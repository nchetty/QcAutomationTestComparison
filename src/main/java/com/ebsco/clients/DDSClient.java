package com.ebsco.clients;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.ebsco.util.RestUtil;

public class DDSClient {

	private static final String AUTHTOKEN_KEY = "authtoken";
	private static final String AUTHTOKEN_EXPIRE_KEY = "tokenExpireEpochTime";
	private static final String STATE_KEY = "state";
	private static final String RESPONSE_KEY = "response";
	private static final String SUCCESS_KEY = "Success";

	private String authToken = null;
	private long authTokenExpireEpochTime = 0;
	private List<DsItem> dsItems = new ArrayList<DsItem>();

	private static final String AUTH_OPERATION = "/com.ebsco.ese.epdm.resource/dmservice/login";
	private static final String START_DS_OPERATION = "/com.ebsco.ese.epdm.resource/dmservice/ds/start";
	private static final String STOP_DS_OPERATION = "/com.ebsco.ese.epdm.resource/dmservice/ds/activity";
	private static final String ACTIVITY_OPERATION = "/com.ebsco.ese.epdm.resource/dmservice/ds/activeserver?product=%s&label=%s";

	private static DDSClient instance = null;
	private static Object mutex = new Object();
	private static Object authMutex = new Object();
	private static Object dsMutex = new Object();

	private DDSClient() {
	}

	public static DDSClient getInstance() {
		if (instance == null) {
			synchronized (mutex) {
				if (instance == null) {
					instance = new DDSClient();
				}
			}
		}

		return instance;
	}

	public int StartDS(String ddsConsoleServerIp, String dsServerIp, String strDB, String strLabel, String strVolume)
			throws Exception {
		return DoStartDS(ddsConsoleServerIp, dsServerIp, strDB, strLabel, strVolume, 20, 15000);
	}

	public int StartDS(String ddsConsoleServerIp, String dsServerIp, String strDB, String strLabel, String strVolume,
			int reTryCounter, int threadWaitMilliSec) throws Exception {
		return DoStartDS(ddsConsoleServerIp, dsServerIp, strDB, strLabel, strVolume, reTryCounter, threadWaitMilliSec);
	}

	private int DoStartDS(String ddsConsoleServerIp, String dsServerIp, String strDB, String strLabel, String strVolume,
			int reTryCounter, int threadWaitMilliSec) throws Exception {

		try {
			AuthTokenExpired(ddsConsoleServerIp);

			// if already running, throw exception NEED TO DECIDE HOW TO HANDLE THIS
			boolean running = IsDsRunning(ddsConsoleServerIp, strDB, strLabel, null, null);
			if (running == true) {
				throw new Exception(strDB + " " + strLabel + " already running on: " + ddsConsoleServerIp);
			}
			
			HashMap<String, String> header = new HashMap<String, String>();
			header.put("Accept", "application/json");
			header.put("Content-type", "application/json");
			header.put("userrole", "Administrator");
			header.put("X-Access-Token", authToken);
			header.put("SOAPAction", ddsConsoleServerIp + START_DS_OPERATION);

			JSONObject json = new JSONObject();
			json.put("hostname", dsServerIp);
			json.put("volume", strVolume);
			json.put("lookuptags", "");
			json.put("addlcmdopts", "");
			json.put("type", "Release");
			json.put("numbertostart", "1");
			json.put("tracinglevel", "");
			json.put("logginglevel", "Errors, Warnings and Info Messages");
			json.put("trace", "off");
			json.put("logging", "off");
			json.put("product", strDB);
			json.put("label", strLabel);

			JSONObject responseJsonObj = RestUtil.getInstance().PostRequest(ddsConsoleServerIp, START_DS_OPERATION,
					json.toString(), header);

			if (responseJsonObj != null) {
							
				JSONArray msg = (JSONArray) responseJsonObj.get(RESPONSE_KEY);
				String result = msg.toString();
				
				/*
				 * {"result":true,
				 * "response":["Success: DC (10.80.98.55) started DS with dsPort=20118, dsPID=15680"],
				 * "protocolVersion":"1","serverId":"DM Service","result":true,
				 * "version":"2.0.0.1","timestamp":"1508439022035"}
				 */
				if (result.length() > 0) {
					// JSONObject response = new JSONObject(result.toString());
					// System.out.println(response.toString());
					//
					// Object success = (Object) response.get(SUCCESS_KEY);

					if (result.contains(SUCCESS_KEY) == true) {

						String dsHostIp = null;
						String dsPort = null;
						String dsPid = null;

						int start = result.indexOf("(", 1);
						int total = result.indexOf(")", start + 1);
						dsHostIp = result.substring(start + 1, total);

						start = result.indexOf("dsPort=", 1);
						total = result.indexOf(",", start + "dsPort=".length());
						dsPort = result.substring(start + "dsPort=".length(), total);

						start = result.indexOf("dsPID=", 1);
						total = result.indexOf("\"", start + "dsPID=".length());
						dsPid = result.substring(start + "dsPID=".length(), total);

						synchronized (dsMutex) {
							dsItems.add(new DsItem(dsHostIp, dsPort, dsPid));
						}
						
						boolean up = false;
						while (up == false || reTryCounter-- <= 0) {
							Thread.sleep(threadWaitMilliSec);
							up = IsDsRunning(ddsConsoleServerIp, strDB, strLabel, dsHostIp, dsPort);
						}

						return (up == false ? 0 : 1);
					}
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return 0;
		}

		return 0;
	}

	public void StopDS(String ddsConsoleServerIp) throws Exception {
		try {
			DoStopDS(ddsConsoleServerIp, dsItems, null, null);
		} finally {
			synchronized (dsMutex) {
				dsItems.clear();
			}
		}
	}

	public void StopDS(String ddsConsoleServerIp, List<DsItem> dSItems, String strDB, String strLabel) throws Exception {
		DoStopDS(ddsConsoleServerIp, dSItems, strDB, strLabel);
	}

	public void DoStopDS(String ddsConsoleServerIp, List<DsItem> dsItems, String strDB, String strLabel) throws Exception {

		try {
			AuthTokenExpired(ddsConsoleServerIp);
			
			HashMap<String, String> header = new HashMap<String, String>();
			header.put("Accept", "application/json");
			header.put("Content-type", "application/json");
			header.put("userrole", "Administrator");
			header.put("X-Access-Token", authToken);
			header.put("SOAPAction", ddsConsoleServerIp + STOP_DS_OPERATION);

			synchronized (dsMutex) {
				Iterator<DsItem> iterator = dsItems.iterator();
				while (iterator.hasNext()) {
					DsItem element = (DsItem) iterator.next();
					
					// Only stop DS MANUALLY if running
					if ((strDB != null) && (strLabel != null)) {
						boolean running = IsDsRunning(ddsConsoleServerIp, strDB, strLabel, element.GetHostIp(), 
								element.GetPort());
						if (running == false) {
							continue;
						}
					}
					
					JSONObject json1 = new JSONObject();
					json1.put("hostname", element.GetHostIp());
					json1.put("hostnamestring", element.GetHostIp());
					json1.put("port", element.GetPort());
					json1.put("delay", "0");

					JSONArray jArray = new JSONArray();
					jArray.put(json1);

					JSONObject json = new JSONObject();
					json.put("hostname", element.GetHostIp());
					json.put("dslist", jArray);
					json.put("activity", "shutdown");

					JSONArray jArray1 = new JSONArray();
					jArray1.put(json);

					System.out.println(jArray1.toString());

					JSONObject responseJsonObj = RestUtil.getInstance().PostRequest(ddsConsoleServerIp,
							STOP_DS_OPERATION, jArray1.toString(), header);

					if (responseJsonObj != null) {
						JSONArray msg = (JSONArray) responseJsonObj.get(RESPONSE_KEY);

						StringBuffer result = new StringBuffer();

						Iterator<Object> iterator1 = msg.iterator();
						while (iterator1.hasNext()) {
							result.append(iterator1.next());
						}

						/*
						 * {"response":
						 * ["Success: DS 10.80.98.55:20116 will shutdown in 0 minutes"
						 * ], "protocolVersion":"1","serverId":"DM Service"
						 * ,"result":true,"version":"2.0.0.1","timestamp":
						 * "1508438376325"}
						 */
						if (result.length() > 0) {
							// JSONObject response = new
							// JSONObject(result.toString());
							// System.out.println(response.toString());
							//
							// Object success = (Object)
							// response.get(SUCCESS_KEY);

							if ((result.toString().contains(SUCCESS_KEY) == false)
									|| (result.toString().contains(element.GetHostIp()) == false)
									|| (result.toString().contains(element.GetPort()) == false)) {
								System.out.println("Failed to stop DS: IP: " + element.GetHostIp() + " Port: "
										+ element.GetPort());
							}
						}
					}
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} 

		return;
	}

	public void GetAuthToken(String ddsConsoleServerIp) throws Exception {

		try {
			HashMap<String, String> header = new HashMap<String, String>();
			header.put("Accept", "application/json");
			header.put("Content-type", "application/json");
			header.put("SOAPAction", ddsConsoleServerIp + AUTH_OPERATION);

			JSONObject json = new JSONObject();
			json.put("username", "Mechanics");
			json.put("password", "Aw3s0m3");
			json.put("shortAuthenticateResponse", "true");

			JSONObject responseJsonObj = RestUtil.getInstance().PostRequest(ddsConsoleServerIp, AUTH_OPERATION,
					json.toString(), header);
			if (responseJsonObj != null) {
				JSONObject response = (JSONObject) responseJsonObj.get(RESPONSE_KEY);
				System.out.println(response.toString());

				synchronized (authMutex) {
					Object value = (Object) response.get(AUTHTOKEN_KEY);
					System.out.println(value);
					authToken = (String) value;

					value = (Object) response.get(AUTHTOKEN_EXPIRE_KEY);
					System.out.println(value);
					authTokenExpireEpochTime = Long.parseLong(value.toString());
				}
			} else
				throw new Exception("Failed to retrieve Auth Token");
		} catch (Exception ex) {
			authToken = null;
			System.out.println(ex.getMessage());
			throw new Exception("Failed to retrieve Auth Token: " + ex.getMessage());
		}
	}

	public boolean IsDsRunning(String ddsConsoleServerIp, String strDB, String strLabel,
			String dsHost, String dsPort) throws Exception {
		try {
			AuthTokenExpired(ddsConsoleServerIp);

			String operation = String.format(ACTIVITY_OPERATION, strDB, strLabel);

			HashMap<String, String> header = new HashMap<String, String>();
			header.put("Content-type", "application/json");
			header.put("userrole", "Administrator");
			header.put("X-Access-Token", authToken);
			header.put("SOAPAction", ddsConsoleServerIp + operation);

			JSONObject jsonObject = RestUtil.getInstance().GetRequest(ddsConsoleServerIp, operation, header);
			if (jsonObject != null) {
				JSONArray msg = (JSONArray) jsonObject.get(RESPONSE_KEY);

				StringBuffer result = new StringBuffer();

				Iterator<Object> iterator = msg.iterator();
				while (iterator.hasNext()) {
					result.append(iterator.next());
				}

				if (result.length() > 0) {
					JSONObject response = new JSONObject(result.toString());
					System.out.println(response.toString());

					// State value can be a combination of the following:
					// C - Command Line
					// M - Manual Console / Manual Start
					// T - Topology Start
					// L - Load Balance Start
					// N - Notify Update / Updated by DDSUpdate
					// S - Shutdown Mode
					// D - DDR Disable / Detached
					// R - No response on verify
					// e.g. TN means server was started by Topology and then
					// updated by DDSUpdate.
					if ((response.get("product").toString().equals(strDB) == true)
							&& (response.get("label").toString().equals(strLabel) == true)
							&& ((response.get(STATE_KEY).toString().contains("M") == true)
									|| (response.get(STATE_KEY).toString().contains("T") == true)
									|| (response.get(STATE_KEY).toString().contains("L") == true))) {
						
						Object product = (Object) response.get("product");
						System.out.println(product);
						Object label = (Object) response.get("label");
						System.out.println(label);
						Object port = (Object) response.get("port");
						System.out.println(port);
						Object hostname = (Object) response.get("hostname");
						System.out.println(hostname);
						String state = (String) response.get(STATE_KEY);
						System.out.println(state);

						if (dsHost != null) {
							if (response.get("hostname").toString().equals(dsHost) == false) {
								return false;
							}
						}
						
						if (dsPort != null) {
							if (response.get("port").toString().equals(dsPort) == false) {
								return false;
							}
						}
						
						return true;
					}
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}

		return false;
	}

	private void AuthTokenExpired(String ddsConsoleServerIp) throws Exception {

		// Instant.now().toEpochMilli(); //Long = 1450879900184
		// Instant.now().getEpochSecond(); //Long = 1450879900
		// System.out.println("toEpochMilli: " + Instant.now().toEpochMilli());
		System.out.println("getEpochSecond: " + Instant.now().getEpochSecond());

		if ((authToken == null) || (authTokenExpireEpochTime <= Instant.now().getEpochSecond())) {
			GetAuthToken(ddsConsoleServerIp);
		}
	}
}
