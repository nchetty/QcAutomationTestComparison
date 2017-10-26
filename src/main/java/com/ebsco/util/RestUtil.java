package com.ebsco.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

public class RestUtil {

	private static RestUtil instance= null;
	private static Object mutex= new Object();
	
	private RestUtil() {
	}

	public static RestUtil getInstance() {
		if(instance == null) {
			synchronized (mutex) {
				if(instance == null) {
					instance= new RestUtil();
				}
			}
		}
		
		return instance;
	}
	
	public JSONObject GetRequest(String resourceUrl, String operationPath, 
			HashMap<String, String> headers) throws Exception {
		
		try {
			CloseableHttpClient client = HttpClients.createDefault();

			HttpGet get = new HttpGet(resourceUrl + operationPath);
			setHeaders(get, headers);
								
			HttpResponse response = client.execute(get);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));		
			String inputLine;
			StringBuffer result = new StringBuffer();

			while ((inputLine = rd.readLine()) != null) {
				result.append(inputLine);
			}
			
			if (result.length() > 0) {
				System.out.println(result);

				return new JSONObject(result.toString());		
			} 
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}
	
	public JSONObject PostRequest(String resourceUrl, String operationPath, String httpBody, 
			HashMap<String, String> headers) throws Exception {
		
		try {
			CloseableHttpClient client = HttpClients.createDefault();
			HttpPost post = new HttpPost(resourceUrl + operationPath);

			setHeaders(post, headers);
					
			post.setEntity(new StringEntity(httpBody));
			
			HttpResponse response = client.execute(post);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));		
			String inputLine;
			StringBuffer result = new StringBuffer();

			while ((inputLine = rd.readLine()) != null) {
				result.append(inputLine);
			}
			
			if (result.length() > 0) {
				System.out.println(result);

				return new JSONObject(result.toString());				
			} 			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}
	
	private void setHeaders(HttpGet get, HashMap<String, String> headers) {
		if (headers == null)
			return;

		for (Map.Entry<String, String> header : headers.entrySet()) {
			get.setHeader(header.getKey(), header.getValue());
		}
	}
	
	private void setHeaders(HttpPost post, HashMap<String, String> headers) {
		if (headers == null)
			return;

		for (Map.Entry<String, String> header : headers.entrySet()) {
			post.setHeader(header.getKey(), header.getValue());
		}
	}
}
