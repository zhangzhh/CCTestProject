package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcProcDef;

/**
 	* A data access object (DAO) providing persistence and search support for TCcProcDef entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcProcDef
  * @author MyEclipse Persistence Tools 
 */
public class TCcProcDefDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcProcDefDAO.class);
	

    
    public void save(TCcProcDef transientInstance) {
        log.debug("saving TCcProcDef instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcProcDef persistentInstance) {
        log.debug("deleting TCcProcDef instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcProcDef findById( String id) {
        log.debug("getting TCcProcDef instance with id: " + id);
        try {
            TCcProcDef instance = (TCcProcDef) getSession()
                    .get("com.dao.TCcProcDef", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcProcDef instance) {
        log.debug("finding TCcProcDef instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcProcDef")
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
      log.debug("finding TCcProcDef instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcProcDef as model where model." 
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
		log.debug("finding all TCcProcDef instances");
		try {
			String queryString = "from TCcProcDef";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcProcDef merge(TCcProcDef detachedInstance) {
        log.debug("merging TCcProcDef instance");
        try {
            TCcProcDef result = (TCcProcDef) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcProcDef instance) {
        log.debug("attaching dirty TCcProcDef instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcProcDef instance) {
        log.debug("attaching clean TCcProcDef instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}