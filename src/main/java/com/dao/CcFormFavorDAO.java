package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.CcFormFavor;

/**
 	* A data access object (DAO) providing persistence and search support for CcFormFavor entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.CcFormFavor
  * @author MyEclipse Persistence Tools 
 */
public class CcFormFavorDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(CcFormFavorDAO.class);
	

    
    public void save(CcFormFavor transientInstance) {
        log.debug("saving CcFormFavor instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(CcFormFavor persistentInstance) {
        log.debug("deleting CcFormFavor instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public CcFormFavor findById( java.lang.Long id) {
        log.debug("getting CcFormFavor instance with id: " + id);
        try {
            CcFormFavor instance = (CcFormFavor) getSession()
                    .get("com.dao.CcFormFavor", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(CcFormFavor instance) {
        log.debug("finding CcFormFavor instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.CcFormFavor")
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
      log.debug("finding CcFormFavor instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from CcFormFavor as model where model." 
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
		log.debug("finding all CcFormFavor instances");
		try {
			String queryString = "from CcFormFavor";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public CcFormFavor merge(CcFormFavor detachedInstance) {
        log.debug("merging CcFormFavor instance");
        try {
            CcFormFavor result = (CcFormFavor) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(CcFormFavor instance) {
        log.debug("attaching dirty CcFormFavor instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(CcFormFavor instance) {
        log.debug("attaching clean CcFormFavor instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}