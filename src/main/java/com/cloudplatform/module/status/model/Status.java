package com.cloudplatform.module.status.model;

import com.cloudplatform.core.model.BaseModelID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "DEVICE_STATUS")
public class Status extends BaseModelID<Integer> {

    private static final long serialVersionUID = -2573763017488910282L;

    private String totalRootDisk;
    private String usedRootDisk;
    private String freeRootDisk;

    private String totalMemory;
    private String usedMemory;
    private String freeMemory;


    @Column(name = "STATUS_RD_TOTAL", length = 100)
    public String getTotalRootDisk() {
        return totalRootDisk;
    }

    public void setTotalRootDisk(String totalRootDisk) {
        this.totalRootDisk = totalRootDisk;
    }

    @Column(name = "STATUS_RD_USED", length = 100)
    public String getUsedRootDisk() {
        return usedRootDisk;
    }

    public void setUsedRootDisk(String usedRootDisk) {
        this.usedRootDisk = usedRootDisk;
    }

    @Column(name = "STATUS_RD_FREE", length = 100)
    public String getFreeRootDisk() {
        return freeRootDisk;
    }

    public void setFreeRootDisk(String freeRootDisk) {
        this.freeRootDisk = freeRootDisk;
    }

    @Column(name = "STATUS_M_TOTAL", length = 100)
    public String getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(String totalMemory) {
        this.totalMemory = totalMemory;
    }

    @Column(name = "STATUS_M_USED", length = 100)
    public String getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(String usedMemory) {
        this.usedMemory = usedMemory;
    }

    @Column(name = "STATUS_M_FREE", length = 100)
    public String getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(String freeMemory) {
        this.freeMemory = freeMemory;
    }


}
