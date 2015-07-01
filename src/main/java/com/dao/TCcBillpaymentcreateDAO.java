package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillpaymentcreate;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillpaymentcreate entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillpaymentcreate
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillpaymentcreateDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillpaymentcreateDAO.class);
	

    
    public void save(TCcBillpaymentcreate transientInstance) {
        log.debug("saving TCcBillpaymentcreate instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillpaymentcreate persistentInstance) {
        log.debug("deleting TCcBillpaymentcreate instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillpaymentcreate findById( String id) {
        log.debug("getting TCcBillpaymentcreate instance with id: " + id);
        try {
            TCcBillpaymentcreate instance = (TCcBillpaymentcreate) getSession()
                    .get("com.dao.TCcBillpaymentcreate", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillpaymentcreate instance) {
        log.debug("finding TCcBillpaymentcreate instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillpaymentcreate")
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
      log.debug("finding TCcBillpaymentcreate instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillpaymentcreate as model where model." 
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
		log.debug("finding all TCcBillpaymentcreate instances");
		try {
			String queryString = "from TCcBillpaymentcreate";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillpaymentcreate merge(TCcBillpaymentcreate detachedInstance) {
        log.debug("merging TCcBillpaymentcreate instance");
        try {
            TCcBillpaymentcreate result = (TCcBillpaymentcreate) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillpaymentcreate instance) {
        log.debug("attaching dirty TCcBillpaymentcreate instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillpaymentcreate instance) {
        log.debug("attaching clean TCcBillpaymentcreate instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}