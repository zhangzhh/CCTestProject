package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcMembertoattribute;

/**
 	* A data access object (DAO) providing persistence and search support for TCcMembertoattribute entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcMembertoattribute
  * @author MyEclipse Persistence Tools 
 */
public class TCcMembertoattributeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcMembertoattributeDAO.class);
	

    
    public void save(TCcMembertoattribute transientInstance) {
        log.debug("saving TCcMembertoattribute instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcMembertoattribute persistentInstance) {
        log.debug("deleting TCcMembertoattribute instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcMembertoattribute findById( String id) {
        log.debug("getting TCcMembertoattribute instance with id: " + id);
        try {
            TCcMembertoattribute instance = (TCcMembertoattribute) getSession()
                    .get("com.dao.TCcMembertoattribute", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcMembertoattribute instance) {
        log.debug("finding TCcMembertoattribute instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcMembertoattribute")
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
      log.debug("finding TCcMembertoattribute instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcMembertoattribute as model where model." 
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
		log.debug("finding all TCcMembertoattribute instances");
		try {
			String queryString = "from TCcMembertoattribute";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcMembertoattribute merge(TCcMembertoattribute detachedInstance) {
        log.debug("merging TCcMembertoattribute instance");
        try {
            TCcMembertoattribute result = (TCcMembertoattribute) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcMembertoattribute instance) {
        log.debug("attaching dirty TCcMembertoattribute instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcMembertoattribute instance) {
        log.debug("attaching clean TCcMembertoattribute instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}