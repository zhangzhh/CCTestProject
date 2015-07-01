package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcExpenseupdatelog;

/**
 	* A data access object (DAO) providing persistence and search support for TCcExpenseupdatelog entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcExpenseupdatelog
  * @author MyEclipse Persistence Tools 
 */
public class TCcExpenseupdatelogDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcExpenseupdatelogDAO.class);
	

    
    public void save(TCcExpenseupdatelog transientInstance) {
        log.debug("saving TCcExpenseupdatelog instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcExpenseupdatelog persistentInstance) {
        log.debug("deleting TCcExpenseupdatelog instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcExpenseupdatelog findById( java.lang.Long id) {
        log.debug("getting TCcExpenseupdatelog instance with id: " + id);
        try {
            TCcExpenseupdatelog instance = (TCcExpenseupdatelog) getSession()
                    .get("com.dao.TCcExpenseupdatelog", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcExpenseupdatelog instance) {
        log.debug("finding TCcExpenseupdatelog instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcExpenseupdatelog")
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
      log.debug("finding TCcExpenseupdatelog instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcExpenseupdatelog as model where model." 
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
		log.debug("finding all TCcExpenseupdatelog instances");
		try {
			String queryString = "from TCcExpenseupdatelog";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcExpenseupdatelog merge(TCcExpenseupdatelog detachedInstance) {
        log.debug("merging TCcExpenseupdatelog instance");
        try {
            TCcExpenseupdatelog result = (TCcExpenseupdatelog) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcExpenseupdatelog instance) {
        log.debug("attaching dirty TCcExpenseupdatelog instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcExpenseupdatelog instance) {
        log.debug("attaching clean TCcExpenseupdatelog instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}