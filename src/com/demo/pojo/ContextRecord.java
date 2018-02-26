package com.demo.pojo;

import java.util.Date;

/**
 * ContextRecord entity. @author MyEclipse Persistence Tools
 */

public class ContextRecord implements java.io.Serializable {

	// Fields

	private Integer recordId;
	private Customer customerId;
	private Date recordDate;
	private String recordAddr;
	private String profile;
	private String recordDesc;
	private String remark;
	private Integer state;

	

	public ContextRecord() {
		super();
	}

	public ContextRecord(Integer recordId, Customer customerId,
			Date recordDate, String recordAddr, String profile,
			String recordDesc, String remark, Integer state) {
		super();
		this.recordId = recordId;
		this.customerId = customerId;
		this.recordDate = recordDate;
		this.recordAddr = recordAddr;
		this.profile = profile;
		this.recordDesc = recordDesc;
		this.remark = remark;
		this.state = state;
	}

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}


	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Date getRecordDate() {
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public String getRecordAddr() {
		return this.recordAddr;
	}

	public void setRecordAddr(String recordAddr) {
		this.recordAddr = recordAddr;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getRecordDesc() {
		return this.recordDesc;
	}

	public void setRecordDesc(String recordDesc) {
		this.recordDesc = recordDesc;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}