package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysFunctionpermission;

/**
 	* A data access object (DAO) providing persistence and search support for TSysFunctionpermission entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysFunctionpermission
  * @author MyEclipse Persistence Tools 
 */
public class TSysFunctionpermissionDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysFunctionpermissionDAO.class);
	

    
    public void save(TSysFunctionpermission transientInstance) {
        log.debug("saving TSysFunctionpermission instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysFunctionpermission persistentInstance) {
        log.debug("deleting TSysFunctionpermission instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysFunctionpermission findById( java.lang.Long id) {
        log.debug("getting TSysFunctionpermission instance with id: " + id);
        try {
            TSysFunctionpermission instance = (TSysFunctionpermission) getSession()
                    .get("com.dao.TSysFunctionpermission", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysFunctionpermission instance) {
        log.debug("finding TSysFunctionpermission instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysFunctionpermission")
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
      log.debug("finding TSysFunctionpermission instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysFunctionpermission as model where model." 
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
		log.debug("finding all TSysFunctionpermission instances");
		try {
			String queryString = "from TSysFunctionpermission";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysFunctionpermission merge(TSysFunctionpermission detachedInstance) {
        log.debug("merging TSysFunctionpermission instance");
        try {
            TSysFunctionpermission result = (TSysFunctionpermission) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysFunctionpermission instance) {
        log.debug("attaching dirty TSysFunctionpermission instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysFunctionpermission instance) {
        log.debug("attaching clean TSysFunctionpermission instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}