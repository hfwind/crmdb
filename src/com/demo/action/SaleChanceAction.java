package com.demo.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.CustomerBiz;
import com.demo.biz.SaleChanceBiz;
import com.demo.biz.SysnavBiz;
import com.demo.biz.UserInfoBiz;
import com.demo.biz.impl.CrmVo;
import com.demo.biz.impl.CustomerBizImpl;
import com.demo.biz.impl.SaleChanceBizImpl;
import com.demo.biz.impl.SysnavBizImpl;
import com.demo.biz.impl.UserInfoBizImpl;
import com.demo.connection.SystemContext;
import com.demo.pojo.Customer;
import com.demo.pojo.SaleChance;
import com.demo.pojo.Sysnav;
import com.demo.pojo.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SaleChanceAction extends ActionSupport {
private List<SaleChance>sclist=new ArrayList<SaleChance>();

private SysnavBiz sysbiz=new SysnavBizImpl();
private List<Sysnav> alllist=new ArrayList<Sysnav>();
private List<Sysnav> list=new ArrayList<Sysnav>();
private int pageMax;
private int saleId;
private SaleChanceBiz scb=new SaleChanceBizImpl();
private CrmVo vo=new CrmVo();
private SaleChance salechance;
private UserInfoBiz us=new UserInfoBizImpl();
private List<UserInfo> userlist=new ArrayList<UserInfo>();
//所有销售机会
public String getAllSaleChance(){	
	pageMax=scb.getSaleSize().size();
	SystemContext.setPageOffset(0);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	sclist=scb.getAllSale();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	return SUCCESS;
}
//查询已分配的销售机会
public String getIdSaleChance(){	
	pageMax=scb.getSaleSize().size();
	SystemContext.setPageOffset(0);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	sclist=scb.getByIdSale();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	return SUCCESS;
}
//分页
public String getAllSale(){
	HttpServletRequest request = ServletActionContext.getRequest();
	SystemContext.setPageOffset(0);
	if(request.getParameter("pager.offset") != null || !"".equals(request.getParameter("pager.offset"))){
		SystemContext.setPageOffset(Integer.parseInt(request.getParameter("pager.offset")));
	}
	pageMax=scb.getSaleSize().size();
	
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	sclist=scb.getAllSale();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	return SUCCESS;
}
//已分配的销售计划分页
public String getAllSalefenye(){
	HttpServletRequest request = ServletActionContext.getRequest();
	SystemContext.setPageOffset(0);
	if(request.getParameter("pager.offset") != null || !"".equals(request.getParameter("pager.offset"))){
		SystemContext.setPageOffset(Integer.parseInt(request.getParameter("pager.offset")));
	}
	pageMax=scb.getSaleSize().size();
	
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	sclist=scb.getByIdSale();
	Map<String,Object> session=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) session.get("user");
	session.put("alllist",alllist);
	session.put("list",list);
	return SUCCESS;
}
//删除销售机会
public String deletSale(){
	SaleChance sale=scb.findById(saleId);
	scb.deleteSale(sale);
	return SUCCESS;
}
//筛选查询
public String getSaleChanceToAjax(){
	HttpSession session=ServletActionContext.getRequest().getSession();
	CrmVo cvo=null;
	if(session.getAttribute("vo")!=null){
		cvo=(CrmVo) session.getAttribute("vo");
		if(vo.getKehuName()!=null){
			cvo.setKehuName(vo.getKehuName());
		}else{
			cvo.setKehuName(null);
		}
		if(vo.getPrefile()!=null){
			cvo.setPrefile(vo.getPrefile());
		}else{
			cvo.setPrefile(null);
		}
		if(vo.getLineMan()!=null){
			cvo.setLineMan(vo.getLineMan());
		}else{
			cvo.setLineMan(null);
		}
	}else{
		cvo=vo;		
	}
	session.setAttribute("vo", cvo);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	sclist=scb.findByCondition(cvo);
	Map<String,Object> sessions=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) sessions.get("user");
	sessions.put("alllist",alllist);
	sessions.put("list",list);
	return SUCCESS;

} 
//已分配的销售机会筛选查询
public String getSaleChanceToAjaxfenpei(){
	HttpSession session=ServletActionContext.getRequest().getSession();
	CrmVo cvo=null;
	if(session.getAttribute("vo")!=null){
		cvo=(CrmVo) session.getAttribute("vo");
		if(vo.getKehuName()!=null){
			cvo.setKehuName(vo.getKehuName());
		}else{
			cvo.setKehuName(null);
		}
		if(vo.getPrefile()!=null){
			cvo.setPrefile(vo.getPrefile());
		}else{
			cvo.setPrefile(null);
		}
		if(vo.getLineMan()!=null){
			cvo.setLineMan(vo.getLineMan());
		}else{
			cvo.setLineMan(null);
		}
	}else{
		cvo=vo;		
	}
	session.setAttribute("vo", cvo);
	alllist=sysbiz.findAll();
	list=sysbiz.getSysPid(0);
	sclist=scb.findByConditions(cvo);
	Map<String,Object> sessions=ActionContext.getContext().getSession();
	UserInfo user=(UserInfo) sessions.get("user");
	sessions.put("alllist",alllist);
	sessions.put("list",list);
	return SUCCESS;

} 
//查看详情
public String salexiang(){
	salechance=scb.findById(saleId);
	userlist=us.getByIdUserInfo();
	return SUCCESS;
}
//修改销售机会
public String updateSaleChance(){
SaleChance sale=scb.findById(saleId);
sale.setSaleSource(salechance.getSaleSource());
sale.setCustomerName(salechance.getCustomerName());
sale.setLinkman(salechance.getLinkman());
sale.setLinkTel(salechance.getLinkTel());
sale.setProfile(salechance.getProfile());
sale.setDesc(salechance.getDesc());
sale.setSuccess(salechance.getSuccess());
sale.setSaleId(salechance.getSaleId());
scb.xiuGaiSale(sale);
return SUCCESS;
}
//添加销售机会
public String addSale(){
	/*System.out.println(salechance.getFounder());
	System.out.println(salechance.getLinkTel());
	scb.save(salechance);*/
	scb.saveSale(salechance);
	return SUCCESS;
}
//分配销售计划
public String fenpeifuwu(){
	SaleChance sale=scb.findById(saleId);
	UserInfo user=new UserInfo();
	user.setUserId(salechance.getUserinfo().getUserId());
	sale.setUserinfo(user);
	sale.setAssignmentTime(salechance.getAssignmentTime());
	sale.setSaleId(saleId);
	scb.updatefen(sale);
	return SUCCESS;
}
//终止计划
public String zhonzhijihua(){
	SaleChance sale=scb.findById(saleId);
	sale.setState(3);
	scb.statea(sale);
	return SUCCESS;
}
//开发成功
public String kaifaok(){
	SaleChance sale=scb.findById(saleId);
	sale.setState(2);
	scb.statea(sale);
	return SUCCESS;
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
public List<SaleChance> getSclist() {
	return sclist;
}

public void setSclist(List<SaleChance> sclist) {
	this.sclist = sclist;
}
public int getPageMax() {
	return pageMax;
}
public void setPageMax(int pageMax) {
	this.pageMax = pageMax;
}

public SysnavBiz getSysbiz() {
	return sysbiz;
}

public void setSysbiz(SysnavBiz sysbiz) {
	this.sysbiz = sysbiz;
}

public SaleChanceBiz getScb() {
	return scb;
}

public void setScb(SaleChanceBiz scb) {
	this.scb = scb;
}

public int getSaleId() {
	return saleId;
}

public void setSaleId(int saleId) {
	this.saleId = saleId;
}
public CrmVo getVo() {
	return vo;
}
public void setVo(CrmVo vo) {
	this.vo = vo;
}
public SaleChance getSalechance() {
	return salechance;
}
public void setSalechance(SaleChance salechance) {
	this.salechance = salechance;
}
public UserInfoBiz getUs() {
	return us;
}
public void setUs(UserInfoBiz us) {
	this.us = us;
}
public List<UserInfo> getUserlist() {
	return userlist;
}
public void setUserlist(List<UserInfo> userlist) {
	this.userlist = userlist;
}
}
