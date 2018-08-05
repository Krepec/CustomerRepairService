package pl.krepec.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RepairDTO {
    private Integer repairId;

    private Integer deviceId;

    private Integer customerId;

    private Integer technicianId;

    private Integer partId;

    private Integer statusId;

    private Integer repairTypeId;

    private Integer deliveryTypeId;

    @JsonFormat(pattern="dd.MM.yyyy")
    private Date startDate;

    @JsonFormat(pattern="dd.MM.yyyy")
    private Date endDate;

    @JsonFormat(pattern="dd.MM.yyyy")
    private Date purchaseDate;

    private String issueDescribe;

    private String comments;


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
        this.deliveryTypeId = deliveryTypeId;
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

    public RepairDTO() {
    }

    public RepairDTO(Integer repairId, Integer deviceId, Integer customerId, Integer technicianId, Integer partId, Integer statusId,
                     Integer repairTypeId, Integer deliveryTypeId, Date startDate, Date endDate, Date purchaseDate, String issueDescribe, String comments) {

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



}
