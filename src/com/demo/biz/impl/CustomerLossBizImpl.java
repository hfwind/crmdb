package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.CustomerLossBiz;
import com.demo.dao.CustomerLossDao;
import com.demo.dao.impl.CustomerLossDaoImpl;
import com.demo.pojo.CustomerLoss;

public class CustomerLossBizImpl implements CustomerLossBiz{
	CustomerLossDao lo=new CustomerLossDaoImpl();
	public List<CustomerLoss> findAll() {
		// TODO Auto-generated method stub
		return lo.findAll();
	}
	@Override
	public List findSize() {//分页
		// TODO Auto-generated method stub
		return lo.findSize();
	}
	@Override
	public List<CustomerLoss> findByCondition(CrmVo vo) {
		// TODO Auto-generated method stub//多条件删除
		return lo.findByCondition(vo);
	}
	@Override
	public CustomerLoss findById(int id) {
		// TODO Auto-generated method stub
		return lo.findById(id);
		
	}
	@Override
	public void attachDirty(CustomerLoss instance) {
		// TODO Auto-generated method stub
		lo.attachDirty(instance);
	}
	@Override
	public List<CustomerLoss> findByLossfenxi(CrmVo vo) {
		// TODO Auto-generated method stub
		return lo.findByLossfenxi(vo);
	}

}
