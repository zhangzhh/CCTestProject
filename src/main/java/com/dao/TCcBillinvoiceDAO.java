package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillinvoice;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillinvoice entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillinvoice
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillinvoiceDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillinvoiceDAO.class);
	

    
    public void save(TCcBillinvoice transientInstance) {
        log.debug("saving TCcBillinvoice instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillinvoice persistentInstance) {
        log.debug("deleting TCcBillinvoice instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillinvoice findById( java.lang.Long id) {
        log.debug("getting TCcBillinvoice instance with id: " + id);
        try {
            TCcBillinvoice instance = (TCcBillinvoice) getSession()
                    .get("com.dao.TCcBillinvoice", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillinvoice instance) {
        log.debug("finding TCcBillinvoice instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillinvoice")
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
      log.debug("finding TCcBillinvoice instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillinvoice as model where model." 
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
		log.debug("finding all TCcBillinvoice instances");
		try {
			String queryString = "from TCcBillinvoice";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillinvoice merge(TCcBillinvoice detachedInstance) {
        log.debug("merging TCcBillinvoice instance");
        try {
            TCcBillinvoice result = (TCcBillinvoice) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillinvoice instance) {
        log.debug("attaching dirty TCcBillinvoice instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillinvoice instance) {
        log.debug("attaching clean TCcBillinvoice instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}