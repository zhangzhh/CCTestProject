package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtBcItem;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtBcItem entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtBcItem
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtBcItemDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtBcItemDAO.class);
	

    
    public void save(TCcCtBcItem transientInstance) {
        log.debug("saving TCcCtBcItem instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtBcItem persistentInstance) {
        log.debug("deleting TCcCtBcItem instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtBcItem findById( java.lang.Long id) {
        log.debug("getting TCcCtBcItem instance with id: " + id);
        try {
            TCcCtBcItem instance = (TCcCtBcItem) getSession()
                    .get("com.dao.TCcCtBcItem", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtBcItem instance) {
        log.debug("finding TCcCtBcItem instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtBcItem")
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
      log.debug("finding TCcCtBcItem instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtBcItem as model where model." 
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
		log.debug("finding all TCcCtBcItem instances");
		try {
			String queryString = "from TCcCtBcItem";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtBcItem merge(TCcCtBcItem detachedInstance) {
        log.debug("merging TCcCtBcItem instance");
        try {
            TCcCtBcItem result = (TCcCtBcItem) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtBcItem instance) {
        log.debug("attaching dirty TCcCtBcItem instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtBcItem instance) {
        log.debug("attaching clean TCcCtBcItem instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}