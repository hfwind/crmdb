package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.BuyProduct;

public interface BuyProductBiz {
	//根据客户管理查询历史订单
	public List getById(int customerId);
	//查询所有
	public List findAll();
	//查询总共有多少条数据
	public List findSize();
	//查询所有订单
    public List<BuyProduct> getAllProduct();
  //根据ID查询
    public BuyProduct findById(int id);
    public List<BuyProduct> getAllgongxian(CrmVo vo);
}
