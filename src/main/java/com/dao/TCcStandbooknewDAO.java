package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcStandbooknew;

/**
 	* A data access object (DAO) providing persistence and search support for TCcStandbooknew entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcStandbooknew
  * @author MyEclipse Persistence Tools 
 */
public class TCcStandbooknewDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcStandbooknewDAO.class);
	

    
    public void save(TCcStandbooknew transientInstance) {
        log.debug("saving TCcStandbooknew instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcStandbooknew persistentInstance) {
        log.debug("deleting TCcStandbooknew instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcStandbooknew findById( String id) {
        log.debug("getting TCcStandbooknew instance with id: " + id);
        try {
            TCcStandbooknew instance = (TCcStandbooknew) getSession()
                    .get("com.dao.TCcStandbooknew", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcStandbooknew instance) {
        log.debug("finding TCcStandbooknew instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcStandbooknew")
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
      log.debug("finding TCcStandbooknew instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcStandbooknew as model where model." 
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
		log.debug("finding all TCcStandbooknew instances");
		try {
			String queryString = "from TCcStandbooknew";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcStandbooknew merge(TCcStandbooknew detachedInstance) {
        log.debug("merging TCcStandbooknew instance");
        try {
            TCcStandbooknew result = (TCcStandbooknew) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcStandbooknew instance) {
        log.debug("attaching dirty TCcStandbooknew instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcStandbooknew instance) {
        log.debug("attaching clean TCcStandbooknew instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}