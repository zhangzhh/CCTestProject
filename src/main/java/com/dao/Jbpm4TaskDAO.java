package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4Task;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4Task entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4Task
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4TaskDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4TaskDAO.class);
	

    
    public void save(Jbpm4Task transientInstance) {
        log.debug("saving Jbpm4Task instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4Task persistentInstance) {
        log.debug("deleting Jbpm4Task instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4Task findById( java.math.BigDecimal id) {
        log.debug("getting Jbpm4Task instance with id: " + id);
        try {
            Jbpm4Task instance = (Jbpm4Task) getSession()
                    .get("com.dao.Jbpm4Task", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4Task instance) {
        log.debug("finding Jbpm4Task instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4Task")
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
      log.debug("finding Jbpm4Task instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4Task as model where model." 
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
		log.debug("finding all Jbpm4Task instances");
		try {
			String queryString = "from Jbpm4Task";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4Task merge(Jbpm4Task detachedInstance) {
        log.debug("merging Jbpm4Task instance");
        try {
            Jbpm4Task result = (Jbpm4Task) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4Task instance) {
        log.debug("attaching dirty Jbpm4Task instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4Task instance) {
        log.debug("attaching clean Jbpm4Task instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}