package com.demo.biz;

import java.util.List;

import com.demo.pojo.Power;

public interface PowerBiz {
	//����Ȩ��
	public void save(Power transientInstance);
	//����ID��ѯȨ��
	public List<Power> getById(int roleId);
}
