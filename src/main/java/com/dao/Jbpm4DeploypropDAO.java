package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4Deployprop;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4Deployprop entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4Deployprop
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4DeploypropDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4DeploypropDAO.class);
	

    
    public void save(Jbpm4Deployprop transientInstance) {
        log.debug("saving Jbpm4Deployprop instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4Deployprop persistentInstance) {
        log.debug("deleting Jbpm4Deployprop instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4Deployprop findById( java.math.BigDecimal id) {
        log.debug("getting Jbpm4Deployprop instance with id: " + id);
        try {
            Jbpm4Deployprop instance = (Jbpm4Deployprop) getSession()
                    .get("com.dao.Jbpm4Deployprop", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4Deployprop instance) {
        log.debug("finding Jbpm4Deployprop instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4Deployprop")
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
      log.debug("finding Jbpm4Deployprop instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4Deployprop as model where model." 
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
		log.debug("finding all Jbpm4Deployprop instances");
		try {
			String queryString = "from Jbpm4Deployprop";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4Deployprop merge(Jbpm4Deployprop detachedInstance) {
        log.debug("merging Jbpm4Deployprop instance");
        try {
            Jbpm4Deployprop result = (Jbpm4Deployprop) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4Deployprop instance) {
        log.debug("attaching dirty Jbpm4Deployprop instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4Deployprop instance) {
        log.debug("attaching clean Jbpm4Deployprop instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}