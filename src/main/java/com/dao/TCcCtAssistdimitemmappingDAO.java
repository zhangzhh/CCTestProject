package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtAssistdimitemmapping;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtAssistdimitemmapping entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtAssistdimitemmapping
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtAssistdimitemmappingDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtAssistdimitemmappingDAO.class);
	

    
    public void save(TCcCtAssistdimitemmapping transientInstance) {
        log.debug("saving TCcCtAssistdimitemmapping instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtAssistdimitemmapping persistentInstance) {
        log.debug("deleting TCcCtAssistdimitemmapping instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtAssistdimitemmapping findById( String id) {
        log.debug("getting TCcCtAssistdimitemmapping instance with id: " + id);
        try {
            TCcCtAssistdimitemmapping instance = (TCcCtAssistdimitemmapping) getSession()
                    .get("com.dao.TCcCtAssistdimitemmapping", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtAssistdimitemmapping instance) {
        log.debug("finding TCcCtAssistdimitemmapping instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtAssistdimitemmapping")
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
      log.debug("finding TCcCtAssistdimitemmapping instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtAssistdimitemmapping as model where model." 
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
		log.debug("finding all TCcCtAssistdimitemmapping instances");
		try {
			String queryString = "from TCcCtAssistdimitemmapping";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtAssistdimitemmapping merge(TCcCtAssistdimitemmapping detachedInstance) {
        log.debug("merging TCcCtAssistdimitemmapping instance");
        try {
            TCcCtAssistdimitemmapping result = (TCcCtAssistdimitemmapping) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtAssistdimitemmapping instance) {
        log.debug("attaching dirty TCcCtAssistdimitemmapping instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtAssistdimitemmapping instance) {
        log.debug("attaching clean TCcCtAssistdimitemmapping instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}