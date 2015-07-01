package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysUserrole;

/**
 	* A data access object (DAO) providing persistence and search support for TSysUserrole entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysUserrole
  * @author MyEclipse Persistence Tools 
 */
public class TSysUserroleDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysUserroleDAO.class);
	

    
    public void save(TSysUserrole transientInstance) {
        log.debug("saving TSysUserrole instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysUserrole persistentInstance) {
        log.debug("deleting TSysUserrole instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysUserrole findById( String id) {
        log.debug("getting TSysUserrole instance with id: " + id);
        try {
            TSysUserrole instance = (TSysUserrole) getSession()
                    .get("com.dao.TSysUserrole", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysUserrole instance) {
        log.debug("finding TSysUserrole instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysUserrole")
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
      log.debug("finding TSysUserrole instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysUserrole as model where model." 
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
		log.debug("finding all TSysUserrole instances");
		try {
			String queryString = "from TSysUserrole";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysUserrole merge(TSysUserrole detachedInstance) {
        log.debug("merging TSysUserrole instance");
        try {
            TSysUserrole result = (TSysUserrole) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysUserrole instance) {
        log.debug("attaching dirty TSysUserrole instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysUserrole instance) {
        log.debug("attaching clean TSysUserrole instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}