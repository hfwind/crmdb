package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.Customer;

public interface CustomerDao {
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
public List findAllgoucheng();
}
