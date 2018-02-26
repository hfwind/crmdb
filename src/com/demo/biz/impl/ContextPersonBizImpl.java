package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.ContextPersonBiz;
import com.demo.dao.ContextPersonDao;
import com.demo.dao.impl.ContextPersonDaoImpl;
import com.demo.pojo.ContextPerson;

public class ContextPersonBizImpl implements ContextPersonBiz{
	ContextPersonDao cope=new ContextPersonDaoImpl();
	@Override
	public List<ContextPerson> findAll() {
		// TODO Auto-generated method stub
		return cope.findAll();
	}

	@Override
	public ContextPerson findById(int id) {
		// TODO Auto-generated method stub
		return cope.findById(id);
	}

	@Override
	public void attachDirty(ContextPerson instance) {
		// TODO Auto-generated method stub
		cope.attachDirty(instance);
	}

	@Override
	public void deletPerson(ContextPerson sale) {
		// TODO Auto-generated method stub
		cope.deletPerson(sale);
	}

	@Override
	public List getById(int customerId) {
		// TODO Auto-generated method stub
		return cope.getById(customerId);
	}
}
