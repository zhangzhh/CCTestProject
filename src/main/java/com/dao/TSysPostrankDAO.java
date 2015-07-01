package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysPostrank;

/**
 	* A data access object (DAO) providing persistence and search support for TSysPostrank entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysPostrank
  * @author MyEclipse Persistence Tools 
 */
public class TSysPostrankDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysPostrankDAO.class);
	

    
    public void save(TSysPostrank transientInstance) {
        log.debug("saving TSysPostrank instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysPostrank persistentInstance) {
        log.debug("deleting TSysPostrank instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysPostrank findById( String id) {
        log.debug("getting TSysPostrank instance with id: " + id);
        try {
            TSysPostrank instance = (TSysPostrank) getSession()
                    .get("com.dao.TSysPostrank", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysPostrank instance) {
        log.debug("finding TSysPostrank instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysPostrank")
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
      log.debug("finding TSysPostrank instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysPostrank as model where model." 
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
		log.debug("finding all TSysPostrank instances");
		try {
			String queryString = "from TSysPostrank";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysPostrank merge(TSysPostrank detachedInstance) {
        log.debug("merging TSysPostrank instance");
        try {
            TSysPostrank result = (TSysPostrank) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysPostrank instance) {
        log.debug("attaching dirty TSysPostrank instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysPostrank instance) {
        log.debug("attaching clean TSysPostrank instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}