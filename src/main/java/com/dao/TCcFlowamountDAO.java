package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcFlowamount;

/**
 	* A data access object (DAO) providing persistence and search support for TCcFlowamount entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcFlowamount
  * @author MyEclipse Persistence Tools 
 */
public class TCcFlowamountDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcFlowamountDAO.class);
	

    
    public void save(TCcFlowamount transientInstance) {
        log.debug("saving TCcFlowamount instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcFlowamount persistentInstance) {
        log.debug("deleting TCcFlowamount instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcFlowamount findById( String id) {
        log.debug("getting TCcFlowamount instance with id: " + id);
        try {
            TCcFlowamount instance = (TCcFlowamount) getSession()
                    .get("com.dao.TCcFlowamount", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcFlowamount instance) {
        log.debug("finding TCcFlowamount instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcFlowamount")
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
      log.debug("finding TCcFlowamount instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcFlowamount as model where model." 
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
		log.debug("finding all TCcFlowamount instances");
		try {
			String queryString = "from TCcFlowamount";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcFlowamount merge(TCcFlowamount detachedInstance) {
        log.debug("merging TCcFlowamount instance");
        try {
            TCcFlowamount result = (TCcFlowamount) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcFlowamount instance) {
        log.debug("attaching dirty TCcFlowamount instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcFlowamount instance) {
        log.debug("attaching clean TCcFlowamount instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}