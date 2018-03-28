package pl.service.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Repairs")
public class Repair {

    @Id
    @GeneratedValue
    @Column(name = "RepairID")
    private Integer repairId;

    @Column(name = "DeviceID")
    private Integer deviceId;

    @Column(name = "CustomerID")
    private Integer customerId;

    @Column(name = "TechnicianID")
    private Integer technicianId;

    @Column(name = "PartID")
    private Integer partId;

    @Column(name = "StatusID")
    private Integer statusId;

    @Column(name = "Repair_typeID")
    private Integer repairTypeId;

    @Column(name = "Delivery_typeID")
    private Integer deliveryTypeId;

    @Column(name = "Start_date")
    private Date startDate;

    @Column(name = "Purchase_date")
    private Date purchaseDate;

    @Column(name = "Comments")
    private String comments;

    @Column(name = "Issue_describe")
    private String issueDescribe;

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public Integer getRepairId() {
        return repairId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setTechnicianId(Integer technicianId) {
        this.technicianId = technicianId;
    }

    public Integer getTechnicianId() {
        return technicianId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setRepairTypeId(Integer repairTypeId) {
        this.repairTypeId = repairTypeId;
    }

    public Integer getRepairTypeId() {
        return repairTypeId;
    }

    public void setDeliveryTypeId(Integer deliveryTypeId) {
        this.deliveryTypeId = this.deliveryTypeId;
    }

    public Integer getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
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

    public Repair(Integer repairId, Integer deviceId, Integer customerId, Integer technicianId, Integer partId, Integer statusId,
                  Integer repairTypeId, Integer deliveryTypeId, Date startDate, Date purchaseDate, String comments, String issueDescribe) {

        this.repairId = repairId;
        this.deviceId = deviceId;
        this.customerId = customerId;
        this.technicianId = technicianId;
        this.partId = partId;
        this.statusId = statusId;
        this.repairTypeId = repairTypeId;
        this.deliveryTypeId = deliveryTypeId;
        this.startDate = startDate;
        this.purchaseDate = purchaseDate;
        this.comments = comments;
        this.issueDescribe = issueDescribe;

    }

    public Repair() {

    }

}
