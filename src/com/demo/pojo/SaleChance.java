package com.demo.pojo;

import java.util.Date;

/**
 * SaleChance entity. @author MyEclipse Persistence Tools
 */

public class SaleChance implements java.io.Serializable {

	// Fields

	private Integer saleId;
	private String saleSource;
	private String founder;
	private String customerName;
	private String linkman;
	private String linkTel;
	private String profile;
	private String desc;
	private UserInfo userinfo;
	private Integer success;
	private Date createTime;
	private Date assignmentTime;
	private Integer state;
    public String getstateName(){
    	String str="开发中";
    	switch(state){
    	case 2: str="开发成功";break;
    	case 3: str="开发失败";break;
    	}
    	return str;
    }
	// Constructors

	/** default constructor */
	public SaleChance() {
	}

	/** minimal constructor */
	public SaleChance(String founder, String customerName, String profile,
			String desc, Integer success, Date createTime, Integer state) {
		this.founder = founder;
		this.customerName = customerName;
		this.profile = profile;
		this.desc = desc;
		this.success = success;
		this.createTime = createTime;
		this.state = state;
	}

	/** full constructor */
	public SaleChance(String saleSource, String founder, String customerName,
			String linkman, String linkTel, String profile, String desc,
			UserInfo userinfo, Integer success, Date createTime,
			Date assignmentTime, Integer state) {
		this.saleSource = saleSource;
		this.founder = founder;
		this.customerName = customerName;
		this.linkman = linkman;
		this.linkTel = linkTel;
		this.profile = profile;
		this.desc = desc;
		this.userinfo = userinfo;
		this.success = success;
		this.createTime = createTime;
		this.assignmentTime = assignmentTime;
		this.state = state;
	}

	// Property accessors

	public Integer getSaleId() {
		return this.saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public String getSaleSource() {
		return this.saleSource;
	}

	public void setSaleSource(String saleSource) {
		this.saleSource = saleSource;
	}

	public String getFounder() {
		return this.founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getLinkTel() {
		return this.linkTel;
	}

	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}



	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	public Integer getSuccess() {
		return this.success;
	}

	public void setSuccess(Integer success) {
		this.success = success;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getAssignmentTime() {
		return this.assignmentTime;
	}

	public void setAssignmentTime(Date assignmentTime) {
		this.assignmentTime = assignmentTime;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}