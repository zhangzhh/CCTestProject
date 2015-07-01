package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcManagementroledim;

/**
 	* A data access object (DAO) providing persistence and search support for TCcManagementroledim entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcManagementroledim
  * @author MyEclipse Persistence Tools 
 */
public class TCcManagementroledimDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcManagementroledimDAO.class);
	

    
    public void save(TCcManagementroledim transientInstance) {
        log.debug("saving TCcManagementroledim instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcManagementroledim persistentInstance) {
        log.debug("deleting TCcManagementroledim instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcManagementroledim findById( java.lang.Long id) {
        log.debug("getting TCcManagementroledim instance with id: " + id);
        try {
            TCcManagementroledim instance = (TCcManagementroledim) getSession()
                    .get("com.dao.TCcManagementroledim", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcManagementroledim instance) {
        log.debug("finding TCcManagementroledim instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcManagementroledim")
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
      log.debug("finding TCcManagementroledim instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcManagementroledim as model where model." 
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
		log.debug("finding all TCcManagementroledim instances");
		try {
			String queryString = "from TCcManagementroledim";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcManagementroledim merge(TCcManagementroledim detachedInstance) {
        log.debug("merging TCcManagementroledim instance");
        try {
            TCcManagementroledim result = (TCcManagementroledim) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcManagementroledim instance) {
        log.debug("attaching dirty TCcManagementroledim instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcManagementroledim instance) {
        log.debug("attaching clean TCcManagementroledim instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}