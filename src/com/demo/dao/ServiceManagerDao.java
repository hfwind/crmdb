package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.ServiceManager;

public interface ServiceManagerDao {
	//查所有服务
	public List findAll();
	//分页查询
	public List findSize();
	//筛选新建的服务
	public List<ServiceManager> findByCondition(CrmVo vo);
	//添加
	public void save(ServiceManager transientInstance);
	//根据id查询服务对象
	public ServiceManager findById(java.lang.Integer id);
	//删除
	public void deleteService(ServiceManager servicemanager);
	//分配服务  修改;
	public void attachDirty(ServiceManager instance);
	//查询所有已经分配的服务
	public List<ServiceManager> findFenpeiService();
	//查询已经处理的服务
	public List findchuli();
	//查询所有反馈完毕的服务
	public List findfankui();
	//筛选已经分配的服务
	public List<ServiceManager> findByCondition2(CrmVo vo);
	//查询服务分析
	public List findfenxi();
	public List<ServiceManager> findByCondition3(CrmVo vo);

}
