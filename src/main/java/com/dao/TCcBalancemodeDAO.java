package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBalancemode;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBalancemode entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBalancemode
  * @author MyEclipse Persistence Tools 
 */
public class TCcBalancemodeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBalancemodeDAO.class);
	

    
    public void save(TCcBalancemode transientInstance) {
        log.debug("saving TCcBalancemode instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBalancemode persistentInstance) {
        log.debug("deleting TCcBalancemode instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBalancemode findById( java.lang.Long id) {
        log.debug("getting TCcBalancemode instance with id: " + id);
        try {
            TCcBalancemode instance = (TCcBalancemode) getSession()
                    .get("com.dao.TCcBalancemode", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBalancemode instance) {
        log.debug("finding TCcBalancemode instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBalancemode")
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
      log.debug("finding TCcBalancemode instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBalancemode as model where model." 
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
		log.debug("finding all TCcBalancemode instances");
		try {
			String queryString = "from TCcBalancemode";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBalancemode merge(TCcBalancemode detachedInstance) {
        log.debug("merging TCcBalancemode instance");
        try {
            TCcBalancemode result = (TCcBalancemode) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBalancemode instance) {
        log.debug("attaching dirty TCcBalancemode instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBalancemode instance) {
        log.debug("attaching clean TCcBalancemode instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}