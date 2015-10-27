package com.cloudplatform.module.status.service;

import com.cloudplatform.core.dao.BaseDAO;
import com.cloudplatform.core.service.AbstractService;
import com.cloudplatform.module.status.dao.StatusDAO;
import com.cloudplatform.module.status.model.Status;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "StatusServiceImpl", mappedName = "StatusServiceImpl")
public class StatusServiceImpl extends AbstractService<Status, Integer> implements StatusService {

    @EJB(beanName = "StatusDAOImpl")
    private StatusDAO statusDAO;

    @Override
    public BaseDAO<Status, Integer> getBaseDAO() {
        return statusDAO;
    }

    @Override
    public Status create(String statusname, String password) {
        // create new status object and set params
        Status status = new Status();
        // persist status object
        create(status);
        // return persisted object, this should have an ID
        return status;
    }
}
