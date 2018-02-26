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
import com.demo.dao.BaseHibernateDao;
import com.demo.dao.CustomerDao;
import com.demo.pojo.Customer;
import com.demo.pojo.SaleChance;

/**
 * A data access object (DAO) providing persistence and search support for
 * Customer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.demo.pojo.Customer
 * @author MyEclipse Persistence Tools
 */
public class CustomerDaoImpl extends BaseDao implements CustomerDao{
	private static final Logger log = LoggerFactory
			.getLogger(CustomerDaoImpl.class);
	// property constants
	public static final String CUSTOMER_NUMBER = "customerNumber";
	public static final String CUSTOMER_NAME = "customerName";
	public static final String CUSTOMER_REGION = "customerRegion";
	public static final String USER_ID = "userId";
	public static final String GRADE_ID = "gradeId";
	public static final String SATISFACTION = "satisfaction";
	public static final String CREDIT = "credit";
	public static final String CUSTOMER_ADDR = "customerAddr";
	public static final String MAIL = "mail";
	public static final String CUSTOMERR_PHONE = "customerrPhone";
	public static final String CUSTOMER_FAX = "customerFax";
	public static final String CUSTOMER_URL = "customerUrl";
	public static final String BUSINESS_LICENCE = "businessLicence";
	public static final String CORPORATION = "corporation";
	public static final String MONEY = "money";
	public static final String ANNUAL_TURNOVER = "annualTurnover";
	public static final String OPEN_BANK = "openBank";
	public static final String BANK_NUMBER = "bankNumber";
	public static final String LAND_TAX = "landTax";
	public static final String STATE_TAX = "stateTax";
	public static final String STATE = "state";

	public void save(Customer transientInstance) {
		log.debug("saving Customer instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Customer persistentInstance) {
		log.debug("deleting Customer instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Customer findById(int id) {
		log.debug("getting Customer instance with id: " + id);
		try {
			Customer instance = (Customer) getSession().get(
					"com.demo.pojo.Customer", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Customer instance) {
		log.debug("finding Customer instance by example");
		try {
			List results = getSession()
					.createCriteria("com.demo.pojo.Customer")
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
		log.debug("finding Customer instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Customer as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCustomerNumber(Object customerNumber) {
		return findByProperty(CUSTOMER_NUMBER, customerNumber);
	}

	public List findByCustomerName(Object customerName) {
		return findByProperty(CUSTOMER_NAME, customerName);
	}

	public List findByCustomerRegion(Object customerRegion) {
		return findByProperty(CUSTOMER_REGION, customerRegion);
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByGradeId(Object gradeId) {
		return findByProperty(GRADE_ID, gradeId);
	}

	public List findBySatisfaction(Object satisfaction) {
		return findByProperty(SATISFACTION, satisfaction);
	}

	public List findByCredit(Object credit) {
		return findByProperty(CREDIT, credit);
	}

	public List findByCustomerAddr(Object customerAddr) {
		return findByProperty(CUSTOMER_ADDR, customerAddr);
	}

	public List findByMail(Object mail) {
		return findByProperty(MAIL, mail);
	}

	public List findByCustomerrPhone(Object customerrPhone) {
		return findByProperty(CUSTOMERR_PHONE, customerrPhone);
	}

	public List findByCustomerFax(Object customerFax) {
		return findByProperty(CUSTOMER_FAX, customerFax);
	}

	public List findByCustomerUrl(Object customerUrl) {
		return findByProperty(CUSTOMER_URL, customerUrl);
	}

	public List findByBusinessLicence(Object businessLicence) {
		return findByProperty(BUSINESS_LICENCE, businessLicence);
	}

	public List findByCorporation(Object corporation) {
		return findByProperty(CORPORATION, corporation);
	}

	public List findByMoney(Object money) {
		return findByProperty(MONEY, money);
	}

	public List findByAnnualTurnover(Object annualTurnover) {
		return findByProperty(ANNUAL_TURNOVER, annualTurnover);
	}

	public List findByOpenBank(Object openBank) {
		return findByProperty(OPEN_BANK, openBank);
	}

	public List findByBankNumber(Object bankNumber) {
		return findByProperty(BANK_NUMBER, bankNumber);
	}

	public List findByLandTax(Object landTax) {
		return findByProperty(LAND_TAX, landTax);
	}

	public List findByStateTax(Object stateTax) {
		return findByProperty(STATE_TAX, stateTax);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all Customer instances");
		try {
			String queryString = "from Customer where state>-1";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(SystemContext.getPageOffset());
			queryObject.setMaxResults(4);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Customer merge(Customer detachedInstance) {
		log.debug("merging Customer instance");
		try {
			Customer result = (Customer) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Customer instance) {
		log.debug("attaching dirty Customer instance");
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

	public void attachClean(Customer instance) {
		log.debug("attaching clean Customer instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	
	public List<Customer> getByIdCustomer(){
		String hql="from Customer where user.role.roleId=1";
		Query query=getSession().createQuery(hql);
		return query.list();
	}
	
	public List findSize() {
		log.debug("finding all Customer instances");
		try {
			String queryString = "from Customer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List<Customer> findByCondition(CrmVo vo){
		Map<String,Object> map=new HashMap<String, Object>();
		String hql="from Customer where user.role.roleId=1";
		try {
			if(vo.getCustomerId()!=null&&!vo.getCustomerId().equals("")){
				hql+=" and customerNumber=:customerId";
				map.put("customerId", vo.getCustomerId());
			}
			if(vo.getCustomerName()!=null&&!vo.getCustomerName().equals("")){
				hql+=" and customerName=:customerName";
				map.put("customerName",vo.getCustomerName());
			}
			if(vo.getAddr()!=null&&!vo.getAddr().equals("")){
				hql+=" and customerRegion=:addr";
				map.put("addr",vo.getAddr());
			}
			if(vo.getCustomerjl()!=null&&!vo.getCustomerjl().equals("")){
				hql+=" and user.trueName=:customerjl";
				map.put("customerjl",vo.getCustomerjl());
			}
			if(vo.getGrade()!=null&&vo.getGrade().getGradeId()!=0){
				hql+=" and grade.gradeId=:gradeId";
				map.put("gradeId",vo.getGrade().getGradeId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			getSession().flush();
			getSession().close();
		}
		return findByCondition(hql, map);
	}
	public void deletCustomer(Customer cus){
		  Transaction tx=null;
		 try {
			 getSession().close();
			 tx=getSession().beginTransaction();
			 String sql = "update customer set state =-1 where customer_id = "+cus.getCustomerId();
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
	public List All() {
		log.debug("finding all Customer instances");
		try {
			String queryString = "from Customer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	//¹¹³É·ÖÎö
		public List findAllgoucheng() {
			log.debug("finding all Customer instances");
			try {
				String queryString = "select customerId,grade.gradeName,count(*)from Customer group by grade.gradeId";
				List queryObject = getSession().createQuery(queryString).list();
				  
				
				return queryObject;
			} catch (RuntimeException re) {
				log.error("find all failed", re);
				throw re;
			}
		}


}