package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.BuyProduct;

public interface BuyProductBiz {
	//���ݿͻ������ѯ��ʷ����
	public List getById(int customerId);
	//��ѯ����
	public List findAll();
	//��ѯ�ܹ��ж���������
	public List findSize();
	//��ѯ���ж���
    public List<BuyProduct> getAllProduct();
  //����ID��ѯ
    public BuyProduct findById(int id);
    public List<BuyProduct> getAllgongxian(CrmVo vo);
}
