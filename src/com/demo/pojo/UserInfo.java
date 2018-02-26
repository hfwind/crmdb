package com.demo.pojo;

import java.util.Date;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
public class UserInfo implements java.io.Serializable {

	// Fields
    
	private Integer userId;
	private String userName;
	private String userPwd;
	private String trueName;
	private String userTel;
	private RoleInfo role;
	private Date registerData;
	private Integer state;
	private String userPic;

	
	public UserInfo() {
		super();
	}
    
	public UserInfo(Integer userId, String userName, String userPwd,
			String trueName, String userTel, RoleInfo role, Date registerData,
			Integer state, String userPic) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.trueName = trueName;
		this.userTel = userTel;
		this.role = role;
		this.registerData = registerData;
		this.state = state;
		this.userPic = userPic;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getUserTel() {
		return this.userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	
	public RoleInfo getRole() {
		return role;
	}

	public void setRole(RoleInfo role) {
		this.role = role;
	}

	public Date getRegisterData() {
		return this.registerData;
	}

	public void setRegisterData(Date registerData) {
		this.registerData = registerData;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getUserPic() {
		return this.userPic;
	}

	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}

}