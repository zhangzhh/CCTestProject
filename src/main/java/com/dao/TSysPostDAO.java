package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysPost;

/**
 	* A data access object (DAO) providing persistence and search support for TSysPost entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysPost
  * @author MyEclipse Persistence Tools 
 */
public class TSysPostDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysPostDAO.class);
	

    
    public void save(TSysPost transientInstance) {
        log.debug("saving TSysPost instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysPost persistentInstance) {
        log.debug("deleting TSysPost instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysPost findById( java.lang.Long id) {
        log.debug("getting TSysPost instance with id: " + id);
        try {
            TSysPost instance = (TSysPost) getSession()
                    .get("com.dao.TSysPost", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysPost instance) {
        log.debug("finding TSysPost instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysPost")
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
      log.debug("finding TSysPost instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysPost as model where model." 
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
		log.debug("finding all TSysPost instances");
		try {
			String queryString = "from TSysPost";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysPost merge(TSysPost detachedInstance) {
        log.debug("merging TSysPost instance");
        try {
            TSysPost result = (TSysPost) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysPost instance) {
        log.debug("attaching dirty TSysPost instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysPost instance) {
        log.debug("attaching clean TSysPost instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}