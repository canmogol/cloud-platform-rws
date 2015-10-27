package com.cloudplatform.app.version.dao;


import com.cloudplatform.core.dao.BaseDAO;
import com.cloudplatform.app.version.model.LatestVersion;

import javax.ejb.Local;


@Local
public interface VersionDAO extends BaseDAO<LatestVersion, Integer> {

    LatestVersion findLatestVersion();

}
