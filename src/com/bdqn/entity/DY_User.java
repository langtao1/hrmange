package com.bdqn.entity;

/*
 * UID INT PRIMARY KEY AUTO_INCREMENT,
UName VARCHAR(20),
UPwd VARCHAR(20),
UGender CHAR(2),
UEmail VARCHAR(40),
URole INT,
UHead VARCHAR(50),
URegDate DATE,
UlastLogin DATE,
ULastEmit DATE,
UPermit INT
 */
//用户信息表
import java.util.Date;
import java.util.List;

public class DY_User {
	private int uId;
	private String uName;
	private String uPwd;
	private String uGender;
	private String uEmail;
	private int uRole;
	private String uHead;
	private Date uRegdate;
	private Date uLastLogin;
	private Date uLastEmail;
	private int uPermit;
	//用户到问题  一对多 每个用户可以提出多个问题
    private List<DY_Topic> topic;
    //用户可以有多个回复
    private List<DY_Revert> reverts;
    //用户可以有多个申请记录
    private List<DY_Apply> applies;
    //一个用户可以选择多个课程
    private List<DY_Topic_Group> groups;
    
	public DY_User() {
		super();
	}
	public DY_User(int uId, String uName, String uPwd, String uGender, String uEmail, int uRole, String uHead,
			Date uRegdate, Date uLastLogin, Date uLastEmail, int uPermit, List<DY_Topic> topic, List<DY_Revert> reverts,
			List<DY_Apply> applies, List<DY_Topic_Group> groups) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPwd = uPwd;
		this.uGender = uGender;
		this.uEmail = uEmail;
		this.uRole = uRole;
		this.uHead = uHead;
		this.uRegdate = uRegdate;
		this.uLastLogin = uLastLogin;
		this.uLastEmail = uLastEmail;
		this.uPermit = uPermit;
		this.topic = topic;
		this.reverts = reverts;
		this.applies = applies;
		this.groups = groups;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getuGender() {
		return uGender;
	}
	public void setuGender(String uGender) {
		this.uGender = uGender;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public int getuRole() {
		return uRole;
	}
	public void setuRole(int uRole) {
		this.uRole = uRole;
	}
	public String getuHead() {
		return uHead;
	}
	public void setuHead(String uHead) {
		this.uHead = uHead;
	}
	public Date getuRegdate() {
		return uRegdate;
	}
	public void setuRegdate(Date uRegdate) {
		this.uRegdate = uRegdate;
	}
	public Date getuLastLogin() {
		return uLastLogin;
	}
	public void setuLastLogin(Date uLastLogin) {
		this.uLastLogin = uLastLogin;
	}
	public Date getuLastEmail() {
		return uLastEmail;
	}
	public void setuLastEmail(Date uLastEmail) {
		this.uLastEmail = uLastEmail;
	}
	public int getuPermit() {
		return uPermit;
	}
	public void setuPermit(int uPermit) {
		this.uPermit = uPermit;
	}
	public List<DY_Topic> getTopic() {
		return topic;
	}
	public void setTopic(List<DY_Topic> topic) {
		this.topic = topic;
	}
	public List<DY_Revert> getReverts() {
		return reverts;
	}
	public void setReverts(List<DY_Revert> reverts) {
		this.reverts = reverts;
	}
	public List<DY_Apply> getApplies() {
		return applies;
	}
	public void setApplies(List<DY_Apply> applies) {
		this.applies = applies;
	}
	public List<DY_Topic_Group> getGroups() {
		return groups;
	}
	public void setGroups(List<DY_Topic_Group> groups) {
		this.groups = groups;
	}
	@Override
	public String toString() {
		return "DY_User [uId=" + uId + ", uName=" + uName + ", uPwd=" + uPwd + ", uGender=" + uGender + ", uEmail="
				+ uEmail + ", uRole=" + uRole + ", uHead=" + uHead + ", uRegdate=" + uRegdate + ", uLastLogin="
				+ uLastLogin + ", uLastEmail=" + uLastEmail + ", uPermit=" + uPermit + ", topic=" + topic + ", reverts="
				+ reverts + ", applies=" + applies + ", groups=" + groups + "]";
	}
    	
}
