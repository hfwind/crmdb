package com.demo.biz.impl;

import java.util.List;

import com.demo.biz.UserInfoBiz;
import com.demo.dao.UserInfoDao;
import com.demo.dao.impl.UserInfoDaoImpl;
import com.demo.pojo.UserInfo;

public class UserInfoBizImpl implements  UserInfoBiz{
	UserInfoDao ud=new UserInfoDaoImpl();
	public UserInfo login(String userName,String userPwd){
		return ud.login(userName, userPwd);
	}
	@Override
	public List<UserInfo> getByIdUserInfo() {
		// TODO Auto-generated method stub
		return ud.getByIdUserInfo();
	}
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return ud.findAll();
	}
	@Override
	public void attachDirty(UserInfo instance) {
		// TODO Auto-generated method stub
		ud.attachDirty(instance);
	}
	@Override
	public UserInfo findById(int id) {
		// TODO Auto-generated method stub
		return ud.findById(id);
	}
	@Override
	public void save(UserInfo transientInstance) {
		// TODO Auto-generated method stub
		ud.save(transientInstance);
	}
    
}
