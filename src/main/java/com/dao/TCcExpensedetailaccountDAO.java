package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcExpensedetailaccount;

/**
 	* A data access object (DAO) providing persistence and search support for TCcExpensedetailaccount entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcExpensedetailaccount
  * @author MyEclipse Persistence Tools 
 */
public class TCcExpensedetailaccountDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcExpensedetailaccountDAO.class);
	

    
    public void save(TCcExpensedetailaccount transientInstance) {
        log.debug("saving TCcExpensedetailaccount instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcExpensedetailaccount persistentInstance) {
        log.debug("deleting TCcExpensedetailaccount instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcExpensedetailaccount findById( java.lang.Long id) {
        log.debug("getting TCcExpensedetailaccount instance with id: " + id);
        try {
            TCcExpensedetailaccount instance = (TCcExpensedetailaccount) getSession()
                    .get("com.dao.TCcExpensedetailaccount", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcExpensedetailaccount instance) {
        log.debug("finding TCcExpensedetailaccount instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcExpensedetailaccount")
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
      log.debug("finding TCcExpensedetailaccount instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcExpensedetailaccount as model where model." 
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
		log.debug("finding all TCcExpensedetailaccount instances");
		try {
			String queryString = "from TCcExpensedetailaccount";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcExpensedetailaccount merge(TCcExpensedetailaccount detachedInstance) {
        log.debug("merging TCcExpensedetailaccount instance");
        try {
            TCcExpensedetailaccount result = (TCcExpensedetailaccount) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcExpensedetailaccount instance) {
        log.debug("attaching dirty TCcExpensedetailaccount instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcExpensedetailaccount instance) {
        log.debug("attaching clean TCcExpensedetailaccount instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}