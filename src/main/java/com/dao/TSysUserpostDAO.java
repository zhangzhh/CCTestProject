package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysUserpost;

/**
 	* A data access object (DAO) providing persistence and search support for TSysUserpost entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysUserpost
  * @author MyEclipse Persistence Tools 
 */
public class TSysUserpostDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysUserpostDAO.class);
	

    
    public void save(TSysUserpost transientInstance) {
        log.debug("saving TSysUserpost instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysUserpost persistentInstance) {
        log.debug("deleting TSysUserpost instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysUserpost findById( java.lang.Long id) {
        log.debug("getting TSysUserpost instance with id: " + id);
        try {
            TSysUserpost instance = (TSysUserpost) getSession()
                    .get("com.dao.TSysUserpost", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysUserpost instance) {
        log.debug("finding TSysUserpost instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysUserpost")
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
      log.debug("finding TSysUserpost instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysUserpost as model where model." 
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
		log.debug("finding all TSysUserpost instances");
		try {
			String queryString = "from TSysUserpost";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysUserpost merge(TSysUserpost detachedInstance) {
        log.debug("merging TSysUserpost instance");
        try {
            TSysUserpost result = (TSysUserpost) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysUserpost instance) {
        log.debug("attaching dirty TSysUserpost instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysUserpost instance) {
        log.debug("attaching clean TSysUserpost instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}