package com.demo.biz.impl;

import com.demo.pojo.BuyProduct;
import com.demo.pojo.Customer;
import com.demo.pojo.CustomerLoss;
import com.demo.pojo.CustomterGrade;
import com.demo.pojo.UserInfo;
import com.demo.pojo.Warehouse;

public class CrmVo {
private String customerId;//客户编号
private String customerName;//名称
private String addr;//地址
private String customerjl;//客户经理
private CustomterGrade grade;//客户等级
private Customer customer;//客户流失
private UserInfo user;//客户经理
private Integer stateaa;//客户流失状态
private String kehuName;//销售管理客户名称
private String prefile;//销售管理概要
private String lineMan;//销售管理联系人
private int dataId; //数据字典编号
private String dataType; //数据类别
private String entry;  //数据条目
private String dataValue; //数据值
private String productName;//产品名称
private Warehouse war;
private String remark;//产品型号
private String goods;//货号
private String fuwutype;//服务类型
private String gongxianName;//贡献分析里面的客户名称
public String getGongxianName() {
	return gongxianName;
}
public void setGongxianName(String gongxianName) {
	this.gongxianName = gongxianName;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getCustomerjl() {
	return customerjl;
}
public void setCustomerjl(String customerjl) {
	this.customerjl = customerjl;
}
public CustomterGrade getGrade() {
	return grade;
}
public void setGrade(CustomterGrade grade) {
	this.grade = grade;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public UserInfo getUser() {
	return user;
}
public void setUser(UserInfo user) {
	this.user = user;
}
public Integer getStateaa() {
	return stateaa;
}
public void setStateaa(Integer stateaa) {
	this.stateaa = stateaa;
}
public String getKehuName() {
	return kehuName;
}
public void setKehuName(String kehuName) {
	this.kehuName = kehuName;
}
public String getPrefile() {
	return prefile;
}
public void setPrefile(String prefile) {
	this.prefile = prefile;
}
public String getLineMan() {
	return lineMan;
}
public void setLineMan(String lineMan) {
	this.lineMan = lineMan;
}
public int getDataId() {
	return dataId;
}
public void setDataId(int dataId) {
	this.dataId = dataId;
}
public String getDataType() {
	return dataType;
}
public void setDataType(String dataType) {
	this.dataType = dataType;
}
public String getEntry() {
	return entry;
}
public void setEntry(String entry) {
	this.entry = entry;
}
public String getDataValue() {
	return dataValue;
}
public void setDataValue(String dataValue) {
	this.dataValue = dataValue;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Warehouse getWar() {
	return war;
}
public void setWar(Warehouse war) {
	this.war = war;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public String getGoods() {
	return goods;
}
public void setGoods(String goods) {
	this.goods = goods;
}
public String getFuwutype() {
	return fuwutype;
}
public void setFuwutype(String fuwutype) {
	this.fuwutype = fuwutype;
}

}
