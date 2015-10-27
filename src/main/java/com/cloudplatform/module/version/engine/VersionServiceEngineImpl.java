package com.cloudplatform.module.version.engine;

import com.cloudplatform.app.serviceengine.dto.LatestVersion;
import com.cloudplatform.module.version.model.Version;
import com.cloudplatform.module.version.service.VersionCopyStrategy;
import com.cloudplatform.module.version.service.VersionService;

import javax.ejb.EJB;

public class VersionServiceEngineImpl implements VersionServiceEngine {

    @EJB(name = "VersionCopyStrategy")
    private VersionCopyStrategy versionCopyStrategy;

    @EJB(name = "VersionServiceImpl")
    private VersionService versionService;

    @Override
    public LatestVersion findLatestVersion() {
        // find version by id
        Version version = versionService.findLatestVersion();
        // create a dto
        LatestVersion dto = new LatestVersion();
        // copy new version info to entity
        versionCopyStrategy.copy(
                dto,
                version
        );
        return dto;
    }

}
