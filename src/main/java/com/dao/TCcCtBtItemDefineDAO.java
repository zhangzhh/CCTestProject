package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcCtBtItemDefine;

/**
 	* A data access object (DAO) providing persistence and search support for TCcCtBtItemDefine entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcCtBtItemDefine
  * @author MyEclipse Persistence Tools 
 */
public class TCcCtBtItemDefineDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcCtBtItemDefineDAO.class);
	

    
    public void save(TCcCtBtItemDefine transientInstance) {
        log.debug("saving TCcCtBtItemDefine instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcCtBtItemDefine persistentInstance) {
        log.debug("deleting TCcCtBtItemDefine instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcCtBtItemDefine findById( java.lang.Long id) {
        log.debug("getting TCcCtBtItemDefine instance with id: " + id);
        try {
            TCcCtBtItemDefine instance = (TCcCtBtItemDefine) getSession()
                    .get("com.dao.TCcCtBtItemDefine", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcCtBtItemDefine instance) {
        log.debug("finding TCcCtBtItemDefine instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcCtBtItemDefine")
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
      log.debug("finding TCcCtBtItemDefine instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcCtBtItemDefine as model where model." 
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
		log.debug("finding all TCcCtBtItemDefine instances");
		try {
			String queryString = "from TCcCtBtItemDefine";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcCtBtItemDefine merge(TCcCtBtItemDefine detachedInstance) {
        log.debug("merging TCcCtBtItemDefine instance");
        try {
            TCcCtBtItemDefine result = (TCcCtBtItemDefine) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcCtBtItemDefine instance) {
        log.debug("attaching dirty TCcCtBtItemDefine instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcCtBtItemDefine instance) {
        log.debug("attaching clean TCcCtBtItemDefine instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}