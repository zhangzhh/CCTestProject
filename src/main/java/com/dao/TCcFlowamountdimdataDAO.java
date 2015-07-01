package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcFlowamountdimdata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcFlowamountdimdata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcFlowamountdimdata
  * @author MyEclipse Persistence Tools 
 */
public class TCcFlowamountdimdataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcFlowamountdimdataDAO.class);
	

    
    public void save(TCcFlowamountdimdata transientInstance) {
        log.debug("saving TCcFlowamountdimdata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcFlowamountdimdata persistentInstance) {
        log.debug("deleting TCcFlowamountdimdata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcFlowamountdimdata findById( String id) {
        log.debug("getting TCcFlowamountdimdata instance with id: " + id);
        try {
            TCcFlowamountdimdata instance = (TCcFlowamountdimdata) getSession()
                    .get("com.dao.TCcFlowamountdimdata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcFlowamountdimdata instance) {
        log.debug("finding TCcFlowamountdimdata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcFlowamountdimdata")
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
      log.debug("finding TCcFlowamountdimdata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcFlowamountdimdata as model where model." 
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
		log.debug("finding all TCcFlowamountdimdata instances");
		try {
			String queryString = "from TCcFlowamountdimdata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcFlowamountdimdata merge(TCcFlowamountdimdata detachedInstance) {
        log.debug("merging TCcFlowamountdimdata instance");
        try {
            TCcFlowamountdimdata result = (TCcFlowamountdimdata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcFlowamountdimdata instance) {
        log.debug("attaching dirty TCcFlowamountdimdata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcFlowamountdimdata instance) {
        log.debug("attaching clean TCcFlowamountdimdata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}