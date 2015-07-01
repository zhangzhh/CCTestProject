package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysFlowTaskCc;

/**
 	* A data access object (DAO) providing persistence and search support for TSysFlowTaskCc entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysFlowTaskCc
  * @author MyEclipse Persistence Tools 
 */
public class TSysFlowTaskCcDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysFlowTaskCcDAO.class);
	

    
    public void save(TSysFlowTaskCc transientInstance) {
        log.debug("saving TSysFlowTaskCc instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysFlowTaskCc persistentInstance) {
        log.debug("deleting TSysFlowTaskCc instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysFlowTaskCc findById( java.lang.Long id) {
        log.debug("getting TSysFlowTaskCc instance with id: " + id);
        try {
            TSysFlowTaskCc instance = (TSysFlowTaskCc) getSession()
                    .get("com.dao.TSysFlowTaskCc", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysFlowTaskCc instance) {
        log.debug("finding TSysFlowTaskCc instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysFlowTaskCc")
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
      log.debug("finding TSysFlowTaskCc instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysFlowTaskCc as model where model." 
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
		log.debug("finding all TSysFlowTaskCc instances");
		try {
			String queryString = "from TSysFlowTaskCc";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysFlowTaskCc merge(TSysFlowTaskCc detachedInstance) {
        log.debug("merging TSysFlowTaskCc instance");
        try {
            TSysFlowTaskCc result = (TSysFlowTaskCc) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysFlowTaskCc instance) {
        log.debug("attaching dirty TSysFlowTaskCc instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysFlowTaskCc instance) {
        log.debug("attaching clean TSysFlowTaskCc instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}