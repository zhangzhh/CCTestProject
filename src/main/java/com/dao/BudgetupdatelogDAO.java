package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Budgetupdatelog;

/**
 	* A data access object (DAO) providing persistence and search support for Budgetupdatelog entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Budgetupdatelog
  * @author MyEclipse Persistence Tools 
 */
public class BudgetupdatelogDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(BudgetupdatelogDAO.class);
	

    
    public void save(Budgetupdatelog transientInstance) {
        log.debug("saving Budgetupdatelog instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Budgetupdatelog persistentInstance) {
        log.debug("deleting Budgetupdatelog instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Budgetupdatelog findById( java.lang.Long id) {
        log.debug("getting Budgetupdatelog instance with id: " + id);
        try {
            Budgetupdatelog instance = (Budgetupdatelog) getSession()
                    .get("com.dao.Budgetupdatelog", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Budgetupdatelog instance) {
        log.debug("finding Budgetupdatelog instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Budgetupdatelog")
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
      log.debug("finding Budgetupdatelog instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Budgetupdatelog as model where model." 
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
		log.debug("finding all Budgetupdatelog instances");
		try {
			String queryString = "from Budgetupdatelog";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Budgetupdatelog merge(Budgetupdatelog detachedInstance) {
        log.debug("merging Budgetupdatelog instance");
        try {
            Budgetupdatelog result = (Budgetupdatelog) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Budgetupdatelog instance) {
        log.debug("attaching dirty Budgetupdatelog instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Budgetupdatelog instance) {
        log.debug("attaching clean Budgetupdatelog instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}