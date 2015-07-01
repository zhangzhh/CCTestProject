package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcItemmapping;

/**
 	* A data access object (DAO) providing persistence and search support for TCcItemmapping entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcItemmapping
  * @author MyEclipse Persistence Tools 
 */
public class TCcItemmappingDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcItemmappingDAO.class);
	

    
    public void save(TCcItemmapping transientInstance) {
        log.debug("saving TCcItemmapping instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcItemmapping persistentInstance) {
        log.debug("deleting TCcItemmapping instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcItemmapping findById( java.lang.Long id) {
        log.debug("getting TCcItemmapping instance with id: " + id);
        try {
            TCcItemmapping instance = (TCcItemmapping) getSession()
                    .get("com.dao.TCcItemmapping", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcItemmapping instance) {
        log.debug("finding TCcItemmapping instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcItemmapping")
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
      log.debug("finding TCcItemmapping instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcItemmapping as model where model." 
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
		log.debug("finding all TCcItemmapping instances");
		try {
			String queryString = "from TCcItemmapping";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcItemmapping merge(TCcItemmapping detachedInstance) {
        log.debug("merging TCcItemmapping instance");
        try {
            TCcItemmapping result = (TCcItemmapping) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcItemmapping instance) {
        log.debug("attaching dirty TCcItemmapping instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcItemmapping instance) {
        log.debug("attaching clean TCcItemmapping instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}