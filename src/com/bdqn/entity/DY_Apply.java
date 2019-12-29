package com.bdqn.entity;

//申请信息表
public class DY_Apply {
	private int aId;
	private int uId;
	private int tgId;
	private String aReason;
	private int aFlag;
	private String aStatus;
	private DY_User user;//声请人
	private DY_Topic_Group group;//申请科目

}
