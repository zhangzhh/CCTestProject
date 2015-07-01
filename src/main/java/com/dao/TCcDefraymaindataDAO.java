package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcDefraymaindata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcDefraymaindata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcDefraymaindata
  * @author MyEclipse Persistence Tools 
 */
public class TCcDefraymaindataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcDefraymaindataDAO.class);
	

    
    public void save(TCcDefraymaindata transientInstance) {
        log.debug("saving TCcDefraymaindata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcDefraymaindata persistentInstance) {
        log.debug("deleting TCcDefraymaindata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcDefraymaindata findById( java.lang.Long id) {
        log.debug("getting TCcDefraymaindata instance with id: " + id);
        try {
            TCcDefraymaindata instance = (TCcDefraymaindata) getSession()
                    .get("com.dao.TCcDefraymaindata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcDefraymaindata instance) {
        log.debug("finding TCcDefraymaindata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcDefraymaindata")
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
      log.debug("finding TCcDefraymaindata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcDefraymaindata as model where model." 
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
		log.debug("finding all TCcDefraymaindata instances");
		try {
			String queryString = "from TCcDefraymaindata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcDefraymaindata merge(TCcDefraymaindata detachedInstance) {
        log.debug("merging TCcDefraymaindata instance");
        try {
            TCcDefraymaindata result = (TCcDefraymaindata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcDefraymaindata instance) {
        log.debug("attaching dirty TCcDefraymaindata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcDefraymaindata instance) {
        log.debug("attaching clean TCcDefraymaindata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}