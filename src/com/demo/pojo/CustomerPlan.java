package com.demo.pojo;

import java.util.Date;

/**
 * CustomerPlan entity. @author MyEclipse Persistence Tools
 */

public class CustomerPlan implements java.io.Serializable {

	// Fields

	private Integer planId;
	private Date planDate;
	private String planDesc;
	private String execute;
	private SaleChance sale;
	private Integer state;
	
	public CustomerPlan(Integer planId, Date planDate, String planDesc,
			String execute, SaleChance sale, Integer state) {
		super();
		this.planId = planId;
		this.planDate = planDate;
		this.planDesc = planDesc;
		this.execute = execute;
		this.sale = sale;
		this.state = state;
	}
	public CustomerPlan() {
		super();
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public Date getPlanDate() {
		return planDate;
	}
	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	public String getPlanDesc() {
		return planDesc;
	}
	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
	}
	public String getExecute() {
		return execute;
	}
	public void setExecute(String execute) {
		this.execute = execute;
	}
	public SaleChance getSale() {
		return sale;
	}
	public void setSale(SaleChance sale) {
		this.sale = sale;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}

	// Constructors
}