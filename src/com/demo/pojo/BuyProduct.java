package com.demo.pojo;

import java.util.Date;

/**
 * BuyProduct entity. @author MyEclipse Persistence Tools
 */

public class BuyProduct implements java.io.Serializable {

	// Fields

	private Integer buyId;
	private Customer customer;
	private Date buyDate;
	private String buyAddr;
	private Integer totalMoney;
	private Integer state;
	public BuyProduct(Integer buyId, Customer customer, Date buyDate,
			String buyAddr, Integer totalMoney, Integer state) {
		super();
		this.buyId = buyId;
		this.customer = customer;
		this.buyDate = buyDate;
		this.buyAddr = buyAddr;
		this.totalMoney = totalMoney;
		this.state = state;
	}
	public BuyProduct() {
		super();
	}
	public Integer getBuyId() {
		return buyId;
	}
	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	public String getBuyAddr() {
		return buyAddr;
	}
	public void setBuyAddr(String buyAddr) {
		this.buyAddr = buyAddr;
	}
	public Integer getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(Integer totalMoney) {
		this.totalMoney = totalMoney;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}


}