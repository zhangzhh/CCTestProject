package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtDimRelation;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtDimRelation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtDimRelation
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtDimRelationDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtDimRelationDAO.class);
	

    
    public void save(TCcCtDimRelation transientInstance) {
        log.debug("saving TCcCtDimRelation instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtDimRelation persistentInstance) {
        log.debug("deleting TCcCtDimRelation instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtDimRelation findById( java.lang.Long id) {
        log.debug("getting TCcCtDimRelation instance with id: " + id);
        try {
            TCcCtDimRelation instance = (TCcCtDimRelation) getSession()
                    .get("com.dao.TCcCtDimRelation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtDimRelation instance) {
        log.debug("finding TCcCtDimRelation instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtDimRelation")
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
      log.debug("finding TCcCtDimRelation instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtDimRelation as model where model." 
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
		log.debug("finding all TCcCtDimRelation instances");
		try {
			String queryString = "from TCcCtDimRelation";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtDimRelation merge(TCcCtDimRelation detachedInstance) {
        log.debug("merging TCcCtDimRelation instance");
        try {
            TCcCtDimRelation result = (TCcCtDimRelation) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtDimRelation instance) {
        log.debug("attaching dirty TCcCtDimRelation instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtDimRelation instance) {
        log.debug("attaching clean TCcCtDimRelation instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}