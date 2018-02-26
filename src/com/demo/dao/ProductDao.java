package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.Product;

public interface ProductDao {
	//��ѯ���п����Ϣ
	public List<Product> findAll();
	//��ҳ��ѯ�����Ϣ
	public List<Product> findSize();
	//ɸѡ��ѯ
	public List<Product> findByConditions(CrmVo vo);
	//ɸѡ�ֿ�
	public List<Product> findByConditions2(CrmVo vo);

}
