package iportal.json.comparision.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import iportal.json.comparision.model.DocJson;
import iportal.json.comparision.service.JsonCompareService;
import iportal.json.comparision.service.JsonService;

@Controller
public class TestController {

	@Autowired
	private JsonService jsonService;
	@Autowired
	private JsonCompareService jsonCompareService;
	
	@GetMapping("/test")
	public ResponseEntity getData(){
		
		Map<String, DocJson> json = jsonService.getJson();
		
		Map<String, String> jsonCompareResult = jsonCompareService.jsonCompare(json);
		
	//return new ResponseEntity(json, HttpStatus.OK);
		return new ResponseEntity(jsonCompareResult, HttpStatus.OK);
	}
}
