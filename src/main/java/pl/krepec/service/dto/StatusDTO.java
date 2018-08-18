package pl.krepec.service.dto;

import pl.krepec.service.repository.model.Status;

import java.util.Objects;

public class StatusDTO {

    private Long statusId;
    private String status;

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StatusDTO(Long statusId, String status) {
        this.statusId = statusId;
        this.status = status;
    }

    public StatusDTO() {
    }


    @Override
    public String toString() {
        return "StatusId: " + statusId + " status: " + status;
    }



}