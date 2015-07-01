package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysRolerank;

/**
 	* A data access object (DAO) providing persistence and search support for TSysRolerank entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysRolerank
  * @author MyEclipse Persistence Tools 
 */
public class TSysRolerankDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysRolerankDAO.class);
	

    
    public void save(TSysRolerank transientInstance) {
        log.debug("saving TSysRolerank instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysRolerank persistentInstance) {
        log.debug("deleting TSysRolerank instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysRolerank findById( String id) {
        log.debug("getting TSysRolerank instance with id: " + id);
        try {
            TSysRolerank instance = (TSysRolerank) getSession()
                    .get("com.dao.TSysRolerank", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysRolerank instance) {
        log.debug("finding TSysRolerank instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysRolerank")
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
      log.debug("finding TSysRolerank instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysRolerank as model where model." 
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
		log.debug("finding all TSysRolerank instances");
		try {
			String queryString = "from TSysRolerank";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysRolerank merge(TSysRolerank detachedInstance) {
        log.debug("merging TSysRolerank instance");
        try {
            TSysRolerank result = (TSysRolerank) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysRolerank instance) {
        log.debug("attaching dirty TSysRolerank instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysRolerank instance) {
        log.debug("attaching clean TSysRolerank instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}