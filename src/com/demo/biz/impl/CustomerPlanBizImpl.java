package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.CustomerPlanBiz;
import com.demo.dao.CustomerPlanDao;
import com.demo.dao.impl.CustomerPlanDaoImpl;
import com.demo.pojo.CustomerPlan;

public class CustomerPlanBizImpl implements CustomerPlanBiz{
	CustomerPlanDao cd=new CustomerPlanDaoImpl();
	//查询所有用户计划
	public List<CustomerPlan> findAll(){
		return cd.findAll();
	}
	//分页查询所有用户
	public List<CustomerPlan> findSize() {
		return cd.findSize();
	}
	//删除用户计划
	public void deletePlan(CustomerPlan cp) {
		cd.deletePlan(cp);
		
	}
	//根据ID查询一条计划
	public CustomerPlan findById(int cid){
		return cd.findById(cid);
	}
	//添加一条计划
	public void save(CustomerPlan cp){
		cd.save(cp);
	}
	
	@Override
	public List<CustomerPlan> getById(int saleId) {
		// TODO Auto-generated method stub
		return cd.getById(saleId);
	}
}
