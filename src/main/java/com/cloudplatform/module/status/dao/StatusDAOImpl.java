package com.cloudplatform.module.status.dao;

import com.cloudplatform.core.dao.AbstractDAO;
import com.cloudplatform.module.status.model.Status;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "StatusDAOImpl", mappedName = "StatusDAOImpl")
public class StatusDAOImpl extends AbstractDAO<Status, Integer> implements StatusDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
