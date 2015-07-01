package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4IdGroup;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4IdGroup entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4IdGroup
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4IdGroupDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4IdGroupDAO.class);
	

    
    public void save(Jbpm4IdGroup transientInstance) {
        log.debug("saving Jbpm4IdGroup instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4IdGroup persistentInstance) {
        log.debug("deleting Jbpm4IdGroup instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4IdGroup findById( java.math.BigDecimal id) {
        log.debug("getting Jbpm4IdGroup instance with id: " + id);
        try {
            Jbpm4IdGroup instance = (Jbpm4IdGroup) getSession()
                    .get("com.dao.Jbpm4IdGroup", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4IdGroup instance) {
        log.debug("finding Jbpm4IdGroup instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4IdGroup")
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
      log.debug("finding Jbpm4IdGroup instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4IdGroup as model where model." 
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
		log.debug("finding all Jbpm4IdGroup instances");
		try {
			String queryString = "from Jbpm4IdGroup";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4IdGroup merge(Jbpm4IdGroup detachedInstance) {
        log.debug("merging Jbpm4IdGroup instance");
        try {
            Jbpm4IdGroup result = (Jbpm4IdGroup) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4IdGroup instance) {
        log.debug("attaching dirty Jbpm4IdGroup instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4IdGroup instance) {
        log.debug("attaching clean Jbpm4IdGroup instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}