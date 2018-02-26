package com.demo.biz.impl;


import java.util.List;

import com.demo.biz.SaleChanceBiz;
import com.demo.dao.SaleChanceDao;
import com.demo.dao.impl.SaleChanceDaoImpl;
import com.demo.pojo.SaleChance;

public class SaleChanceBizImpl implements SaleChanceBiz{
	SaleChanceDao scd=new SaleChanceDaoImpl();
	//查所有销售机会
	public List<SaleChance> getAllSale() {
		
		return scd.findAll();
	}
	@Override
	public List<SaleChance> getSaleSize() {
		
		return scd.findSize();
	}
	@Override
	public void deleteSale(SaleChance sale) {
		scd.deletSale(sale);
		
	}
	@Override
	public SaleChance findById(Integer id) {
		// TODO Auto-generated method stub
		return scd.findById(id);
	}
	@Override
	public List<SaleChance> findByCondition(CrmVo vo) {
		
		return scd.findByCondition(vo);
	}
	//修改
	public void xiugai(SaleChance salechance) {
		scd.attachDirty(salechance);
		
	}
	
	//添加
	@Override
	public void save(SaleChance sale) {
		// TODO Auto-generated method stub
		scd.save(sale);
	}
	@Override
	public void saveSale(SaleChance sale) {
		// TODO Auto-generated method stub
		scd.saveSale(sale);
	}
	@Override
	public void updatefen(SaleChance sale) {
		// TODO Auto-generated method stub
		scd.updatefen(sale);
	}
	@Override
	public List<SaleChance> getByIdSale() {
		// TODO Auto-generated method stub
		return scd.getByIdSale();
	}
	@Override
	public List<SaleChance> findByConditions(CrmVo vo) {
		// TODO Auto-generated method stub
		return scd.findByConditions(vo);
	}
	@Override
	public void xiuGaiSale(SaleChance sale) {
		// TODO Auto-generated method stub
		scd.xiuGaiSale(sale);
	}
	@Override
	public void statea(SaleChance sale) {
		// TODO Auto-generated method stub
		scd.statea(sale);
	}
}
