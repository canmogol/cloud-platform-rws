package com.cloudplatform.app.serviceengine.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SystemInfoResponseDTO {

    private String responseUUID;
    private StatusResponseDTO statusResponseDTO;
    private LatestVersionDTO latestVersionDTO;

    public String getResponseUUID() {
        return responseUUID;
    }

    public void setResponseUUID(String responseUUID) {
        this.responseUUID = responseUUID;
    }

    public void setStatusResponseDTO(StatusResponseDTO statusResponseDTO) {
        this.statusResponseDTO = statusResponseDTO;
    }

    public StatusResponseDTO getStatusResponseDTO() {
        return statusResponseDTO;
    }

    public void setLatestVersionDTO(LatestVersionDTO latestVersionDTO) {
        this.latestVersionDTO = latestVersionDTO;
    }

    public LatestVersionDTO getLatestVersionDTO() {
        return latestVersionDTO;
    }
}
