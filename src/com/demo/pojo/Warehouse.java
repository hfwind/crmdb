package com.demo.pojo;

/**
 * Warehouse entity. @author MyEclipse Persistence Tools
 */

public class Warehouse implements java.io.Serializable {

	// Fields

	private Integer warehouseId;
	private String warehouseName;
	private Integer state;

	// Constructors

	/** default constructor */
	public Warehouse() {
	}

	/** full constructor */
	public Warehouse(String warehouseName, Integer state) {
		this.warehouseName = warehouseName;
		this.state = state;
	}

	// Property accessors

	public Integer getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName() {
		return this.warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}