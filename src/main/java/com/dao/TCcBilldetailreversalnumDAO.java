package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBilldetailreversalnum;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBilldetailreversalnum entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBilldetailreversalnum
  * @author MyEclipse Persistence Tools 
 */
public class TCcBilldetailreversalnumDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBilldetailreversalnumDAO.class);
	

    
    public void save(TCcBilldetailreversalnum transientInstance) {
        log.debug("saving TCcBilldetailreversalnum instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBilldetailreversalnum persistentInstance) {
        log.debug("deleting TCcBilldetailreversalnum instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBilldetailreversalnum findById( java.lang.Long id) {
        log.debug("getting TCcBilldetailreversalnum instance with id: " + id);
        try {
            TCcBilldetailreversalnum instance = (TCcBilldetailreversalnum) getSession()
                    .get("com.dao.TCcBilldetailreversalnum", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBilldetailreversalnum instance) {
        log.debug("finding TCcBilldetailreversalnum instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBilldetailreversalnum")
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
      log.debug("finding TCcBilldetailreversalnum instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBilldetailreversalnum as model where model." 
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
		log.debug("finding all TCcBilldetailreversalnum instances");
		try {
			String queryString = "from TCcBilldetailreversalnum";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBilldetailreversalnum merge(TCcBilldetailreversalnum detachedInstance) {
        log.debug("merging TCcBilldetailreversalnum instance");
        try {
            TCcBilldetailreversalnum result = (TCcBilldetailreversalnum) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBilldetailreversalnum instance) {
        log.debug("attaching dirty TCcBilldetailreversalnum instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBilldetailreversalnum instance) {
        log.debug("attaching clean TCcBilldetailreversalnum instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}