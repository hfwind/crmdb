package com.demo.dao;

import java.util.List;

import com.demo.pojo.ContextPerson;



public interface ContextPersonDao {
	public List<ContextPerson> findAll();//��ѯ
	public ContextPerson findById(int id);//��id��ѯ
	public void attachDirty(ContextPerson instance); //�޸�
	//public void delete(ContextPerson persistentInstance);//ɾ��
	public void deletPerson(ContextPerson sale);//ɾ��
	public List findSize();//��ѯ�ܹ��ж���������
	//���ݿͻ�id��ѯ��ϵ��
	public List getById(int customerId);
}
