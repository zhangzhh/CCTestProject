package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4Property;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4Property entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4Property
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4PropertyDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4PropertyDAO.class);
	

    
    public void save(Jbpm4Property transientInstance) {
        log.debug("saving Jbpm4Property instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4Property persistentInstance) {
        log.debug("deleting Jbpm4Property instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4Property findById( java.lang.String id) {
        log.debug("getting Jbpm4Property instance with id: " + id);
        try {
            Jbpm4Property instance = (Jbpm4Property) getSession()
                    .get("com.dao.Jbpm4Property", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4Property instance) {
        log.debug("finding Jbpm4Property instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4Property")
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
      log.debug("finding Jbpm4Property instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4Property as model where model." 
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
		log.debug("finding all Jbpm4Property instances");
		try {
			String queryString = "from Jbpm4Property";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4Property merge(Jbpm4Property detachedInstance) {
        log.debug("merging Jbpm4Property instance");
        try {
            Jbpm4Property result = (Jbpm4Property) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4Property instance) {
        log.debug("attaching dirty Jbpm4Property instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4Property instance) {
        log.debug("attaching clean Jbpm4Property instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}