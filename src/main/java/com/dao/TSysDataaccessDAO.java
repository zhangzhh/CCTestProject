package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysDataaccess;

/**
 	* A data access object (DAO) providing persistence and search support for TSysDataaccess entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysDataaccess
  * @author MyEclipse Persistence Tools 
 */
public class TSysDataaccessDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysDataaccessDAO.class);
	

    
    public void save(TSysDataaccess transientInstance) {
        log.debug("saving TSysDataaccess instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysDataaccess persistentInstance) {
        log.debug("deleting TSysDataaccess instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysDataaccess findById( java.lang.Long id) {
        log.debug("getting TSysDataaccess instance with id: " + id);
        try {
            TSysDataaccess instance = (TSysDataaccess) getSession()
                    .get("com.dao.TSysDataaccess", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysDataaccess instance) {
        log.debug("finding TSysDataaccess instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysDataaccess")
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
      log.debug("finding TSysDataaccess instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysDataaccess as model where model." 
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
		log.debug("finding all TSysDataaccess instances");
		try {
			String queryString = "from TSysDataaccess";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysDataaccess merge(TSysDataaccess detachedInstance) {
        log.debug("merging TSysDataaccess instance");
        try {
            TSysDataaccess result = (TSysDataaccess) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysDataaccess instance) {
        log.debug("attaching dirty TSysDataaccess instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysDataaccess instance) {
        log.debug("attaching clean TSysDataaccess instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}