package com.cloudplatform.app.serviceengine.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusDTO {

    private Integer deviceId;
    private DiskStatusDTO diskStatusDTO;
    private MemoryStatusDTO memoryStatusDTO;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public DiskStatusDTO getDiskStatusDTO() {
        return diskStatusDTO;
    }

    public void setDiskStatusDTO(DiskStatusDTO diskStatusDTO) {
        this.diskStatusDTO = diskStatusDTO;
    }

    public MemoryStatusDTO getMemoryStatusDTO() {
        return memoryStatusDTO;
    }

    public void setMemoryStatusDTO(MemoryStatusDTO memoryStatusDTO) {
        this.memoryStatusDTO = memoryStatusDTO;
    }

}
