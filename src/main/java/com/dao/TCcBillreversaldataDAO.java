package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillreversaldata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillreversaldata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillreversaldata
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillreversaldataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillreversaldataDAO.class);
	

    
    public void save(TCcBillreversaldata transientInstance) {
        log.debug("saving TCcBillreversaldata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillreversaldata persistentInstance) {
        log.debug("deleting TCcBillreversaldata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillreversaldata findById( java.lang.Long id) {
        log.debug("getting TCcBillreversaldata instance with id: " + id);
        try {
            TCcBillreversaldata instance = (TCcBillreversaldata) getSession()
                    .get("com.dao.TCcBillreversaldata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillreversaldata instance) {
        log.debug("finding TCcBillreversaldata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillreversaldata")
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
      log.debug("finding TCcBillreversaldata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillreversaldata as model where model." 
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
		log.debug("finding all TCcBillreversaldata instances");
		try {
			String queryString = "from TCcBillreversaldata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillreversaldata merge(TCcBillreversaldata detachedInstance) {
        log.debug("merging TCcBillreversaldata instance");
        try {
            TCcBillreversaldata result = (TCcBillreversaldata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillreversaldata instance) {
        log.debug("attaching dirty TCcBillreversaldata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillreversaldata instance) {
        log.debug("attaching clean TCcBillreversaldata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}