package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcTotalcontroltype;

/**
 	* A data access object (DAO) providing persistence and search support for TCcTotalcontroltype entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcTotalcontroltype
  * @author MyEclipse Persistence Tools 
 */
public class TCcTotalcontroltypeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcTotalcontroltypeDAO.class);
	

    
    public void save(TCcTotalcontroltype transientInstance) {
        log.debug("saving TCcTotalcontroltype instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcTotalcontroltype persistentInstance) {
        log.debug("deleting TCcTotalcontroltype instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcTotalcontroltype findById( String id) {
        log.debug("getting TCcTotalcontroltype instance with id: " + id);
        try {
            TCcTotalcontroltype instance = (TCcTotalcontroltype) getSession()
                    .get("com.dao.TCcTotalcontroltype", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcTotalcontroltype instance) {
        log.debug("finding TCcTotalcontroltype instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcTotalcontroltype")
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
      log.debug("finding TCcTotalcontroltype instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcTotalcontroltype as model where model." 
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
		log.debug("finding all TCcTotalcontroltype instances");
		try {
			String queryString = "from TCcTotalcontroltype";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcTotalcontroltype merge(TCcTotalcontroltype detachedInstance) {
        log.debug("merging TCcTotalcontroltype instance");
        try {
            TCcTotalcontroltype result = (TCcTotalcontroltype) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcTotalcontroltype instance) {
        log.debug("attaching dirty TCcTotalcontroltype instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcTotalcontroltype instance) {
        log.debug("attaching clean TCcTotalcontroltype instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}