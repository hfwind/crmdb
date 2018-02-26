package com.demo.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.connection.SystemContext;
import com.demo.dao.BaseHibernateDao;
import com.demo.dao.ContextPersonDao;
import com.demo.pojo.ContextPerson;
import com.demo.pojo.CustomerPlan;

/**
 * A data access object (DAO) providing persistence and search support for
 * ContextPerson entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.demo.pojo.ContextPerson
 * @author MyEclipse Persistence Tools
 */
public class ContextPersonDaoImpl extends BaseHibernateDao implements ContextPersonDao{
	private static final Logger log = LoggerFactory
			.getLogger(ContextPersonDaoImpl.class);
	// property constants
	public static final String CUSTOMER_ID = "customerId";
	public static final String PERSON_NAME = "personName";
	public static final String PERSON_SEX = "personSex";
	public static final String PERSON_POSITION = "personPosition";
	public static final String PERSON_PHONE = "personPhone";
	public static final String PERSON_TEL = "personTel";
	public static final String PERSON_REMARKS = "personRemarks";
	public static final String STATE = "state";

	public void save(ContextPerson transientInstance) {
		log.debug("saving ContextPerson instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ContextPerson persistentInstance) {
		Transaction tx=getSession().beginTransaction();
		log.debug("deleting ContextPerson instance");
		try {
			getSession().delete(persistentInstance);
			tx.commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			tx.rollback();
			log.error("delete failed", re);
			throw re;
		}
	}

	public ContextPerson findById(int id) {
		log.debug("getting ContextPerson instance with id: " + id);
		try {
			ContextPerson instance = (ContextPerson) getSession().get(
					"com.demo.pojo.ContextPerson", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ContextPerson instance) {
		log.debug("finding ContextPerson instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.ContextPerson")
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
		log.debug("finding ContextPerson instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ContextPerson as model where model."
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

	public List findByPersonName(Object personName) {
		return findByProperty(PERSON_NAME, personName);
	}

	public List findByPersonSex(Object personSex) {
		return findByProperty(PERSON_SEX, personSex);
	}

	public List findByPersonPosition(Object personPosition) {
		return findByProperty(PERSON_POSITION, personPosition);
	}

	public List findByPersonPhone(Object personPhone) {
		return findByProperty(PERSON_PHONE, personPhone);
	}

	public List findByPersonTel(Object personTel) {
		return findByProperty(PERSON_TEL, personTel);
	}

	public List findByPersonRemarks(Object personRemarks) {
		return findByProperty(PERSON_REMARKS, personRemarks);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all ContextPerson instances");
		try {
			String queryString = "from ContextPerson where state=1";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ContextPerson merge(ContextPerson detachedInstance) {
		log.debug("merging ContextPerson instance");
		try {
			ContextPerson result = (ContextPerson) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ContextPerson instance) {
		log.debug("attaching dirty ContextPerson instance");
		Transaction tx=null;
		try {
			getSession().close();
			tx=getSession().beginTransaction();
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
			tx.commit();
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			tx.rollback();
			throw re;
		}
	}

	public void attachClean(ContextPerson instance) {
		log.debug("attaching clean ContextPerson instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	 public void deletPerson(ContextPerson sale){
		 Transaction tx=getSession().beginTransaction();
		 try {
			 String sql = "update context_person set state = -1 where person_id = "+sale.getPersonId();
			 SQLQuery sqlQuery = getSession().createSQLQuery(sql);
			 sqlQuery.executeUpdate();
			 tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		 
	  }
	 public List findSize() {
			log.debug("finding all ContextPerson instances");
			try {
				String queryString = "from ContextPerson";
				Query queryObject = getSession().createQuery(queryString);
				return queryObject.list();
			} catch (RuntimeException re) {
				log.error("find all failed", re);
				throw re;
			}
		}
	 public List getById(int customerId){
			String hql="from ContextPerson where state>-1 and customerId.customerId="+customerId;
			Query query=getSession().createQuery(hql);
			return query.list();
		}
}