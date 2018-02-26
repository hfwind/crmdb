package com.demo.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.biz.impl.CrmVo;
import com.demo.connection.SystemContext;
import com.demo.dao.BaseDao;
import com.demo.dao.DataDictionaryDao;
import com.demo.pojo.DataDictionary;

/**
 * A data access object (DAO) providing persistence and search support for
 * DataDictionary entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.demo.pojo.DataDictionary
 * @author MyEclipse Persistence Tools
 */
public class DataDictionaryDaoImpl extends BaseDao implements DataDictionaryDao{
	private static final Logger log = LoggerFactory
			.getLogger(DataDictionaryDaoImpl.class);
	// property constants
	public static final String DATA_TYPE = "dataType";
	public static final String ENTRY = "entry";
	public static final String DATA_VALUE = "dataValue";
	public static final String STATE = "state";

	public void save(DataDictionary transientInstance) {
		Transaction tx=getSession().beginTransaction();
		log.debug("saving DataDictionary instance");
		try {
			getSession().save(transientInstance);
			tx.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			tx.rollback();
			throw re;
		}
	}

	public void delete(DataDictionary persistentInstance) {
		Transaction tx=getSession().beginTransaction();
		log.debug("deleting DataDictionary instance");
		try {
			getSession().delete(persistentInstance);
			tx.commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			tx.rollback();
			throw re;
		}
	}

	public DataDictionary findById(int id) {
		log.debug("getting DataDictionary instance with id: " + id);
		try {
			DataDictionary instance = (DataDictionary) getSession().get(
					"com.demo.pojo.DataDictionary", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DataDictionary instance) {
		log.debug("finding DataDictionary instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.DataDictionary")
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
		log.debug("finding DataDictionary instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DataDictionary as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDataType(Object dataType) {
		return findByProperty(DATA_TYPE, dataType);
	}

	public List findByEntry(Object entry) {
		return findByProperty(ENTRY, entry);
	}

	public List findByDataValue(Object dataValue) {
		return findByProperty(DATA_VALUE, dataValue);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all DataDictionary instances");
		try {
			String queryString = "from DataDictionary where state>=0";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(SystemContext.getPageOffset());
			queryObject.setMaxResults(7);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DataDictionary merge(DataDictionary detachedInstance) {
		log.debug("merging DataDictionary instance");
		try {
			DataDictionary result = (DataDictionary) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DataDictionary instance) {
		Transaction tx=getSession().beginTransaction();
		log.debug("attaching dirty DataDictionary instance");
		try {
			getSession().saveOrUpdate(instance);
			tx.commit();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			tx.rollback();
			throw re;
		}
	}

	public void attachClean(DataDictionary instance) {
		log.debug("attaching clean DataDictionary instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public void deletData(DataDictionary persistentInstance){
		 Transaction tx=getSession().beginTransaction();
		 try {
			 String sql = "update data_dictionary set state = -1 where data_id = "+persistentInstance.getDataId();
			 SQLQuery sqlQuery = getSession().createSQLQuery(sql);
			 sqlQuery.executeUpdate();
			 tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		  
	  }
	public List findSize() {//查询总共有多少条数据
		log.debug("finding all DataDictionary instances");
		try {
			String queryString = "from DataDictionary";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public List<DataDictionary> findByCondition(CrmVo vo){//条件
		Map<String,Object> map=new HashMap<String,Object>();
		String hql="from DataDictionary where state>=0";
		try {
			if(vo.getDataType()!=null&&!vo.getDataType().equals("")){
				hql+="and dataType=:dataType";
				map.put("dataType", vo.getDataType());
			}
			if(vo.getEntry()!=null&&!vo.getEntry().equals("")){
				hql+=" and entry=:entry";
				map.put("entry",vo.getEntry());
			}
			if(vo.getDataValue()!=null&&!vo.getDataValue().equals("")){
				hql+=" and dataValue=:dataValue";
				map.put("dataValue",vo.getDataValue());
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
