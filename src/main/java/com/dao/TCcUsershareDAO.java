package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcUsershare;

/**
 	* A data access object (DAO) providing persistence and search support for TCcUsershare entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcUsershare
  * @author MyEclipse Persistence Tools 
 */
public class TCcUsershareDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcUsershareDAO.class);
	

    
    public void save(TCcUsershare transientInstance) {
        log.debug("saving TCcUsershare instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcUsershare persistentInstance) {
        log.debug("deleting TCcUsershare instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcUsershare findById( java.lang.Long id) {
        log.debug("getting TCcUsershare instance with id: " + id);
        try {
            TCcUsershare instance = (TCcUsershare) getSession()
                    .get("com.dao.TCcUsershare", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcUsershare instance) {
        log.debug("finding TCcUsershare instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcUsershare")
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
      log.debug("finding TCcUsershare instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcUsershare as model where model." 
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
		log.debug("finding all TCcUsershare instances");
		try {
			String queryString = "from TCcUsershare";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcUsershare merge(TCcUsershare detachedInstance) {
        log.debug("merging TCcUsershare instance");
        try {
            TCcUsershare result = (TCcUsershare) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcUsershare instance) {
        log.debug("attaching dirty TCcUsershare instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcUsershare instance) {
        log.debug("attaching clean TCcUsershare instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}