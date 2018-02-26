package com.demo.pojo;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer productId;
	private String productName;
	private String goods;
	private Integer productNum;
	private Integer productMoney;
	private String remark;
	private Integer state;
	private Warehouse war;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public Integer getProductNum() {
		return productNum;
	}
	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}
	public Integer getProductMoney() {
		return productMoney;
	}
	public void setProductMoney(Integer productMoney) {
		this.productMoney = productMoney;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Warehouse getWar() {
		return war;
	}
	public void setWar(Warehouse war) {
		this.war = war;
	}
	public Product(Integer productId, String productName, String goods,
			Integer productNum, Integer productMoney, String remark,
			Integer state, Warehouse war) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.goods = goods;
		this.productNum = productNum;
		this.productMoney = productMoney;
		this.remark = remark;
		this.state = state;
		this.war = war;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	// Constructors

	/** default constructor */
}