package com.demo.action;

import com.demo.biz.PowerBiz;
import com.demo.biz.impl.PowerBizImpl;
import com.demo.pojo.Power;
import com.demo.pojo.RoleInfo;
import com.demo.pojo.Sysnav;
import com.opensymphony.xwork2.ActionSupport;

public class PowerAction extends ActionSupport{
private int role;
private int[] pow;
private PowerBiz pobiz=new PowerBizImpl();
public String addpower(){
	Power power=new Power();
	Sysnav nav=new Sysnav();
	RoleInfo roleinfo=new RoleInfo();
	for(int n : pow){
		System.out.println(n);
		roleinfo.setRoleId(role);
		nav.setNavId(n);
		power.setNavId(nav);
		power.setRoleId(roleinfo);
		pobiz.save(power);
	}
	return SUCCESS;
}
public int getRole() {
	return role;
}
public void setRole(int role) {
	this.role = role;
}
public int[] getPow() {
	return pow;
}
public void setPow(int[] pow) {
	this.pow = pow;
}
public PowerBiz getPobiz() {
	return pobiz;
}
public void setPobiz(PowerBiz pobiz) {
	this.pobiz = pobiz;
}

}
