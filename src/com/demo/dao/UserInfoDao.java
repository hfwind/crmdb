package com.demo.dao;

import java.util.List;

import com.demo.pojo.UserInfo;


public interface UserInfoDao {
	//登陆方法
		public UserInfo login(String userName,String userPwd);
		public List<UserInfo> getByIdUserInfo();
		//查询所有职工
		public List findAll();
		//删除职工
		public void attachDirty(UserInfo instance);
		//根据ID查询职工
		public UserInfo findById(int id);
		//添加用户
		public void save(UserInfo transientInstance);
}
