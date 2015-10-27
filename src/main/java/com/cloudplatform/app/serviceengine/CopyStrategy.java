package com.cloudplatform.app.serviceengine;

import com.cloudplatform.app.serviceengine.dto.LatestVersionDTO;
import com.cloudplatform.app.serviceengine.dto.StatusDTO;
import com.cloudplatform.app.status.model.Status;
import com.cloudplatform.app.version.model.LatestVersion;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(name = "CopyStrategy", mappedName = "CopyStrategy")
@LocalBean
public class CopyStrategy {

    public void copy(StatusDTO from, Status to) {
        to.setDeviceId(from.getDeviceId());
        to.setUsedRootDisk(from.getDiskStatusDTO().getUsedRootDisk());
        to.setTotalRootDisk(from.getDiskStatusDTO().getTotalRootDisk());
        to.setFreeRootDisk(from.getDiskStatusDTO().getFreeRootDisk());
        to.setUsedMemory(from.getMemoryStatusDTO().getUsedMemory());
        to.setFreeMemory(from.getMemoryStatusDTO().getFreeMemory());
        to.setTotalMemory(from.getMemoryStatusDTO().getTotalMemory());
    }

    public void copy(LatestVersion from, LatestVersionDTO to) {
        to.setMajor(from.getMajor());
        to.setMinor(from.getMinor());
        to.setPatch(from.getPatch());
        to.setTag(from.getTag());
    }

}
