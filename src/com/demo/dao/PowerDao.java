package com.demo.dao;

import java.util.List;

import com.demo.pojo.Power;

public interface PowerDao {
//分配权限
public void save(Power transientInstance);
//根据ID查询权限
public List<Power> getById(int roleId);
}
