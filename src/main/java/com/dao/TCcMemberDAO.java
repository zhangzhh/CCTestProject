package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcMember;

/**
 	* A data access object (DAO) providing persistence and search support for TCcMember entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcMember
  * @author MyEclipse Persistence Tools 
 */
public class TCcMemberDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcMemberDAO.class);
	

    
    public void save(TCcMember transientInstance) {
        log.debug("saving TCcMember instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcMember persistentInstance) {
        log.debug("deleting TCcMember instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcMember findById( java.lang.Long id) {
        log.debug("getting TCcMember instance with id: " + id);
        try {
            TCcMember instance = (TCcMember) getSession()
                    .get("com.dao.TCcMember", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcMember instance) {
        log.debug("finding TCcMember instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcMember")
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
      log.debug("finding TCcMember instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcMember as model where model." 
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
		log.debug("finding all TCcMember instances");
		try {
			String queryString = "from TCcMember";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcMember merge(TCcMember detachedInstance) {
        log.debug("merging TCcMember instance");
        try {
            TCcMember result = (TCcMember) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcMember instance) {
        log.debug("attaching dirty TCcMember instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcMember instance) {
        log.debug("attaching clean TCcMember instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}