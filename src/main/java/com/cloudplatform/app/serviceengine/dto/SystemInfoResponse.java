package com.cloudplatform.app.serviceengine.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SystemInfoResponse {
    private StatusResponse statusResponse;
    private LatestVersion latestVersion;

    public void setStatusResponse(StatusResponse statusResponse) {
        this.statusResponse = statusResponse;
    }

    public StatusResponse getStatusResponse() {
        return statusResponse;
    }

    public void setLatestVersion(LatestVersion latestVersion) {
        this.latestVersion = latestVersion;
    }

    public LatestVersion getLatestVersion() {
        return latestVersion;
    }
}
