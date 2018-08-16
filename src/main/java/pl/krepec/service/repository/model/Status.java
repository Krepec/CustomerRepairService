package pl.krepec.service.repository.model;

import pl.krepec.service.dto.StatusDTO;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue
    @Column(name = "StatusID")
    private Long statusId;

    @Column(name = "Status")
    private String status;

    @OneToMany(mappedBy = "status")
    public List<Repair> repairs;

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

    public Status(Long statusId, String status) {
        this.statusId = statusId;
        this.status = status;
    }

    public Status() {
    }

    @Override
    public boolean equals(Object obj) {
        Status status = (Status) obj;
        return statusId.equals(status.getStatusId()) && this.status.equals(status.getStatus());

    }
    @Override
    public int hashCode() {
        return Objects.hash(statusId, statusId);
    }

    @Override
    public String toString() {
        return "StatusId: " + statusId + " status: " + status;
    }
}

