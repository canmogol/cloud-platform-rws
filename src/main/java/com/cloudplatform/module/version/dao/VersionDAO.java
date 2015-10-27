package com.cloudplatform.module.version.dao;


import com.cloudplatform.core.dao.BaseDAO;
import com.cloudplatform.module.version.model.Version;

import javax.ejb.Local;


@Local
public interface VersionDAO extends BaseDAO<Version, Integer> {

    Version findLatestVersion();

}
