package com.demo.pojo;

/**
 * Sysnav entity. @author MyEclipse Persistence Tools
 */

public class Sysnav implements java.io.Serializable {

	// Fields

	private Integer navId;
	private String navName;
	private String pid;
	private String url;
	private String desc;
	private Integer state;
	private Integer index;

	// Constructors

	/** default constructor */
	public Sysnav() {
	}

	/** full constructor */
	public Sysnav(String navName, String pid, String url, String desc,
			Integer state, Integer index) {
		this.navName = navName;
		this.pid = pid;
		this.url = url;
		this.desc = desc;
		this.state = state;
		this.index = index;
	}

	// Property accessors

	public Integer getNavId() {
		return this.navId;
	}

	public void setNavId(Integer navId) {
		this.navId = navId;
	}

	public String getNavName() {
		return this.navName;
	}

	public void setNavName(String navName) {
		this.navName = navName;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getIndex() {
		return this.index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

}