package com.cloudplatform.app.status.dao;

import com.cloudplatform.app.status.model.Status;
import com.cloudplatform.core.dao.AbstractDAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "StatusDAOImpl", mappedName = "StatusDAOImpl")
public class StatusDAOImpl extends AbstractDAO<Status, Integer> implements StatusDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public Status findByDeviceId(Integer deviceId) {
        Status status = null;
        List<Status> statusList = entityManager.createNamedQuery(Status.QUERY_FIND_BY_DEVICE_ID, Status.class)
                .setParameter("deviceId", deviceId)
                .setMaxResults(1)
                .getResultList();
        if (statusList.size() == 1) {
            status = statusList.get(0);
        }
        return status;
    }
}
