package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysDataaccesstype;

/**
 	* A data access object (DAO) providing persistence and search support for TSysDataaccesstype entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysDataaccesstype
  * @author MyEclipse Persistence Tools 
 */
public class TSysDataaccesstypeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysDataaccesstypeDAO.class);
	

    
    public void save(TSysDataaccesstype transientInstance) {
        log.debug("saving TSysDataaccesstype instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysDataaccesstype persistentInstance) {
        log.debug("deleting TSysDataaccesstype instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysDataaccesstype findById( java.lang.Long id) {
        log.debug("getting TSysDataaccesstype instance with id: " + id);
        try {
            TSysDataaccesstype instance = (TSysDataaccesstype) getSession()
                    .get("com.dao.TSysDataaccesstype", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysDataaccesstype instance) {
        log.debug("finding TSysDataaccesstype instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysDataaccesstype")
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
      log.debug("finding TSysDataaccesstype instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysDataaccesstype as model where model." 
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
		log.debug("finding all TSysDataaccesstype instances");
		try {
			String queryString = "from TSysDataaccesstype";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysDataaccesstype merge(TSysDataaccesstype detachedInstance) {
        log.debug("merging TSysDataaccesstype instance");
        try {
            TSysDataaccesstype result = (TSysDataaccesstype) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysDataaccesstype instance) {
        log.debug("attaching dirty TSysDataaccesstype instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysDataaccesstype instance) {
        log.debug("attaching clean TSysDataaccesstype instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}