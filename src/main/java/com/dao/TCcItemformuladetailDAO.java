package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcItemformuladetail;

/**
 	* A data access object (DAO) providing persistence and search support for TCcItemformuladetail entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcItemformuladetail
  * @author MyEclipse Persistence Tools 
 */
public class TCcItemformuladetailDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcItemformuladetailDAO.class);
	

    
    public void save(TCcItemformuladetail transientInstance) {
        log.debug("saving TCcItemformuladetail instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcItemformuladetail persistentInstance) {
        log.debug("deleting TCcItemformuladetail instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcItemformuladetail findById( java.lang.Long id) {
        log.debug("getting TCcItemformuladetail instance with id: " + id);
        try {
            TCcItemformuladetail instance = (TCcItemformuladetail) getSession()
                    .get("com.dao.TCcItemformuladetail", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcItemformuladetail instance) {
        log.debug("finding TCcItemformuladetail instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcItemformuladetail")
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
      log.debug("finding TCcItemformuladetail instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcItemformuladetail as model where model." 
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
		log.debug("finding all TCcItemformuladetail instances");
		try {
			String queryString = "from TCcItemformuladetail";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcItemformuladetail merge(TCcItemformuladetail detachedInstance) {
        log.debug("merging TCcItemformuladetail instance");
        try {
            TCcItemformuladetail result = (TCcItemformuladetail) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcItemformuladetail instance) {
        log.debug("attaching dirty TCcItemformuladetail instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcItemformuladetail instance) {
        log.debug("attaching clean TCcItemformuladetail instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}