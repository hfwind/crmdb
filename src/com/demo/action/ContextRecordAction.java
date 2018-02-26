package com.demo.action;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ContextException;

import com.demo.biz.ContextRecordBiz;
import com.demo.biz.CustomerBiz;
import com.demo.biz.impl.ContextRecordBizImpl;
import com.demo.biz.impl.CustomerBizImpl;
import com.demo.pojo.ContextRecord;
import com.demo.pojo.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class ContextRecordAction extends ActionSupport{
private ContextRecordBiz cbiz=new ContextRecordBizImpl();
private List<ContextRecord> clist=new ArrayList<ContextRecord>();
private int customerId;
private int recordId;
private ContextRecord con;
private Customer cus;
private CustomerBiz cubiz=new CustomerBizImpl();
public String getconById(){
	clist=cbiz.getById(customerId);
	cus=cubiz.findById(customerId);
	return SUCCESS;
}
public String deleteRecord(){
	ContextRecord re=cbiz.findById(recordId);
	cbiz.deletRecord(re);
	return SUCCESS;
}
public String getContextId(){
	con=cbiz.findById(recordId);
	return SUCCESS;
}
public String xiugai(){
	ContextRecord c=cbiz.findById(recordId);
	c.setRecordDate(con.getRecordDate());
	c.setRecordAddr(con.getRecordDesc());
	c.setProfile(con.getProfile());
	c.setRemark(con.getRemark());
	c.setRecordDesc(con.getRecordDesc());
	cbiz.attachDirty(c);
	return SUCCESS;
}
public ContextRecordBiz getCbiz() {
	return cbiz;
}
public void setCbiz(ContextRecordBiz cbiz) {
	this.cbiz = cbiz;
}
public List<ContextRecord> getClist() {
	return clist;
}
public void setClist(List<ContextRecord> clist) {
	this.clist = clist;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getRecordId() {
	return recordId;
}
public void setRecordId(int recordId) {
	this.recordId = recordId;
}
public ContextRecord getCon() {
	return con;
}
public void setCon(ContextRecord con) {
	this.con = con;
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
}
