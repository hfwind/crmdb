package com.demo.dao;

import java.util.List;

import com.demo.pojo.CustomerPlan;
import com.demo.pojo.SaleChance;

public interface CustomerPlanDao {

	//��ѯ�����û��ƻ�
	public List<CustomerPlan> findAll();
	//��ҳ��ѯ
	public List<CustomerPlan> findSize();
	//ɾ���û��ƻ�
	public void deletePlan(CustomerPlan cp);
	//����ID��ѯһ���ƻ�
	public CustomerPlan findById(int cid);
	//���һ���ƻ�
	public void save(CustomerPlan cp);
	
	public List<CustomerPlan> getById(int saleId);
}
