package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysFieldvalue;

/**
 	* A data access object (DAO) providing persistence and search support for TSysFieldvalue entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysFieldvalue
  * @author MyEclipse Persistence Tools 
 */
public class TSysFieldvalueDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysFieldvalueDAO.class);
	

    
    public void save(TSysFieldvalue transientInstance) {
        log.debug("saving TSysFieldvalue instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysFieldvalue persistentInstance) {
        log.debug("deleting TSysFieldvalue instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysFieldvalue findById( java.lang.Long id) {
        log.debug("getting TSysFieldvalue instance with id: " + id);
        try {
            TSysFieldvalue instance = (TSysFieldvalue) getSession()
                    .get("com.dao.TSysFieldvalue", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysFieldvalue instance) {
        log.debug("finding TSysFieldvalue instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysFieldvalue")
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
      log.debug("finding TSysFieldvalue instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysFieldvalue as model where model." 
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
		log.debug("finding all TSysFieldvalue instances");
		try {
			String queryString = "from TSysFieldvalue";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysFieldvalue merge(TSysFieldvalue detachedInstance) {
        log.debug("merging TSysFieldvalue instance");
        try {
            TSysFieldvalue result = (TSysFieldvalue) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysFieldvalue instance) {
        log.debug("attaching dirty TSysFieldvalue instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysFieldvalue instance) {
        log.debug("attaching clean TSysFieldvalue instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}