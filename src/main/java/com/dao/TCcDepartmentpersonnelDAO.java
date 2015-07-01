package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcDepartmentpersonnel;

/**
 	* A data access object (DAO) providing persistence and search support for TCcDepartmentpersonnel entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcDepartmentpersonnel
  * @author MyEclipse Persistence Tools 
 */
public class TCcDepartmentpersonnelDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcDepartmentpersonnelDAO.class);
	

    
    public void save(TCcDepartmentpersonnel transientInstance) {
        log.debug("saving TCcDepartmentpersonnel instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcDepartmentpersonnel persistentInstance) {
        log.debug("deleting TCcDepartmentpersonnel instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcDepartmentpersonnel findById( java.lang.Long id) {
        log.debug("getting TCcDepartmentpersonnel instance with id: " + id);
        try {
            TCcDepartmentpersonnel instance = (TCcDepartmentpersonnel) getSession()
                    .get("com.dao.TCcDepartmentpersonnel", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcDepartmentpersonnel instance) {
        log.debug("finding TCcDepartmentpersonnel instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcDepartmentpersonnel")
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
      log.debug("finding TCcDepartmentpersonnel instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcDepartmentpersonnel as model where model." 
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
		log.debug("finding all TCcDepartmentpersonnel instances");
		try {
			String queryString = "from TCcDepartmentpersonnel";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcDepartmentpersonnel merge(TCcDepartmentpersonnel detachedInstance) {
        log.debug("merging TCcDepartmentpersonnel instance");
        try {
            TCcDepartmentpersonnel result = (TCcDepartmentpersonnel) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcDepartmentpersonnel instance) {
        log.debug("attaching dirty TCcDepartmentpersonnel instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcDepartmentpersonnel instance) {
        log.debug("attaching clean TCcDepartmentpersonnel instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}