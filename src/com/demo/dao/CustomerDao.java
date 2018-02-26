package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.Customer;

public interface CustomerDao {
//查询所有客户详情
public List findAll();
//查询所有客户经理详情
public List getByIdCustomer();
//查询总共多少条数据
public List findSize();
//多条件查询
public List<Customer> findByCondition(CrmVo vo);
//删除客户
public void deletCustomer(Customer cus);
//根据ID查询
public Customer findById(int id);
public List All();
public void attachDirty(Customer instance);
//构成分析
public List findAllgoucheng();
}
