package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.BuyProduct;

public interface BuyProductDao {
//���ݿͻ������ѯ��ʷ����
public List getById(int customerId);
//��ѯ����
public List findAll();
//��ѯ�ܹ��ж���������
public List findSize();
//��ѯ���ж���
public List findAllProduct() ;
//����ID��ѯ
public BuyProduct findById(int id);
public List findgongxian(CrmVo vo);
}
