package com.demo.pojo;

/**
 * RoleInfo entity. @author MyEclipse Persistence Tools
 */

public class RoleInfo implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private String roleRemark;
	private Integer state;

	// Constructors

	/** default constructor */
	public RoleInfo() {
	}

	/** minimal constructor */
	public RoleInfo(String roleName, String roleRemark) {
		this.roleName = roleName;
		this.roleRemark = roleRemark;
	}

	/** full constructor */
	public RoleInfo(String roleName, String roleRemark, Integer state) {
		this.roleName = roleName;
		this.roleRemark = roleRemark;
		this.state = state;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleRemark() {
		return this.roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}