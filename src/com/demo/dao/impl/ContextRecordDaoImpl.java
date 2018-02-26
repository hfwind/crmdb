package com.demo.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.dao.BaseHibernateDao;
import com.demo.dao.ContextRecordDao;
import com.demo.pojo.ContextPerson;
import com.demo.pojo.ContextRecord;

/**
 * A data access object (DAO) providing persistence and search support for
 * ContextRecord entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.demo.pojo.ContextRecord
 * @author MyEclipse Persistence Tools
 */
public class ContextRecordDaoImpl extends BaseHibernateDao implements ContextRecordDao{
	private static final Logger log = LoggerFactory
			.getLogger(ContextRecordDaoImpl.class);
	// property constants
	public static final String CUSTOMER_ID = "customerId";
	public static final String RECORD_ADDR = "recordAddr";
	public static final String PROFILE = "profile";
	public static final String RECORD_DESC = "recordDesc";
	public static final String REMARK = "remark";
	public static final String STATE = "state";

	public void save(ContextRecord transientInstance) {
		log.debug("saving ContextRecord instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ContextRecord persistentInstance) {
		log.debug("deleting ContextRecord instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ContextRecord findById(int id) {
		log.debug("getting ContextRecord instance with id: " + id);
		try {
			ContextRecord instance = (ContextRecord) getSession().get(
					"com.demo.pojo.ContextRecord", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ContextRecord instance) {
		log.debug("finding ContextRecord instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.ContextRecord")
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
		log.debug("finding ContextRecord instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ContextRecord as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCustomerId(Object customerId) {
		return findByProperty(CUSTOMER_ID, customerId);
	}

	public List findByRecordAddr(Object recordAddr) {
		return findByProperty(RECORD_ADDR, recordAddr);
	}

	public List findByProfile(Object profile) {
		return findByProperty(PROFILE, profile);
	}

	public List findByRecordDesc(Object recordDesc) {
		return findByProperty(RECORD_DESC, recordDesc);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all ContextRecord instances");
		try {
			String queryString = "from ContextRecord";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ContextRecord merge(ContextRecord detachedInstance) {
		log.debug("merging ContextRecord instance");
		try {
			ContextRecord result = (ContextRecord) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ContextRecord instance) {
		log.debug("attaching dirty ContextRecord instance");
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

	public void attachClean(ContextRecord instance) {
		log.debug("attaching clean ContextRecord instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public List getById(int customerId){
		String hql="from ContextRecord where state>-1 and customerId.customerId="+customerId;
		Query query=getSession().createQuery(hql);
		return query.list();
	}
	 public void deletRecord(ContextRecord rec){
		 Transaction tx=getSession().beginTransaction();
		 try {
			 String sql = "update context_record set state = -1 where record_id = "+rec.getRecordId();
			 SQLQuery sqlQuery = getSession().createSQLQuery(sql);
			 sqlQuery.executeUpdate();
			 tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		 
	  }
}