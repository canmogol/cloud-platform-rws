package com.cloudplatform.app.serviceengine;


import com.cloudplatform.app.serviceengine.dto.LatestVersionDTO;
import com.cloudplatform.app.serviceengine.dto.StatusDTO;
import com.cloudplatform.app.serviceengine.dto.StatusResponseDTO;

import javax.ejb.Local;

@Local
public interface AppServiceEngine {

    StatusResponseDTO statusChanged(StatusDTO statusDTO);

    LatestVersionDTO findLatestVersion();

}