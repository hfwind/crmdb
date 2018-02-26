package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.SysnavBiz;
import com.demo.dao.SysnavDao;
import com.demo.dao.impl.SysnavDaoImpl;

public class SysnavBizImpl implements SysnavBiz{
SysnavDao sys=new SysnavDaoImpl();

	public List findAll() {
		// TODO Auto-generated method stub
		return sys.findAll();
	}

	public List getSysPid(int pid) {
		// TODO Auto-generated method stub
		return sys.getSysPid(pid);
	}
}
