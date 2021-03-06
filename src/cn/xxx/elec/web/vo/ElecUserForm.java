package cn.xxx.elec.web.vo;

import java.io.File;

public class ElecUserForm {

	private String userID;
	private String jctID;
	private String userName;
	private String loginName;
	private String loginPwd;
	private String passwordconfirm;
	private String sexID;
	private String birthday;	
	private String address;
	private String contactTel;
	private String email;
	private String mobile;
	private String isDuty;
	private String onDutyDate;
	private String offDutyDate;
	private String remark;
	private boolean flag;
	private String md5Flag;
	//2015-6-16 显示图表时用到	
	private String jctname;
	private String jctcount;
	
	public String getJctname() {
		return jctname;
	}
	public void setJctname(String jctname) {
		this.jctname = jctname;
	}
	public String getJctcount() {
		return jctcount;
	}
	public void setJctcount(String jctcount) {
		this.jctcount = jctcount;
	}
	//jxl报表导入时用
	private File file;
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	//判断页面是
	//	null：编辑页面
	//  1  ： 明细页面
	private String viewFlag;
	
	
	public String getViewFlag() {
		return viewFlag;
	}
	public void setViewFlag(String viewFlag) {
		this.viewFlag = viewFlag;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getJctID() {
		return jctID;
	}
	public void setJctID(String jctID) {
		this.jctID = jctID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	
	public String getPasswordconfirm() {
		return passwordconfirm;
	}
	public void setPasswordconfirm(String passwordconfirm) {
		this.passwordconfirm = passwordconfirm;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getSexID() {
		return sexID;
	}
	public void setSexID(String sexID) {
		this.sexID = sexID;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIsDuty() {
		return isDuty;
	}
	public void setIsDuty(String isDuty) {
		this.isDuty = isDuty;
	}
	public String getOnDutyDate() {
		return onDutyDate;
	}
	public void setOnDutyDate(String onDutyDate) {
		this.onDutyDate = onDutyDate;
	}
	public String getOffDutyDate() {
		return offDutyDate;
	}
	public void setOffDutyDate(String offDutyDate) {
		this.offDutyDate = offDutyDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getMd5Flag() {
		return md5Flag;
	}
	public void setMd5Flag(String md5Flag) {
		this.md5Flag = md5Flag;
	}
	@Override
	public String toString() {
		return "ElecUserForm [userID=" + userID + ", jctID=" + jctID
				+ ", userName=" + userName + ", loginName=" + loginName
				+ ", loginPwd=" + loginPwd + ", passwordconfirm="
				+ passwordconfirm + ", sexID=" + sexID + ", birthday="
				+ birthday + ", address=" + address + ", contactTel="
				+ contactTel + ", email=" + email + ", mobile=" + mobile
				+ ", isDuty=" + isDuty + ", onDutyDate=" + onDutyDate
				+ ", offDutyDate=" + offDutyDate + ", remark=" + remark
				+ ", flag=" + flag + ", md5Flag=" + md5Flag + ", viewFlag="
				+ viewFlag + "]";
	}
	
	
	
}
