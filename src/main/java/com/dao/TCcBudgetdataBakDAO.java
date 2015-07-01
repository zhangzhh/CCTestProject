package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBudgetdataBak;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBudgetdataBak entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBudgetdataBak
  * @author MyEclipse Persistence Tools 
 */
public class TCcBudgetdataBakDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBudgetdataBakDAO.class);
	

    
    public void save(TCcBudgetdataBak transientInstance) {
        log.debug("saving TCcBudgetdataBak instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBudgetdataBak persistentInstance) {
        log.debug("deleting TCcBudgetdataBak instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBudgetdataBak findById( String id) {
        log.debug("getting TCcBudgetdataBak instance with id: " + id);
        try {
            TCcBudgetdataBak instance = (TCcBudgetdataBak) getSession()
                    .get("com.dao.TCcBudgetdataBak", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBudgetdataBak instance) {
        log.debug("finding TCcBudgetdataBak instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBudgetdataBak")
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
      log.debug("finding TCcBudgetdataBak instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBudgetdataBak as model where model." 
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
		log.debug("finding all TCcBudgetdataBak instances");
		try {
			String queryString = "from TCcBudgetdataBak";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBudgetdataBak merge(TCcBudgetdataBak detachedInstance) {
        log.debug("merging TCcBudgetdataBak instance");
        try {
            TCcBudgetdataBak result = (TCcBudgetdataBak) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBudgetdataBak instance) {
        log.debug("attaching dirty TCcBudgetdataBak instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBudgetdataBak instance) {
        log.debug("attaching clean TCcBudgetdataBak instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}