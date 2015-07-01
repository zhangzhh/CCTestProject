package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4HistActinst;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4HistActinst entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4HistActinst
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4HistActinstDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4HistActinstDAO.class);
	

    
    public void save(Jbpm4HistActinst transientInstance) {
        log.debug("saving Jbpm4HistActinst instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4HistActinst persistentInstance) {
        log.debug("deleting Jbpm4HistActinst instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4HistActinst findById( java.math.BigDecimal id) {
        log.debug("getting Jbpm4HistActinst instance with id: " + id);
        try {
            Jbpm4HistActinst instance = (Jbpm4HistActinst) getSession()
                    .get("com.dao.Jbpm4HistActinst", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4HistActinst instance) {
        log.debug("finding Jbpm4HistActinst instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4HistActinst")
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
      log.debug("finding Jbpm4HistActinst instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4HistActinst as model where model." 
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
		log.debug("finding all Jbpm4HistActinst instances");
		try {
			String queryString = "from Jbpm4HistActinst";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4HistActinst merge(Jbpm4HistActinst detachedInstance) {
        log.debug("merging Jbpm4HistActinst instance");
        try {
            Jbpm4HistActinst result = (Jbpm4HistActinst) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4HistActinst instance) {
        log.debug("attaching dirty Jbpm4HistActinst instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4HistActinst instance) {
        log.debug("attaching clean Jbpm4HistActinst instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}