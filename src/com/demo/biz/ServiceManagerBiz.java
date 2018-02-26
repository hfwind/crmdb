package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.ServiceManager;

public interface ServiceManagerBiz {
//查询所有服务
	public List<ServiceManager> getAllService();
	//分页
	public List<ServiceManager> getServiceSize();
	//筛选
	public List<ServiceManager> findByCondition(CrmVo vo);
	//添加
	public void saveService(ServiceManager servicemanager);
	//根据id查询对象
	public ServiceManager getServiceById(int serviceId);
	//删除
	public void deleteService(ServiceManager servicemanager);
	//分配服务 修改
	public void updateService(ServiceManager servicemanager);
	//查询所有已经分配的服务
	public List<ServiceManager> getallFenpeiService();
	//查询所有处理的服务
	public List<ServiceManager> getchuliService();
	//查询所有反馈完的服务
	public List<ServiceManager> getfankuiService();
	//筛选分配的服务
	public List<ServiceManager> findByCondition2(CrmVo vo);
	//服务分析
	public List<ServiceManager> getallfuwu();
	public List<ServiceManager> findByCondition3(CrmVo vo);

}
