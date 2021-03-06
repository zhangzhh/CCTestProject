package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtDim;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtDim entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtDim
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtDimDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtDimDAO.class);
	

    
    public void save(TCcCtDim transientInstance) {
        log.debug("saving TCcCtDim instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtDim persistentInstance) {
        log.debug("deleting TCcCtDim instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtDim findById( java.lang.Long id) {
        log.debug("getting TCcCtDim instance with id: " + id);
        try {
            TCcCtDim instance = (TCcCtDim) getSession()
                    .get("com.dao.TCcCtDim", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtDim instance) {
        log.debug("finding TCcCtDim instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtDim")
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
      log.debug("finding TCcCtDim instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtDim as model where model." 
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
		log.debug("finding all TCcCtDim instances");
		try {
			String queryString = "from TCcCtDim";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtDim merge(TCcCtDim detachedInstance) {
        log.debug("merging TCcCtDim instance");
        try {
            TCcCtDim result = (TCcCtDim) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtDim instance) {
        log.debug("attaching dirty TCcCtDim instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtDim instance) {
        log.debug("attaching clean TCcCtDim instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}