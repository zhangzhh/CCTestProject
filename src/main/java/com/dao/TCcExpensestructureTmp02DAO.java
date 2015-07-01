package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcExpensestructureTmp02;

/**
 	* A data access object (DAO) providing persistence and search support for TCcExpensestructureTmp02 entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcExpensestructureTmp02
  * @author MyEclipse Persistence Tools 
 */
public class TCcExpensestructureTmp02DAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcExpensestructureTmp02DAO.class);
	

    
    public void save(TCcExpensestructureTmp02 transientInstance) {
        log.debug("saving TCcExpensestructureTmp02 instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcExpensestructureTmp02 persistentInstance) {
        log.debug("deleting TCcExpensestructureTmp02 instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcExpensestructureTmp02 findById( String id) {
        log.debug("getting TCcExpensestructureTmp02 instance with id: " + id);
        try {
            TCcExpensestructureTmp02 instance = (TCcExpensestructureTmp02) getSession()
                    .get("com.dao.TCcExpensestructureTmp02", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcExpensestructureTmp02 instance) {
        log.debug("finding TCcExpensestructureTmp02 instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcExpensestructureTmp02")
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
      log.debug("finding TCcExpensestructureTmp02 instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcExpensestructureTmp02 as model where model." 
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
		log.debug("finding all TCcExpensestructureTmp02 instances");
		try {
			String queryString = "from TCcExpensestructureTmp02";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcExpensestructureTmp02 merge(TCcExpensestructureTmp02 detachedInstance) {
        log.debug("merging TCcExpensestructureTmp02 instance");
        try {
            TCcExpensestructureTmp02 result = (TCcExpensestructureTmp02) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcExpensestructureTmp02 instance) {
        log.debug("attaching dirty TCcExpensestructureTmp02 instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcExpensestructureTmp02 instance) {
        log.debug("attaching clean TCcExpensestructureTmp02 instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}