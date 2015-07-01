package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4Swimlane;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4Swimlane entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4Swimlane
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4SwimlaneDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4SwimlaneDAO.class);
	

    
    public void save(Jbpm4Swimlane transientInstance) {
        log.debug("saving Jbpm4Swimlane instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4Swimlane persistentInstance) {
        log.debug("deleting Jbpm4Swimlane instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4Swimlane findById( java.math.BigDecimal id) {
        log.debug("getting Jbpm4Swimlane instance with id: " + id);
        try {
            Jbpm4Swimlane instance = (Jbpm4Swimlane) getSession()
                    .get("com.dao.Jbpm4Swimlane", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4Swimlane instance) {
        log.debug("finding Jbpm4Swimlane instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4Swimlane")
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
      log.debug("finding Jbpm4Swimlane instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4Swimlane as model where model." 
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
		log.debug("finding all Jbpm4Swimlane instances");
		try {
			String queryString = "from Jbpm4Swimlane";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4Swimlane merge(Jbpm4Swimlane detachedInstance) {
        log.debug("merging Jbpm4Swimlane instance");
        try {
            Jbpm4Swimlane result = (Jbpm4Swimlane) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4Swimlane instance) {
        log.debug("attaching dirty Jbpm4Swimlane instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4Swimlane instance) {
        log.debug("attaching clean Jbpm4Swimlane instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}