package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBilldetailtotalcontrol;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBilldetailtotalcontrol entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBilldetailtotalcontrol
  * @author MyEclipse Persistence Tools 
 */
public class TCcBilldetailtotalcontrolDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBilldetailtotalcontrolDAO.class);
	

    
    public void save(TCcBilldetailtotalcontrol transientInstance) {
        log.debug("saving TCcBilldetailtotalcontrol instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBilldetailtotalcontrol persistentInstance) {
        log.debug("deleting TCcBilldetailtotalcontrol instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBilldetailtotalcontrol findById( String id) {
        log.debug("getting TCcBilldetailtotalcontrol instance with id: " + id);
        try {
            TCcBilldetailtotalcontrol instance = (TCcBilldetailtotalcontrol) getSession()
                    .get("com.dao.TCcBilldetailtotalcontrol", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBilldetailtotalcontrol instance) {
        log.debug("finding TCcBilldetailtotalcontrol instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBilldetailtotalcontrol")
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
      log.debug("finding TCcBilldetailtotalcontrol instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBilldetailtotalcontrol as model where model." 
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
		log.debug("finding all TCcBilldetailtotalcontrol instances");
		try {
			String queryString = "from TCcBilldetailtotalcontrol";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBilldetailtotalcontrol merge(TCcBilldetailtotalcontrol detachedInstance) {
        log.debug("merging TCcBilldetailtotalcontrol instance");
        try {
            TCcBilldetailtotalcontrol result = (TCcBilldetailtotalcontrol) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBilldetailtotalcontrol instance) {
        log.debug("attaching dirty TCcBilldetailtotalcontrol instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBilldetailtotalcontrol instance) {
        log.debug("attaching clean TCcBilldetailtotalcontrol instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}