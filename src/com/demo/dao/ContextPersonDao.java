package com.demo.dao;

import java.util.List;

import com.demo.pojo.ContextPerson;



public interface ContextPersonDao {
	public List<ContextPerson> findAll();//查询
	public ContextPerson findById(int id);//按id查询
	public void attachDirty(ContextPerson instance); //修改
	//public void delete(ContextPerson persistentInstance);//删除
	public void deletPerson(ContextPerson sale);//删除
	public List findSize();//查询总共有多少条数据
	//根据客户id查询联系人
	public List getById(int customerId);
}
