package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcAccountdetailDz;

/**
 	* A data access object (DAO) providing persistence and search support for TCcAccountdetailDz entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcAccountdetailDz
  * @author MyEclipse Persistence Tools 
 */
public class TCcAccountdetailDzDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcAccountdetailDzDAO.class);
	

    
    public void save(TCcAccountdetailDz transientInstance) {
        log.debug("saving TCcAccountdetailDz instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcAccountdetailDz persistentInstance) {
        log.debug("deleting TCcAccountdetailDz instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcAccountdetailDz findById( java.lang.Long id) {
        log.debug("getting TCcAccountdetailDz instance with id: " + id);
        try {
            TCcAccountdetailDz instance = (TCcAccountdetailDz) getSession()
                    .get("com.dao.TCcAccountdetailDz", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcAccountdetailDz instance) {
        log.debug("finding TCcAccountdetailDz instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcAccountdetailDz")
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
      log.debug("finding TCcAccountdetailDz instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcAccountdetailDz as model where model." 
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
		log.debug("finding all TCcAccountdetailDz instances");
		try {
			String queryString = "from TCcAccountdetailDz";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcAccountdetailDz merge(TCcAccountdetailDz detachedInstance) {
        log.debug("merging TCcAccountdetailDz instance");
        try {
            TCcAccountdetailDz result = (TCcAccountdetailDz) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcAccountdetailDz instance) {
        log.debug("attaching dirty TCcAccountdetailDz instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcAccountdetailDz instance) {
        log.debug("attaching clean TCcAccountdetailDz instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}