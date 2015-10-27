package com.cloudplatform.app.version.service;

import com.cloudplatform.core.dao.BaseDAO;
import com.cloudplatform.core.service.AbstractService;
import com.cloudplatform.app.version.dao.VersionDAO;
import com.cloudplatform.app.version.model.LatestVersion;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "VersionServiceImpl", mappedName = "VersionServiceImpl")
public class VersionServiceImpl extends AbstractService<LatestVersion, Integer> implements VersionService {

    @EJB(beanName = "VersionDAOImpl")
    private VersionDAO versionDAO;

    @Override
    public BaseDAO<LatestVersion, Integer> getBaseDAO() {
        return versionDAO;
    }

    @Override
    public LatestVersion findLatestVersion() {
        // find version object from DB
        return versionDAO.findLatestVersion();
    }
}
