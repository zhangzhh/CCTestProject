package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCurrencyconnection;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCurrencyconnection entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCurrencyconnection
  * @author MyEclipse Persistence Tools 
 */
public class TCcCurrencyconnectionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCurrencyconnectionDAO.class);
	

    
    public void save(TCcCurrencyconnection transientInstance) {
        log.debug("saving TCcCurrencyconnection instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCurrencyconnection persistentInstance) {
        log.debug("deleting TCcCurrencyconnection instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCurrencyconnection findById( java.lang.Long id) {
        log.debug("getting TCcCurrencyconnection instance with id: " + id);
        try {
            TCcCurrencyconnection instance = (TCcCurrencyconnection) getSession()
                    .get("com.dao.TCcCurrencyconnection", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCurrencyconnection instance) {
        log.debug("finding TCcCurrencyconnection instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCurrencyconnection")
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
      log.debug("finding TCcCurrencyconnection instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCurrencyconnection as model where model." 
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
		log.debug("finding all TCcCurrencyconnection instances");
		try {
			String queryString = "from TCcCurrencyconnection";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCurrencyconnection merge(TCcCurrencyconnection detachedInstance) {
        log.debug("merging TCcCurrencyconnection instance");
        try {
            TCcCurrencyconnection result = (TCcCurrencyconnection) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCurrencyconnection instance) {
        log.debug("attaching dirty TCcCurrencyconnection instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCurrencyconnection instance) {
        log.debug("attaching clean TCcCurrencyconnection instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}