package com.cloudplatform.app.status.service;

import com.cloudplatform.core.service.BaseService;
import com.cloudplatform.app.status.model.Status;

import javax.ejb.Local;

@Local
public interface StatusService extends BaseService<Status, Integer> {

    Status findByDeviceId(Integer deviceId);

}
