package com.demo.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.biz.impl.CrmVo;
import com.demo.connection.SystemContext;
import com.demo.dao.BaseDao;
import com.demo.dao.BaseHibernateDao;
import com.demo.dao.ServiceManagerDao;
import com.demo.pojo.ServiceManager;

/**
 * A data access object (DAO) providing persistence and search support for
 * ServiceManager entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.demo.pojo.ServiceManager
 * @author MyEclipse Persistence Tools
 */
public class ServiceManagerDaoImpl extends BaseDao implements ServiceManagerDao{
	private static final Logger log = LoggerFactory
			.getLogger(ServiceManagerDaoImpl.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String SERVICE_TYPE = "serviceType";
	public static final String PROFILE = "profile";
	public static final String CUSTOMER_NAME = "customerName";
	public static final String STATE = "state";
	public static final String SERVICE_REQUEST = "serviceRequest";
	public static final String CREATE_PERSON = "createPerson";
	public static final String SERVICE_PROCSSING = "serviceProcssing";
	public static final String PROCES_PERSON = "procesPerson";
	public static final String PROCES_RESULT = "procesResult";
	public static final String SATISFACTION = "satisfaction";
	
	public void save(ServiceManager transientInstance) {
		Transaction tx=null;
		log.debug("saving ServiceManager instance");
		try {
			getSession().close();
			tx=getSession().beginTransaction();
			getSession().save(transientInstance);
			tx.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			tx.rollback();
			throw re;
		}
	}

	public void delete(ServiceManager persistentInstance) {
		log.debug("deleting ServiceManager instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ServiceManager findById(java.lang.Integer id) {
		log.debug("getting ServiceManager instance with id: " + id);
		try {
			ServiceManager instance = (ServiceManager) getSession().get(
					"com.demo.pojo.ServiceManager", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ServiceManager instance) {
		log.debug("finding ServiceManager instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.ServiceManager")
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
		log.debug("finding ServiceManager instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ServiceManager as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByServiceType(Object serviceType) {
		return findByProperty(SERVICE_TYPE, serviceType);
	}

	public List findByProfile(Object profile) {
		return findByProperty(PROFILE, profile);
	}

	public List findByCustomerName(Object customerName) {
		return findByProperty(CUSTOMER_NAME, customerName);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findByServiceRequest(Object serviceRequest) {
		return findByProperty(SERVICE_REQUEST, serviceRequest);
	}

	public List findByCreatePerson(Object createPerson) {
		return findByProperty(CREATE_PERSON, createPerson);
	}

	public List findByServiceProcssing(Object serviceProcssing) {
		return findByProperty(SERVICE_PROCSSING, serviceProcssing);
	}

	public List findByProcesPerson(Object procesPerson) {
		return findByProperty(PROCES_PERSON, procesPerson);
	}

	public List findByProcesResult(Object procesResult) {
		return findByProperty(PROCES_RESULT, procesResult);
	}

	public List findBySatisfaction(Object satisfaction) {
		return findByProperty(SATISFACTION, satisfaction);
	}

	public List findAll() {
		log.debug("finding all ServiceManager instances");
		try {
			String queryString = "from ServiceManager where state=1";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(SystemContext.getPageOffset());
			queryObject.setMaxResults(3);	
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ServiceManager merge(ServiceManager detachedInstance) {
		log.debug("merging ServiceManager instance");
		try {
			ServiceManager result = (ServiceManager) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}
 
	public void attachDirty(ServiceManager instance) {
		log.debug("attaching dirty ServiceManager instance");
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

	public void attachClean(ServiceManager instance) {
		log.debug("attaching clean ServiceManager instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	//分页
	public List findSize() {
		log.debug("finding all ServiceManager instances");
		try {
			String queryString = "from ServiceManager";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	//筛选新建的服务(等待分配的服务)
	public List<ServiceManager> findByCondition(CrmVo vo){
		Map<String,Object>map=new HashMap<String,Object>();
		String hql="from ServiceManager where 1=1 and state=1";
		try {
			if(vo.getKehuName()!=null&&!vo.getKehuName().equals("")){
				hql+=" and customerName=:kehuName";	
				map.put("kehuName", vo.getKehuName());
				System.out.println(vo.getKehuName()+"daoimpl");
			}
			if(vo.getPrefile()!=null&&!vo.getPrefile().equals("")){
				hql+=" and profile=:prefile";
				map.put("prefile", vo.getPrefile());
			}
			if(vo.getFuwutype().equals("请选择")){
				hql+=" and 1=1";
			}
			if(vo.getFuwutype()!=null&&!vo.getFuwutype().equals("")){
				hql+=" and serviceType=:fuwutype";
				map.put("fuwutype", vo.getFuwutype());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			getSession().flush();
			getSession().close();
		}
		return findByCondition(hql, map);
	}
	//筛选已经分配的服务(等待处理)
	public List<ServiceManager> findByCondition2(CrmVo vo){
		Map<String,Object>map=new HashMap<String,Object>();
		String hql="from ServiceManager where state=2";
		try {
			if(vo.getKehuName()!=null&&!vo.getKehuName().equals("")){
				hql+=" and customerName=:kehuName";	
				map.put("kehuName", vo.getKehuName());
				System.out.println(vo.getKehuName()+"daoimpl");
			}
			if(vo.getPrefile()!=null&&!vo.getPrefile().equals("")){
				hql+=" and profile=:prefile";
				map.put("prefile", vo.getPrefile());
			}
			if(vo.getFuwutype().equals("请选择")){
				hql+=" and 1=1";
			}
			if(vo.getFuwutype()!=null&&!vo.getFuwutype().equals("")){
				hql+=" and serviceType=:fuwutype";
				map.put("fuwutype", vo.getFuwutype());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			getSession().flush();
			getSession().close();
		}
		return findByCondition(hql, map);
	}
	//删除
	
	public void deleteService(ServiceManager servicemanager){

		Transaction tx=null;
		try {				
			getSession().close();
			tx=getSession().beginTransaction();
			 String sql = "update service_manager set state = -1 where service_id = "+servicemanager.getServiceId();
			 System.out.println(servicemanager.getServiceId()+"aaaaaa");
			 SQLQuery sqlQuery = getSession().createSQLQuery(sql);
			 sqlQuery.executeUpdate();
			 tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}
	//查询所有已经分配的服务
	public List<ServiceManager> findFenpeiService(){
		String hql="from ServiceManager where procesPerson is not null and state=2";
		Query query=getSession().createQuery(hql);
		return 	query.list();
	}
  //查询已经处理的服务
	public List findchuli() {
		log.debug("finding all ServiceManager instances");
		try {
			String queryString = "from ServiceManager where state=3";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	//归档服务查询所有的服务
	public List findfankui() {
		log.debug("finding all ServiceManager instances");
		try {
			String queryString = "from ServiceManager where state>0";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	//查询服务分析
		public List findfenxi() {
			log.debug("finding all ServiceManager instances");
			try {
				String queryString = "select serviceId,count(*),serviceType from ServiceManager group by serviceType";
				List queryObject = getSession().createQuery(queryString).list();
				return queryObject;
			} catch (RuntimeException re) {
				log.error("find all failed", re);
				throw re;
			}
		}
		public List<ServiceManager> findByCondition3(CrmVo vo){
			Map<String,Object>map=new HashMap<String,Object>();
			String hql="from ServiceManager where 1=1";
			try {
				if(vo.getKehuName()!=null&&!vo.getKehuName().equals("")){
					hql+=" and customerName=:kehuName";	
					map.put("kehuName", vo.getKehuName());
					System.out.println(vo.getKehuName()+"daoimpl");
				}
				if(vo.getPrefile()!=null&&!vo.getPrefile().equals("")){
					hql+=" and profile=:prefile";
					map.put("prefile", vo.getPrefile());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				getSession().flush();
				getSession().close();
			}
			return findByCondition(hql, map);
		}
}