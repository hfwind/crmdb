package com.demo.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

public class BaseDao extends BaseHibernateDao{
public List findByCondition(String hql,Map<String,Object> map){
	Session session=getSession();
	Query query=session.createQuery(hql);
	for(String key : map.keySet()){
		query.setParameter(key,map.get(key));
	}
	return query.list();
}
}
