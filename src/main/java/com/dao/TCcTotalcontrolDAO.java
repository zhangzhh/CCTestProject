package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcTotalcontrol;

/**
 	* A data access object (DAO) providing persistence and search support for TCcTotalcontrol entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcTotalcontrol
  * @author MyEclipse Persistence Tools 
 */
public class TCcTotalcontrolDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcTotalcontrolDAO.class);
	

    
    public void save(TCcTotalcontrol transientInstance) {
        log.debug("saving TCcTotalcontrol instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcTotalcontrol persistentInstance) {
        log.debug("deleting TCcTotalcontrol instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcTotalcontrol findById( java.math.BigDecimal id) {
        log.debug("getting TCcTotalcontrol instance with id: " + id);
        try {
            TCcTotalcontrol instance = (TCcTotalcontrol) getSession()
                    .get("com.dao.TCcTotalcontrol", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcTotalcontrol instance) {
        log.debug("finding TCcTotalcontrol instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcTotalcontrol")
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
      log.debug("finding TCcTotalcontrol instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcTotalcontrol as model where model." 
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
		log.debug("finding all TCcTotalcontrol instances");
		try {
			String queryString = "from TCcTotalcontrol";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcTotalcontrol merge(TCcTotalcontrol detachedInstance) {
        log.debug("merging TCcTotalcontrol instance");
        try {
            TCcTotalcontrol result = (TCcTotalcontrol) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcTotalcontrol instance) {
        log.debug("attaching dirty TCcTotalcontrol instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcTotalcontrol instance) {
        log.debug("attaching clean TCcTotalcontrol instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}