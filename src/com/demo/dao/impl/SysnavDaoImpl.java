package com.demo.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.dao.BaseHibernateDao;
import com.demo.dao.SysnavDao;
import com.demo.pojo.Sysnav;

/**
 * A data access object (DAO) providing persistence and search support for
 * Sysnav entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.demo.pojo.Sysnav
 * @author MyEclipse Persistence Tools
 */
public class SysnavDaoImpl extends BaseHibernateDao implements SysnavDao{
	private static final Logger log = LoggerFactory.getLogger(SysnavDaoImpl.class);
	// property constants
	public static final String NAV_NAME = "navName";
	public static final String PID = "pid";
	public static final String URL = "url";
	public static final String DESC = "desc";
	public static final String STATE = "state";
	public static final String INDEX = "index";

	public void save(Sysnav transientInstance) {
		log.debug("saving Sysnav instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sysnav persistentInstance) {
		log.debug("deleting Sysnav instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sysnav findById(java.lang.Integer id) {
		log.debug("getting Sysnav instance with id: " + id);
		try {
			Sysnav instance = (Sysnav) getSession().get("com.demo.pojo.Sysnav",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sysnav instance) {
		log.debug("finding Sysnav instance by example");
		try {
			List results = getSession().createCriteria("com.demo.pojo.Sysnav")
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
		log.debug("finding Sysnav instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sysnav as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNavName(Object navName) {
		return findByProperty(NAV_NAME, navName);
	}

	public List findByPid(Object pid) {
		return findByProperty(PID, pid);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByDesc(Object desc) {
		return findByProperty(DESC, desc);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findByIndex(Object index) {
		return findByProperty(INDEX, index);
	}

	public List findAll() {
		log.debug("finding all Sysnav instances");
		try {
			String queryString = "from Sysnav";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}finally{
			getSession().flush();
			getSession().close();
		}
	}

	public Sysnav merge(Sysnav detachedInstance) {
		log.debug("merging Sysnav instance");
		try {
			Sysnav result = (Sysnav) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sysnav instance) {
		log.debug("attaching dirty Sysnav instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sysnav instance) {
		log.debug("attaching clean Sysnav instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	@Override
	public List getSysPid(int pid) {
		String hql="from Sysnav where pid="+pid;
		Query query=getSession().createQuery(hql);
		return query.list();
		
	}
}