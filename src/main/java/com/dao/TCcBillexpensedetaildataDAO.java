package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillexpensedetaildata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillexpensedetaildata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillexpensedetaildata
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillexpensedetaildataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillexpensedetaildataDAO.class);
	

    
    public void save(TCcBillexpensedetaildata transientInstance) {
        log.debug("saving TCcBillexpensedetaildata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillexpensedetaildata persistentInstance) {
        log.debug("deleting TCcBillexpensedetaildata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillexpensedetaildata findById( java.lang.Long id) {
        log.debug("getting TCcBillexpensedetaildata instance with id: " + id);
        try {
            TCcBillexpensedetaildata instance = (TCcBillexpensedetaildata) getSession()
                    .get("com.dao.TCcBillexpensedetaildata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillexpensedetaildata instance) {
        log.debug("finding TCcBillexpensedetaildata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillexpensedetaildata")
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
      log.debug("finding TCcBillexpensedetaildata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillexpensedetaildata as model where model." 
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
		log.debug("finding all TCcBillexpensedetaildata instances");
		try {
			String queryString = "from TCcBillexpensedetaildata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillexpensedetaildata merge(TCcBillexpensedetaildata detachedInstance) {
        log.debug("merging TCcBillexpensedetaildata instance");
        try {
            TCcBillexpensedetaildata result = (TCcBillexpensedetaildata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillexpensedetaildata instance) {
        log.debug("attaching dirty TCcBillexpensedetaildata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillexpensedetaildata instance) {
        log.debug("attaching clean TCcBillexpensedetaildata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}