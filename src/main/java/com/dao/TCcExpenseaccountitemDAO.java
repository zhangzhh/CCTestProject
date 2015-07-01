package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcExpenseaccountitem;

/**
 	* A data access object (DAO) providing persistence and search support for TCcExpenseaccountitem entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcExpenseaccountitem
  * @author MyEclipse Persistence Tools 
 */
public class TCcExpenseaccountitemDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcExpenseaccountitemDAO.class);
	

    
    public void save(TCcExpenseaccountitem transientInstance) {
        log.debug("saving TCcExpenseaccountitem instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcExpenseaccountitem persistentInstance) {
        log.debug("deleting TCcExpenseaccountitem instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcExpenseaccountitem findById( java.lang.Long id) {
        log.debug("getting TCcExpenseaccountitem instance with id: " + id);
        try {
            TCcExpenseaccountitem instance = (TCcExpenseaccountitem) getSession()
                    .get("com.dao.TCcExpenseaccountitem", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcExpenseaccountitem instance) {
        log.debug("finding TCcExpenseaccountitem instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcExpenseaccountitem")
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
      log.debug("finding TCcExpenseaccountitem instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcExpenseaccountitem as model where model." 
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
		log.debug("finding all TCcExpenseaccountitem instances");
		try {
			String queryString = "from TCcExpenseaccountitem";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcExpenseaccountitem merge(TCcExpenseaccountitem detachedInstance) {
        log.debug("merging TCcExpenseaccountitem instance");
        try {
            TCcExpenseaccountitem result = (TCcExpenseaccountitem) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcExpenseaccountitem instance) {
        log.debug("attaching dirty TCcExpenseaccountitem instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcExpenseaccountitem instance) {
        log.debug("attaching clean TCcExpenseaccountitem instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}