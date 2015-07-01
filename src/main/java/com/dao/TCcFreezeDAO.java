package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcFreeze;

/**
 	* A data access object (DAO) providing persistence and search support for TCcFreeze entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcFreeze
  * @author MyEclipse Persistence Tools 
 */
public class TCcFreezeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcFreezeDAO.class);
	

    
    public void save(TCcFreeze transientInstance) {
        log.debug("saving TCcFreeze instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcFreeze persistentInstance) {
        log.debug("deleting TCcFreeze instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcFreeze findById( String id) {
        log.debug("getting TCcFreeze instance with id: " + id);
        try {
            TCcFreeze instance = (TCcFreeze) getSession()
                    .get("com.dao.TCcFreeze", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcFreeze instance) {
        log.debug("finding TCcFreeze instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcFreeze")
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
      log.debug("finding TCcFreeze instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcFreeze as model where model." 
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
		log.debug("finding all TCcFreeze instances");
		try {
			String queryString = "from TCcFreeze";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcFreeze merge(TCcFreeze detachedInstance) {
        log.debug("merging TCcFreeze instance");
        try {
            TCcFreeze result = (TCcFreeze) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcFreeze instance) {
        log.debug("attaching dirty TCcFreeze instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcFreeze instance) {
        log.debug("attaching clean TCcFreeze instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}