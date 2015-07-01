package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysObjectlanguage;

/**
 	* A data access object (DAO) providing persistence and search support for TSysObjectlanguage entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysObjectlanguage
  * @author MyEclipse Persistence Tools 
 */
public class TSysObjectlanguageDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysObjectlanguageDAO.class);
	

    
    public void save(TSysObjectlanguage transientInstance) {
        log.debug("saving TSysObjectlanguage instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysObjectlanguage persistentInstance) {
        log.debug("deleting TSysObjectlanguage instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysObjectlanguage findById( String id) {
        log.debug("getting TSysObjectlanguage instance with id: " + id);
        try {
            TSysObjectlanguage instance = (TSysObjectlanguage) getSession()
                    .get("com.dao.TSysObjectlanguage", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysObjectlanguage instance) {
        log.debug("finding TSysObjectlanguage instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysObjectlanguage")
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
      log.debug("finding TSysObjectlanguage instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysObjectlanguage as model where model." 
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
		log.debug("finding all TSysObjectlanguage instances");
		try {
			String queryString = "from TSysObjectlanguage";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysObjectlanguage merge(TSysObjectlanguage detachedInstance) {
        log.debug("merging TSysObjectlanguage instance");
        try {
            TSysObjectlanguage result = (TSysObjectlanguage) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysObjectlanguage instance) {
        log.debug("attaching dirty TSysObjectlanguage instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysObjectlanguage instance) {
        log.debug("attaching clean TSysObjectlanguage instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}