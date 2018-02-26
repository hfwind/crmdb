package com.demo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.RoleInfoBiz;
import com.demo.biz.UserInfoBiz;
import com.demo.biz.impl.RoleInfoBizImpl;
import com.demo.biz.impl.UserInfoBizImpl;
import com.demo.pojo.RoleInfo;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoAction extends ActionSupport{

	private String userName;
	private String userPwd;
	private String smg;
	private UserInfo user=new UserInfo();
	private UserInfoBiz ub=new UserInfoBizImpl();
	private List<UserInfo> ulist=new ArrayList<UserInfo>();
	private int id;
	private UserInfo u;
	private RoleInfoBiz rolebiz=new RoleInfoBizImpl();
	private List<RoleInfo> rlist=new ArrayList<RoleInfo>();
	private int roleId;
	//登陆ACTION
	public String login(){
		user=ub.login(userName, userPwd);
		if(user!=null){
			Map<String, Object> session=ActionContext.getContext().getSession();
			session.put("user",user);
			return SUCCESS;
		}else{
			smg="账号或密码错误!";
			return INPUT;
		}
		
	}
	//查询所有职工
	public String getAllUser(){
		ulist=ub.findAll();
		Map<String,Object> session=ActionContext.getContext().getSession();
		UserInfo user=(UserInfo) session.get("user");
		session.put("ulist",ulist);	
		return SUCCESS;
	}
	//删除职工
	public String deleteaa(){
		user=ub.findById(id);
		user.setState(-1);
		ub.attachDirty(user);
		return SUCCESS;
	}
	public String getById(){
		user=ub.findById(id);
		return SUCCESS;
	}
	//查询所有职位
	public String getAllRole(){
		rlist=rolebiz.findAll();
		return SUCCESS;
	}
	public String addUserInfo(){
		RoleInfo r=new RoleInfo();
		r.setRoleId(roleId);
		user.setRole(r);
		ub.save(user);
		return SUCCESS;
	}
	public String updateUser(){
		u=ub.findById(id);
		u.setUserName(user.getUserName());
		u.setUserPwd(user.getUserPwd());
		u.setUserTel(user.getUserTel());
		u.setRegisterData(user.getRegisterData());
		ub.attachDirty(u);
		return SUCCESS;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getSmg() {
		return smg;
	}
	public void setSmg(String smg) {
		this.smg = smg;
	}
	public UserInfoBiz getUb() {
		return ub;
	}
	public void setUb(UserInfoBiz ub) {
		this.ub = ub;
	}
	public List<UserInfo> getUlist() {
		return ulist;
	}
	public void setUlist(List<UserInfo> ulist) {
		this.ulist = ulist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserInfo getU() {
		return u;
	}
	public void setU(UserInfo u) {
		this.u = u;
	}
	public RoleInfoBiz getRolebiz() {
		return rolebiz;
	}
	public void setRolebiz(RoleInfoBiz rolebiz) {
		this.rolebiz = rolebiz;
	}
	public List<RoleInfo> getRlist() {
		return rlist;
	}
	public void setRlist(List<RoleInfo> rlist) {
		this.rlist = rlist;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}
