package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.DataDictionaryBiz;
import com.demo.dao.DataDictionaryDao;
import com.demo.dao.impl.DataDictionaryDaoImpl;
import com.demo.pojo.DataDictionary;

public class DataDictionaryBizImpl implements DataDictionaryBiz{
	DataDictionaryDao daDao=new DataDictionaryDaoImpl();
	@Override
	public void attachDirty(DataDictionary instance) {
		// TODO Auto-generated method stub
		daDao.attachDirty(instance);
	}

	@Override
	public void deletData(DataDictionary persistentInstance) {
		// TODO Auto-generated method stub
		daDao.deletData(persistentInstance);
	}

	@Override
	public List<DataDictionary> findAll() {
		// TODO Auto-generated method stub
		return daDao.findAll();
	}

	@Override
	public DataDictionary findById(int id) {
		// TODO Auto-generated method stub
		return daDao.findById(id);
	}

	@Override
	public List findSize() {
		// TODO Auto-generated method stub
		return daDao.findSize();
	}

	@Override
	public List<DataDictionary> findByCondition(CrmVo vo) {
		// TODO Auto-generated method stub
		return daDao.findByCondition(vo);
	}

	@Override
	public void save(DataDictionary transientInstance) {
		// TODO Auto-generated method stub
		daDao.save(transientInstance);
	}

}
