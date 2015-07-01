package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcManagementroledimdata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcManagementroledimdata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcManagementroledimdata
  * @author MyEclipse Persistence Tools 
 */
public class TCcManagementroledimdataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcManagementroledimdataDAO.class);
	

    
    public void save(TCcManagementroledimdata transientInstance) {
        log.debug("saving TCcManagementroledimdata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcManagementroledimdata persistentInstance) {
        log.debug("deleting TCcManagementroledimdata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcManagementroledimdata findById( String id) {
        log.debug("getting TCcManagementroledimdata instance with id: " + id);
        try {
            TCcManagementroledimdata instance = (TCcManagementroledimdata) getSession()
                    .get("com.dao.TCcManagementroledimdata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcManagementroledimdata instance) {
        log.debug("finding TCcManagementroledimdata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcManagementroledimdata")
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
      log.debug("finding TCcManagementroledimdata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcManagementroledimdata as model where model." 
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
		log.debug("finding all TCcManagementroledimdata instances");
		try {
			String queryString = "from TCcManagementroledimdata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcManagementroledimdata merge(TCcManagementroledimdata detachedInstance) {
        log.debug("merging TCcManagementroledimdata instance");
        try {
            TCcManagementroledimdata result = (TCcManagementroledimdata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcManagementroledimdata instance) {
        log.debug("attaching dirty TCcManagementroledimdata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcManagementroledimdata instance) {
        log.debug("attaching clean TCcManagementroledimdata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}