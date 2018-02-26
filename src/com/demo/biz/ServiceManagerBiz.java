package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.ServiceManager;

public interface ServiceManagerBiz {
//��ѯ���з���
	public List<ServiceManager> getAllService();
	//��ҳ
	public List<ServiceManager> getServiceSize();
	//ɸѡ
	public List<ServiceManager> findByCondition(CrmVo vo);
	//���
	public void saveService(ServiceManager servicemanager);
	//����id��ѯ����
	public ServiceManager getServiceById(int serviceId);
	//ɾ��
	public void deleteService(ServiceManager servicemanager);
	//������� �޸�
	public void updateService(ServiceManager servicemanager);
	//��ѯ�����Ѿ�����ķ���
	public List<ServiceManager> getallFenpeiService();
	//��ѯ���д���ķ���
	public List<ServiceManager> getchuliService();
	//��ѯ���з�����ķ���
	public List<ServiceManager> getfankuiService();
	//ɸѡ����ķ���
	public List<ServiceManager> findByCondition2(CrmVo vo);
	//�������
	public List<ServiceManager> getallfuwu();
	public List<ServiceManager> findByCondition3(CrmVo vo);

}
