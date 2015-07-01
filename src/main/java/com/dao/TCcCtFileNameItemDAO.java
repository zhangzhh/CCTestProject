package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtFileNameItem;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtFileNameItem entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtFileNameItem
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtFileNameItemDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtFileNameItemDAO.class);
	

    
    public void save(TCcCtFileNameItem transientInstance) {
        log.debug("saving TCcCtFileNameItem instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtFileNameItem persistentInstance) {
        log.debug("deleting TCcCtFileNameItem instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtFileNameItem findById( java.math.BigDecimal id) {
        log.debug("getting TCcCtFileNameItem instance with id: " + id);
        try {
            TCcCtFileNameItem instance = (TCcCtFileNameItem) getSession()
                    .get("com.dao.TCcCtFileNameItem", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtFileNameItem instance) {
        log.debug("finding TCcCtFileNameItem instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtFileNameItem")
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
      log.debug("finding TCcCtFileNameItem instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtFileNameItem as model where model." 
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
		log.debug("finding all TCcCtFileNameItem instances");
		try {
			String queryString = "from TCcCtFileNameItem";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtFileNameItem merge(TCcCtFileNameItem detachedInstance) {
        log.debug("merging TCcCtFileNameItem instance");
        try {
            TCcCtFileNameItem result = (TCcCtFileNameItem) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtFileNameItem instance) {
        log.debug("attaching dirty TCcCtFileNameItem instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtFileNameItem instance) {
        log.debug("attaching clean TCcCtFileNameItem instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}