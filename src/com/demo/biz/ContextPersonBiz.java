package com.demo.biz;

import java.util.List;

import com.demo.pojo.ContextPerson;

public interface ContextPersonBiz {
	public List<ContextPerson> findAll();//��ѯ
	public ContextPerson findById(int id);//��id��ѯ
	public void attachDirty(ContextPerson instance); //�޸�
	//public void delete(ContextPerson persistentInstance);//ɾ��
	public void deletPerson(ContextPerson sale);//ɾ��
	//���ݿͻ�id��ѯ��ϵ��
	public List getById(int customerId);
}
