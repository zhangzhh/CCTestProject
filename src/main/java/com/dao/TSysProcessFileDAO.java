package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysProcessFile;

/**
 	* A data access object (DAO) providing persistence and search support for TSysProcessFile entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysProcessFile
  * @author MyEclipse Persistence Tools 
 */
public class TSysProcessFileDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysProcessFileDAO.class);
	

    
    public void save(TSysProcessFile transientInstance) {
        log.debug("saving TSysProcessFile instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysProcessFile persistentInstance) {
        log.debug("deleting TSysProcessFile instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysProcessFile findById( String id) {
        log.debug("getting TSysProcessFile instance with id: " + id);
        try {
            TSysProcessFile instance = (TSysProcessFile) getSession()
                    .get("com.dao.TSysProcessFile", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysProcessFile instance) {
        log.debug("finding TSysProcessFile instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysProcessFile")
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
      log.debug("finding TSysProcessFile instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysProcessFile as model where model." 
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
		log.debug("finding all TSysProcessFile instances");
		try {
			String queryString = "from TSysProcessFile";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysProcessFile merge(TSysProcessFile detachedInstance) {
        log.debug("merging TSysProcessFile instance");
        try {
            TSysProcessFile result = (TSysProcessFile) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysProcessFile instance) {
        log.debug("attaching dirty TSysProcessFile instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysProcessFile instance) {
        log.debug("attaching clean TSysProcessFile instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}