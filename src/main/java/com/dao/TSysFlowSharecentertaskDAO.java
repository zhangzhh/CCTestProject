package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysFlowSharecentertask;

/**
 	* A data access object (DAO) providing persistence and search support for TSysFlowSharecentertask entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysFlowSharecentertask
  * @author MyEclipse Persistence Tools 
 */
public class TSysFlowSharecentertaskDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysFlowSharecentertaskDAO.class);
	

    
    public void save(TSysFlowSharecentertask transientInstance) {
        log.debug("saving TSysFlowSharecentertask instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysFlowSharecentertask persistentInstance) {
        log.debug("deleting TSysFlowSharecentertask instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysFlowSharecentertask findById( java.lang.Long id) {
        log.debug("getting TSysFlowSharecentertask instance with id: " + id);
        try {
            TSysFlowSharecentertask instance = (TSysFlowSharecentertask) getSession()
                    .get("com.dao.TSysFlowSharecentertask", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysFlowSharecentertask instance) {
        log.debug("finding TSysFlowSharecentertask instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysFlowSharecentertask")
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
      log.debug("finding TSysFlowSharecentertask instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysFlowSharecentertask as model where model." 
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
		log.debug("finding all TSysFlowSharecentertask instances");
		try {
			String queryString = "from TSysFlowSharecentertask";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysFlowSharecentertask merge(TSysFlowSharecentertask detachedInstance) {
        log.debug("merging TSysFlowSharecentertask instance");
        try {
            TSysFlowSharecentertask result = (TSysFlowSharecentertask) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysFlowSharecentertask instance) {
        log.debug("attaching dirty TSysFlowSharecentertask instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysFlowSharecentertask instance) {
        log.debug("attaching clean TSysFlowSharecentertask instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}