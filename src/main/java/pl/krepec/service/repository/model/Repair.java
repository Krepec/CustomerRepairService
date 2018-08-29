package pl.krepec.service.repository.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.criteria.ListJoin;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "repairs")
public class Repair {

    @Id
    @GeneratedValue
    @Column(name = "RepairID")
    private Long repairId;

    @Column(name = "DeviceID")
    private Long deviceId;

    @Column(name = "CustomerID")
    private Long customerId;

    @Column(name = "TechnicianID")
    private Long technicianId;

    @Column(name = "PartID")
    private Long partId;

    @Column(name = "StatusID")
    private Long statusId;

    @Column(name = "Repair_typeID")
    private Long repairTypeId;

    @Column(name = "Delivery_typeID")
    private Long deliveryTypeId;

    //ustawia w jakim formacie bedzie wyświetlona data yyyy-MM-dd
    @Temporal(TemporalType.DATE)
    @NotNull(message = "NIE WPROWADZONO DATY ROZPOCZECIA NAPRAWY")
    @Column(name = "Start_date")
    private Date startDate;

    @Column(name = "End_date")
    private Date endDate;

    @NotNull(message = "NIE WPROWADZONO DATY ZAKUPU URZADZENIA")
    @Column(name = "Purchase_date")
    private Date purchaseDate;

    @Column(name = "Issue_describe")
    private String issueDescribe;

    @Column(name = "Comments")
    private String comments;

    @ManyToOne
    @JoinColumn(name = "deviceid", insertable = false, updatable = false)
    private Device device;

    @ManyToOne
    @JoinColumn(name = "customerid", insertable = false, updatable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "technicianid", insertable = false, updatable = false)
    private Technician technician;

    @ManyToOne
    @JoinColumn(name = "statusid", insertable = false, updatable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "repair_typeid", insertable = false, updatable = false)
    private RepairType repairType;

    @ManyToOne
    @JoinColumn(name = "part", insertable = false, updatable = false)
    private Part part;

    public void setRepairId(Long repairId) {
        this.repairId = repairId;
    }

    public Long getRepairId() {
        return repairId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setTechnicianId(Long technicianId) {
        this.technicianId = technicianId;
    }

    public Long getTechnicianId() {
        return technicianId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public Long getPartId() {
        return partId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setRepairTypeId(Long repairTypeId) {
        this.repairTypeId = repairTypeId;
    }

    public Long getRepairTypeId() {
        return repairTypeId;
    }

    public void setDeliveryTypeId(Long deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    public Long getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setIssueDescribe(String issueDescribe) {
        this.issueDescribe = issueDescribe;
    }

    public String getIssueDescribe() {
        return issueDescribe;
    }

    public Repair(Long repairId, Long deviceId, Long customerId, Long technicianId, Long partId, Long statusId,
                  Long repairTypeId, Long deliveryTypeId, Date startDate, Date endDate, Date purchaseDate, String issueDescribe, String comments) {

        this.repairId = repairId;
        this.deviceId = deviceId;
        this.customerId = customerId;
        this.technicianId = technicianId;
        this.partId = partId;
        this.statusId = statusId;
        this.repairTypeId = repairTypeId;
        this.deliveryTypeId = deliveryTypeId;
        this.endDate = endDate;
        this.startDate = startDate;
        this.purchaseDate = purchaseDate;
        this.comments = comments;
        this.issueDescribe = issueDescribe;

    }

    public Repair() {

    }

    @Override
    public String toString() {
        return "Numer naprawy: " + repairId + " Status: " + status;
    }
}
