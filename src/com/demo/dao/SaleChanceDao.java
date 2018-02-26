package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.SaleChance;

public interface SaleChanceDao {
	//查询所有销售机会
	public List findAll();
	//分页
	public List findSize();
	//删除销售机会
	public void deletSale(SaleChance sale);
	//根据ID查询
	public SaleChance findById(java.lang.Integer id);
	//筛选查询销售机会
	public List<SaleChance> findByCondition(CrmVo vo);
	//修改销售机会
	public void attachDirty(SaleChance instance);
	//添加销售机会
	public void save(SaleChance sale);
	//添加
	public void saveSale(SaleChance sale);
	//分配销售机会
	public void updatefen(SaleChance sale);
	//查询已分配的销售机会
	public List<SaleChance> getByIdSale();
	//已分配销售机会的筛选
	public List<SaleChance> findByConditions(CrmVo vo);
	//修改销售机会
	public void xiuGaiSale(SaleChance sale);
	public void statea(SaleChance sale);
}
