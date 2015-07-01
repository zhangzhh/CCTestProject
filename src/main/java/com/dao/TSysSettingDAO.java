package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysSetting;

/**
 	* A data access object (DAO) providing persistence and search support for TSysSetting entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysSetting
  * @author MyEclipse Persistence Tools 
 */
public class TSysSettingDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysSettingDAO.class);
	

    
    public void save(TSysSetting transientInstance) {
        log.debug("saving TSysSetting instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysSetting persistentInstance) {
        log.debug("deleting TSysSetting instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysSetting findById( java.lang.Long id) {
        log.debug("getting TSysSetting instance with id: " + id);
        try {
            TSysSetting instance = (TSysSetting) getSession()
                    .get("com.dao.TSysSetting", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysSetting instance) {
        log.debug("finding TSysSetting instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysSetting")
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
      log.debug("finding TSysSetting instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysSetting as model where model." 
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
		log.debug("finding all TSysSetting instances");
		try {
			String queryString = "from TSysSetting";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysSetting merge(TSysSetting detachedInstance) {
        log.debug("merging TSysSetting instance");
        try {
            TSysSetting result = (TSysSetting) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysSetting instance) {
        log.debug("attaching dirty TSysSetting instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysSetting instance) {
        log.debug("attaching clean TSysSetting instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}