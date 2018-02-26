package com.demo.action;

import java.util.ArrayList;
import java.util.List;

import com.demo.biz.ContextPersonBiz;
import com.demo.biz.CustomerBiz;
import com.demo.biz.impl.ContextPersonBizImpl;
import com.demo.biz.impl.CustomerBizImpl;
import com.demo.pojo.ContextPerson;
import com.demo.pojo.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class ContextPersonAction extends ActionSupport{
	ContextPersonBiz cobiz=new ContextPersonBizImpl();
	List<ContextPerson> perlist=new ArrayList<ContextPerson>();
	public ContextPerson ContextPerson=new ContextPerson();
	public int id;
	public int customerId;
	private Customer cus;
	private CustomerBiz cubiz=new CustomerBizImpl();
    private ContextPerson person;
	public String PerAll(){//查询客户信息管理联系人
		perlist=cobiz.getById(customerId);
		cus=cubiz.findById(customerId);
		return SUCCESS;
	}
	
	public String PerUpda(){//修改联系人
		ContextPerson=cobiz.findById(id);
		ContextPerson.setPersonName(person.getPersonName());
		ContextPerson.setPersonPosition(person.getPersonPosition());
		ContextPerson.setPersonPhone(person.getPersonPhone());
		ContextPerson.setPersonSex(person.getPersonSex());
		ContextPerson.setPersonTel(person.getPersonTel());
		ContextPerson.setPersonRemarks(person.getPersonRemarks());
		cobiz.attachDirty(ContextPerson);
		return SUCCESS;
	}
	
	public String PerDele(){//删除联系人
		ContextPerson=cobiz.findById(id);
		cobiz.deletPerson(ContextPerson);
		return SUCCESS;
	}
	public String getById(){
		person=cobiz.findById(id);
		return SUCCESS;
	}
	public List<ContextPerson> getPerlist() {
		return perlist;
	}
	public void setPerlist(List<ContextPerson> perlist) {
		this.perlist = perlist;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ContextPerson getContextPerson() {
		return ContextPerson;
	}

	public void setContextPerson(ContextPerson contextPerson) {
		ContextPerson = contextPerson;
	}

	public ContextPersonBiz getCobiz() {
		return cobiz;
	}

	public void setCobiz(ContextPersonBiz cobiz) {
		this.cobiz = cobiz;
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

	public ContextPerson getPerson() {
		return person;
	}

	public void setPerson(ContextPerson person) {
		this.person = person;
	}

}
