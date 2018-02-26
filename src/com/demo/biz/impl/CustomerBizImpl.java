package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.CustomerBiz;
import com.demo.dao.CustomerDao;
import com.demo.dao.impl.CustomerDaoImpl;
import com.demo.pojo.Customer;
import com.demo.pojo.Power;

public class CustomerBizImpl implements  CustomerBiz{
CustomerDao cust=new CustomerDaoImpl();
@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return cust.findAll();
	}
@Override
	public List getByIdCustomer() {
		// TODO Auto-generated method stub
		return cust.getByIdCustomer();
	}
@Override
	public List findSize() {
		// TODO Auto-generated method stub
		return cust.findSize();
	}
@Override
	public List<Customer> findByCondition(CrmVo vo) {
		// TODO Auto-generated method stub
		return cust.findByCondition(vo);
	}
@Override
public Customer findById(int id) {
	// TODO Auto-generated method stub
	return cust.findById(id);
}
@Override
public void deletCustomer(Customer cus) {
	// TODO Auto-generated method stub
	cust.deletCustomer(cus);
}
@Override
public List All() {
	// TODO Auto-generated method stub
	return cust.All();
}
@Override
public void attachDirty(Customer instance) {
	// TODO Auto-generated method stub
	cust.attachDirty(instance);
}
@Override
public List<Customer> getgoucheng() {
	// TODO Auto-generated method stub
	return cust.findAllgoucheng();
}
}
