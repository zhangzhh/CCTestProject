package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysBillfield;

/**
 	* A data access object (DAO) providing persistence and search support for TSysBillfield entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysBillfield
  * @author MyEclipse Persistence Tools 
 */
public class TSysBillfieldDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysBillfieldDAO.class);
	

    
    public void save(TSysBillfield transientInstance) {
        log.debug("saving TSysBillfield instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysBillfield persistentInstance) {
        log.debug("deleting TSysBillfield instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysBillfield findById( String id) {
        log.debug("getting TSysBillfield instance with id: " + id);
        try {
            TSysBillfield instance = (TSysBillfield) getSession()
                    .get("com.dao.TSysBillfield", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysBillfield instance) {
        log.debug("finding TSysBillfield instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysBillfield")
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
      log.debug("finding TSysBillfield instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysBillfield as model where model." 
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
		log.debug("finding all TSysBillfield instances");
		try {
			String queryString = "from TSysBillfield";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysBillfield merge(TSysBillfield detachedInstance) {
        log.debug("merging TSysBillfield instance");
        try {
            TSysBillfield result = (TSysBillfield) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysBillfield instance) {
        log.debug("attaching dirty TSysBillfield instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysBillfield instance) {
        log.debug("attaching clean TSysBillfield instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}