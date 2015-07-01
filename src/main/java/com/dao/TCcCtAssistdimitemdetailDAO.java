package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtAssistdimitemdetail;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtAssistdimitemdetail entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtAssistdimitemdetail
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtAssistdimitemdetailDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtAssistdimitemdetailDAO.class);
	

    
    public void save(TCcCtAssistdimitemdetail transientInstance) {
        log.debug("saving TCcCtAssistdimitemdetail instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtAssistdimitemdetail persistentInstance) {
        log.debug("deleting TCcCtAssistdimitemdetail instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtAssistdimitemdetail findById( String id) {
        log.debug("getting TCcCtAssistdimitemdetail instance with id: " + id);
        try {
            TCcCtAssistdimitemdetail instance = (TCcCtAssistdimitemdetail) getSession()
                    .get("com.dao.TCcCtAssistdimitemdetail", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtAssistdimitemdetail instance) {
        log.debug("finding TCcCtAssistdimitemdetail instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtAssistdimitemdetail")
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
      log.debug("finding TCcCtAssistdimitemdetail instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtAssistdimitemdetail as model where model." 
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
		log.debug("finding all TCcCtAssistdimitemdetail instances");
		try {
			String queryString = "from TCcCtAssistdimitemdetail";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtAssistdimitemdetail merge(TCcCtAssistdimitemdetail detachedInstance) {
        log.debug("merging TCcCtAssistdimitemdetail instance");
        try {
            TCcCtAssistdimitemdetail result = (TCcCtAssistdimitemdetail) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtAssistdimitemdetail instance) {
        log.debug("attaching dirty TCcCtAssistdimitemdetail instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtAssistdimitemdetail instance) {
        log.debug("attaching clean TCcCtAssistdimitemdetail instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}