package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcDimOrganization;

/**
 	* A data access object (DAO) providing persistence and search support for TCcDimOrganization entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcDimOrganization
  * @author MyEclipse Persistence Tools 
 */
public class TCcDimOrganizationDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcDimOrganizationDAO.class);
	

    
    public void save(TCcDimOrganization transientInstance) {
        log.debug("saving TCcDimOrganization instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcDimOrganization persistentInstance) {
        log.debug("deleting TCcDimOrganization instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcDimOrganization findById( java.lang.Long id) {
        log.debug("getting TCcDimOrganization instance with id: " + id);
        try {
            TCcDimOrganization instance = (TCcDimOrganization) getSession()
                    .get("com.dao.TCcDimOrganization", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcDimOrganization instance) {
        log.debug("finding TCcDimOrganization instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcDimOrganization")
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
      log.debug("finding TCcDimOrganization instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcDimOrganization as model where model." 
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
		log.debug("finding all TCcDimOrganization instances");
		try {
			String queryString = "from TCcDimOrganization";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcDimOrganization merge(TCcDimOrganization detachedInstance) {
        log.debug("merging TCcDimOrganization instance");
        try {
            TCcDimOrganization result = (TCcDimOrganization) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcDimOrganization instance) {
        log.debug("attaching dirty TCcDimOrganization instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcDimOrganization instance) {
        log.debug("attaching clean TCcDimOrganization instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}