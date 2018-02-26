package com.demo.dao;

import java.util.List;

import com.demo.pojo.ContextRecord;

public interface ContextRecordDao {
//根据客户查询交往记录
public List getById(int customerId);
//删除交往记录
public void deletRecord(ContextRecord rec);
//根据ID查询交往记录
public ContextRecord findById(int id);
//修改交往记录
public void attachDirty(ContextRecord instance);
}
