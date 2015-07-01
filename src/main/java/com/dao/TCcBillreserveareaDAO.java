package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.BaseHibernateDAO;
import com.entity.TCcBillreservearea;

/**
 	* A data access object (DAO) providing persistence and search support for TCcBillreservearea entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.dao.TCcBillreservearea
  * @author MyEclipse Persistence Tools 
 */
public class TCcBillreserveareaDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TCcBillreserveareaDAO.class);
	

    
    public void save(TCcBillreservearea transientInstance) {
        log.debug("saving TCcBillreservearea instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TCcBillreservearea persistentInstance) {
        log.debug("deleting TCcBillreservearea instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TCcBillreservearea findById( java.lang.Long id) {
        log.debug("getting TCcBillreservearea instance with id: " + id);
        try {
            TCcBillreservearea instance = (TCcBillreservearea) getSession()
                    .get("com.dao.TCcBillreservearea", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TCcBillreservearea instance) {
        log.debug("finding TCcBillreservearea instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.dao.TCcBillreservearea")
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
      log.debug("finding TCcBillreservearea instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TCcBillreservearea as model where model." 
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
		log.debug("finding all TCcBillreservearea instances");
		try {
			String queryString = "from TCcBillreservearea";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TCcBillreservearea merge(TCcBillreservearea detachedInstance) {
        log.debug("merging TCcBillreservearea instance");
        try {
            TCcBillreservearea result = (TCcBillreservearea) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TCcBillreservearea instance) {
        log.debug("attaching dirty TCcBillreservearea instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TCcBillreservearea instance) {
        log.debug("attaching clean TCcBillreservearea instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}