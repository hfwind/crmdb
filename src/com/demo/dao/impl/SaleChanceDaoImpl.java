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
import com.demo.dao.SaleChanceDao;
import com.demo.pojo.SaleChance;

/**
 * A data access object (DAO) providing persistence and search support for
 * SaleChance entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.demo.pojo.SaleChance
 * @author MyEclipse Persistence Tools
 */
public class SaleChanceDaoImpl extends BaseDao implements SaleChanceDao{
	private static final Logger log = LoggerFactory
			.getLogger(SaleChanceDaoImpl.class);
	// property constants
	public static final String SALE_SOURCE = "saleSource";
	public static final String FOUNDER = "founder";
	public static final String CUSTOMER_NAME = "customerName";
	public static final String LINKMAN = "linkman";
	public static final String LINK_TEL = "linkTel";
	public static final String PROFILE = "profile";
	public static final String DESC = "desc";
	public static final String USER_ID = "userId";
	public static final String SUCCESS = "success";
	public static final String STATE = "state";
	//Transaction tx=getSession().beginTransaction();
	public void save(SaleChance transientInstance) {
		log.debug("saving SaleChance instance");
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

	public void delete(SaleChance persistentInstance) {
		log.debug("deleting SaleChance instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	 Session session=getSession();
  public void deletSale(SaleChance sale){
	  Transaction tx=null;
	 try {
		 getSession().close();
		 tx=getSession().beginTransaction();
		 String sql = "update sale_chance set state = -1 where sale_id = "+sale.getSaleId();
		 SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		 sqlQuery.executeUpdate();
		 tx.commit();
	} catch (Exception e) {
		tx.rollback();
		e.printStackTrace();
	}finally{
		getSession().flush();
		getSession().close();
	}
	  
  }
	public SaleChance findById(java.lang.Integer id) {
		log.debug("getting SaleChance instance with id: " + id);
		try {
			String hql = "from SaleChance where saleId = ?";
			Query query = getSession().createQuery(hql);
			query.setInteger(0, id);
			return (SaleChance) query.list().get(0);
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SaleChance instance) {
		log.debug("finding SaleChance instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.SaleChance")
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
		log.debug("finding SaleChance instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SaleChance as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySaleSource(Object saleSource) {
		return findByProperty(SALE_SOURCE, saleSource);
	}

	public List findByFounder(Object founder) {
		return findByProperty(FOUNDER, founder);
	}

	public List findByCustomerName(Object customerName) {
		return findByProperty(CUSTOMER_NAME, customerName);
	}

	public List findByLinkman(Object linkman) {
		return findByProperty(LINKMAN, linkman);
	}

	public List findByLinkTel(Object linkTel) {
		return findByProperty(LINK_TEL, linkTel);
	}

	public List findByProfile(Object profile) {
		return findByProperty(PROFILE, profile);
	}

	public List findByDesc(Object desc) {
		return findByProperty(DESC, desc);
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findBySuccess(Object success) {
		return findByProperty(SUCCESS, success);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all SaleChance instances");
		try {
			String queryString = "from SaleChance where state>0";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(SystemContext.getPageOffset());
			queryObject.setMaxResults(4);	
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	//分页查询
	public List findSize() {
		log.debug("finding all SaleChance instances");
		try {
			String queryString = "from SaleChance";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public SaleChance merge(SaleChance detachedInstance) {
		log.debug("merging SaleChance instance");
		try {
			SaleChance result = (SaleChance) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SaleChance instance) {
		log.debug("attaching dirty SaleChance instance");
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
		}finally{
			getSession().flush();
			getSession().close();
		}
	}
	public void attachClean(SaleChance instance) {
		log.debug("attaching clean SaleChance instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	//筛选
	public List<SaleChance> findByCondition(CrmVo vo){
		Map<String,Object>map=new HashMap<String,Object>();
		String hql="from SaleChance where 1=1";
		try {
			if(vo.getKehuName()!=null&&!vo.getKehuName().equals("")){
				hql+=" and customerName=:kehuName";	
				map.put("kehuName", vo.getKehuName());
			}
			if(vo.getPrefile()!=null&&!vo.getPrefile().equals("")){
				hql+=" and profile=:prefile";
				map.put("prefile", vo.getPrefile());
			}
			if(vo.getLineMan()!=null&&!vo.getLineMan().equals("")){
				hql+=" and linkman=:lineMan";
				map.put("lineMan",vo.getLineMan());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			getSession().flush();
			getSession().close();
		}
		return findByCondition(hql, map);
	}
	//添加
	public void saveSale(SaleChance sale){
		  Transaction tx=null;
		 try {
			 getSession().close();
			 tx=getSession().beginTransaction();
			 String sql = "INSERT INTO sale_chance() VALUES(NULL,?,?,?,?,?,?,?,NULL,?,?,NULL,?)";
			 SQLQuery sqlQuery = getSession().createSQLQuery(sql);
			 sqlQuery.setString(0,sale.getSaleSource());
			 sqlQuery.setString(1,sale.getFounder());
			 sqlQuery.setString(2,sale.getCustomerName());
			 sqlQuery.setString(3,sale.getLinkman());
			 sqlQuery.setString(4,sale.getLinkTel());
			 sqlQuery.setString(5,sale.getProfile());
			 sqlQuery.setString(6,sale.getDesc());
			 sqlQuery.setInteger(7,sale.getSuccess());
			 sqlQuery.setDate(8,sale.getCreateTime());
			 sqlQuery.setInteger(9,sale.getState());
			 sqlQuery.executeUpdate();
			 tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
	public void updatefen(SaleChance sale){
		Transaction tx=null;
		try {
			getSession().close();
			tx=getSession().beginTransaction();
			String sql="update sale_chance set user_id=?,assignment_time=? where sale_id=?";
			SQLQuery sqlquery=getSession().createSQLQuery(sql);
			sqlquery.setInteger(0, sale.getUserinfo().getUserId());
			sqlquery.setDate(1,sale.getAssignmentTime());
			sqlquery.setInteger(2,sale.getSaleId());
			sqlquery.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	public List<SaleChance> getByIdSale(){
		String hql="from SaleChance where userinfo.userId is not null and state>-1";
		Query query=getSession().createQuery(hql);
		return query.list();
	}
	//已分配销售机会筛选
		public List<SaleChance> findByConditions(CrmVo vo){
			Map<String,Object>map=new HashMap<String,Object>();
			String hql="from SaleChance where state>-1 and userinfo.userId is not null";
			try {
				if(vo.getKehuName()!=null&&!vo.getKehuName().equals("")){
					hql+=" and customerName=:kehuName";	
					map.put("kehuName", vo.getKehuName());
				}
				if(vo.getPrefile()!=null&&!vo.getPrefile().equals("")){
					hql+=" and profile=:prefile";
					map.put("prefile", vo.getPrefile());
				}
				if(vo.getLineMan()!=null&&!vo.getLineMan().equals("")){
					hql+=" and linkman=:lineMan";
					map.put("lineMan",vo.getLineMan());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				getSession().flush();
				getSession().close();
			}
			return findByCondition(hql, map);
		}
		//修改销售机会
		public void xiuGaiSale(SaleChance sale){
			Transaction tx=null;
			try {
				getSession().close();
				tx=getSession().beginTransaction();
				String sql="UPDATE  sale_chance SET sale_source=?,customer_name=?,linkman=?,link_tel=?,`profile`=?,`desc`=?,success=? WHERE sale_id=?";
				SQLQuery query=getSession().createSQLQuery(sql);
				query.setString(0,sale.getSaleSource());
				query.setString(1,sale.getCustomerName());
				query.setString(2,sale.getLinkman());
				query.setString(3,sale.getLinkTel());
				query.setString(4,sale.getProfile());
				query.setString(5,sale.getDesc());
				query.setInteger(6,sale.getSuccess());
				query.setInteger(7,sale.getSaleId());
				query.executeUpdate();
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		public void statea(SaleChance sale){
			Transaction tx=null;
			try {
				getSession().close();
				tx=getSession().beginTransaction();
				String hql="update sale_chance set state=? where sale_id=?";
				SQLQuery query=getSession().createSQLQuery(hql);
				query.setInteger(0, sale.getState());
				query.setInteger(1,sale.getSaleId());
				query.executeUpdate();
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
				e.printStackTrace();
			}
		}
}