package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcAccountbalanceBz;

/**
 	* A data access object (DAO) providing persistence and search support for TCcAccountbalanceBz entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcAccountbalanceBz
  * @author MyEclipse Persistence Tools 
 */
public class TCcAccountbalanceBzDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcAccountbalanceBzDAO.class);
	

    
    public void save(TCcAccountbalanceBz transientInstance) {
        log.debug("saving TCcAccountbalanceBz instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcAccountbalanceBz persistentInstance) {
        log.debug("deleting TCcAccountbalanceBz instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcAccountbalanceBz findById( java.lang.Long id) {
        log.debug("getting TCcAccountbalanceBz instance with id: " + id);
        try {
            TCcAccountbalanceBz instance = (TCcAccountbalanceBz) getSession()
                    .get("com.dao.TCcAccountbalanceBz", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcAccountbalanceBz instance) {
        log.debug("finding TCcAccountbalanceBz instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcAccountbalanceBz")
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
      log.debug("finding TCcAccountbalanceBz instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcAccountbalanceBz as model where model." 
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
		log.debug("finding all TCcAccountbalanceBz instances");
		try {
			String queryString = "from TCcAccountbalanceBz";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcAccountbalanceBz merge(TCcAccountbalanceBz detachedInstance) {
        log.debug("merging TCcAccountbalanceBz instance");
        try {
            TCcAccountbalanceBz result = (TCcAccountbalanceBz) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcAccountbalanceBz instance) {
        log.debug("attaching dirty TCcAccountbalanceBz instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcAccountbalanceBz instance) {
        log.debug("attaching clean TCcAccountbalanceBz instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}