package com.demo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.demo.biz.BuyProductBiz;
import com.demo.biz.CustomerBiz;
import com.demo.biz.impl.BuyProductBizImpl;
import com.demo.biz.impl.CrmVo;
import com.demo.biz.impl.CustomerBizImpl;
import com.demo.pojo.BuyProduct;
import com.demo.pojo.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BuyProductAction extends ActionSupport{
private BuyProductBiz buybiz=new BuyProductBizImpl();
private List<BuyProduct> blist=new ArrayList<BuyProduct>();
private int customerId;
private Customer cus;
private int cid;
private CustomerBiz cubiz=new CustomerBizImpl();
private BuyProduct buy=new BuyProduct();
private CrmVo vo=new CrmVo();


public String getfindById(){
	blist=buybiz.getById(customerId);
	cus=cubiz.findById(customerId);
	return SUCCESS;
}
//¹±Ï×
public String getProduct(){
	blist=buybiz.getAllProduct();
	return SUCCESS;
}
//É¸Ñ¡¹±Ï×
public String shaixuangongxian(){
	HttpSession session=ServletActionContext.getRequest().getSession();
	CrmVo cvo=null;
	if(session.getAttribute("vo")!=null){
		cvo=(CrmVo) session.getAttribute("vo");
		if(vo.getGongxianName()!=null){
			cvo.setGongxianName(vo.getGongxianName());
		}else{
			cvo.setGongxianName(null);
		}
	}else{
		cvo=vo;
	}
	session.setAttribute("vo", cvo);
	blist=buybiz.getAllgongxian(cvo);
	return SUCCESS;
}
public String getBuyProduct(){
	buy=buybiz.findById(cid);
	Map<String, Object> session = ActionContext.getContext().getSession();
	session.put("buy", buy);
	return SUCCESS;
}
public BuyProductBiz getBuybiz() {
	return buybiz;
}
public void setBuybiz(BuyProductBiz buybiz) {
	this.buybiz = buybiz;
}

public List<BuyProduct> getBlist() {
	return blist;
}
public void setBlist(List<BuyProduct> blist) {
	this.blist = blist;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public Customer getCus() {
	return cus;
}
public void setCus(Customer cus) {
	this.cus = cus;
}
public CustomerBiz getCubiz() {
	return cubiz;
}
public void setCubiz(CustomerBiz cubiz) {
	this.cubiz = cubiz;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public BuyProduct getBuy() {
	return buy;
}
public void setBuy(BuyProduct buy) {
	this.buy = buy;
}
public CrmVo getVo() {
	return vo;
}
public void setVo(CrmVo vo) {
	this.vo = vo;
}
}
