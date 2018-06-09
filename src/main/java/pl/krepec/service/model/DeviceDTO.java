package pl.krepec.service.model;

public class DeviceDTO {

    private Integer deviceId;

    private String mark;

    private String model;

    private String serialNumber;

    private Long imei;

    private String comments;

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setImei(Long imei) {
        this.imei = imei;
    }

    public Long getImei() {
        return imei;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public DeviceDTO(Integer deviceId, String mark, String model, String serialNumber, Long imei, String comments) {
        this.deviceId = deviceId;
        this.mark = mark;
        this.model = model;
        this.serialNumber = serialNumber;
        this.imei = imei;
        this.comments = comments;
    }

    public DeviceDTO() {}
}
