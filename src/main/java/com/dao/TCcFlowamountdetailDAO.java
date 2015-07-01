package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcFlowamountdetail;

/**
 	* A data access object (DAO) providing persistence and search support for TCcFlowamountdetail entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcFlowamountdetail
  * @author MyEclipse Persistence Tools 
 */
public class TCcFlowamountdetailDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcFlowamountdetailDAO.class);
	

    
    public void save(TCcFlowamountdetail transientInstance) {
        log.debug("saving TCcFlowamountdetail instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcFlowamountdetail persistentInstance) {
        log.debug("deleting TCcFlowamountdetail instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcFlowamountdetail findById( String id) {
        log.debug("getting TCcFlowamountdetail instance with id: " + id);
        try {
            TCcFlowamountdetail instance = (TCcFlowamountdetail) getSession()
                    .get("com.dao.TCcFlowamountdetail", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcFlowamountdetail instance) {
        log.debug("finding TCcFlowamountdetail instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcFlowamountdetail")
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
      log.debug("finding TCcFlowamountdetail instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcFlowamountdetail as model where model." 
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
		log.debug("finding all TCcFlowamountdetail instances");
		try {
			String queryString = "from TCcFlowamountdetail";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcFlowamountdetail merge(TCcFlowamountdetail detachedInstance) {
        log.debug("merging TCcFlowamountdetail instance");
        try {
            TCcFlowamountdetail result = (TCcFlowamountdetail) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcFlowamountdetail instance) {
        log.debug("attaching dirty TCcFlowamountdetail instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcFlowamountdetail instance) {
        log.debug("attaching clean TCcFlowamountdetail instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}