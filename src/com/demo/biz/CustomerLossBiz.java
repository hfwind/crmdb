package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.CustomerLoss;

public interface CustomerLossBiz {
	public List<CustomerLoss> findAll();
	public List findSize();//��ҳ
	public List<CustomerLoss> findByCondition(CrmVo vo);//��������ѯ
	public CustomerLoss findById(int id);//��id��ѯ
	public void attachDirty(CustomerLoss instance); //�޸�
	public List<CustomerLoss> findByLossfenxi(CrmVo vo);//��ʧ����������
}
