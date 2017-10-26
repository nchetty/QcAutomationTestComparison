package com.ebsco.clients;

import com.ebscohost.services.core._2010._05.*;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.ep_core_services_searchservice_api_contracts.ApplicationId;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.soap.AddressingFeature;

public class SearchServiceClient 
{	
	private static SearchServiceClient instance= null;
	private static Object mutex= new Object();
	
	private SearchServiceClient() {
	}

	public static SearchServiceClient getInstance() {
		if(instance == null) {
			synchronized (mutex) {
				if(instance == null) {
					instance= new SearchServiceClient();
				}
			}
		}
		
		return instance;
	}
	
    private String DoSearch(String searchServiceUrl, String searchTerm, String productCode, String label,
    		String profile) {

        //Get the annotation to get the WSDL location.  WSDL is needed for service constructor.
        WebServiceClient searchAnnotation = SearchService.class.getAnnotation(WebServiceClient.class);

        //Tinker with wsdlLocation in the wsimport in the pom to get a value that's loadable from the class loader.
        String searchWsdlLocation = searchAnnotation.wsdlLocation();
 
        //Create the client proxy
        Service searchServiceProxy = new SearchService(SearchServiceClient.class.getClassLoader().getResource(searchWsdlLocation));
             	
        //Get the port from the proxy
        ISearchService searchServicePort = searchServiceProxy.getPort(ISearchService.class, new AddressingFeature());

        //Set common timeout properties.
        BindingProvider bindingProvider = (BindingProvider)searchServicePort;
        bindingProvider.getRequestContext().put("com.sun.xml.ws.connect.timeout", 5000);
        bindingProvider.getRequestContext().put("com.sun.xml.ws.internal.connect.timeout", 5000);
        bindingProvider.getRequestContext().put("com.sun.xml.ws.request.timeout", 5000);
        bindingProvider.getRequestContext().put("com.sun.xml.ws.internal.request.timeout", 5000);        
        //bindingProvider.getRequestContext().put(BindingProviderProperties.CONNECT_TIMEOUT, 5000);
        //bindingProvider.getRequestContext().put(BindingProviderProperties.REQUEST_TIMEOUT, 5000);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, searchServiceUrl);

        //Now, you should be able to conduct a search on the port.
        SearchRequestMessage searchRequest = getSearchRequest(searchTerm, productCode, label, profile);
         
        String resultSetID = searchServicePort.search(searchRequest);

        System.out.println("resultSetID: " + resultSetID);
        
        return resultSetID;
    }

	private ResultSetStatusMessage GetResults(String searchServiceResultUrl, String resultSetID) {

        //Get the annotation to get the WSDL location.  WSDL is needed for service constructor.
        WebServiceClient resultSetAnnotation = ResultSet.class.getAnnotation(WebServiceClient.class);

        //Tinker with wsdlLocation in the wsimport in the pom to get a value that's loadable from the class loader.
        String resultSetWsdlLocation = resultSetAnnotation.wsdlLocation();

        //Create the client proxy
        Service resultSetServiceProxy = new ResultSet(SearchServiceClient.class.getClassLoader().getResource(resultSetWsdlLocation));
            	
        //Get the port from the proxy
        IResultSet resultSetServicePort = resultSetServiceProxy.getPort(IResultSet.class, new AddressingFeature());

        BindingProvider bindingProvider = (BindingProvider)resultSetServicePort;
        bindingProvider.getRequestContext().put("com.sun.xml.ws.connect.timeout", 5000);
        bindingProvider.getRequestContext().put("com.sun.xml.ws.internal.connect.timeout", 5000);
        bindingProvider.getRequestContext().put("com.sun.xml.ws.request.timeout", 5000);
        bindingProvider.getRequestContext().put("com.sun.xml.ws.internal.request.timeout", 5000);
        //bindingProvider.getRequestContext().put(BindingProviderProperties.CONNECT_TIMEOUT, 5000);
        //bindingProvider.getRequestContext().put(BindingProviderProperties.REQUEST_TIMEOUT, 5000);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, searchServiceResultUrl);

       
        //Get info from the result set about that search token.
        ResultSetStatusMessage resultStatus = resultSetServicePort.getStatus(resultSetID);
         
        return resultStatus;
    }

    private SearchRequestMessage getSearchRequest(String searchTerm, String dbCode, String label,
    		String profile) {

        SearchRequestMessage searchRequest = new SearchRequestMessage();

        UserCriteria userCriteria = new UserCriteria();

        userCriteria.setActivityID("Some ID");
        userCriteria.setApplicationID(ApplicationId.GENERAL);
        userCriteria.setApplicationSource(""); //is used to distinguish between different request sources, e.g. persistent link, user input. This can be left blank
        userCriteria.setClientApplicationID("SomeApp"); //is supplied to DS as additional context (Ehost, SDI, RSS use something like EhostInterfaces, Version=14.3.1.57, Culture=neutral, PublicKeyToken=null)
        userCriteria.setLanguage("en");

        //This represents the end-user's IP address, and is only used as additional user context in error logs.
        //Plumbing the IP address through the enhancer chain is a big change.  Leaving blank for now.
        userCriteria.setUserIP("");

//        userCriteria.setLabel("live");
//        userCriteria.setTarget("DS:live");
        userCriteria.setLabel(label);
        userCriteria.setTarget("DS:"+label);
        userCriteria.setSessionID("someID");
        
        String[] words = profile.split("\\.");   
        userCriteria.setCustomer(words[0]);
        userCriteria.setGroup(words[1]);
        userCriteria.setProfile(words[2]);
 
        searchRequest.setUser(userCriteria);

        SearchCriteria criteria = new SearchCriteria();

        ExpressionCriteria expressions = new ExpressionCriteria();
        ArrayOfExpression terms = new ArrayOfExpression();
        Expression term = new Expression();
        term.setTerm(searchTerm);
        terms.getExpression().add(term);
        expressions.setTerms(terms);
        criteria.setExpressions(expressions);

        //Set up initial database criteria
        DatabaseCriteria dbCriteria = new DatabaseCriteria();
        ArrayOfstring dbArray = new ArrayOfstring();
        dbArray.getString().add(dbCode);
//        dbArray.getString().add("a9h");
        dbCriteria.setSelectedDatabases(dbArray);

        //Set specific host
        /*DatabaseTarget dbTarget = new DatabaseTarget();
        dbTarget.setHostOrIp("10.1.32.110");
        dbTarget.setPort(22563);
        DatabaseExtension dbExtension = new DatabaseExtension();
        dbExtension.setTarget(dbTarget);
        dbExtension.setDatabaseName("a9h");
        DatabaseExtensionCriteria extensionCriteria = new DatabaseExtensionCriteria();
        ArrayOfDatabaseExtension dbExtensions = new ArrayOfDatabaseExtension();
        dbExtensions.getDatabaseExtension().add(dbExtension);
        extensionCriteria.setExtensions(dbExtensions);
        dbCriteria.setExtensionCriteria(extensionCriteria);*/

        //Write database criteria
        criteria.setDatabases(dbCriteria);

        //Write criteria
        searchRequest.setCriteria(criteria);

        return searchRequest;
    }
    
	public String GetTotalHitsCount(String searchServiceUrl, String searchServiceResultUrl, String searchTerm, 
			String dbCode, String label, String profile) {
		
		String resultSetId = DoSearch(searchServiceUrl, searchTerm, dbCode, label, profile);
		if (resultSetId == null || resultSetId.isEmpty() == true)
			return null;
		
		ResultSetStatusMessage resultStatus = GetResults(searchServiceResultUrl, resultSetId);
		
        return "Hits: " + resultStatus.getSources().getSourceSearchStatus().get(0).getTotalHits();
	}
}
