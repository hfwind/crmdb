package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.Product;

public interface ProductBiz {
	//��ѯ���п����Ϣ
	public List<Product> findAll();
	//��ҳ��ѯ�����Ϣ
	public List<Product> findSize();
	//ɸѡ��ѯ��Ϣ
	public List<Product> findByConditions(CrmVo vo);
	//ɸѡ�ֿ�
	public List<Product> findByConditions2(CrmVo vo);

}
