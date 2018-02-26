package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.ServiceManager;

public interface ServiceManagerDao {
	//�����з���
	public List findAll();
	//��ҳ��ѯ
	public List findSize();
	//ɸѡ�½��ķ���
	public List<ServiceManager> findByCondition(CrmVo vo);
	//���
	public void save(ServiceManager transientInstance);
	//����id��ѯ�������
	public ServiceManager findById(java.lang.Integer id);
	//ɾ��
	public void deleteService(ServiceManager servicemanager);
	//�������  �޸�;
	public void attachDirty(ServiceManager instance);
	//��ѯ�����Ѿ�����ķ���
	public List<ServiceManager> findFenpeiService();
	//��ѯ�Ѿ�����ķ���
	public List findchuli();
	//��ѯ���з�����ϵķ���
	public List findfankui();
	//ɸѡ�Ѿ�����ķ���
	public List<ServiceManager> findByCondition2(CrmVo vo);
	//��ѯ�������
	public List findfenxi();
	public List<ServiceManager> findByCondition3(CrmVo vo);

}
