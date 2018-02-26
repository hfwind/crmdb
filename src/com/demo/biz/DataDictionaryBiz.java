package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.DataDictionary;

public interface DataDictionaryBiz {
	public void attachDirty(DataDictionary instance);//修改
	public void deletData(DataDictionary persistentInstance);//删除
	public List<DataDictionary> findAll();//查询
	public DataDictionary findById(int id);//按id
	public List findSize();//分页
	public List<DataDictionary> findByCondition(CrmVo vo);//多条件查询
	public void save(DataDictionary transientInstance);//增加
}
