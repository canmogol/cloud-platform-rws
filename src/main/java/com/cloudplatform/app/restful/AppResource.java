package com.cloudplatform.app.restful;


import com.cloudplatform.app.serviceengine.AppServiceEngine;
import com.cloudplatform.app.serviceengine.dto.LatestVersionDTO;
import com.cloudplatform.app.serviceengine.dto.StatusResponseDTO;
import com.cloudplatform.app.serviceengine.dto.SystemInfoRequestDTO;
import com.cloudplatform.app.serviceengine.dto.SystemInfoResponseDTO;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/system")
@Produces({"application/json"})
@Consumes({"application/json"})
@Stateless
@LocalBean
public class AppResource {

    @EJB(name = "AppServiceEngineImpl")
    private AppServiceEngine appServiceEngine;

    @POST
    @Path("/info")
    public SystemInfoResponseDTO statusChanged(SystemInfoRequestDTO request) {
        // handle status of device
        StatusResponseDTO statusResponseDTO = appServiceEngine.statusChanged(request.getStatusDTO());
        // find latest version
        LatestVersionDTO latestVersionDTO = appServiceEngine.findLatestVersion();
        // prepare response
        SystemInfoResponseDTO systemInfoResponseDTO = new SystemInfoResponseDTO();
        systemInfoResponseDTO.setStatusResponseDTO(statusResponseDTO);
        systemInfoResponseDTO.setLatestVersionDTO(latestVersionDTO);
        systemInfoResponseDTO.setResponseUUID(request.getRequestUUID());
        return systemInfoResponseDTO;
    }

}
