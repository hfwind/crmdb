package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.ContextRecordBiz;
import com.demo.dao.ContextRecordDao;
import com.demo.dao.impl.ContextRecordDaoImpl;
import com.demo.pojo.ContextRecord;

public class ContextRecordBizImpl implements ContextRecordBiz{
 ContextRecordDao conbiz=new ContextRecordDaoImpl();

public List getById(int customerId) {
	// TODO Auto-generated method stub
	return conbiz.getById(customerId);
}

@Override
public void deletRecord(ContextRecord rec) {
	// TODO Auto-generated method stub
	conbiz.deletRecord(rec);
}

@Override
public ContextRecord findById(int id) {
	// TODO Auto-generated method stub
	return conbiz.findById(id);
}

@Override
public void attachDirty(ContextRecord instance) {
	// TODO Auto-generated method stub
	conbiz.attachDirty(instance);
}
 
}
