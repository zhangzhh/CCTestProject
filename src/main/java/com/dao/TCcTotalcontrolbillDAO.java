package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcTotalcontrolbill;

/**
 	* A data access object (DAO) providing persistence and search support for TCcTotalcontrolbill entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcTotalcontrolbill
  * @author MyEclipse Persistence Tools 
 */
public class TCcTotalcontrolbillDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcTotalcontrolbillDAO.class);
	

    
    public void save(TCcTotalcontrolbill transientInstance) {
        log.debug("saving TCcTotalcontrolbill instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcTotalcontrolbill persistentInstance) {
        log.debug("deleting TCcTotalcontrolbill instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcTotalcontrolbill findById( java.lang.Long id) {
        log.debug("getting TCcTotalcontrolbill instance with id: " + id);
        try {
            TCcTotalcontrolbill instance = (TCcTotalcontrolbill) getSession()
                    .get("com.dao.TCcTotalcontrolbill", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcTotalcontrolbill instance) {
        log.debug("finding TCcTotalcontrolbill instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcTotalcontrolbill")
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
      log.debug("finding TCcTotalcontrolbill instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcTotalcontrolbill as model where model." 
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
		log.debug("finding all TCcTotalcontrolbill instances");
		try {
			String queryString = "from TCcTotalcontrolbill";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcTotalcontrolbill merge(TCcTotalcontrolbill detachedInstance) {
        log.debug("merging TCcTotalcontrolbill instance");
        try {
            TCcTotalcontrolbill result = (TCcTotalcontrolbill) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcTotalcontrolbill instance) {
        log.debug("attaching dirty TCcTotalcontrolbill instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcTotalcontrolbill instance) {
        log.debug("attaching clean TCcTotalcontrolbill instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}