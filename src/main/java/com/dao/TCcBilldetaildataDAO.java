package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBilldetaildata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBilldetaildata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBilldetaildata
  * @author MyEclipse Persistence Tools 
 */
public class TCcBilldetaildataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBilldetaildataDAO.class);
	

    
    public void save(TCcBilldetaildata transientInstance) {
        log.debug("saving TCcBilldetaildata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBilldetaildata persistentInstance) {
        log.debug("deleting TCcBilldetaildata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBilldetaildata findById( java.lang.Long id) {
        log.debug("getting TCcBilldetaildata instance with id: " + id);
        try {
            TCcBilldetaildata instance = (TCcBilldetaildata) getSession()
                    .get("com.dao.TCcBilldetaildata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBilldetaildata instance) {
        log.debug("finding TCcBilldetaildata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBilldetaildata")
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
      log.debug("finding TCcBilldetaildata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBilldetaildata as model where model." 
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
		log.debug("finding all TCcBilldetaildata instances");
		try {
			String queryString = "from TCcBilldetaildata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBilldetaildata merge(TCcBilldetaildata detachedInstance) {
        log.debug("merging TCcBilldetaildata instance");
        try {
            TCcBilldetaildata result = (TCcBilldetaildata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBilldetaildata instance) {
        log.debug("attaching dirty TCcBilldetaildata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBilldetaildata instance) {
        log.debug("attaching clean TCcBilldetaildata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}