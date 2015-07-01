package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtSpecialType;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtSpecialType entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtSpecialType
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtSpecialTypeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtSpecialTypeDAO.class);
	

    
    public void save(TCcCtSpecialType transientInstance) {
        log.debug("saving TCcCtSpecialType instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtSpecialType persistentInstance) {
        log.debug("deleting TCcCtSpecialType instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtSpecialType findById( java.lang.Long id) {
        log.debug("getting TCcCtSpecialType instance with id: " + id);
        try {
            TCcCtSpecialType instance = (TCcCtSpecialType) getSession()
                    .get("com.dao.TCcCtSpecialType", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtSpecialType instance) {
        log.debug("finding TCcCtSpecialType instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtSpecialType")
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
      log.debug("finding TCcCtSpecialType instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtSpecialType as model where model." 
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
		log.debug("finding all TCcCtSpecialType instances");
		try {
			String queryString = "from TCcCtSpecialType";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtSpecialType merge(TCcCtSpecialType detachedInstance) {
        log.debug("merging TCcCtSpecialType instance");
        try {
            TCcCtSpecialType result = (TCcCtSpecialType) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtSpecialType instance) {
        log.debug("attaching dirty TCcCtSpecialType instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtSpecialType instance) {
        log.debug("attaching clean TCcCtSpecialType instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}