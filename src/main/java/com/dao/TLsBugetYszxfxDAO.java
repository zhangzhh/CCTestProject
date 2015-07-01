package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TLsBugetYszxfx;

/**
 	* A data access object (DAO) providing persistence and search support for TLsBugetYszxfx entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TLsBugetYszxfx
  * @author MyEclipse Persistence Tools 
 */
public class TLsBugetYszxfxDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TLsBugetYszxfxDAO.class);
	

    
    public void save(TLsBugetYszxfx transientInstance) {
        log.debug("saving TLsBugetYszxfx instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TLsBugetYszxfx persistentInstance) {
        log.debug("deleting TLsBugetYszxfx instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TLsBugetYszxfx findById( String id) {
        log.debug("getting TLsBugetYszxfx instance with id: " + id);
        try {
            TLsBugetYszxfx instance = (TLsBugetYszxfx) getSession()
                    .get("com.dao.TLsBugetYszxfx", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TLsBugetYszxfx instance) {
        log.debug("finding TLsBugetYszxfx instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TLsBugetYszxfx")
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
      log.debug("finding TLsBugetYszxfx instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TLsBugetYszxfx as model where model." 
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
		log.debug("finding all TLsBugetYszxfx instances");
		try {
			String queryString = "from TLsBugetYszxfx";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TLsBugetYszxfx merge(TLsBugetYszxfx detachedInstance) {
        log.debug("merging TLsBugetYszxfx instance");
        try {
            TLsBugetYszxfx result = (TLsBugetYszxfx) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TLsBugetYszxfx instance) {
        log.debug("attaching dirty TLsBugetYszxfx instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TLsBugetYszxfx instance) {
        log.debug("attaching clean TLsBugetYszxfx instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}