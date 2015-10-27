package com.cloudplatform.module.version.service;

import com.cloudplatform.core.service.BaseService;
import com.cloudplatform.module.version.model.Version;

import javax.ejb.Local;

@Local
public interface VersionService extends BaseService<Version, Integer> {

    Version findLatestVersion();

}
