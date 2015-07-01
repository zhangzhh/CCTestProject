package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcDepartmentpost;

/**
 	* A data access object (DAO) providing persistence and search support for TCcDepartmentpost entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcDepartmentpost
  * @author MyEclipse Persistence Tools 
 */
public class TCcDepartmentpostDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcDepartmentpostDAO.class);
	

    
    public void save(TCcDepartmentpost transientInstance) {
        log.debug("saving TCcDepartmentpost instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcDepartmentpost persistentInstance) {
        log.debug("deleting TCcDepartmentpost instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcDepartmentpost findById( java.lang.Long id) {
        log.debug("getting TCcDepartmentpost instance with id: " + id);
        try {
            TCcDepartmentpost instance = (TCcDepartmentpost) getSession()
                    .get("com.dao.TCcDepartmentpost", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcDepartmentpost instance) {
        log.debug("finding TCcDepartmentpost instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcDepartmentpost")
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
      log.debug("finding TCcDepartmentpost instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcDepartmentpost as model where model." 
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
		log.debug("finding all TCcDepartmentpost instances");
		try {
			String queryString = "from TCcDepartmentpost";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcDepartmentpost merge(TCcDepartmentpost detachedInstance) {
        log.debug("merging TCcDepartmentpost instance");
        try {
            TCcDepartmentpost result = (TCcDepartmentpost) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcDepartmentpost instance) {
        log.debug("attaching dirty TCcDepartmentpost instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcDepartmentpost instance) {
        log.debug("attaching clean TCcDepartmentpost instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}