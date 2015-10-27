package com.cloudplatform.module.status.engine;

import com.cloudplatform.app.serviceengine.dto.StatusDTO;
import com.cloudplatform.app.serviceengine.dto.StatusResponse;
import com.cloudplatform.module.status.model.Status;
import com.cloudplatform.module.status.service.StatusCopyStrategy;
import com.cloudplatform.module.status.service.StatusService;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "StatusServiceEngineImpl", mappedName = "AppServiceEngineImpl")
public class StatusServiceEngineImpl implements StatusServiceEngine {

    @EJB(name = "StatusCopyStrategy")
    private StatusCopyStrategy statusCopyStrategy;

    @EJB(name = "StatusServiceImpl")
    private StatusService statusService;

    @Override
    public StatusResponse statusChanged(Integer deviceId, StatusDTO dto) {
        // find status by id
        Status status = statusService.findById(deviceId);

        // copy new status info to entity
        statusCopyStrategy.copy(
                dto,
                status
        );
        // update status entity
        statusService.update(status);

        // create and return a response dto
        StatusResponse statusResponse = new StatusResponse();
        return statusResponse;
    }
}
