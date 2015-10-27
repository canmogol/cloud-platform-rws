package com.cloudplatform.app.serviceengine;

import com.cloudplatform.app.serviceengine.dto.LatestVersionDTO;
import com.cloudplatform.app.serviceengine.dto.StatusDTO;
import com.cloudplatform.app.serviceengine.dto.StatusResponseDTO;
import com.cloudplatform.app.status.model.Status;
import com.cloudplatform.app.status.service.StatusService;
import com.cloudplatform.app.version.model.LatestVersion;
import com.cloudplatform.app.version.service.VersionService;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "AppServiceEngineImpl", mappedName = "AppServiceEngineImpl")
public class AppServiceEngineImpl implements AppServiceEngine {

    @EJB(name = "CopyStrategy")
    private CopyStrategy copyStrategy;

    @EJB(name = "StatusServiceImpl")
    private StatusService statusService;

    @EJB(name = "VersionServiceImpl")
    private VersionService versionService;

    @Override
    public StatusResponseDTO statusChanged(StatusDTO dto) {
        // create response
        StatusResponseDTO response = new StatusResponseDTO();

        // find status by id
        Status status = statusService.findByDeviceId(dto.getDeviceId());

        if (status != null) {

            // copy data from dto to status
            copyStrategy.copy(
                    dto,
                    status
            );

            // update status entity
            statusService.update(status);

            // set message as updated
            response.setMessage("updated");
        } else {
            // create a new status,
            // this is the first time device sent the status info
            status = new Status();

            // copy data from dto to entity
            copyStrategy.copy(
                    dto,
                    status
            );

            // create status entity
            statusService.create(status);

            // set message as updated
            response.setMessage("created");
        }

        return response;
    }

    @Override
    public LatestVersionDTO findLatestVersion() {
        // find version by id
        LatestVersion latestVersion = versionService.findLatestVersion();
        // create a dto
        LatestVersionDTO dto = new LatestVersionDTO();
        // copy new version info to entity
        copyStrategy.copy(
                latestVersion,
                dto
        );
        return dto;
    }

}
