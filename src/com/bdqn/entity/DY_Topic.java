package com.bdqn.entity;
//提问信息表

/*
 * TID INT PRIMARY KEY AUTO_INCREMENT,
UID INT,
TGID INT,
TTitle VARCHAR(200),
TContent TEXT,
TDate DATE,
TReadCount INT
 */

import java.util.Date;
import java.util.List;

public class DY_Topic {
	private int tId;
	private int uId;
	private int tgId;
	private String tTitle;
	private String tContent;
	private Date tDate;
	private int tReadCount;
	private DY_User user;//每个问题都是某个用户提出来的
	private DY_Topic_Group group;//每个问题都现对于每个课程
	private List<DY_Revert> reverts;//每个问题都有对应的回复
	public DY_Topic(int tId, int uId, int tgId, String tTitle, String tContent, Date tDate, int tReadCount,
			DY_User user, DY_Topic_Group group, List<DY_Revert> reverts) {
		super();
		this.tId = tId;
		this.uId = uId;
		this.tgId = tgId;
		this.tTitle = tTitle;
		this.tContent = tContent;
		this.tDate = tDate;
		this.tReadCount = tReadCount;
		this.user = user;
		this.group = group;
		this.reverts = reverts;
	}
	public DY_Topic() {
		super();
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
	public int getTgId() {
		return tgId;
	}
	public void setTgId(int tgId) {
		this.tgId = tgId;
	}
	public String gettTitle() {
		return tTitle;
	}
	public void settTitle(String tTitle) {
		this.tTitle = tTitle;
	}
	public String gettContent() {
		return tContent;
	}
	public void settContent(String tContent) {
		this.tContent = tContent;
	}
	public Date gettDate() {
		return tDate;
	}
	public void settDate(Date tDate) {
		this.tDate = tDate;
	}
	public int gettReadCount() {
		return tReadCount;
	}
	public void settReadCount(int tReadCount) {
		this.tReadCount = tReadCount;
	}
	public DY_User getUser() {
		return user;
	}
	public void setUser(DY_User user) {
		this.user = user;
	}
	public DY_Topic_Group getGroup() {
		return group;
	}
	public void setGroup(DY_Topic_Group group) {
		this.group = group;
	}
	public List<DY_Revert> getReverts() {
		return reverts;
	}
	public void setReverts(List<DY_Revert> reverts) {
		this.reverts = reverts;
	}
	@Override
	public String toString() {
		return "DY_Topic [tId=" + tId + ", uId=" + uId + ", tgId=" + tgId + ", tTitle=" + tTitle + ", tContent="
				+ tContent + ", tDate=" + tDate + ", tReadCount=" + tReadCount + ", user=" + user + ", group=" + group
				+ ", reverts=" + reverts + "]";
	}
	
}
