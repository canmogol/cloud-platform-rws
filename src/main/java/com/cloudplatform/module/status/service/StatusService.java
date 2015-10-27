package com.cloudplatform.module.status.service;

import com.cloudplatform.core.service.BaseService;
import com.cloudplatform.module.status.model.Status;

import javax.ejb.Local;

@Local
public interface StatusService extends BaseService<Status, Integer> {

    Status create(String statusname, String password);

}
