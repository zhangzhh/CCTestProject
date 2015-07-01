package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.Jbpm4Participation;

/**
 	* A data access object (DAO) providing persistence and search support for Jbpm4Participation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.Jbpm4Participation
  * @author MyEclipse Persistence Tools 
 */
public class Jbpm4ParticipationDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(Jbpm4ParticipationDAO.class);
	

    
    public void save(Jbpm4Participation transientInstance) {
        log.debug("saving Jbpm4Participation instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Jbpm4Participation persistentInstance) {
        log.debug("deleting Jbpm4Participation instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Jbpm4Participation findById( java.math.BigDecimal id) {
        log.debug("getting Jbpm4Participation instance with id: " + id);
        try {
            Jbpm4Participation instance = (Jbpm4Participation) getSession()
                    .get("com.dao.Jbpm4Participation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Jbpm4Participation instance) {
        log.debug("finding Jbpm4Participation instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.Jbpm4Participation")
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
      log.debug("finding Jbpm4Participation instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Jbpm4Participation as model where model." 
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
		log.debug("finding all Jbpm4Participation instances");
		try {
			String queryString = "from Jbpm4Participation";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Jbpm4Participation merge(Jbpm4Participation detachedInstance) {
        log.debug("merging Jbpm4Participation instance");
        try {
            Jbpm4Participation result = (Jbpm4Participation) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Jbpm4Participation instance) {
        log.debug("attaching dirty Jbpm4Participation instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Jbpm4Participation instance) {
        log.debug("attaching clean Jbpm4Participation instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}