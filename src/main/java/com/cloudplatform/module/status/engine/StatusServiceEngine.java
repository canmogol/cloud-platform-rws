package com.cloudplatform.module.status.engine;


import com.cloudplatform.app.serviceengine.dto.StatusDTO;
import com.cloudplatform.app.serviceengine.dto.StatusResponse;

import javax.ejb.Local;

@Local
public interface StatusServiceEngine {

    StatusResponse statusChanged(Integer deviceId, StatusDTO statusDTO);

}
