package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysLogfield;

/**
 	* A data access object (DAO) providing persistence and search support for TSysLogfield entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysLogfield
  * @author MyEclipse Persistence Tools 
 */
public class TSysLogfieldDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysLogfieldDAO.class);
	

    
    public void save(TSysLogfield transientInstance) {
        log.debug("saving TSysLogfield instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysLogfield persistentInstance) {
        log.debug("deleting TSysLogfield instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysLogfield findById( java.lang.Long id) {
        log.debug("getting TSysLogfield instance with id: " + id);
        try {
            TSysLogfield instance = (TSysLogfield) getSession()
                    .get("com.dao.TSysLogfield", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysLogfield instance) {
        log.debug("finding TSysLogfield instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysLogfield")
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
      log.debug("finding TSysLogfield instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysLogfield as model where model." 
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
		log.debug("finding all TSysLogfield instances");
		try {
			String queryString = "from TSysLogfield";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysLogfield merge(TSysLogfield detachedInstance) {
        log.debug("merging TSysLogfield instance");
        try {
            TSysLogfield result = (TSysLogfield) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysLogfield instance) {
        log.debug("attaching dirty TSysLogfield instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysLogfield instance) {
        log.debug("attaching clean TSysLogfield instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}