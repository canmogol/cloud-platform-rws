package com.cloudplatform.app.serviceengine;


import com.cloudplatform.app.serviceengine.dto.LatestVersion;
import com.cloudplatform.app.serviceengine.dto.StatusDTO;
import com.cloudplatform.app.serviceengine.dto.StatusResponse;

import javax.ejb.Local;

@Local
public interface AppServiceEngine {

    StatusResponse statusChanged(Integer deviceId, StatusDTO statusDTO);

    LatestVersion findLatestVersion();

}