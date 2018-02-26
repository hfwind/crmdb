package com.demo.dao.impl;

import com.demo.dao.BaseHibernateDao;
import com.demo.dao.UserInfoDao;
import com.demo.pojo.UserInfo;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.Entity;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.demo.dao.impl.UserInfo
 * @author MyEclipse Persistence Tools
 */
public class UserInfoDaoImpl extends BaseHibernateDao implements UserInfoDao{
	private static final Logger log = LoggerFactory
			.getLogger(UserInfoDaoImpl.class);
	// property constants
	public static final String USER_NAME = "userName";
	public static final String USER_PWD = "userPwd";
	public static final String TRUE_NAME = "trueName";
	public static final String USER_TEL = "userTel";
	public static final String ROLE_ID = "roleId";
	public static final String STATE = "state";
	public static final String USER_PIC = "userPic";

	public void save(UserInfo transientInstance) {
		log.debug("saving UserInfo instance");
		Transaction tx=null;
		try {
			getSession().close();
			tx=getSession().beginTransaction();
			getSession().save(transientInstance);
			log.debug("save successful");
			tx.commit();
		} catch (RuntimeException re) {
			tx.rollback();
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UserInfo persistentInstance) {
		log.debug("deleting UserInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserInfo findById(int id) {
		log.debug("getting UserInfo instance with id: " + id);
		try {
			UserInfo instance = (UserInfo) getSession().get(
					"com.demo.pojo.UserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserInfo instance) {
		log.debug("finding UserInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.dao.impl.UserInfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List findByUserPwd(Object userPwd) {
		return findByProperty(USER_PWD, userPwd);
	}

	public List findByTrueName(Object trueName) {
		return findByProperty(TRUE_NAME, trueName);
	}

	public List findByUserTel(Object userTel) {
		return findByProperty(USER_TEL, userTel);
	}

	public List findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findByUserPic(Object userPic) {
		return findByProperty(USER_PIC, userPic);
	}

	public List findAll() {
		log.debug("finding all UserInfo instances");
		try {
			String queryString = "from UserInfo where state>-1";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UserInfo merge(UserInfo detachedInstance) {
		log.debug("merging UserInfo instance");
		try {
			UserInfo result = (UserInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UserInfo instance) {
		log.debug("attaching dirty UserInfo instance");
		Transaction tx=null;
		try {
			getSession().close();
			tx=getSession().beginTransaction();
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
			tx.commit();
		} catch (RuntimeException re) {
			tx.rollback();
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserInfo instance) {
		log.debug("attaching clean UserInfo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	//µÇÂ½·½·¨
			public UserInfo login(String userName,String userPwd){
				//log.debug("attaching clean Person instance");
				try {
					String hql="from UserInfo where userName=? and userPwd=? and state>-1";
					Session session=getSession();
					Query query=session.createQuery(hql);
					query.setString(0, userName);
					query.setString(1, userPwd);
					List<UserInfo> list=query.list();
					if(list!=null&&list.size()>0){
						return list.get(0);
					}
					return null;
				} catch (RuntimeException re) {
					// TODO: handle exception
					log.error("attach failed",re);
					throw re;
				}
			}
			public List<UserInfo> getByIdUserInfo(){
				String hql="from UserInfo where role.roleId=1";
				Query query=getSession().createQuery(hql);
				return query.list();
			}
}