package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillforsign;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillforsign entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillforsign
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillforsignDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillforsignDAO.class);
	

    
    public void save(TCcBillforsign transientInstance) {
        log.debug("saving TCcBillforsign instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillforsign persistentInstance) {
        log.debug("deleting TCcBillforsign instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillforsign findById( java.lang.Long id) {
        log.debug("getting TCcBillforsign instance with id: " + id);
        try {
            TCcBillforsign instance = (TCcBillforsign) getSession()
                    .get("com.dao.TCcBillforsign", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillforsign instance) {
        log.debug("finding TCcBillforsign instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillforsign")
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
      log.debug("finding TCcBillforsign instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillforsign as model where model." 
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
		log.debug("finding all TCcBillforsign instances");
		try {
			String queryString = "from TCcBillforsign";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillforsign merge(TCcBillforsign detachedInstance) {
        log.debug("merging TCcBillforsign instance");
        try {
            TCcBillforsign result = (TCcBillforsign) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillforsign instance) {
        log.debug("attaching dirty TCcBillforsign instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillforsign instance) {
        log.debug("attaching clean TCcBillforsign instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}