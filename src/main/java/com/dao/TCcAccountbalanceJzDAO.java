package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcAccountbalanceJz;

/**
 	* A data access object (DAO) providing persistence and search support for TCcAccountbalanceJz entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcAccountbalanceJz
  * @author MyEclipse Persistence Tools 
 */
public class TCcAccountbalanceJzDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcAccountbalanceJzDAO.class);
	

    
    public void save(TCcAccountbalanceJz transientInstance) {
        log.debug("saving TCcAccountbalanceJz instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcAccountbalanceJz persistentInstance) {
        log.debug("deleting TCcAccountbalanceJz instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcAccountbalanceJz findById( java.lang.Long id) {
        log.debug("getting TCcAccountbalanceJz instance with id: " + id);
        try {
            TCcAccountbalanceJz instance = (TCcAccountbalanceJz) getSession()
                    .get("com.dao.TCcAccountbalanceJz", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcAccountbalanceJz instance) {
        log.debug("finding TCcAccountbalanceJz instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcAccountbalanceJz")
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
      log.debug("finding TCcAccountbalanceJz instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcAccountbalanceJz as model where model." 
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
		log.debug("finding all TCcAccountbalanceJz instances");
		try {
			String queryString = "from TCcAccountbalanceJz";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcAccountbalanceJz merge(TCcAccountbalanceJz detachedInstance) {
        log.debug("merging TCcAccountbalanceJz instance");
        try {
            TCcAccountbalanceJz result = (TCcAccountbalanceJz) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcAccountbalanceJz instance) {
        log.debug("attaching dirty TCcAccountbalanceJz instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcAccountbalanceJz instance) {
        log.debug("attaching clean TCcAccountbalanceJz instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}