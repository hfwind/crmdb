package com.demo.dao;

import java.util.List;

import com.demo.pojo.Power;

public interface PowerDao {
//����Ȩ��
public void save(Power transientInstance);
//����ID��ѯȨ��
public List<Power> getById(int roleId);
}
