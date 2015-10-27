package com.cloudplatform.module.status.service;

import com.cloudplatform.module.status.model.Status;
import com.cloudplatform.app.serviceengine.dto.StatusDTO;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(name = "StatusCopyStrategy", mappedName = "StatusCopyStrategy")
@LocalBean
public class StatusCopyStrategy {

    public void copy(StatusDTO dto, Status entity) {
        entity.setFreeRootDisk(dto.getDiskStatus().getFreeRootDisk());
        entity.setTotalRootDisk(dto.getDiskStatus().getTotalRootDisk());
        entity.setUsedRootDisk(dto.getDiskStatus().getUsedRootDisk());
        entity.setFreeMemory(dto.getMemoryStatus().getFreeMemory());
        entity.setTotalMemory(dto.getMemoryStatus().getTotalMemory());
        entity.setUsedMemory(dto.getMemoryStatus().getUsedMemory());
    }
}
