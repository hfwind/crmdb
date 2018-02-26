package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.CustomerLoss;

public interface CustomerLossBiz {
	public List<CustomerLoss> findAll();
	public List findSize();//分页
	public List<CustomerLoss> findByCondition(CrmVo vo);//多条件查询
	public CustomerLoss findById(int id);//按id查询
	public void attachDirty(CustomerLoss instance); //修改
	public List<CustomerLoss> findByLossfenxi(CrmVo vo);//流失分析多条件
}
