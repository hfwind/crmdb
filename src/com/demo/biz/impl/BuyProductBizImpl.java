package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.BuyProductBiz;
import com.demo.dao.BuyProductDao;
import com.demo.dao.impl.BuyProductDaoImpl;
import com.demo.pojo.BuyProduct;

public class BuyProductBizImpl implements BuyProductBiz{
BuyProductDao buy=new BuyProductDaoImpl();

@Override
public List getById(int customerId) {
	// TODO Auto-generated method stub
	return buy.getById(customerId);
}

@Override
public List findAll() {
	// TODO Auto-generated method stub
	return buy.findAll();
}

@Override
public List findSize() {
	// TODO Auto-generated method stub
	return buy.findSize();
}

@Override
public List<BuyProduct> getAllProduct() {
	// TODO Auto-generated method stub
	return buy.findAllProduct();
}

@Override
public BuyProduct findById(int id) {
	// TODO Auto-generated method stub
	return buy.findById(id);
}

@Override
public List<BuyProduct> getAllgongxian(CrmVo vo) {
	// TODO Auto-generated method stub
	return buy.findgongxian(vo);
}

}
