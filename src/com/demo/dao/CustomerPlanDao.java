package com.demo.dao;

import java.util.List;

import com.demo.pojo.CustomerPlan;
import com.demo.pojo.SaleChance;

public interface CustomerPlanDao {

	//查询所有用户计划
	public List<CustomerPlan> findAll();
	//分页查询
	public List<CustomerPlan> findSize();
	//删除用户计划
	public void deletePlan(CustomerPlan cp);
	//根据ID查询一条计划
	public CustomerPlan findById(int cid);
	//添加一条计划
	public void save(CustomerPlan cp);
	
	public List<CustomerPlan> getById(int saleId);
}
