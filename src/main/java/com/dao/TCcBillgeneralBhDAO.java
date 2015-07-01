package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillgeneralBh;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillgeneralBh entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillgeneralBh
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillgeneralBhDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillgeneralBhDAO.class);
	

    
    public void save(TCcBillgeneralBh transientInstance) {
        log.debug("saving TCcBillgeneralBh instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillgeneralBh persistentInstance) {
        log.debug("deleting TCcBillgeneralBh instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillgeneralBh findById( java.lang.String id) {
        log.debug("getting TCcBillgeneralBh instance with id: " + id);
        try {
            TCcBillgeneralBh instance = (TCcBillgeneralBh) getSession()
                    .get("com.dao.TCcBillgeneralBh", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillgeneralBh instance) {
        log.debug("finding TCcBillgeneralBh instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillgeneralBh")
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
      log.debug("finding TCcBillgeneralBh instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillgeneralBh as model where model." 
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
		log.debug("finding all TCcBillgeneralBh instances");
		try {
			String queryString = "from TCcBillgeneralBh";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillgeneralBh merge(TCcBillgeneralBh detachedInstance) {
        log.debug("merging TCcBillgeneralBh instance");
        try {
            TCcBillgeneralBh result = (TCcBillgeneralBh) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillgeneralBh instance) {
        log.debug("attaching dirty TCcBillgeneralBh instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillgeneralBh instance) {
        log.debug("attaching clean TCcBillgeneralBh instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}