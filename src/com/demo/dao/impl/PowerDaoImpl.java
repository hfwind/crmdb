package com.demo.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.dao.BaseHibernateDao;
import com.demo.dao.PowerDao;
import com.demo.pojo.Power;

/**
 * A data access object (DAO) providing persistence and search support for Power
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.demo.pojo.Power
 * @author MyEclipse Persistence Tools
 */
public class PowerDaoImpl extends BaseHibernateDao implements PowerDao{
	private static final Logger log = LoggerFactory.getLogger(PowerDaoImpl.class);
	// property constants
	public static final String NAV_ID = "navId";
	public static final String ROLE_ID = "roleId";

	public void save(Power transientInstance) {
		log.debug("saving Power instance");
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

	public void delete(Power persistentInstance) {
		log.debug("deleting Power instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Power findById(java.lang.Integer id) {
		log.debug("getting Power instance with id: " + id);
		try {
			Power instance = (Power) getSession()
					.get("com.demo.pojo.Power", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Power instance) {
		log.debug("finding Power instance by example");
		try {
			List results = getSession().createCriteria("com.demo.pojo.Power")
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
		log.debug("finding Power instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Power as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNavId(Object navId) {
		return findByProperty(NAV_ID, navId);
	}

	public List findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

	public List findAll() {
		log.debug("finding all Power instances");
		try {
			String queryString = "from Power";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Power merge(Power detachedInstance) {
		log.debug("merging Power instance");
		try {
			Power result = (Power) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Power instance) {
		log.debug("attaching dirty Power instance");
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

	public void attachClean(Power instance) {
		log.debug("attaching clean Power instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public List<Power> getById(int roleId){
		String hql="from Power where roleId="+roleId;
		Query query=getSession().createQuery(hql);
		return query.list();
	}
}