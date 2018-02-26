package com.demo.biz;

import java.util.List;

public interface SysnavBiz {
//查询所有菜单
public List findAll();
//查询所有父菜单
public List getSysPid(int pid);
}
