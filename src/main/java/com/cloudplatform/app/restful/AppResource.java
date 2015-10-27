package com.cloudplatform.app.restful;


import com.cloudplatform.app.serviceengine.AppServiceEngine;
import com.cloudplatform.app.serviceengine.dto.LatestVersion;
import com.cloudplatform.app.serviceengine.dto.StatusResponse;
import com.cloudplatform.app.serviceengine.dto.SystemInfoRequest;
import com.cloudplatform.app.serviceengine.dto.SystemInfoResponse;

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
    public SystemInfoResponse statusChanged(SystemInfoRequest request) {
        // handle status of device
        StatusResponse statusResponse = appServiceEngine.statusChanged(request.getDeviceId(), request.getStatusDTO());
        // find latest version
        LatestVersion latestVersion = appServiceEngine.findLatestVersion();
        // prepare response
        SystemInfoResponse systemInfoResponse = new SystemInfoResponse();
        systemInfoResponse.setStatusResponse(statusResponse);
        systemInfoResponse.setLatestVersion(latestVersion);
        return systemInfoResponse;
    }

}
