package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4HistProcinst;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4HistProcinst entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4HistProcinst
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4HistProcinstDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4HistProcinstDAO.class);
	

    
    public void save(Jbpm4HistProcinst transientInstance) {
        log.debug("saving Jbpm4HistProcinst instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4HistProcinst persistentInstance) {
        log.debug("deleting Jbpm4HistProcinst instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4HistProcinst findById( java.math.BigDecimal id) {
        log.debug("getting Jbpm4HistProcinst instance with id: " + id);
        try {
            Jbpm4HistProcinst instance = (Jbpm4HistProcinst) getSession()
                    .get("com.dao.Jbpm4HistProcinst", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4HistProcinst instance) {
        log.debug("finding Jbpm4HistProcinst instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4HistProcinst")
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
      log.debug("finding Jbpm4HistProcinst instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4HistProcinst as model where model." 
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
		log.debug("finding all Jbpm4HistProcinst instances");
		try {
			String queryString = "from Jbpm4HistProcinst";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4HistProcinst merge(Jbpm4HistProcinst detachedInstance) {
        log.debug("merging Jbpm4HistProcinst instance");
        try {
            Jbpm4HistProcinst result = (Jbpm4HistProcinst) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4HistProcinst instance) {
        log.debug("attaching dirty Jbpm4HistProcinst instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4HistProcinst instance) {
        log.debug("attaching clean Jbpm4HistProcinst instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}