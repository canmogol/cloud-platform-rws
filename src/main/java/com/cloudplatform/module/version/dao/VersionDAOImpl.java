package com.cloudplatform.module.version.dao;

import com.cloudplatform.core.dao.AbstractDAO;
import com.cloudplatform.module.version.model.Version;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "VersionDAOImpl", mappedName = "VersionDAOImpl")
public class VersionDAOImpl extends AbstractDAO<Version, Integer> implements VersionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public Version findLatestVersion() {
        List<Version> versionList = entityManager.createNamedQuery(Version.QUERY_LATEST_VERSION_LAST, Version.class).setMaxResults(1).getResultList();
        if (versionList != null && versionList.size() > 0) {
            return versionList.get(0);
        }
        return null;
    }
}
