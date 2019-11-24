package iportal.json.comparision.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iportal.json.comparision.dao.JsonDao;
import iportal.json.comparision.model.DocJson;
import iportal.json.comparision.service.JsonService;

@Service
public class JsonServiceImpl implements JsonService {
	//@PersistenceContext
	@Autowired
	JsonDao jsonDao;
	public Map<String, DocJson> getJson()
	{
		Map<String, DocJson> docsMap = new HashMap<>();
		List<Object[]> result = jsonDao.getJsonDao();
		for(Object[]  data: result) {
			
			String contcPathNm = data[0].toString();
			String intgCtlgItmVerId=data[1].toString();
			String operTyCd =data[2].toString();
			String operRsrcNm = data[3].toString();
			String docCatgCd =data [4].toString();
			String docCntTx =data [5].toString();
			
			DocJson docJson = null;
			
			if(docsMap.containsKey(operRsrcNm))
				docJson = docsMap.get(operRsrcNm);
			else
				docJson = new DocJson();
			
			if(docCatgCd.equalsIgnoreCase("RQST")) 
				docJson.setReqJson(docCntTx);
			else if(docCatgCd.equalsIgnoreCase("RESP")) 
				docJson.setResJson(docCntTx);
			
			docJson.setContxPathNm(contcPathNm);
			docJson.setIntgCtlgItmVerId(intgCtlgItmVerId);
			docJson.setOperTyCd(operTyCd);
			docJson.setOperRsrcNm(operRsrcNm);
			
			
			docsMap.put(operRsrcNm, docJson);
			
		}
		
		
		return docsMap;
	
	}
}
