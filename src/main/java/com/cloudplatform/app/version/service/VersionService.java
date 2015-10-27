package com.cloudplatform.app.version.service;

import com.cloudplatform.core.service.BaseService;
import com.cloudplatform.app.version.model.LatestVersion;

import javax.ejb.Local;

@Local
public interface VersionService extends BaseService<LatestVersion, Integer> {

    LatestVersion findLatestVersion();

}
