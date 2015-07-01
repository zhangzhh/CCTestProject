package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillrepaymentdata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillrepaymentdata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillrepaymentdata
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillrepaymentdataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillrepaymentdataDAO.class);
	

    
    public void save(TCcBillrepaymentdata transientInstance) {
        log.debug("saving TCcBillrepaymentdata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillrepaymentdata persistentInstance) {
        log.debug("deleting TCcBillrepaymentdata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillrepaymentdata findById( java.lang.Long id) {
        log.debug("getting TCcBillrepaymentdata instance with id: " + id);
        try {
            TCcBillrepaymentdata instance = (TCcBillrepaymentdata) getSession()
                    .get("com.dao.TCcBillrepaymentdata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillrepaymentdata instance) {
        log.debug("finding TCcBillrepaymentdata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillrepaymentdata")
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
      log.debug("finding TCcBillrepaymentdata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillrepaymentdata as model where model." 
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
		log.debug("finding all TCcBillrepaymentdata instances");
		try {
			String queryString = "from TCcBillrepaymentdata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillrepaymentdata merge(TCcBillrepaymentdata detachedInstance) {
        log.debug("merging TCcBillrepaymentdata instance");
        try {
            TCcBillrepaymentdata result = (TCcBillrepaymentdata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillrepaymentdata instance) {
        log.debug("attaching dirty TCcBillrepaymentdata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillrepaymentdata instance) {
        log.debug("attaching clean TCcBillrepaymentdata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}