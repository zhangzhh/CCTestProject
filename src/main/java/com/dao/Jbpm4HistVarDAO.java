package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4HistVar;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4HistVar entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4HistVar
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4HistVarDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4HistVarDAO.class);
	

    
    public void save(Jbpm4HistVar transientInstance) {
        log.debug("saving Jbpm4HistVar instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4HistVar persistentInstance) {
        log.debug("deleting Jbpm4HistVar instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4HistVar findById( java.math.BigDecimal id) {
        log.debug("getting Jbpm4HistVar instance with id: " + id);
        try {
            Jbpm4HistVar instance = (Jbpm4HistVar) getSession()
                    .get("com.dao.Jbpm4HistVar", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4HistVar instance) {
        log.debug("finding Jbpm4HistVar instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4HistVar")
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
      log.debug("finding Jbpm4HistVar instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4HistVar as model where model." 
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
		log.debug("finding all Jbpm4HistVar instances");
		try {
			String queryString = "from Jbpm4HistVar";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4HistVar merge(Jbpm4HistVar detachedInstance) {
        log.debug("merging Jbpm4HistVar instance");
        try {
            Jbpm4HistVar result = (Jbpm4HistVar) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4HistVar instance) {
        log.debug("attaching dirty Jbpm4HistVar instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4HistVar instance) {
        log.debug("attaching clean Jbpm4HistVar instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}