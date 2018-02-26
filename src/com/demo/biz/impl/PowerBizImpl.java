package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.PowerBiz;
import com.demo.dao.PowerDao;
import com.demo.dao.impl.PowerDaoImpl;
import com.demo.pojo.Power;

public class PowerBizImpl implements PowerBiz{
    PowerDao powerdao=new PowerDaoImpl();
	@Override
	public void save(Power transientInstance) {
		// TODO Auto-generated method stub
		powerdao.save(transientInstance);
	}
	@Override
	public List<Power> getById(int roleId) {
		// TODO Auto-generated method stub
		return powerdao.getById(roleId);
	}

}
