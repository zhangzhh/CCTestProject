package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillpaymentdata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillpaymentdata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillpaymentdata
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillpaymentdataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillpaymentdataDAO.class);
	

    
    public void save(TCcBillpaymentdata transientInstance) {
        log.debug("saving TCcBillpaymentdata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillpaymentdata persistentInstance) {
        log.debug("deleting TCcBillpaymentdata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillpaymentdata findById( String id) {
        log.debug("getting TCcBillpaymentdata instance with id: " + id);
        try {
            TCcBillpaymentdata instance = (TCcBillpaymentdata) getSession()
                    .get("com.dao.TCcBillpaymentdata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillpaymentdata instance) {
        log.debug("finding TCcBillpaymentdata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillpaymentdata")
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
      log.debug("finding TCcBillpaymentdata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillpaymentdata as model where model." 
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
		log.debug("finding all TCcBillpaymentdata instances");
		try {
			String queryString = "from TCcBillpaymentdata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillpaymentdata merge(TCcBillpaymentdata detachedInstance) {
        log.debug("merging TCcBillpaymentdata instance");
        try {
            TCcBillpaymentdata result = (TCcBillpaymentdata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillpaymentdata instance) {
        log.debug("attaching dirty TCcBillpaymentdata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillpaymentdata instance) {
        log.debug("attaching clean TCcBillpaymentdata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}