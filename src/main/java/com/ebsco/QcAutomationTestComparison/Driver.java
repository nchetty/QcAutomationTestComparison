package com.ebsco.QcAutomationTestComparison;

import java.util.ArrayList;
import java.util.List;

import com.ebsco.clients.DDSClient;
import com.ebsco.clients.DsItem;
import com.ebsco.clients.SearchServiceClient;

public class Driver {

//    private static final String SEARCH_SERVICE_URL = "http://pdc-syncfacade.epnet.com/SearchServiceFacade/SearchService.svc?singlewsdl";
//    private static final String RESULT_SET_SERVICE_URL = "http://pdc-syncfacade.epnet.com/SearchServiceFacade/ResultSet.svc?singlewsdl";

	private static final String SEARCH_SERVICE_URL = "http://%s/SearchServiceFacade/SearchService.svc?singlewsdl";
    private static final String RESULT_SET_SERVICE_URL = "http://%s/SearchServiceFacade/ResultSet.svc?singlewsdl";
    		
    private static final String DDS_CONSOLE_DEV_URL = "http://edc-v-ddsconsld01.epnet.com:8080";  
    //private static final String DDS_CONSOLE_DEV_URL = "http://pdc-v-dds01:8080";
    
    //  Below will be passed in on comment line    
    //private static final String SEARCH_HOST_LIVE_IP = "pdc-syncfacade.epnet.com";
    
    // In SuperDelegatesOfOz Platform 9
    private static final String SEARCH_HOST_LIVE_IP = "10.80.99.59";
    private static final String DS_HOST_DEV_IP = "10.80.98.55";  
 	private static final String DS_SERVER = "edc-v-epdsd01";
 	
 	private static String searchServiceSearchWsdl = null;
 	private static String searchServiceResultWsdl = null;
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			searchServiceSearchWsdl = String.format(SEARCH_SERVICE_URL, SEARCH_HOST_LIVE_IP);
			searchServiceResultWsdl = String.format(RESULT_SET_SERVICE_URL, SEARCH_HOST_LIVE_IP);
				
			EndToEndTest();
			
			//DDSConsoleTest();
			
			//SearchServiceTest();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}		
	}
	
	static void EndToEndTest() {
		String searchTerm = "food";
		String dbCode = "mih";
		String label = "rebuild";
		String profile = "demo.main.ehost";
		String volume = "build";
		
		try {
			// Need a check not to call if running in production
			DDSClient.getInstance().StartDS(DDS_CONSOLE_DEV_URL, DS_HOST_DEV_IP, dbCode, label, volume);
			
			String results = SearchServiceClient.getInstance().GetTotalHitsCount(searchServiceSearchWsdl, 
					searchServiceResultWsdl, searchTerm, dbCode, label, profile);

			if  (results != null)
				System.out.println(results);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				// Need a check not to call if running in production
				DDSClient.getInstance().StopDS(DDS_CONSOLE_DEV_URL);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
	}
	
	static void DDSConsoleTest() {
		try {				
//			DDSClient.getInstance().StartDS(DDS_CONSOLE_DEV_URL, DS_HOST_DEV_IP, "lih", "live", "build");
//									        
//			DDSClient.getInstance().StopDS(DDS_CONSOLE_DEV_URL);

			// FOR TESTING

			List<DsItem> dsItems= new ArrayList<DsItem>();
			dsItems.add(new DsItem(DS_HOST_DEV_IP, "20193", null));	
			dsItems.add(new DsItem(DS_HOST_DEV_IP, "99999", null));	
			DDSClient.getInstance().StopDS(DDS_CONSOLE_DEV_URL, dsItems, "mih", "rebuild");
						
			// This is only use by StartDS so will be private.  Team can decide if need to call from
			//  their test and change it to public
			//DDSConsoleClient.getInstance().IsDsRunning(DDS_CONSOLE_DEV_URL, "mih", "rebuild");
			
			//DDSConsoleClient.getInstance().IsDsRunning(DDS_CONSOLE_DEV_URL, "lih", "live");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
	}
	
	static void SearchServiceTest() {
		
		try {			
			//SearchServiceClient ssClient = new SearchServiceClient(SEARCH_SERVICE_URL, RESULT_SET_SERVICE_URL);
			//String results = ssClient.Search("water", "demo.main.ehost");
			
//			String results = SearchServiceClient.getInstance().GetTotalHitsCount(searchServiceSearchWsdl, 
//					searchServiceResultWsdl, "water", "prodsys2.cat00062a.l");
		
//			String results = SearchServiceClient.getInstance().GetTotalHitsCount(searchServiceSearchWsdl, 
//					searchServiceResultWsdl, "water", "demo.main.ehost");

	        //System.out.println(results);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
	}
}
