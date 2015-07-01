package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcManagementroledetail;

/**
 	* A data access object (DAO) providing persistence and search support for TCcManagementroledetail entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcManagementroledetail
  * @author MyEclipse Persistence Tools 
 */
public class TCcManagementroledetailDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcManagementroledetailDAO.class);
	

    
    public void save(TCcManagementroledetail transientInstance) {
        log.debug("saving TCcManagementroledetail instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcManagementroledetail persistentInstance) {
        log.debug("deleting TCcManagementroledetail instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcManagementroledetail findById( java.lang.Long id) {
        log.debug("getting TCcManagementroledetail instance with id: " + id);
        try {
            TCcManagementroledetail instance = (TCcManagementroledetail) getSession()
                    .get("com.dao.TCcManagementroledetail", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcManagementroledetail instance) {
        log.debug("finding TCcManagementroledetail instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcManagementroledetail")
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
      log.debug("finding TCcManagementroledetail instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcManagementroledetail as model where model." 
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
		log.debug("finding all TCcManagementroledetail instances");
		try {
			String queryString = "from TCcManagementroledetail";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcManagementroledetail merge(TCcManagementroledetail detachedInstance) {
        log.debug("merging TCcManagementroledetail instance");
        try {
            TCcManagementroledetail result = (TCcManagementroledetail) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcManagementroledetail instance) {
        log.debug("attaching dirty TCcManagementroledetail instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcManagementroledetail instance) {
        log.debug("attaching clean TCcManagementroledetail instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}