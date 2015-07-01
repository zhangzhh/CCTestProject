package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcAccountdetailJz;

/**
 	* A data access object (DAO) providing persistence and search support for TCcAccountdetailJz entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcAccountdetailJz
  * @author MyEclipse Persistence Tools 
 */
public class TCcAccountdetailJzDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcAccountdetailJzDAO.class);
	

    
    public void save(TCcAccountdetailJz transientInstance) {
        log.debug("saving TCcAccountdetailJz instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcAccountdetailJz persistentInstance) {
        log.debug("deleting TCcAccountdetailJz instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcAccountdetailJz findById( java.lang.Long id) {
        log.debug("getting TCcAccountdetailJz instance with id: " + id);
        try {
            TCcAccountdetailJz instance = (TCcAccountdetailJz) getSession()
                    .get("com.dao.TCcAccountdetailJz", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcAccountdetailJz instance) {
        log.debug("finding TCcAccountdetailJz instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcAccountdetailJz")
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
      log.debug("finding TCcAccountdetailJz instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcAccountdetailJz as model where model." 
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
		log.debug("finding all TCcAccountdetailJz instances");
		try {
			String queryString = "from TCcAccountdetailJz";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcAccountdetailJz merge(TCcAccountdetailJz detachedInstance) {
        log.debug("merging TCcAccountdetailJz instance");
        try {
            TCcAccountdetailJz result = (TCcAccountdetailJz) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcAccountdetailJz instance) {
        log.debug("attaching dirty TCcAccountdetailJz instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcAccountdetailJz instance) {
        log.debug("attaching clean TCcAccountdetailJz instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}