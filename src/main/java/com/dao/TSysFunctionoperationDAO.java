package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysFunctionoperation;

/**
 	* A data access object (DAO) providing persistence and search support for TSysFunctionoperation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysFunctionoperation
  * @author MyEclipse Persistence Tools 
 */
public class TSysFunctionoperationDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysFunctionoperationDAO.class);
	

    
    public void save(TSysFunctionoperation transientInstance) {
        log.debug("saving TSysFunctionoperation instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysFunctionoperation persistentInstance) {
        log.debug("deleting TSysFunctionoperation instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysFunctionoperation findById( java.lang.Long id) {
        log.debug("getting TSysFunctionoperation instance with id: " + id);
        try {
            TSysFunctionoperation instance = (TSysFunctionoperation) getSession()
                    .get("com.dao.TSysFunctionoperation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysFunctionoperation instance) {
        log.debug("finding TSysFunctionoperation instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysFunctionoperation")
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
      log.debug("finding TSysFunctionoperation instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysFunctionoperation as model where model." 
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
		log.debug("finding all TSysFunctionoperation instances");
		try {
			String queryString = "from TSysFunctionoperation";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysFunctionoperation merge(TSysFunctionoperation detachedInstance) {
        log.debug("merging TSysFunctionoperation instance");
        try {
            TSysFunctionoperation result = (TSysFunctionoperation) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysFunctionoperation instance) {
        log.debug("attaching dirty TSysFunctionoperation instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysFunctionoperation instance) {
        log.debug("attaching clean TSysFunctionoperation instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}