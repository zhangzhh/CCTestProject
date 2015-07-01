package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TLsBuget;

/**
 	* A data access object (DAO) providing persistence and search support for TLsBuget entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TLsBuget
  * @author MyEclipse Persistence Tools 
 */
public class TLsBugetDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TLsBugetDAO.class);
	

    
    public void save(TLsBuget transientInstance) {
        log.debug("saving TLsBuget instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TLsBuget persistentInstance) {
        log.debug("deleting TLsBuget instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TLsBuget findById( String id) {
        log.debug("getting TLsBuget instance with id: " + id);
        try {
            TLsBuget instance = (TLsBuget) getSession()
                    .get("com.dao.TLsBuget", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TLsBuget instance) {
        log.debug("finding TLsBuget instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TLsBuget")
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
      log.debug("finding TLsBuget instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TLsBuget as model where model." 
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
		log.debug("finding all TLsBuget instances");
		try {
			String queryString = "from TLsBuget";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TLsBuget merge(TLsBuget detachedInstance) {
        log.debug("merging TLsBuget instance");
        try {
            TLsBuget result = (TLsBuget) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TLsBuget instance) {
        log.debug("attaching dirty TLsBuget instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TLsBuget instance) {
        log.debug("attaching clean TLsBuget instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}