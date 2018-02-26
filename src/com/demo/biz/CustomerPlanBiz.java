package com.demo.biz;

import java.util.List;

import com.demo.pojo.CustomerPlan;

public interface CustomerPlanBiz {

	//查询所有用户计划
	public List<CustomerPlan> findAll();
	//分页查询用户计划
	public List<CustomerPlan> findSize();
	//删除用户计划
	public void deletePlan(CustomerPlan cp);
	//根据ID查询一条计划
	public CustomerPlan findById(int cid);
	//添加一条计划
	public void save(CustomerPlan cp);
	
	public List<CustomerPlan> getById(int saleId);
}
