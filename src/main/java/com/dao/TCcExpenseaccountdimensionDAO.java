package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcExpenseaccountdimension;

/**
 	* A data access object (DAO) providing persistence and search support for TCcExpenseaccountdimension entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcExpenseaccountdimension
  * @author MyEclipse Persistence Tools 
 */
public class TCcExpenseaccountdimensionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcExpenseaccountdimensionDAO.class);
	

    
    public void save(TCcExpenseaccountdimension transientInstance) {
        log.debug("saving TCcExpenseaccountdimension instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcExpenseaccountdimension persistentInstance) {
        log.debug("deleting TCcExpenseaccountdimension instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcExpenseaccountdimension findById( java.lang.Long id) {
        log.debug("getting TCcExpenseaccountdimension instance with id: " + id);
        try {
            TCcExpenseaccountdimension instance = (TCcExpenseaccountdimension) getSession()
                    .get("com.dao.TCcExpenseaccountdimension", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcExpenseaccountdimension instance) {
        log.debug("finding TCcExpenseaccountdimension instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcExpenseaccountdimension")
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
      log.debug("finding TCcExpenseaccountdimension instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcExpenseaccountdimension as model where model." 
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
		log.debug("finding all TCcExpenseaccountdimension instances");
		try {
			String queryString = "from TCcExpenseaccountdimension";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcExpenseaccountdimension merge(TCcExpenseaccountdimension detachedInstance) {
        log.debug("merging TCcExpenseaccountdimension instance");
        try {
            TCcExpenseaccountdimension result = (TCcExpenseaccountdimension) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcExpenseaccountdimension instance) {
        log.debug("attaching dirty TCcExpenseaccountdimension instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcExpenseaccountdimension instance) {
        log.debug("attaching clean TCcExpenseaccountdimension instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}