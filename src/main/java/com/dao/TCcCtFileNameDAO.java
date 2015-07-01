package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtFileName;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtFileName entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtFileName
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtFileNameDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtFileNameDAO.class);
	

    
    public void save(TCcCtFileName transientInstance) {
        log.debug("saving TCcCtFileName instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtFileName persistentInstance) {
        log.debug("deleting TCcCtFileName instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtFileName findById( java.lang.Long id) {
        log.debug("getting TCcCtFileName instance with id: " + id);
        try {
            TCcCtFileName instance = (TCcCtFileName) getSession()
                    .get("com.dao.TCcCtFileName", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtFileName instance) {
        log.debug("finding TCcCtFileName instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtFileName")
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
      log.debug("finding TCcCtFileName instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtFileName as model where model." 
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
		log.debug("finding all TCcCtFileName instances");
		try {
			String queryString = "from TCcCtFileName";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtFileName merge(TCcCtFileName detachedInstance) {
        log.debug("merging TCcCtFileName instance");
        try {
            TCcCtFileName result = (TCcCtFileName) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtFileName instance) {
        log.debug("attaching dirty TCcCtFileName instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtFileName instance) {
        log.debug("attaching clean TCcCtFileName instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}