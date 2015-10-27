package com.cloudplatform.app.version.dao;

import com.cloudplatform.core.dao.AbstractDAO;
import com.cloudplatform.app.version.model.LatestVersion;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "VersionDAOImpl", mappedName = "VersionDAOImpl")
public class VersionDAOImpl extends AbstractDAO<LatestVersion, Integer> implements VersionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public LatestVersion findLatestVersion() {
        List<LatestVersion> latestVersionList = entityManager.createNamedQuery(LatestVersion.QUERY_LATEST_VERSION_LAST, LatestVersion.class).setMaxResults(1).getResultList();
        if (latestVersionList != null && latestVersionList.size() > 0) {
            return latestVersionList.get(0);
        }
        return null;
    }
}
