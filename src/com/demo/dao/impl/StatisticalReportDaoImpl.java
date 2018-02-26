package com.demo.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.dao.BaseHibernateDao;
import com.demo.dao.StatisticalReportDao;
import com.demo.pojo.StatisticalReport;

/**
 * A data access object (DAO) providing persistence and search support for
 * StatisticalReport entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.demo.pojo.StatisticalReport
 * @author MyEclipse Persistence Tools
 */
public class StatisticalReportDaoImpl extends BaseHibernateDao implements StatisticalReportDao{
	private static final Logger log = LoggerFactory
			.getLogger(StatisticalReportDaoImpl.class);
	// property constants
	public static final String BUY_ID = "buyId";
	public static final String CUSTOMER_ID = "customerId";
	public static final String SERVICE_ID = "serviceId";
	public static final String LOSS_ID = "lossId";
	public static final String STATE = "state";

	public void save(StatisticalReport transientInstance) {
		log.debug("saving StatisticalReport instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(StatisticalReport persistentInstance) {
		log.debug("deleting StatisticalReport instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StatisticalReport findById(java.lang.Integer id) {
		log.debug("getting StatisticalReport instance with id: " + id);
		try {
			StatisticalReport instance = (StatisticalReport) getSession().get(
					"com.demo.pojo.StatisticalReport", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StatisticalReport instance) {
		log.debug("finding StatisticalReport instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.StatisticalReport")
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
		log.debug("finding StatisticalReport instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from StatisticalReport as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBuyId(Object buyId) {
		return findByProperty(BUY_ID, buyId);
	}

	public List findByCustomerId(Object customerId) {
		return findByProperty(CUSTOMER_ID, customerId);
	}

	public List findByServiceId(Object serviceId) {
		return findByProperty(SERVICE_ID, serviceId);
	}

	public List findByLossId(Object lossId) {
		return findByProperty(LOSS_ID, lossId);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all StatisticalReport instances");
		try {
			String queryString = "from StatisticalReport";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StatisticalReport merge(StatisticalReport detachedInstance) {
		log.debug("merging StatisticalReport instance");
		try {
			StatisticalReport result = (StatisticalReport) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StatisticalReport instance) {
		log.debug("attaching dirty StatisticalReport instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StatisticalReport instance) {
		log.debug("attaching clean StatisticalReport instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}