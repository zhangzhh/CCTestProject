package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcAttrdimension;

/**
 	* A data access object (DAO) providing persistence and search support for TCcAttrdimension entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcAttrdimension
  * @author MyEclipse Persistence Tools 
 */
public class TCcAttrdimensionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcAttrdimensionDAO.class);
	

    
    public void save(TCcAttrdimension transientInstance) {
        log.debug("saving TCcAttrdimension instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcAttrdimension persistentInstance) {
        log.debug("deleting TCcAttrdimension instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcAttrdimension findById( java.lang.Long id) {
        log.debug("getting TCcAttrdimension instance with id: " + id);
        try {
            TCcAttrdimension instance = (TCcAttrdimension) getSession()
                    .get("com.dao.TCcAttrdimension", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcAttrdimension instance) {
        log.debug("finding TCcAttrdimension instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcAttrdimension")
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
      log.debug("finding TCcAttrdimension instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcAttrdimension as model where model." 
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
		log.debug("finding all TCcAttrdimension instances");
		try {
			String queryString = "from TCcAttrdimension";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcAttrdimension merge(TCcAttrdimension detachedInstance) {
        log.debug("merging TCcAttrdimension instance");
        try {
            TCcAttrdimension result = (TCcAttrdimension) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcAttrdimension instance) {
        log.debug("attaching dirty TCcAttrdimension instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcAttrdimension instance) {
        log.debug("attaching clean TCcAttrdimension instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}