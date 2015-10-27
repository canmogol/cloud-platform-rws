package com.cloudplatform.app.status.service;

import com.cloudplatform.core.dao.BaseDAO;
import com.cloudplatform.core.service.AbstractService;
import com.cloudplatform.app.status.dao.StatusDAO;
import com.cloudplatform.app.status.model.Status;

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
    public Status findByDeviceId(Integer deviceId) {
        return statusDAO.findByDeviceId(deviceId);
    }
}
