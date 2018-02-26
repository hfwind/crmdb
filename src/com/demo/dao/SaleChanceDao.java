package com.demo.dao;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.SaleChance;

public interface SaleChanceDao {
	//��ѯ�������ۻ���
	public List findAll();
	//��ҳ
	public List findSize();
	//ɾ�����ۻ���
	public void deletSale(SaleChance sale);
	//����ID��ѯ
	public SaleChance findById(java.lang.Integer id);
	//ɸѡ��ѯ���ۻ���
	public List<SaleChance> findByCondition(CrmVo vo);
	//�޸����ۻ���
	public void attachDirty(SaleChance instance);
	//������ۻ���
	public void save(SaleChance sale);
	//���
	public void saveSale(SaleChance sale);
	//�������ۻ���
	public void updatefen(SaleChance sale);
	//��ѯ�ѷ�������ۻ���
	public List<SaleChance> getByIdSale();
	//�ѷ������ۻ����ɸѡ
	public List<SaleChance> findByConditions(CrmVo vo);
	//�޸����ۻ���
	public void xiuGaiSale(SaleChance sale);
	public void statea(SaleChance sale);
}
