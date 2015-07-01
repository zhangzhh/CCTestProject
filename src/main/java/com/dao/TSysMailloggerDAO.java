package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysMaillogger;

/**
 	* A data access object (DAO) providing persistence and search support for TSysMaillogger entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysMaillogger
  * @author MyEclipse Persistence Tools 
 */
public class TSysMailloggerDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysMailloggerDAO.class);
	

    
    public void save(TSysMaillogger transientInstance) {
        log.debug("saving TSysMaillogger instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysMaillogger persistentInstance) {
        log.debug("deleting TSysMaillogger instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysMaillogger findById( java.lang.Long id) {
        log.debug("getting TSysMaillogger instance with id: " + id);
        try {
            TSysMaillogger instance = (TSysMaillogger) getSession()
                    .get("com.dao.TSysMaillogger", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysMaillogger instance) {
        log.debug("finding TSysMaillogger instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysMaillogger")
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
      log.debug("finding TSysMaillogger instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysMaillogger as model where model." 
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
		log.debug("finding all TSysMaillogger instances");
		try {
			String queryString = "from TSysMaillogger";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysMaillogger merge(TSysMaillogger detachedInstance) {
        log.debug("merging TSysMaillogger instance");
        try {
            TSysMaillogger result = (TSysMaillogger) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysMaillogger instance) {
        log.debug("attaching dirty TSysMaillogger instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysMaillogger instance) {
        log.debug("attaching clean TSysMaillogger instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}