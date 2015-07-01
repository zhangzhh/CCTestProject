package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcFormdimension;

/**
 	* A data access object (DAO) providing persistence and search support for TCcFormdimension entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcFormdimension
  * @author MyEclipse Persistence Tools 
 */
public class TCcFormdimensionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcFormdimensionDAO.class);
	

    
    public void save(TCcFormdimension transientInstance) {
        log.debug("saving TCcFormdimension instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcFormdimension persistentInstance) {
        log.debug("deleting TCcFormdimension instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcFormdimension findById( java.lang.Long id) {
        log.debug("getting TCcFormdimension instance with id: " + id);
        try {
            TCcFormdimension instance = (TCcFormdimension) getSession()
                    .get("com.dao.TCcFormdimension", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcFormdimension instance) {
        log.debug("finding TCcFormdimension instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcFormdimension")
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
      log.debug("finding TCcFormdimension instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcFormdimension as model where model." 
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
		log.debug("finding all TCcFormdimension instances");
		try {
			String queryString = "from TCcFormdimension";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcFormdimension merge(TCcFormdimension detachedInstance) {
        log.debug("merging TCcFormdimension instance");
        try {
            TCcFormdimension result = (TCcFormdimension) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcFormdimension instance) {
        log.debug("attaching dirty TCcFormdimension instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcFormdimension instance) {
        log.debug("attaching clean TCcFormdimension instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}