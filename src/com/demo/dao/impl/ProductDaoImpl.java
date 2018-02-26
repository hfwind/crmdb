package com.demo.dao.impl;

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
import com.demo.dao.ProductDao;
import com.demo.pojo.CustomerLoss;
import com.demo.pojo.Product;
import com.demo.pojo.SaleChance;

/**
 * A data access object (DAO) providing persistence and search support for
 * Product entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.demo.pojo.Product
 * @author MyEclipse Persistence Tools
 */
public class ProductDaoImpl extends BaseDao implements ProductDao{
	private static final Logger log = LoggerFactory.getLogger(ProductDaoImpl.class);
	// property constants
	public static final String PRODUCT_NAME = "productName";
	public static final String WAREHOUSE_ID = "warehouseId";
	public static final String GOODS = "goods";
	public static final String PRODUCT_NUM = "productNum";
	public static final String PRODUCT_MONEY = "productMoney";
	public static final String REMARK = "remark";
	public static final String STATE = "state";

	public void save(Product transientInstance) {
		log.debug("saving Product instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Product persistentInstance) {
		log.debug("deleting Product instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Product findById(java.lang.Integer id) {
		log.debug("getting Product instance with id: " + id);
		try {
			Product instance = (Product) getSession().get(
					"com.demo.pojo.Product", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Product instance) {
		log.debug("finding Product instance by example");
		try {
			List results = getSession().createCriteria("com.demo.pojo.Product")
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
		log.debug("finding Product instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Product as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByProductName(Object productName) {
		return findByProperty(PRODUCT_NAME, productName);
	}

	public List findByWarehouseId(Object warehouseId) {
		return findByProperty(WAREHOUSE_ID, warehouseId);
	}

	public List findByGoods(Object goods) {
		return findByProperty(GOODS, goods);
	}

	public List findByProductNum(Object productNum) {
		return findByProperty(PRODUCT_NUM, productNum);
	}

	public List findByProductMoney(Object productMoney) {
		return findByProperty(PRODUCT_MONEY, productMoney);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all Product instances");
		try {
			String queryString = "from Product where 1=1";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(SystemContext.getPageOffset());
			queryObject.setMaxResults(2);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Product merge(Product detachedInstance) {
		log.debug("merging Product instance");
		try {
			Product result = (Product) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Product instance) {
		log.debug("attaching dirty Product instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Product instance) {
		log.debug("attaching clean Product instance");
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
		log.debug("finding all Product instances");
		try {
			String queryString = "from Product";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	//筛选查询
	public List<Product> findByConditions(CrmVo vo){
		getSession().clear();
		Map<String,Object>map=new HashMap<String,Object>();
		String hql="from Product where 1=1";
		try {
			if(vo.getProductName()!=null&&!vo.getProductName().equals("")){
				hql+=" and productName=:productName";	
				map.put("productName", vo.getProductName());
			}
			if(vo.getRemark()!=null&&!vo.getRemark().equals("")){
				hql+=" and remark=:remark";
				map.put("remark", vo.getRemark());
			}
			if(vo.getGoods()!=null&&!vo.getGoods().equals("")){
				System.out.println(vo.getGoods());
				hql+=" and goods=:goods";
				map.put("goods",vo.getGoods());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			getSession().flush();
			getSession().close();
		}
		return findByCondition(hql, map);
	}
	
	public List<Product> findByConditions2(CrmVo vo){
		getSession().clear();
		Map<String,Object>map=new HashMap<String,Object>();
		String hql="from Product where 1=1";
		try {
			if(vo.getRemark()!=null&&!vo.getRemark().equals("")){
				hql+=" and remark=:remark";
				map.put("remark", vo.getRemark());
			}
			if(vo.getWar()!=null&&vo.getWar().getWarehouseName()!=null&&!vo.getWar().getWarehouseName().equals("")){
			    hql+=" and war.warehouseName=:warehouseName";
			  map.put("warehouseName", vo.getWar().getWarehouseName());
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