package com.demo.pojo;

/**
 * ContextPerson entity. @author MyEclipse Persistence Tools
 */

public class ContextPerson implements java.io.Serializable {

	// Fields

	private Integer personId;
	private Customer customerId;
	private String personName;
	private String personSex;
	private String personPosition;
	private String personPhone;
	private String personTel;
	private String personRemarks;
	private Integer state;

	
	public ContextPerson() {
		super();
	}

	public ContextPerson(Integer personId, Customer customerId,
			String personName, String personSex, String personPosition,
			String personPhone, String personTel, String personRemarks,
			Integer state) {
		super();
		this.personId = personId;
		this.customerId = customerId;
		this.personName = personName;
		this.personSex = personSex;
		this.personPosition = personPosition;
		this.personPhone = personPhone;
		this.personTel = personTel;
		this.personRemarks = personRemarks;
		this.state = state;
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonSex() {
		return this.personSex;
	}

	public void setPersonSex(String personSex) {
		this.personSex = personSex;
	}

	public String getPersonPosition() {
		return this.personPosition;
	}

	public void setPersonPosition(String personPosition) {
		this.personPosition = personPosition;
	}

	public String getPersonPhone() {
		return this.personPhone;
	}

	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
	}

	public String getPersonTel() {
		return this.personTel;
	}

	public void setPersonTel(String personTel) {
		this.personTel = personTel;
	}

	public String getPersonRemarks() {
		return this.personRemarks;
	}

	public void setPersonRemarks(String personRemarks) {
		this.personRemarks = personRemarks;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}