package com.demo.pojo;

import java.util.Date;

/**
 * CustomerLoss entity. @author MyEclipse Persistence Tools
 */

public class CustomerLoss implements java.io.Serializable {

	// Fields

	private Integer lossId;
	private BuyProduct buy;
	private Date lossDate;
	private String lossWhy;
	private String reprieve;
	private Integer state;
	public String getstateName(){
		String str="ÇëÑ¡Ôñ";
		switch(this.state){
		case 0: str="Ô¤¾¯";break;
		case 1: str="ÔÝ»ºÁ÷Ê§";break;
		case 2: str="ÒÑÁ÷Ê§";break;
		}
		return str;
	}
	public CustomerLoss() {
		super();
	}
	public CustomerLoss(Integer lossId, BuyProduct buy, Date lossDate,
			String lossWhy, String reprieve, Integer state) {
		super();
		this.lossId = lossId;
		this.buy = buy;
		this.lossDate = lossDate;
		this.lossWhy = lossWhy;
		this.reprieve = reprieve;
		this.state = state;
	}
	public Integer getLossId() {
		return lossId;
	}
	public void setLossId(Integer lossId) {
		this.lossId = lossId;
	}
	public BuyProduct getBuy() {
		return buy;
	}
	public void setBuy(BuyProduct buy) {
		this.buy = buy;
	}
	public Date getLossDate() {
		return lossDate;
	}
	public void setLossDate(Date lossDate) {
		this.lossDate = lossDate;
	}
	public String getLossWhy() {
		return lossWhy;
	}
	public void setLossWhy(String lossWhy) {
		this.lossWhy = lossWhy;
	}
	public String getReprieve() {
		return reprieve;
	}
	public void setReprieve(String reprieve) {
		this.reprieve = reprieve;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}


}