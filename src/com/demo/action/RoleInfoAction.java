package com.demo.action;

import java.util.ArrayList;
import java.util.List;

import com.demo.biz.RoleInfoBiz;
import com.demo.biz.impl.RoleInfoBizImpl;
import com.demo.pojo.RoleInfo;
import com.opensymphony.xwork2.ActionSupport;

public class RoleInfoAction extends ActionSupport{
private RoleInfoBiz rolebiz=new RoleInfoBizImpl();
private List<RoleInfo> rolist=new ArrayList<RoleInfo>();
public String findAllRole(){
	rolist=rolebiz.findAll();
	return SUCCESS;
}
public RoleInfoBiz getRolebiz() {
	return rolebiz;
}
public void setRolebiz(RoleInfoBiz rolebiz) {
	this.rolebiz = rolebiz;
}
public List<RoleInfo> getRolist() {
	return rolist;
}
public void setRolist(List<RoleInfo> rolist) {
	this.rolist = rolist;
}

}
