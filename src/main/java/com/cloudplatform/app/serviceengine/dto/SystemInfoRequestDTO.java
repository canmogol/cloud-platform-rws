package com.cloudplatform.app.serviceengine.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SystemInfoRequestDTO {

    private String requestUUID;
    private StatusDTO statusDTO;

    public String getRequestUUID() {
        return requestUUID;
    }

    public void setRequestUUID(String requestUUID) {
        this.requestUUID = requestUUID;
    }

    public StatusDTO getStatusDTO() {
        return statusDTO;
    }

    public void setStatusDTO(StatusDTO statusDTO) {
        this.statusDTO = statusDTO;
    }
}
