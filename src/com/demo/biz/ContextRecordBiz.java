package com.demo.biz;

import java.util.List;

import com.demo.pojo.ContextRecord;

public interface ContextRecordBiz {
	//���ݿͻ���ѯ������¼
	public List getById(int customerId);
	//ɾ��������¼
	public void deletRecord(ContextRecord rec);
	//����ID��ѯ������¼
	public ContextRecord findById(int id);
	//�޸Ľ�����¼
	public void attachDirty(ContextRecord instance);
}
