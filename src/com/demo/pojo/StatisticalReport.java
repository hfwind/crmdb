package com.demo.pojo;

/**
 * StatisticalReport entity. @author MyEclipse Persistence Tools
 */

public class StatisticalReport implements java.io.Serializable {

	// Fields

	private Integer reportId;
	private Integer buyId;
	private Integer customerId;
	private Integer serviceId;
	private Integer lossId;
	private Integer state;

	// Constructors

	/** default constructor */
	public StatisticalReport() {
	}

	/** full constructor */
	public StatisticalReport(Integer buyId, Integer customerId,
			Integer serviceId, Integer lossId, Integer state) {
		this.buyId = buyId;
		this.customerId = customerId;
		this.serviceId = serviceId;
		this.lossId = lossId;
		this.state = state;
	}

	// Property accessors

	public Integer getReportId() {
		return this.reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	public Integer getBuyId() {
		return this.buyId;
	}

	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public Integer getLossId() {
		return this.lossId;
	}

	public void setLossId(Integer lossId) {
		this.lossId = lossId;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}