package com.demo.dao;

import java.util.List;

import com.demo.pojo.UserInfo;


public interface UserInfoDao {
	//��½����
		public UserInfo login(String userName,String userPwd);
		public List<UserInfo> getByIdUserInfo();
		//��ѯ����ְ��
		public List findAll();
		//ɾ��ְ��
		public void attachDirty(UserInfo instance);
		//����ID��ѯְ��
		public UserInfo findById(int id);
		//����û�
		public void save(UserInfo transientInstance);
}
