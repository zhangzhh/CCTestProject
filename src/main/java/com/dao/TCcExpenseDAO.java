package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcExpense;

/**
 	* A data access object (DAO) providing persistence and search support for TCcExpense entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcExpense
  * @author MyEclipse Persistence Tools 
 */
public class TCcExpenseDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcExpenseDAO.class);
	

    
    public void save(TCcExpense transientInstance) {
        log.debug("saving TCcExpense instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcExpense persistentInstance) {
        log.debug("deleting TCcExpense instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcExpense findById( java.lang.Long id) {
        log.debug("getting TCcExpense instance with id: " + id);
        try {
            TCcExpense instance = (TCcExpense) getSession()
                    .get("com.dao.TCcExpense", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcExpense instance) {
        log.debug("finding TCcExpense instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcExpense")
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
      log.debug("finding TCcExpense instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcExpense as model where model." 
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
		log.debug("finding all TCcExpense instances");
		try {
			String queryString = "from TCcExpense";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcExpense merge(TCcExpense detachedInstance) {
        log.debug("merging TCcExpense instance");
        try {
            TCcExpense result = (TCcExpense) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcExpense instance) {
        log.debug("attaching dirty TCcExpense instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcExpense instance) {
        log.debug("attaching clean TCcExpense instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}