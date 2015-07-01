package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtSapMapping;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtSapMapping entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtSapMapping
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtSapMappingDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtSapMappingDAO.class);
	

    
    public void save(TCcCtSapMapping transientInstance) {
        log.debug("saving TCcCtSapMapping instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtSapMapping persistentInstance) {
        log.debug("deleting TCcCtSapMapping instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtSapMapping findById( java.lang.Long id) {
        log.debug("getting TCcCtSapMapping instance with id: " + id);
        try {
            TCcCtSapMapping instance = (TCcCtSapMapping) getSession()
                    .get("com.dao.TCcCtSapMapping", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtSapMapping instance) {
        log.debug("finding TCcCtSapMapping instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtSapMapping")
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
      log.debug("finding TCcCtSapMapping instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtSapMapping as model where model." 
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
		log.debug("finding all TCcCtSapMapping instances");
		try {
			String queryString = "from TCcCtSapMapping";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtSapMapping merge(TCcCtSapMapping detachedInstance) {
        log.debug("merging TCcCtSapMapping instance");
        try {
            TCcCtSapMapping result = (TCcCtSapMapping) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtSapMapping instance) {
        log.debug("attaching dirty TCcCtSapMapping instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtSapMapping instance) {
        log.debug("attaching clean TCcCtSapMapping instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}