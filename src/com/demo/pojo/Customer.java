package com.demo.pojo;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private String customerNumber;
	private String customerName;
	private String customerRegion;
	private UserInfo user;
	private CustomterGrade grade;
	private Integer satisfaction;
	private Integer credit;
	private String customerAddr;
	private String mail;
	private String customerrPhone;
	private String customerFax;
	private String customerUrl;
	private String businessLicence;
	private String corporation;
	private Integer money;
	private String annualTurnover;
	private String openBank;
	private String bankNumber;
	private String landTax;
	private String stateTax;
	private Integer state;



	// Property accessors
	

	public Integer getCustomerId() {
		return this.customerId;
	}

	public Customer() {
		super();
	}
    
	public Customer(Integer customerId, String customerNumber,
			String customerName, String customerRegion, UserInfo user,
			CustomterGrade grade, Integer satisfaction, Integer credit,
			String customerAddr, String mail, String customerrPhone,
			String customerFax, String customerUrl, String businessLicence,
			String corporation, Integer money, String annualTurnover,
			String openBank, String bankNumber, String landTax,
			String stateTax, Integer state) {
		super();
		this.customerId = customerId;
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerRegion = customerRegion;
		this.user = user;
		this.grade = grade;
		this.satisfaction = satisfaction;
		this.credit = credit;
		this.customerAddr = customerAddr;
		this.mail = mail;
		this.customerrPhone = customerrPhone;
		this.customerFax = customerFax;
		this.customerUrl = customerUrl;
		this.businessLicence = businessLicence;
		this.corporation = corporation;
		this.money = money;
		this.annualTurnover = annualTurnover;
		this.openBank = openBank;
		this.bankNumber = bankNumber;
		this.landTax = landTax;
		this.stateTax = stateTax;
		this.state = state;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerRegion() {
		return this.customerRegion;
	}

	public void setCustomerRegion(String customerRegion) {
		this.customerRegion = customerRegion;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public CustomterGrade getGrade() {
		return grade;
	}

	public void setGrade(CustomterGrade grade) {
		this.grade = grade;
	}

	public Integer getSatisfaction() {
		return this.satisfaction;
	}

	public void setSatisfaction(Integer satisfaction) {
		this.satisfaction = satisfaction;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getCustomerAddr() {
		return this.customerAddr;
	}

	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCustomerrPhone() {
		return this.customerrPhone;
	}

	public void setCustomerrPhone(String customerrPhone) {
		this.customerrPhone = customerrPhone;
	}

	public String getCustomerFax() {
		return this.customerFax;
	}

	public void setCustomerFax(String customerFax) {
		this.customerFax = customerFax;
	}

	public String getCustomerUrl() {
		return this.customerUrl;
	}

	public void setCustomerUrl(String customerUrl) {
		this.customerUrl = customerUrl;
	}

	public String getBusinessLicence() {
		return this.businessLicence;
	}

	public void setBusinessLicence(String businessLicence) {
		this.businessLicence = businessLicence;
	}

	public String getCorporation() {
		return this.corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getAnnualTurnover() {
		return this.annualTurnover;
	}

	public void setAnnualTurnover(String annualTurnover) {
		this.annualTurnover = annualTurnover;
	}

	public String getOpenBank() {
		return this.openBank;
	}

	public void setOpenBank(String openBank) {
		this.openBank = openBank;
	}

	public String getBankNumber() {
		return this.bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getLandTax() {
		return this.landTax;
	}

	public void setLandTax(String landTax) {
		this.landTax = landTax;
	}

	public String getStateTax() {
		return this.stateTax;
	}

	public void setStateTax(String stateTax) {
		this.stateTax = stateTax;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}