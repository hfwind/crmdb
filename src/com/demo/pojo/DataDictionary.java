package com.demo.pojo;

/**
 * DataDictionary entity. @author MyEclipse Persistence Tools
 */

public class DataDictionary implements java.io.Serializable {

	// Fields

	private Integer dataId;
	private String dataType;
	private String entry;
	private String dataValue;
	private Integer state;

	// Constructors

	/** default constructor */
	public DataDictionary() {
	}

	/** full constructor */
	public DataDictionary(String dataType, String entry, String dataValue,
			Integer state) {
		this.dataType = dataType;
		this.entry = entry;
		this.dataValue = dataValue;
		this.state = state;
	}

	// Property accessors

	public Integer getDataId() {
		return this.dataId;
	}

	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getEntry() {
		return this.entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public String getDataValue() {
		return this.dataValue;
	}

	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}