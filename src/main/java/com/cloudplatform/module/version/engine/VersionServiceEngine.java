package com.cloudplatform.module.version.engine;


import com.cloudplatform.app.serviceengine.dto.LatestVersion;

import javax.ejb.Local;

@Local
public interface VersionServiceEngine {

    LatestVersion findLatestVersion();

}
