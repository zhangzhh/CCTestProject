package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.CcForm;

/**
 	* A data access object (DAO) providing persistence and search support for CcForm entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.CcForm
  * @author MyEclipse Persistence Tools 
 */
public class CcFormDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(CcFormDAO.class);
	

    
    public void save(CcForm transientInstance) {
        log.debug("saving CcForm instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(CcForm persistentInstance) {
        log.debug("deleting CcForm instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public CcForm findById( String id) {
        log.debug("getting CcForm instance with id: " + id);
        try {
            CcForm instance = (CcForm) getSession()
                    .get("com.dao.CcForm", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(CcForm instance) {
        log.debug("finding CcForm instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.CcForm")
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
      log.debug("finding CcForm instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from CcForm as model where model." 
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
		log.debug("finding all CcForm instances");
		try {
			String queryString = "from CcForm";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public CcForm merge(CcForm detachedInstance) {
        log.debug("merging CcForm instance");
        try {
            CcForm result = (CcForm) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(CcForm instance) {
        log.debug("attaching dirty CcForm instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(CcForm instance) {
        log.debug("attaching clean CcForm instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}