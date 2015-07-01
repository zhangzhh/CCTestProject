package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBalancemodeitem;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBalancemodeitem entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBalancemodeitem
  * @author MyEclipse Persistence Tools 
 */
public class TCcBalancemodeitemDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBalancemodeitemDAO.class);
	

    
    public void save(TCcBalancemodeitem transientInstance) {
        log.debug("saving TCcBalancemodeitem instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBalancemodeitem persistentInstance) {
        log.debug("deleting TCcBalancemodeitem instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBalancemodeitem findById( java.lang.Long id) {
        log.debug("getting TCcBalancemodeitem instance with id: " + id);
        try {
            TCcBalancemodeitem instance = (TCcBalancemodeitem) getSession()
                    .get("com.dao.TCcBalancemodeitem", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBalancemodeitem instance) {
        log.debug("finding TCcBalancemodeitem instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBalancemodeitem")
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
      log.debug("finding TCcBalancemodeitem instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBalancemodeitem as model where model." 
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
		log.debug("finding all TCcBalancemodeitem instances");
		try {
			String queryString = "from TCcBalancemodeitem";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBalancemodeitem merge(TCcBalancemodeitem detachedInstance) {
        log.debug("merging TCcBalancemodeitem instance");
        try {
            TCcBalancemodeitem result = (TCcBalancemodeitem) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBalancemodeitem instance) {
        log.debug("attaching dirty TCcBalancemodeitem instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBalancemodeitem instance) {
        log.debug("attaching clean TCcBalancemodeitem instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}