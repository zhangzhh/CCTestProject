package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillshareexpensedata;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillshareexpensedata entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillshareexpensedata
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillshareexpensedataDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillshareexpensedataDAO.class);
	

    
    public void save(TCcBillshareexpensedata transientInstance) {
        log.debug("saving TCcBillshareexpensedata instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillshareexpensedata persistentInstance) {
        log.debug("deleting TCcBillshareexpensedata instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillshareexpensedata findById( java.lang.Long id) {
        log.debug("getting TCcBillshareexpensedata instance with id: " + id);
        try {
            TCcBillshareexpensedata instance = (TCcBillshareexpensedata) getSession()
                    .get("com.dao.TCcBillshareexpensedata", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillshareexpensedata instance) {
        log.debug("finding TCcBillshareexpensedata instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillshareexpensedata")
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
      log.debug("finding TCcBillshareexpensedata instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillshareexpensedata as model where model." 
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
		log.debug("finding all TCcBillshareexpensedata instances");
		try {
			String queryString = "from TCcBillshareexpensedata";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillshareexpensedata merge(TCcBillshareexpensedata detachedInstance) {
        log.debug("merging TCcBillshareexpensedata instance");
        try {
            TCcBillshareexpensedata result = (TCcBillshareexpensedata) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillshareexpensedata instance) {
        log.debug("attaching dirty TCcBillshareexpensedata instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillshareexpensedata instance) {
        log.debug("attaching clean TCcBillshareexpensedata instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}