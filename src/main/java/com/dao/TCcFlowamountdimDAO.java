package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcFlowamountdim;

/**
 	* A data access object (DAO) providing persistence and search support for TCcFlowamountdim entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcFlowamountdim
  * @author MyEclipse Persistence Tools 
 */
public class TCcFlowamountdimDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcFlowamountdimDAO.class);
	

    
    public void save(TCcFlowamountdim transientInstance) {
        log.debug("saving TCcFlowamountdim instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcFlowamountdim persistentInstance) {
        log.debug("deleting TCcFlowamountdim instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcFlowamountdim findById( String id) {
        log.debug("getting TCcFlowamountdim instance with id: " + id);
        try {
            TCcFlowamountdim instance = (TCcFlowamountdim) getSession()
                    .get("com.dao.TCcFlowamountdim", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcFlowamountdim instance) {
        log.debug("finding TCcFlowamountdim instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcFlowamountdim")
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
      log.debug("finding TCcFlowamountdim instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcFlowamountdim as model where model." 
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
		log.debug("finding all TCcFlowamountdim instances");
		try {
			String queryString = "from TCcFlowamountdim";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcFlowamountdim merge(TCcFlowamountdim detachedInstance) {
        log.debug("merging TCcFlowamountdim instance");
        try {
            TCcFlowamountdim result = (TCcFlowamountdim) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcFlowamountdim instance) {
        log.debug("attaching dirty TCcFlowamountdim instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcFlowamountdim instance) {
        log.debug("attaching clean TCcFlowamountdim instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}