package com.cloudplatform.module.status.dao;


import com.cloudplatform.core.dao.BaseDAO;
import com.cloudplatform.module.status.model.Status;

import javax.ejb.Local;


@Local
public interface StatusDAO extends BaseDAO<Status, Integer> {

}
