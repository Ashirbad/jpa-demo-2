package iportal.json.comparision.model;

public class JsonModel {

	String contxPathNM;
	String ctlgItemVerId;
	String operTyCd;
	String OperRsrcNm;
	String docCatgCd;
	String docCntTx;
	public String getContxPathNM() {
		return contxPathNM;
	}
	public void setContxPathNM(String contxPathNM) {
		this.contxPathNM = contxPathNM;
	}
	public String getCtlgItemVerId() {
		return ctlgItemVerId;
	}
	public void setCtlgItemVerId(String ctlgItemVerId) {
		this.ctlgItemVerId = ctlgItemVerId;
	}
	public String getOperTyCd() {
		return operTyCd;
	}
	public void setOperTyCd(String operTyCd) {
		this.operTyCd = operTyCd;
	}
	public String getOperRsrcNm() {
		return OperRsrcNm;
	}
	public void setOperRsrcNm(String operRsrcNm) {
		OperRsrcNm = operRsrcNm;
	}
	public String getDocCatgCd() {
		return docCatgCd;
	}
	public void setDocCatgCd(String docCatgCd) {
		this.docCatgCd = docCatgCd;
	}
	public String getDocCntTx() {
		return docCntTx;
	}
	public void setDocCntTx(String docCntTx) {
		this.docCntTx = docCntTx;
	}
	@Override
	public String toString() {
		return "JsonModel [contxPathNM=" + contxPathNM + ", ctlgItemVerId=" + ctlgItemVerId + ", operTyCd=" + operTyCd
				+ ", OperRsrcNm=" + OperRsrcNm + ", docCatgCd=" + docCatgCd + ", docCntTx=" + docCntTx + "]";
	}
	
	
}
