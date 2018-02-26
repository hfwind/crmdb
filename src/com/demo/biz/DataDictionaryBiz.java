package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.DataDictionary;

public interface DataDictionaryBiz {
	public void attachDirty(DataDictionary instance);//�޸�
	public void deletData(DataDictionary persistentInstance);//ɾ��
	public List<DataDictionary> findAll();//��ѯ
	public DataDictionary findById(int id);//��id
	public List findSize();//��ҳ
	public List<DataDictionary> findByCondition(CrmVo vo);//��������ѯ
	public void save(DataDictionary transientInstance);//����
}
