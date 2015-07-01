package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcManagementrole;

/**
 	* A data access object (DAO) providing persistence and search support for TCcManagementrole entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcManagementrole
  * @author MyEclipse Persistence Tools 
 */
public class TCcManagementroleDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcManagementroleDAO.class);
	

    
    public void save(TCcManagementrole transientInstance) {
        log.debug("saving TCcManagementrole instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcManagementrole persistentInstance) {
        log.debug("deleting TCcManagementrole instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcManagementrole findById( java.lang.Long id) {
        log.debug("getting TCcManagementrole instance with id: " + id);
        try {
            TCcManagementrole instance = (TCcManagementrole) getSession()
                    .get("com.dao.TCcManagementrole", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcManagementrole instance) {
        log.debug("finding TCcManagementrole instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcManagementrole")
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
      log.debug("finding TCcManagementrole instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcManagementrole as model where model." 
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
		log.debug("finding all TCcManagementrole instances");
		try {
			String queryString = "from TCcManagementrole";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcManagementrole merge(TCcManagementrole detachedInstance) {
        log.debug("merging TCcManagementrole instance");
        try {
            TCcManagementrole result = (TCcManagementrole) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcManagementrole instance) {
        log.debug("attaching dirty TCcManagementrole instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcManagementrole instance) {
        log.debug("attaching clean TCcManagementrole instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}