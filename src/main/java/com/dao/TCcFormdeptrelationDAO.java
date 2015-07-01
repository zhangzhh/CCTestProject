package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcFormdeptrelation;

/**
 	* A data access object (DAO) providing persistence and search support for TCcFormdeptrelation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcFormdeptrelation
  * @author MyEclipse Persistence Tools 
 */
public class TCcFormdeptrelationDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcFormdeptrelationDAO.class);
	

    
    public void save(TCcFormdeptrelation transientInstance) {
        log.debug("saving TCcFormdeptrelation instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcFormdeptrelation persistentInstance) {
        log.debug("deleting TCcFormdeptrelation instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcFormdeptrelation findById( String id) {
        log.debug("getting TCcFormdeptrelation instance with id: " + id);
        try {
            TCcFormdeptrelation instance = (TCcFormdeptrelation) getSession()
                    .get("com.dao.TCcFormdeptrelation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcFormdeptrelation instance) {
        log.debug("finding TCcFormdeptrelation instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcFormdeptrelation")
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
      log.debug("finding TCcFormdeptrelation instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcFormdeptrelation as model where model." 
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
		log.debug("finding all TCcFormdeptrelation instances");
		try {
			String queryString = "from TCcFormdeptrelation";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcFormdeptrelation merge(TCcFormdeptrelation detachedInstance) {
        log.debug("merging TCcFormdeptrelation instance");
        try {
            TCcFormdeptrelation result = (TCcFormdeptrelation) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcFormdeptrelation instance) {
        log.debug("attaching dirty TCcFormdeptrelation instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcFormdeptrelation instance) {
        log.debug("attaching clean TCcFormdeptrelation instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}