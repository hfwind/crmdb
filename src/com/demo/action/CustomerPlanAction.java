package com.demo.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.demo.biz.CustomerPlanBiz;
import com.demo.biz.SaleChanceBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.impl.CustomerPlanBizImpl;
import com.demo.biz.impl.SaleChanceBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.connection.SystemContext;
import com.demo.pojo.CustomerPlan;
import com.demo.pojo.SaleChance;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerPlanAction extends ActionSupport{
	private SysnavBiz sysbiz=new SysnavBizImpl();
	private SaleChanceBiz sbiz=new SaleChanceBizImpl();
	private List<Sysnav> alllist=new ArrayList<Sysnav>();
	private List<Sysnav> list=new ArrayList<Sysnav>();
	private CustomerPlan cp;
	public CustomerPlan getCp() {
		return cp;
	}
	public void setCp(CustomerPlan cp) {
		this.cp = cp;
	}
	/////////////////////////////////////////////////////////////////
	private CustomerPlanBiz pbiz=new CustomerPlanBizImpl();
	private List<CustomerPlan> plist=new ArrayList<CustomerPlan>();
	private List<SaleChance> slist=new ArrayList<SaleChance>();
	private int pid;
	private int sid;
	private String planDate;
	private String planDesc;
	private int pageMax;
	private int saleId;
	public String findAllPlan(){
		alllist=sysbiz.findAll();
		list=sysbiz.getSysPid(0);
		plist=pbiz.getById(saleId);
		Map<String,Object> session=ActionContext.getContext().getSession();
		UserInfo user=(UserInfo) session.get("user");
		SaleChance sc=sbiz.findById(saleId);
		System.out.println(sc.getDesc());
		session.put("alllist",alllist);
		session.put("list",list);
		session.put("plist",plist);
		session.put("sc", sc);
		return SUCCESS;
	}
	public String deletePlan(){
		CustomerPlan cp=pbiz.findById(pid);
		pbiz.deletePlan(cp);
		return SUCCESS;
	}
	public String addplan () throws ParseException{
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");		
		CustomerPlan c=new CustomerPlan();
		SaleChance s=new SaleChance();
		s.setSaleId(saleId);
		c.setSale(s);
		c.setPlanDate(format1.parse(planDate));
		c.setState(1);
		c.setPlanDesc(planDesc);
		pbiz.save(c);
		return SUCCESS;
		
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public SysnavBiz getSysbiz() {
		return sysbiz;
	}
	public void setSysbiz(SysnavBiz sysbiz) {
		this.sysbiz = sysbiz;
	}
	public SaleChanceBiz getSbiz() {
		return sbiz;
	}
	public void setSbiz(SaleChanceBiz sbiz) {
		this.sbiz = sbiz;
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
	public CustomerPlanBiz getPbiz() {
		return pbiz;
	}
	public void setPbiz(CustomerPlanBiz pbiz) {
		this.pbiz = pbiz;
	}
	public List<CustomerPlan> getPlist() {
		return plist;
	}
	public void setPlist(List<CustomerPlan> plist) {
		this.plist = plist;
	}
	public List<SaleChance> getSlist() {
		return slist;
	}
	public void setSlist(List<SaleChance> slist) {
		this.slist = slist;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getPlanDate() {
		return planDate;
	}
	public void setPlanDate(String planDate) {
		this.planDate = planDate;
	}
	public String getPlanDesc() {
		return planDesc;
	}
	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
	}
	public int getPageMax() {
		return pageMax;
	}
	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	
}
