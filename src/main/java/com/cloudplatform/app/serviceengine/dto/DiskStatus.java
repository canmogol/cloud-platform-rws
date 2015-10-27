package com.cloudplatform.app.serviceengine.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DiskStatus {

    private String totalRootDisk;
    private String usedRootDisk;
    private String freeRootDisk;

    public String getTotalRootDisk() {
        return totalRootDisk;
    }

    public void setTotalRootDisk(String totalRootDisk) {
        this.totalRootDisk = totalRootDisk;
    }

    public String getUsedRootDisk() {
        return usedRootDisk;
    }

    public void setUsedRootDisk(String usedRootDisk) {
        this.usedRootDisk = usedRootDisk;
    }

    public String getFreeRootDisk() {
        return freeRootDisk;
    }

    public void setFreeRootDisk(String freeRootDisk) {
        this.freeRootDisk = freeRootDisk;
    }
}
