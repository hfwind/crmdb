package com.demo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.demo.biz.PowerBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.impl.PowerBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.pojo.Power;
import com.demo.pojo.RoleInfo;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SysnavAction extends ActionSupport{
//sysnavbiz
private SysnavBiz sysbiz=new SysnavBizImpl();
private List<Sysnav> alllist=new ArrayList<Sysnav>();
private List<Sysnav> list=new ArrayList<Sysnav>();
private PowerBiz pobiz=new PowerBizImpl();
private List<Power> polist=new ArrayList<Power>();
public String findAllSysnav(){
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	RoleInfo role=user.getRole();
	polist=pobiz.getById(role.getRoleId());
	session.put("alllist",alllist);
	session.put("list",list);
	session.put("polist",polist);
	return SUCCESS;
}

public SysnavBiz getSysbiz() {
	return sysbiz;
}

public void setSysbiz(SysnavBiz sysbiz) {
	this.sysbiz = sysbiz;
}

public List<Sysnav> getAlllist() {
	return alllist;
}

public void setAlllist(List<Sysnav> alllist) {
	this.alllist = alllist;
}

public List<Sysnav> getList() {
	return list;
}

public void setList(List<Sysnav> list) {
	this.list = list;
}

}
