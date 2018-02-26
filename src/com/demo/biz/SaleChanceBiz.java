package com.demo.biz;

import java.util.List;

import com.demo.biz.impl.CrmVo;
import com.demo.pojo.SaleChance;



public interface SaleChanceBiz {

	
	//���������ۻ���
	public List<SaleChance> getAllSale();
	//��ҳ
	public List<SaleChance> getSaleSize();
	//ɾ�����ۻ���
	public void deleteSale(SaleChance sale);
	//����ID��ѯ
	public SaleChance findById(java.lang.Integer id);
	//ɸѡ��ѯ
	public List<SaleChance> findByCondition(CrmVo vo);
	//�޸�
	public void xiugai(SaleChance salechance);
	//���
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
