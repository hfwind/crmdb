package com.demo.biz;

import java.util.List;

import com.demo.pojo.CustomerPlan;

public interface CustomerPlanBiz {

	//��ѯ�����û��ƻ�
	public List<CustomerPlan> findAll();
	//��ҳ��ѯ�û��ƻ�
	public List<CustomerPlan> findSize();
	//ɾ���û��ƻ�
	public void deletePlan(CustomerPlan cp);
	//����ID��ѯһ���ƻ�
	public CustomerPlan findById(int cid);
	//���һ���ƻ�
	public void save(CustomerPlan cp);
	
	public List<CustomerPlan> getById(int saleId);
}
