package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSelectDef;

/**
 	* A data access object (DAO) providing persistence and search support for TSelectDef entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSelectDef
  * @author MyEclipse Persistence Tools 
 */
public class TSelectDefDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSelectDefDAO.class);
	

    
    public void save(TSelectDef transientInstance) {
        log.debug("saving TSelectDef instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSelectDef persistentInstance) {
        log.debug("deleting TSelectDef instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSelectDef findById( java.lang.Long id) {
        log.debug("getting TSelectDef instance with id: " + id);
        try {
            TSelectDef instance = (TSelectDef) getSession()
                    .get("com.dao.TSelectDef", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSelectDef instance) {
        log.debug("finding TSelectDef instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSelectDef")
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
      log.debug("finding TSelectDef instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSelectDef as model where model." 
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
		log.debug("finding all TSelectDef instances");
		try {
			String queryString = "from TSelectDef";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSelectDef merge(TSelectDef detachedInstance) {
        log.debug("merging TSelectDef instance");
        try {
            TSelectDef result = (TSelectDef) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSelectDef instance) {
        log.debug("attaching dirty TSelectDef instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSelectDef instance) {
        log.debug("attaching clean TSelectDef instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}