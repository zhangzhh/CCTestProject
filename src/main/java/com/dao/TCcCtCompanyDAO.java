package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtCompany;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtCompany entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtCompany
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtCompanyDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtCompanyDAO.class);
	

    
    public void save(TCcCtCompany transientInstance) {
        log.debug("saving TCcCtCompany instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtCompany persistentInstance) {
        log.debug("deleting TCcCtCompany instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtCompany findById( java.lang.Long id) {
        log.debug("getting TCcCtCompany instance with id: " + id);
        try {
            TCcCtCompany instance = (TCcCtCompany) getSession()
                    .get("com.dao.TCcCtCompany", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtCompany instance) {
        log.debug("finding TCcCtCompany instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtCompany")
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
      log.debug("finding TCcCtCompany instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtCompany as model where model." 
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
		log.debug("finding all TCcCtCompany instances");
		try {
			String queryString = "from TCcCtCompany";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtCompany merge(TCcCtCompany detachedInstance) {
        log.debug("merging TCcCtCompany instance");
        try {
            TCcCtCompany result = (TCcCtCompany) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtCompany instance) {
        log.debug("attaching dirty TCcCtCompany instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtCompany instance) {
        log.debug("attaching clean TCcCtCompany instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}