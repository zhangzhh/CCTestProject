package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillprocessApprovecommen;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillprocessApprovecommen entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillprocessApprovecommen
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillprocessApprovecommenDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillprocessApprovecommenDAO.class);
	

    
    public void save(TCcBillprocessApprovecommen transientInstance) {
        log.debug("saving TCcBillprocessApprovecommen instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillprocessApprovecommen persistentInstance) {
        log.debug("deleting TCcBillprocessApprovecommen instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillprocessApprovecommen findById( java.lang.Long id) {
        log.debug("getting TCcBillprocessApprovecommen instance with id: " + id);
        try {
            TCcBillprocessApprovecommen instance = (TCcBillprocessApprovecommen) getSession()
                    .get("com.dao.TCcBillprocessApprovecommen", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillprocessApprovecommen instance) {
        log.debug("finding TCcBillprocessApprovecommen instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillprocessApprovecommen")
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
      log.debug("finding TCcBillprocessApprovecommen instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillprocessApprovecommen as model where model." 
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
		log.debug("finding all TCcBillprocessApprovecommen instances");
		try {
			String queryString = "from TCcBillprocessApprovecommen";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillprocessApprovecommen merge(TCcBillprocessApprovecommen detachedInstance) {
        log.debug("merging TCcBillprocessApprovecommen instance");
        try {
            TCcBillprocessApprovecommen result = (TCcBillprocessApprovecommen) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillprocessApprovecommen instance) {
        log.debug("attaching dirty TCcBillprocessApprovecommen instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillprocessApprovecommen instance) {
        log.debug("attaching clean TCcBillprocessApprovecommen instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}