package com.demo.pojo;

/**
 * Power entity. @author MyEclipse Persistence Tools
 */

public class Power implements java.io.Serializable {

	// Fields

	private Integer powerId;
	private Sysnav navId;
	private RoleInfo roleId;
	public Power() {
		super();
	}
	public Power(Integer powerId, Sysnav navId, RoleInfo roleId) {
		super();
		this.powerId = powerId;
		this.navId = navId;
		this.roleId = roleId;
	}
	public Integer getPowerId() {
		return powerId;
	}
	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}
	public Sysnav getNavId() {
		return navId;
	}
	public void setNavId(Sysnav navId) {
		this.navId = navId;
	}
	public RoleInfo getRoleId() {
		return roleId;
	}
	public void setRoleId(RoleInfo roleId) {
		this.roleId = roleId;
	}

	// Constructors

}