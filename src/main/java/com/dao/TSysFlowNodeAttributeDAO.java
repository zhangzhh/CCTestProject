package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TSysFlowNodeAttribute;

/**
 	* A data access object (DAO) providing persistence and search support for TSysFlowNodeAttribute entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TSysFlowNodeAttribute
  * @author MyEclipse Persistence Tools 
 */
public class TSysFlowNodeAttributeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TSysFlowNodeAttributeDAO.class);
	

    
    public void save(TSysFlowNodeAttribute transientInstance) {
        log.debug("saving TSysFlowNodeAttribute instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TSysFlowNodeAttribute persistentInstance) {
        log.debug("deleting TSysFlowNodeAttribute instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TSysFlowNodeAttribute findById( java.lang.Long id) {
        log.debug("getting TSysFlowNodeAttribute instance with id: " + id);
        try {
            TSysFlowNodeAttribute instance = (TSysFlowNodeAttribute) getSession()
                    .get("com.dao.TSysFlowNodeAttribute", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TSysFlowNodeAttribute instance) {
        log.debug("finding TSysFlowNodeAttribute instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TSysFlowNodeAttribute")
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
      log.debug("finding TSysFlowNodeAttribute instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TSysFlowNodeAttribute as model where model." 
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
		log.debug("finding all TSysFlowNodeAttribute instances");
		try {
			String queryString = "from TSysFlowNodeAttribute";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TSysFlowNodeAttribute merge(TSysFlowNodeAttribute detachedInstance) {
        log.debug("merging TSysFlowNodeAttribute instance");
        try {
            TSysFlowNodeAttribute result = (TSysFlowNodeAttribute) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TSysFlowNodeAttribute instance) {
        log.debug("attaching dirty TSysFlowNodeAttribute instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TSysFlowNodeAttribute instance) {
        log.debug("attaching clean TSysFlowNodeAttribute instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}