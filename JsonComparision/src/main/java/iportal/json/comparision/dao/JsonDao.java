package iportal.json.comparision.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import iportal.json.comparision.model.DocJson;

@Repository
public class JsonDao {
	
	@Autowired
	EntityManager entityManager;
	
	
	public List<Object[]> getJsonDao()
	{

		String sqlQuery="Select CONTX_PATH_NM,INTG_CTLG_ITM_VER_ID,OPER_TY_CD,OPER_RSRC_NM,DOC_CATG_CD,DOC_CNT_TX from IGDT_USE_CASE_CTLG_ITEM";
		Query query = entityManager.createNativeQuery(sqlQuery);
		
		List<Object[]> result = query.getResultList();
		return result;
	}

}
