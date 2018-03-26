package pl.service.model;

import javax.persistence.*;

@Entity
@Table(name = "Status")
public class Status {

    @Id
    @GeneratedValue
    private Integer statusId;

    @Column(name = "Status")
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

    public Status(Integer statusId, String status) {
        this.statusId = statusId;
        this.status = status;
    }

    public Status() {
    }
}
