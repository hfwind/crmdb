package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.Product;

public interface ProductDao {
	//查询所有库存信息
	public List<Product> findAll();
	//分页查询库存信息
	public List<Product> findSize();
	//筛选查询
	public List<Product> findByConditions(CrmVo vo);
	//筛选仓库
	public List<Product> findByConditions2(CrmVo vo);

}
