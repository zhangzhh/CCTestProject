package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtBtRule;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtBtRule entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtBtRule
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtBtRuleDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtBtRuleDAO.class);
	

    
    public void save(TCcCtBtRule transientInstance) {
        log.debug("saving TCcCtBtRule instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtBtRule persistentInstance) {
        log.debug("deleting TCcCtBtRule instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtBtRule findById( java.lang.Long id) {
        log.debug("getting TCcCtBtRule instance with id: " + id);
        try {
            TCcCtBtRule instance = (TCcCtBtRule) getSession()
                    .get("com.dao.TCcCtBtRule", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtBtRule instance) {
        log.debug("finding TCcCtBtRule instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtBtRule")
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
      log.debug("finding TCcCtBtRule instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtBtRule as model where model." 
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
		log.debug("finding all TCcCtBtRule instances");
		try {
			String queryString = "from TCcCtBtRule";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtBtRule merge(TCcCtBtRule detachedInstance) {
        log.debug("merging TCcCtBtRule instance");
        try {
            TCcCtBtRule result = (TCcCtBtRule) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtBtRule instance) {
        log.debug("attaching dirty TCcCtBtRule instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtBtRule instance) {
        log.debug("attaching clean TCcCtBtRule instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}