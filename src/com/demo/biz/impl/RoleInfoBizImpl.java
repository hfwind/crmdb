package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.RoleInfoBiz;
import com.demo.dao.RoleInfoDao;
import com.demo.dao.impl.RoleInfoDaoImpl;

public class RoleInfoBizImpl implements RoleInfoBiz{
    RoleInfoDao roledao=new RoleInfoDaoImpl();
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return roledao.findAll();
	}

}
