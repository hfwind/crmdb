package com.demo.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.demo.connection.*;
import com.demo.connection.SystemContext;
import com.demo.dao.BaseHibernateDao;
import com.demo.dao.CustomerPlanDao;
import com.demo.pojo.CustomerPlan;

/**
 * A data access object (DAO) providing persistence and search support for
 * CustomerPlan entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.demo.pojo.CustomerPlan
 * @author MyEclipse Persistence Tools
 */
public class CustomerPlanDaoImpl extends BaseHibernateDao implements CustomerPlanDao{
	private static final Logger log = LoggerFactory
			.getLogger(CustomerPlanDaoImpl.class);
	// property constants
	public static final String PLAN_DESC = "planDesc";
	public static final String EXECUTE = "execute";
	public static final String SALE_ID = "saleId";
	public static final String STATE = "state";
	//Transaction tx = getSession().beginTransaction();
	
	public void save(CustomerPlan transientInstance) {
		log.debug("saving CustomerPlan instance");
		Transaction tx=null;
		try {
			getSession().close();
			tx=getSession().beginTransaction();
			//getSession().beginTransaction().begin();;
			getSession().save(transientInstance);
			log.debug("save successful");
			//getSession().beginTransaction().commit();
			tx.commit();
		} catch (RuntimeException re) {
			tx.rollback();
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CustomerPlan persistentInstance) {
		log.debug("deleting CustomerPlan instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CustomerPlan findById(int cid) {
		log.debug("getting CustomerPlan instance with id: " + cid);
		try {
			CustomerPlan instance = (CustomerPlan) getSession().get(
					"com.demo.pojo.CustomerPlan", cid);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CustomerPlan instance) {
		log.debug("finding CustomerPlan instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.CustomerPlan")
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
		log.debug("finding CustomerPlan instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CustomerPlan as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPlanDesc(Object planDesc) {
		return findByProperty(PLAN_DESC, planDesc);
	}

	public List findByExecute(Object execute) {
		return findByProperty(EXECUTE, execute);
	}

	public List findBySaleId(Object saleId) {
		return findByProperty(SALE_ID, saleId);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all CustomerPlan instances");
		try {
			String queryString = "from CustomerPlan where state>0 ";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(SystemContext.getPageOffset());
			queryObject.setMaxResults(3);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CustomerPlan merge(CustomerPlan detachedInstance) {
		log.debug("merging CustomerPlan instance");
		try {
			CustomerPlan result = (CustomerPlan) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CustomerPlan instance) {
		log.debug("attaching dirty CustomerPlan instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CustomerPlan instance) {
		log.debug("attaching clean CustomerPlan instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	//分页方法
	public List findSize() {
		log.debug("finding all CustomerPlan instances");
		try {
			String queryString = "from CustomerPlan";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	//删除用户计划
	public void deletePlan(CustomerPlan cp){
		Transaction tx=null;
		try {
			getSession().close();
			tx=getSession().beginTransaction();
			//getSession().beginTransaction();
			String sql="update customer_plan set state=-1 where plan_id="+cp.getPlanId();
		    SQLQuery sqlquery=getSession().createSQLQuery(sql);
			sqlquery.executeUpdate();
			//getSession().beginTransaction().commit();
			tx.commit();
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
	}
	public List<CustomerPlan> getById(int saleId){
		String hql="from CustomerPlan where state>-1 and sale.saleId="+saleId;
		Query query=getSession().createQuery(hql);
		return query.list();
	}
}