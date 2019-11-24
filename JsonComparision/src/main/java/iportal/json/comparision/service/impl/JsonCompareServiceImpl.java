package iportal.json.comparision.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import iportal.json.comparision.model.DocJson;
import iportal.json.comparision.service.JsonCompareService;

public class JsonCompareServiceImpl implements JsonCompareService {

	private static final Logger log  = LoggerFactory.getLogger(JsonCompareServiceImpl.class);
	@Override
	public Map<String, String> jsonCompare(Map<String, DocJson> data) {
	
		Map<String, String> statusMap = new HashMap<>();
		
		for(Map.Entry<String, DocJson> entry: data.entrySet()) {
		
			String path = entry.getKey();
			DocJson docJson = entry.getValue();
			
			try {
				
				RestTemplate restTemplate = new RestTemplate();
				final String uri = "https://xyz.com/" + docJson.getContxPathNm() +"/"+docJson.getOperRsrcNm();
				
			     /*
			    Map<String, String> params = new HashMap<String, String>();
			    params.put("id", docJson.getReqJson());
			    Object result = restTemplate.getForObject(uri, Object.class,  params);
			     */
				//EmployeeVO newEmployee = new EmployeeVO(-1, "Adam", "Gilly", "test@email.com");
				 
			    Object result = null;
			    if(docJson.getOperTyCd().equalsIgnoreCase("POST")) {
			    	result = restTemplate.postForObject( uri, docJson.getReqJson(), Object.class);
			    }
			    else if(docJson.getOperTyCd().equalsIgnoreCase("GET")) {
			    	//result = restTemplate.getForObject( uri, Object.class);
			    }
			    
			    System.out.println(result);
			    
			    //Compare Json
			    String status =  "";

			    String dbResponseJson = docJson.getResJson();
			    String apiResponseJson = result.toString();
			    
			    statusMap.put(path, status);
			}
			catch(Exception e) {
				log.error("error:", e);
			}
			
		}
		return statusMap;
	}

}
