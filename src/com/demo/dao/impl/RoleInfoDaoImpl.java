package com.demo.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.dao.BaseHibernateDao;
import com.demo.dao.RoleInfoDao;
import com.demo.pojo.RoleInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * RoleInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.demo.pojo.RoleInfo
 * @author MyEclipse Persistence Tools
 */
public class RoleInfoDaoImpl extends BaseHibernateDao implements RoleInfoDao{
	private static final Logger log = LoggerFactory
			.getLogger(RoleInfoDaoImpl.class);
	// property constants
	public static final String ROLE_NAME = "roleName";
	public static final String ROLE_REMARK = "roleRemark";
	public static final String STATE = "state";

	public void save(RoleInfo transientInstance) {
		log.debug("saving RoleInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RoleInfo persistentInstance) {
		log.debug("deleting RoleInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RoleInfo findById(java.lang.Integer id) {
		log.debug("getting RoleInfo instance with id: " + id);
		try {
			RoleInfo instance = (RoleInfo) getSession().get(
					"com.demo.pojo.RoleInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RoleInfo instance) {
		log.debug("finding RoleInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.RoleInfo")
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
		log.debug("finding RoleInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RoleInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRoleName(Object roleName) {
		return findByProperty(ROLE_NAME, roleName);
	}

	public List findByRoleRemark(Object roleRemark) {
		return findByProperty(ROLE_REMARK, roleRemark);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all RoleInfo instances");
		try {
			String queryString = "from RoleInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RoleInfo merge(RoleInfo detachedInstance) {
		log.debug("merging RoleInfo instance");
		try {
			RoleInfo result = (RoleInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RoleInfo instance) {
		log.debug("attaching dirty RoleInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RoleInfo instance) {
		log.debug("attaching clean RoleInfo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}