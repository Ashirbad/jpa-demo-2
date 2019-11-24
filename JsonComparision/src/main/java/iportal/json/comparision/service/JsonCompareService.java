package iportal.json.comparision.service;

import java.util.Map;

import iportal.json.comparision.model.DocJson;

public interface JsonCompareService {
	
	public Map<String, String> jsonCompare(Map<String, DocJson> data) ;

}
