package com.cloudplatform.app.status.model;

import com.cloudplatform.core.model.BaseModelID;

import javax.persistence.*;


@Entity
@Table(name = "DEVICE_STATUS")
@NamedQueries(
        @NamedQuery(name = "FIND_BY_DEVICE_ID", query = "select s from Status s where s.deviceId = :deviceId")
)
public class Status extends BaseModelID<Integer> {

    private static final long serialVersionUID = -2573763017488910282L;

    public static final String QUERY_FIND_BY_DEVICE_ID = "FIND_BY_DEVICE_ID";

    private Integer deviceId;

    private String totalRootDisk;
    private String usedRootDisk;
    private String freeRootDisk;

    private String totalMemory;
    private String usedMemory;
    private String freeMemory;

    @Column(name = "STATUS_DEVICE_ID", unique = true)
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

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
