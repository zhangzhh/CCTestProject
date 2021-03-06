package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysLanguage;

/**
 	* A data access object (DAO) providing persistence and search support for TSysLanguage entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysLanguage
  * @author MyEclipse Persistence Tools 
 */
public class TSysLanguageDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysLanguageDAO.class);
	

    
    public void save(TSysLanguage transientInstance) {
        log.debug("saving TSysLanguage instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysLanguage persistentInstance) {
        log.debug("deleting TSysLanguage instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysLanguage findById( String id) {
        log.debug("getting TSysLanguage instance with id: " + id);
        try {
            TSysLanguage instance = (TSysLanguage) getSession()
                    .get("com.dao.TSysLanguage", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysLanguage instance) {
        log.debug("finding TSysLanguage instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysLanguage")
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
      log.debug("finding TSysLanguage instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysLanguage as model where model." 
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
		log.debug("finding all TSysLanguage instances");
		try {
			String queryString = "from TSysLanguage";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysLanguage merge(TSysLanguage detachedInstance) {
        log.debug("merging TSysLanguage instance");
        try {
            TSysLanguage result = (TSysLanguage) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysLanguage instance) {
        log.debug("attaching dirty TSysLanguage instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysLanguage instance) {
        log.debug("attaching clean TSysLanguage instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}