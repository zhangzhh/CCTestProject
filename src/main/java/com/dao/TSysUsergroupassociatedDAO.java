package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysUsergroupassociated;

/**
 	* A data access object (DAO) providing persistence and search support for TSysUsergroupassociated entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysUsergroupassociated
  * @author MyEclipse Persistence Tools 
 */
public class TSysUsergroupassociatedDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysUsergroupassociatedDAO.class);
	

    
    public void save(TSysUsergroupassociated transientInstance) {
        log.debug("saving TSysUsergroupassociated instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysUsergroupassociated persistentInstance) {
        log.debug("deleting TSysUsergroupassociated instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysUsergroupassociated findById( String id) {
        log.debug("getting TSysUsergroupassociated instance with id: " + id);
        try {
            TSysUsergroupassociated instance = (TSysUsergroupassociated) getSession()
                    .get("com.dao.TSysUsergroupassociated", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysUsergroupassociated instance) {
        log.debug("finding TSysUsergroupassociated instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysUsergroupassociated")
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
      log.debug("finding TSysUsergroupassociated instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysUsergroupassociated as model where model." 
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
		log.debug("finding all TSysUsergroupassociated instances");
		try {
			String queryString = "from TSysUsergroupassociated";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysUsergroupassociated merge(TSysUsergroupassociated detachedInstance) {
        log.debug("merging TSysUsergroupassociated instance");
        try {
            TSysUsergroupassociated result = (TSysUsergroupassociated) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysUsergroupassociated instance) {
        log.debug("attaching dirty TSysUsergroupassociated instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysUsergroupassociated instance) {
        log.debug("attaching clean TSysUsergroupassociated instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}