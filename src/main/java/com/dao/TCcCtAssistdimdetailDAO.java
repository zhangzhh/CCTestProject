package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtAssistdimdetail;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtAssistdimdetail entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtAssistdimdetail
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtAssistdimdetailDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtAssistdimdetailDAO.class);
	

    
    public void save(TCcCtAssistdimdetail transientInstance) {
        log.debug("saving TCcCtAssistdimdetail instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtAssistdimdetail persistentInstance) {
        log.debug("deleting TCcCtAssistdimdetail instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtAssistdimdetail findById( String id) {
        log.debug("getting TCcCtAssistdimdetail instance with id: " + id);
        try {
            TCcCtAssistdimdetail instance = (TCcCtAssistdimdetail) getSession()
                    .get("com.dao.TCcCtAssistdimdetail", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtAssistdimdetail instance) {
        log.debug("finding TCcCtAssistdimdetail instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtAssistdimdetail")
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
      log.debug("finding TCcCtAssistdimdetail instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtAssistdimdetail as model where model." 
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
		log.debug("finding all TCcCtAssistdimdetail instances");
		try {
			String queryString = "from TCcCtAssistdimdetail";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtAssistdimdetail merge(TCcCtAssistdimdetail detachedInstance) {
        log.debug("merging TCcCtAssistdimdetail instance");
        try {
            TCcCtAssistdimdetail result = (TCcCtAssistdimdetail) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtAssistdimdetail instance) {
        log.debug("attaching dirty TCcCtAssistdimdetail instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtAssistdimdetail instance) {
        log.debug("attaching clean TCcCtAssistdimdetail instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}