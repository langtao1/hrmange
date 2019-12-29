package com.bdqn.entity;
//回复信息表

import java.util.Date;
import java.util.List;

public class DY_Revert {
/*
 * RID INT PRIMARY KEY AUTO_INCREMENT,
TID INT,
UID INT,
RTitle VARCHAR(200),
RContent TEXT,
RDate DATE
 */
	private int rId;
	private int tId;
	private int uId;
	private String rTitle;
	private String rContent;
	private Date rDate;
	private DY_Topic topic;//回复对应的问题
	private DY_User user;//回复对应的那个用户
	public DY_Revert(int rId, int tId, int uId, String rTitle, String rContent, Date rDate, DY_Topic topic,
			DY_User user) {
		super();
		this.rId = rId;
		this.tId = tId;
		this.uId = uId;
		this.rTitle = rTitle;
		this.rContent = rContent;
		this.rDate = rDate;
		this.topic = topic;
		this.user = user;
	}
	public DY_Revert() {
		super();
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getrTitle() {
		return rTitle;
	}
	public void setrTitle(String rTitle) {
		this.rTitle = rTitle;
	}
	public String getrContent() {
		return rContent;
	}
	public void setrContent(String rContent) {
		this.rContent = rContent;
	}
	public Date getrDate() {
		return rDate;
	}
	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}
	public DY_Topic getTopic() {
		return topic;
	}
	public void setTopic(DY_Topic topic) {
		this.topic = topic;
	}
	public DY_User getUser() {
		return user;
	}
	public void setUser(DY_User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "DY_Revert [rId=" + rId + ", tId=" + tId + ", uId=" + uId + ", rTitle=" + rTitle + ", rContent="
				+ rContent + ", rDate=" + rDate + ", topic=" + topic + ", user=" + user + "]";
	}
	
}
