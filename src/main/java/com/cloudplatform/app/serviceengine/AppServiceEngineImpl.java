package com.cloudplatform.app.serviceengine;

import com.cloudplatform.app.serviceengine.dto.LatestVersion;
import com.cloudplatform.app.serviceengine.dto.StatusDTO;
import com.cloudplatform.app.serviceengine.dto.StatusResponse;
import com.cloudplatform.module.status.engine.StatusServiceEngine;
import com.cloudplatform.module.version.engine.VersionServiceEngine;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "AppServiceEngineImpl", mappedName = "AppServiceEngineImpl")
public class AppServiceEngineImpl implements AppServiceEngine {

    @EJB(name = "StatusServiceEngineImpl")
    private StatusServiceEngine statusServiceEngine;

    @EJB(name = "VersionServiceEngineImpl")
    private VersionServiceEngine versionServiceEngine;

    @Override
    public StatusResponse statusChanged(Integer deviceId, StatusDTO statusDTO) {
        StatusResponse statusResponse =  statusServiceEngine.statusChanged(deviceId, statusDTO);
        return statusResponse;
    }

    @Override
    public LatestVersion findLatestVersion() {
        LatestVersion latestVersion = versionServiceEngine.findLatestVersion();
        return latestVersion;
    }
}
