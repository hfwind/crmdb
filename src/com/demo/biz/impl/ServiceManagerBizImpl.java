package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.ServiceManagerBiz;
import com.demo.dao.ServiceManagerDao;
import com.demo.dao.impl.ServiceManagerDaoImpl;
import com.demo.pojo.ServiceManager;

public class ServiceManagerBizImpl implements ServiceManagerBiz{

	ServiceManagerDao smd=new ServiceManagerDaoImpl();
	public List<ServiceManager> getAllService() {
		return smd.findAll();
		
	}
	
	public List<ServiceManager> getServiceSize() {
		// TODO Auto-generated method stub
		return smd.findSize();
	}

	@Override
	public List<ServiceManager> findByCondition(CrmVo vo) {
		
		return smd.findByCondition(vo);
	}

	@Override
	public void saveService(ServiceManager servicemanager) {
		smd.save(servicemanager);
		
	}

	@Override
	public ServiceManager getServiceById(int serviceId) {

		return smd.findById(serviceId);
	}

	@Override
	public void deleteService(ServiceManager servicemanager) {
		
		smd.deleteService(servicemanager);
	}



	@Override
	public List<ServiceManager> getallFenpeiService() {
		// TODO Auto-generated method stub
		return smd.findFenpeiService();
	}

	@Override
	public void updateService(ServiceManager servicemanager) {
		smd.attachDirty(servicemanager);
		
	}

	@Override
	public List<ServiceManager> getchuliService() {
		// TODO Auto-generated method stub
		return smd.findchuli();
	}

	@Override
	public List<ServiceManager> getfankuiService() {
		// TODO Auto-generated method stub
		return smd.findfankui();
	}

	@Override
	public List<ServiceManager> findByCondition2(CrmVo vo) {
		// TODO Auto-generated method stub
		return smd.findByCondition2(vo);
	}

	@Override
	public List<ServiceManager> getallfuwu() {
		// TODO Auto-generated method stub
		return smd.findfenxi();
	}

	@Override
	public List<ServiceManager> findByCondition3(CrmVo vo) {
		// TODO Auto-generated method stub
		return smd.findByCondition3(vo);
	}

	

}
