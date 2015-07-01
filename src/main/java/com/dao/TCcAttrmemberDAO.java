package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcAttrmember;

/**
 	* A data access object (DAO) providing persistence and search support for TCcAttrmember entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcAttrmember
  * @author MyEclipse Persistence Tools 
 */
public class TCcAttrmemberDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcAttrmemberDAO.class);
	

    
    public void save(TCcAttrmember transientInstance) {
        log.debug("saving TCcAttrmember instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcAttrmember persistentInstance) {
        log.debug("deleting TCcAttrmember instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcAttrmember findById( java.lang.Long id) {
        log.debug("getting TCcAttrmember instance with id: " + id);
        try {
            TCcAttrmember instance = (TCcAttrmember) getSession()
                    .get("com.dao.TCcAttrmember", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcAttrmember instance) {
        log.debug("finding TCcAttrmember instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcAttrmember")
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
      log.debug("finding TCcAttrmember instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcAttrmember as model where model." 
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
		log.debug("finding all TCcAttrmember instances");
		try {
			String queryString = "from TCcAttrmember";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcAttrmember merge(TCcAttrmember detachedInstance) {
        log.debug("merging TCcAttrmember instance");
        try {
            TCcAttrmember result = (TCcAttrmember) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcAttrmember instance) {
        log.debug("attaching dirty TCcAttrmember instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcAttrmember instance) {
        log.debug("attaching clean TCcAttrmember instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}