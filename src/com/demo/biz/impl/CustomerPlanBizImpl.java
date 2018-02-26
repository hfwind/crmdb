package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.CustomerPlanBiz;
import com.demo.dao.CustomerPlanDao;
import com.demo.dao.impl.CustomerPlanDaoImpl;
import com.demo.pojo.CustomerPlan;

public class CustomerPlanBizImpl implements CustomerPlanBiz{
	CustomerPlanDao cd=new CustomerPlanDaoImpl();
	//��ѯ�����û��ƻ�
	public List<CustomerPlan> findAll(){
		return cd.findAll();
	}
	//��ҳ��ѯ�����û�
	public List<CustomerPlan> findSize() {
		return cd.findSize();
	}
	//ɾ���û��ƻ�
	public void deletePlan(CustomerPlan cp) {
		cd.deletePlan(cp);
		
	}
	//����ID��ѯһ���ƻ�
	public CustomerPlan findById(int cid){
		return cd.findById(cid);
	}
	//���һ���ƻ�
	public void save(CustomerPlan cp){
		cd.save(cp);
	}
	
	@Override
	public List<CustomerPlan> getById(int saleId) {
		// TODO Auto-generated method stub
		return cd.getById(saleId);
	}
}
