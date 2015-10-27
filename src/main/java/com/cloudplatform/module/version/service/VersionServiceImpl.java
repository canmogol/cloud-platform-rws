package com.cloudplatform.module.version.service;

import com.cloudplatform.core.dao.BaseDAO;
import com.cloudplatform.core.service.AbstractService;
import com.cloudplatform.module.version.dao.VersionDAO;
import com.cloudplatform.module.version.model.Version;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "VersionServiceImpl", mappedName = "VersionServiceImpl")
public class VersionServiceImpl extends AbstractService<Version, Integer> implements VersionService {

    @EJB(beanName = "VersionDAOImpl")
    private VersionDAO versionDAO;

    @Override
    public BaseDAO<Version, Integer> getBaseDAO() {
        return versionDAO;
    }

    @Override
    public Version findLatestVersion() {
        // find version object from DB
        return versionDAO.findLatestVersion();
    }
}
