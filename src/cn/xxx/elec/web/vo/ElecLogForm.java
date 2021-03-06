package cn.xxx.elec.web.vo;

import java.util.Date;

public class ElecLogForm {
	private String logID;
	private String ipAddress;
	private String opeName;
	private String opeTime;
	private String details;
	//保存待删除的日志id集合
	private String[] logid;
	
	public String[] getLogid() {
		return logid;
	}
	public void setLogid(String[] logid) {
		this.logid = logid;
	}
	public String getLogID() {
		return logID;
	}
	public void setLogID(String logID) {
		this.logID = logID;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getOpeName() {
		return opeName;
	}
	public void setOpeName(String opeName) {
		this.opeName = opeName;
	}
	public String getOpeTime() {
		return opeTime;
	}
	public void setOpeTime(String opeTime) {
		this.opeTime = opeTime;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ElecLogForm [logID=" + logID + ", ipAddress=" + ipAddress
				+ ", opeName=" + opeName + ", opeTime=" + opeTime
				+ ", details=" + details + "]";
	}
	
	
}
