package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.CustomerGradeBiz;
import com.demo.dao.CustomterGradeDao;
import com.demo.dao.impl.CustomterGradeDaoImpl;

public class CustomerGradeBizImpl implements CustomerGradeBiz{
	CustomterGradeDao gradedao=new CustomterGradeDaoImpl();
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return gradedao.findAll();
	}

}
