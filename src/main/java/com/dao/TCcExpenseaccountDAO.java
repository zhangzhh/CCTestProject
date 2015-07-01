package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcExpenseaccount;

/**
 	* A data access object (DAO) providing persistence and search support for TCcExpenseaccount entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcExpenseaccount
  * @author MyEclipse Persistence Tools 
 */
public class TCcExpenseaccountDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcExpenseaccountDAO.class);
	

    
    public void save(TCcExpenseaccount transientInstance) {
        log.debug("saving TCcExpenseaccount instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcExpenseaccount persistentInstance) {
        log.debug("deleting TCcExpenseaccount instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcExpenseaccount findById( java.lang.Long id) {
        log.debug("getting TCcExpenseaccount instance with id: " + id);
        try {
            TCcExpenseaccount instance = (TCcExpenseaccount) getSession()
                    .get("com.dao.TCcExpenseaccount", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcExpenseaccount instance) {
        log.debug("finding TCcExpenseaccount instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcExpenseaccount")
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
      log.debug("finding TCcExpenseaccount instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcExpenseaccount as model where model." 
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
		log.debug("finding all TCcExpenseaccount instances");
		try {
			String queryString = "from TCcExpenseaccount";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcExpenseaccount merge(TCcExpenseaccount detachedInstance) {
        log.debug("merging TCcExpenseaccount instance");
        try {
            TCcExpenseaccount result = (TCcExpenseaccount) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcExpenseaccount instance) {
        log.debug("attaching dirty TCcExpenseaccount instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcExpenseaccount instance) {
        log.debug("attaching clean TCcExpenseaccount instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}