package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.ProductBiz;
import com.demo.dao.ProductDao;
import com.demo.dao.impl.ProductDaoImpl;
import com.demo.pojo.Product;

public class ProductBizImpl implements ProductBiz{
	ProductDao pd=new ProductDaoImpl();
	//��ѯ���п����Ϣ
	public List<Product> findAll(){
		return pd.findAll();
	}
	//��ҳ��ѯ�����Ϣ
	public List<Product> findSize(){
		return pd.findSize();
	}
	//ɸѡ��ѯ��Ϣ
	public List<Product> findByConditions(CrmVo vo){
		return pd.findByConditions(vo);
	}
	@Override
	public List<Product> findByConditions2(CrmVo vo) {
		// TODO Auto-generated method stub
		return pd.findByConditions2(vo);
	}

}
