package pl.krepec.service.repository.model;

import javax.persistence.*;
import javax.websocket.OnError;
import java.util.List;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue
    @Column(name = "StatusID")
    private Integer statusId;

    @Column(name = "StatusDTO")
    private String status;

    @OneToMany(mappedBy = "status")
    public List<Repair> repairs;

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
