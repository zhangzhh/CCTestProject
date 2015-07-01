package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillassociateditem;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillassociateditem entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillassociateditem
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillassociateditemDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillassociateditemDAO.class);
	

    
    public void save(TCcBillassociateditem transientInstance) {
        log.debug("saving TCcBillassociateditem instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillassociateditem persistentInstance) {
        log.debug("deleting TCcBillassociateditem instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillassociateditem findById( java.lang.Long id) {
        log.debug("getting TCcBillassociateditem instance with id: " + id);
        try {
            TCcBillassociateditem instance = (TCcBillassociateditem) getSession()
                    .get("com.dao.TCcBillassociateditem", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillassociateditem instance) {
        log.debug("finding TCcBillassociateditem instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillassociateditem")
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
      log.debug("finding TCcBillassociateditem instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillassociateditem as model where model." 
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
		log.debug("finding all TCcBillassociateditem instances");
		try {
			String queryString = "from TCcBillassociateditem";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillassociateditem merge(TCcBillassociateditem detachedInstance) {
        log.debug("merging TCcBillassociateditem instance");
        try {
            TCcBillassociateditem result = (TCcBillassociateditem) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillassociateditem instance) {
        log.debug("attaching dirty TCcBillassociateditem instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillassociateditem instance) {
        log.debug("attaching clean TCcBillassociateditem instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}