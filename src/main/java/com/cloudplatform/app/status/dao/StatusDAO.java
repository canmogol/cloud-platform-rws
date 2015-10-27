package com.cloudplatform.app.status.dao;


import com.cloudplatform.core.dao.BaseDAO;
import com.cloudplatform.app.status.model.Status;

import javax.ejb.Local;


@Local
public interface StatusDAO extends BaseDAO<Status, Integer> {

    Status findByDeviceId(Integer deviceId);

}
