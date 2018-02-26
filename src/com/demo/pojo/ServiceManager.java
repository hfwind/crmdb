package com.demo.pojo;

import java.util.Date;

/**
 * ServiceManager entity. @author MyEclipse Persistence Tools
 */

public class ServiceManager implements java.io.Serializable {

	// Fields

	private Integer serviceId;
	private UserInfo userinfo;
	private String serviceType;
	private String profile;
	private String customerName;
	private Integer state;
	private String serviceRequest;
	private String createPerson;
	private Date serviceDate;
	private Date distributionTime;
	private String serviceProcssing;
	private String procesPerson;
	private Date procesTime;
	private String procesResult;
	private Integer satisfaction;

	// Constructors

	/** default constructor */
	public ServiceManager() {
	}

	/** minimal constructor */
	public ServiceManager( UserInfo userinfo, String serviceType,
			String customerName, Integer state, String createPerson,
			Date serviceDate, Date distributionTime, String procesPerson,
			Integer satisfaction) {
		this.userinfo = userinfo;
		this.serviceType = serviceType;
		this.customerName = customerName;
		this.state = state;
		this.createPerson = createPerson;
		this.serviceDate = serviceDate;
		this.distributionTime = distributionTime;
		this.procesPerson = procesPerson;
		this.satisfaction = satisfaction;
	}

	/** full constructor */
	public ServiceManager(UserInfo userinfo, String serviceType, String profile,
			String customerName, Integer state, String serviceRequest,
			String createPerson, Date serviceDate, Date distributionTime,
			String serviceProcssing, String procesPerson, Date procesTime,
			String procesResult, Integer satisfaction) {
		this.userinfo = userinfo;
		this.serviceType = serviceType;
		this.profile = profile;
		this.customerName = customerName;
		this.state = state;
		this.serviceRequest = serviceRequest;
		this.createPerson = createPerson;
		this.serviceDate = serviceDate;
		this.distributionTime = distributionTime;
		this.serviceProcssing = serviceProcssing;
		this.procesPerson = procesPerson;
		this.procesTime = procesTime;
		this.procesResult = procesResult;
		this.satisfaction = satisfaction;
	}

	// Property accessors

	public Integer getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getServiceRequest() {
		return this.serviceRequest;
	}

	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public String getCreatePerson() {
		return this.createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	public Date getServiceDate() {
		return this.serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public Date getDistributionTime() {
		return this.distributionTime;
	}

	public void setDistributionTime(Date distributionTime) {
		this.distributionTime = distributionTime;
	}

	public String getServiceProcssing() {
		return this.serviceProcssing;
	}

	public void setServiceProcssing(String serviceProcssing) {
		this.serviceProcssing = serviceProcssing;
	}

	public String getProcesPerson() {
		return this.procesPerson;
	}

	public void setProcesPerson(String procesPerson) {
		this.procesPerson = procesPerson;
	}

	public Date getProcesTime() {
		return this.procesTime;
	}

	public void setProcesTime(Date procesTime) {
		this.procesTime = procesTime;
	}

	public String getProcesResult() {
		return this.procesResult;
	}

	public void setProcesResult(String procesResult) {
		this.procesResult = procesResult;
	}

	public Integer getSatisfaction() {
		return this.satisfaction;
	}

	public void setSatisfaction(Integer satisfaction) {
		this.satisfaction = satisfaction;
	}

}