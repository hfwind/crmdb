package com.demo.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.biz.impl.CrmVo;
import com.demo.connection.SystemContext;
import com.demo.dao.BaseDao;
import com.demo.dao.BaseHibernateDao;
import com.demo.dao.CustomerLossDao;
import com.demo.pojo.CustomerLoss;

/**
 * A data access object (DAO) providing persistence and search support for
 * CustomerLoss entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.demo.pojo.CustomerLoss
 * @author MyEclipse Persistence Tools
 */
public class CustomerLossDaoImpl extends BaseDao implements CustomerLossDao{
	private static final Logger log = LoggerFactory
			.getLogger(CustomerLossDaoImpl.class);
	// property constants
	public static final String BUY_ID = "buyId";
	public static final String LOSS_WHY = "lossWhy";
	public static final String REPRIEVE = "reprieve";
	public static final String STATE = "state";

	public void save(CustomerLoss transientInstance) {
		log.debug("saving CustomerLoss instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CustomerLoss persistentInstance) {
		log.debug("deleting CustomerLoss instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CustomerLoss findById(int id) {
		log.debug("getting CustomerLoss instance with id: " + id);
		try {
			CustomerLoss instance = (CustomerLoss) getSession().get(
					"com.demo.pojo.CustomerLoss", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CustomerLoss instance) {
		log.debug("finding CustomerLoss instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.CustomerLoss")
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
		log.debug("finding CustomerLoss instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CustomerLoss as model where model."
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

	public List findByLossWhy(Object lossWhy) {
		return findByProperty(LOSS_WHY, lossWhy);
	}

	public List findByReprieve(Object reprieve) {
		return findByProperty(REPRIEVE, reprieve);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all CustomerLoss instances");
		try {
			String queryString = "from CustomerLoss";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(SystemContext.getPageOffset());
			queryObject.setMaxResults(4);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CustomerLoss merge(CustomerLoss detachedInstance) {
		log.debug("merging CustomerLoss instance");
		try {
			CustomerLoss result = (CustomerLoss) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CustomerLoss instance) {
		Transaction tx=getSession().beginTransaction();
		log.debug("attaching dirty CustomerLoss instance");
		try {
			
			getSession().saveOrUpdate(instance);
			tx.commit();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			tx.rollback();
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CustomerLoss instance) {
		log.debug("attaching clean CustomerLoss instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	
	public List findSize() {
		log.debug("finding all CustomerLoss instances");
		try {
			String queryString = "from CustomerLoss";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public List<CustomerLoss> findByCondition(CrmVo vo){
		Map<String,Object> map=new HashMap<String,Object>();
		String hql="from CustomerLoss where 1=1";
		try {
			if(vo.getCustomer()!=null&&vo.getCustomer().getCustomerName()!=null&&!vo.getCustomer().getCustomerName().equals("")){
				hql+="and buy.customer.customerName=:customerName";
				map.put("customerName", vo.getCustomer().getCustomerName());
			}
			if(vo.getUser()!=null&&vo.getUser().getTrueName()!=null&&!vo.getUser().getTrueName().equals("")){
				hql+=" and buy.customer.user.trueName=:trueName";
				map.put("trueName",vo.getUser().getTrueName());
			}
			if(vo.getStateaa()!=null&&vo.getStateaa()!=-1){
				hql+=" and state=:stateaa";
				map.put("stateaa",vo.getStateaa());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			getSession().flush();
			getSession().close();
		}
		return findByCondition(hql, map);
	}
	
	public List<CustomerLoss> findByLossfenxi(CrmVo vo){//流失分析多条件查询
		Map<String,Object> map=new HashMap<String,Object>();
		String hql="from CustomerLoss where 1=1";
		try {
			if(vo.getCustomer()!=null&&vo.getCustomer().getCustomerName()!=null&&!vo.getCustomer().getCustomerName().equals("")){
				hql+="and buy.customer.customerName=:customerName";
				map.put("customerName", vo.getCustomer().getCustomerName());
			}
			if(vo.getUser()!=null&&vo.getUser().getTrueName()!=null&&!vo.getUser().getTrueName().equals("")){
				hql+=" and buy.customer.user.trueName=:trueName";
				map.put("trueName",vo.getUser().getTrueName());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			getSession().flush();
			getSession().close();
		}
		return findByCondition(hql,map);
	}


}