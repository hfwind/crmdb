package com.demo.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.biz.impl.CrmVo;
import com.demo.connection.SystemContext;
import com.demo.dao.BaseDao;
import com.demo.dao.BaseHibernateDao;
import com.demo.dao.BuyProductDao;
import com.demo.pojo.BuyProduct;

/**
 * A data access object (DAO) providing persistence and search support for
 * BuyProduct entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.demo.pojo.BuyProduct
 * @author MyEclipse Persistence Tools
 */
public class BuyProductDaoImpl extends BaseDao implements BuyProductDao{
	private static final Logger log = LoggerFactory
			.getLogger(BuyProductDaoImpl.class);
	// property constants
	public static final String CUSTOMER_ID = "customerId";
	public static final String BUY_ADDR = "buyAddr";
	public static final String TOTAL_MONEY = "totalMoney";
	public static final String STATE = "state";

	public void save(BuyProduct transientInstance) {
		log.debug("saving BuyProduct instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BuyProduct persistentInstance) {
		log.debug("deleting BuyProduct instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BuyProduct findById(int id) {
		log.debug("getting BuyProduct instance with id: " + id);
		try {
			BuyProduct instance = (BuyProduct) getSession().get(
					"com.demo.pojo.BuyProduct", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BuyProduct instance) {
		log.debug("finding BuyProduct instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.BuyProduct")
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
		log.debug("finding BuyProduct instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BuyProduct as model where model."
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

	public List findByBuyAddr(Object buyAddr) {
		return findByProperty(BUY_ADDR, buyAddr);
	}

	public List findByTotalMoney(Object totalMoney) {
		return findByProperty(TOTAL_MONEY, totalMoney);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all BuyProduct instances");
		try {
			String queryString = "from BuyProduct";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(SystemContext.getPageOffset());
			queryObject.setMaxResults(3);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BuyProduct merge(BuyProduct detachedInstance) {
		log.debug("merging BuyProduct instance");
		try {
			BuyProduct result = (BuyProduct) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BuyProduct instance) {
		log.debug("attaching dirty BuyProduct instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BuyProduct instance) {
		log.debug("attaching clean BuyProduct instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public List getById(int customerId){
		String hql="from BuyProduct where customer.customerId="+customerId;
		Query query=getSession().createQuery(hql);
		return query.list();
	}
	public List findSize() {
		log.debug("finding all BuyProduct instances");
		try {
			String queryString = "from BuyProduct";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List findAllProduct() {
		log.debug("finding all BuyProduct instances");
		try {
			String queryString = "select buyId,customer.customerName,sum(totalMoney) from BuyProduct group by customer.customerId";
			List queryObject = getSession().createQuery(queryString).list();
			return queryObject;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	//É¸Ñ¡²éÑ¯¹±Ï×·ÖÎö
	public List findgongxian(CrmVo vo){
		Map<String,Object>map=new HashMap<String,Object>();
		String hql = "select buyId,customer.customerName,sum(totalMoney) from BuyProduct group by customer.customerId having 1=1";
		try {
			if(vo.getGongxianName()!=null&&!vo.getGongxianName().equals("")){
				hql+=" and customer.customerName=:gongxianName";
				map.put("gongxianName", vo.getGongxianName());
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
}