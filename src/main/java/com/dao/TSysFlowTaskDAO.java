package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysFlowTask;

/**
 	* A data access object (DAO) providing persistence and search support for TSysFlowTask entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysFlowTask
  * @author MyEclipse Persistence Tools 
 */
public class TSysFlowTaskDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysFlowTaskDAO.class);
	

    
    public void save(TSysFlowTask transientInstance) {
        log.debug("saving TSysFlowTask instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysFlowTask persistentInstance) {
        log.debug("deleting TSysFlowTask instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysFlowTask findById( java.lang.Long id) {
        log.debug("getting TSysFlowTask instance with id: " + id);
        try {
            TSysFlowTask instance = (TSysFlowTask) getSession()
                    .get("com.dao.TSysFlowTask", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysFlowTask instance) {
        log.debug("finding TSysFlowTask instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysFlowTask")
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
      log.debug("finding TSysFlowTask instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysFlowTask as model where model." 
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
		log.debug("finding all TSysFlowTask instances");
		try {
			String queryString = "from TSysFlowTask";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysFlowTask merge(TSysFlowTask detachedInstance) {
        log.debug("merging TSysFlowTask instance");
        try {
            TSysFlowTask result = (TSysFlowTask) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysFlowTask instance) {
        log.debug("attaching dirty TSysFlowTask instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysFlowTask instance) {
        log.debug("attaching clean TSysFlowTask instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}