package pl.krepec.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RepairDTO {
    private Long repairId;

    private Long deviceId;

    private Long customerId;

    private Long technicianId;

    private Long partId;

    private Long statusId;

    private Long repairTypeId;

    private Long deliveryTypeId;

    private Date startDate;

    private Date endDate;

    private Date purchaseDate;

    private String issueDescribe;

    private String comments;


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

    public RepairDTO() {
    }

    public RepairDTO(Long repairId, Long deviceId, Long customerId, Long technicianId, Long partId, Long statusId,
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



}
