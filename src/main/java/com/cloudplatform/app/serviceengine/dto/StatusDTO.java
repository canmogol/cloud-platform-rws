package com.cloudplatform.app.serviceengine.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusDTO {

    private DiskStatus diskStatus;
    private MemoryStatus memoryStatus;

    public DiskStatus getDiskStatus() {
        return diskStatus;
    }

    public void setDiskStatus(DiskStatus diskStatus) {
        this.diskStatus = diskStatus;
    }

    public MemoryStatus getMemoryStatus() {
        return memoryStatus;
    }

    public void setMemoryStatus(MemoryStatus memoryStatus) {
        this.memoryStatus = memoryStatus;
    }

}
