package pl.krepec.service.dto;

public class StatusDTO {

    private Integer statusId;
    private String status;

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StatusDTO(Integer statusId, String status) {
        this.statusId = statusId;
        this.status = status;
    }

    public StatusDTO() {
    }
}
