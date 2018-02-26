package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.Customer;
import com.demo.pojo.Power;

public interface CustomerBiz {
//��ѯ���пͻ�����
public List findAll();
//��ѯ���пͻ���������
public List getByIdCustomer();
//��ѯ�ܹ�����������
public List findSize();
//��������ѯ
public List<Customer> findByCondition(CrmVo vo);
//ɾ���ͻ�
public void deletCustomer(Customer cus);
//����ID��ѯ
public Customer findById(int id);
public List All();
public void attachDirty(Customer instance);
//���ɷ���
public List<Customer> getgoucheng();
}
