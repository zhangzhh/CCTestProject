package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillpaymentseize;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillpaymentseize entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillpaymentseize
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillpaymentseizeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillpaymentseizeDAO.class);
	

    
    public void save(TCcBillpaymentseize transientInstance) {
        log.debug("saving TCcBillpaymentseize instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillpaymentseize persistentInstance) {
        log.debug("deleting TCcBillpaymentseize instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillpaymentseize findById( java.lang.Long id) {
        log.debug("getting TCcBillpaymentseize instance with id: " + id);
        try {
            TCcBillpaymentseize instance = (TCcBillpaymentseize) getSession()
                    .get("com.dao.TCcBillpaymentseize", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillpaymentseize instance) {
        log.debug("finding TCcBillpaymentseize instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillpaymentseize")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding TCcBillpaymentseize instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillpaymentseize as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all TCcBillpaymentseize instances");
		try {
			String queryString = "from TCcBillpaymentseize";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillpaymentseize merge(TCcBillpaymentseize detachedInstance) {
        log.debug("merging TCcBillpaymentseize instance");
        try {
            TCcBillpaymentseize result = (TCcBillpaymentseize) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillpaymentseize instance) {
        log.debug("attaching dirty TCcBillpaymentseize instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillpaymentseize instance) {
        log.debug("attaching clean TCcBillpaymentseize instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}