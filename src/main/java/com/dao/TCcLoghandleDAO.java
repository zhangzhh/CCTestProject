package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcLoghandle;

/**
 	* A data access object (DAO) providing persistence and search support for TCcLoghandle entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcLoghandle
  * @author MyEclipse Persistence Tools 
 */
public class TCcLoghandleDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcLoghandleDAO.class);
	

    
    public void save(TCcLoghandle transientInstance) {
        log.debug("saving TCcLoghandle instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcLoghandle persistentInstance) {
        log.debug("deleting TCcLoghandle instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcLoghandle findById( String id) {
        log.debug("getting TCcLoghandle instance with id: " + id);
        try {
            TCcLoghandle instance = (TCcLoghandle) getSession()
                    .get("com.dao.TCcLoghandle", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcLoghandle instance) {
        log.debug("finding TCcLoghandle instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcLoghandle")
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
      log.debug("finding TCcLoghandle instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcLoghandle as model where model." 
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
		log.debug("finding all TCcLoghandle instances");
		try {
			String queryString = "from TCcLoghandle";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcLoghandle merge(TCcLoghandle detachedInstance) {
        log.debug("merging TCcLoghandle instance");
        try {
            TCcLoghandle result = (TCcLoghandle) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcLoghandle instance) {
        log.debug("attaching dirty TCcLoghandle instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcLoghandle instance) {
        log.debug("attaching clean TCcLoghandle instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}