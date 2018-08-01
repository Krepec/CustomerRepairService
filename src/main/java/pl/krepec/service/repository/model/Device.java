package pl.krepec.service.repository.model;

import javax.persistence.*;
import java.util.List;

// zmienic typ w bazie danych
@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue
    @Column(name = "DeviceID")
    private Integer deviceId;

    @Column(name = "Mark")
    private String mark;

    @Column(name = "Model")
    private String model;

    @Column(name = "Serial_number")
    private String serialNumber;

    @Column(name = "Imei")
    private Long imei;

    @Column(name = "Comments")
    private String comments;

    @OneToMany(fetch=FetchType.LAZY, mappedBy="device")
    private List<Repair> repairs;

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

    public Device(Integer deviceId, String mark, String model, String serialNumber, Long imei, String comments) {
        this.deviceId = deviceId;
        this.mark = mark;
        this.model = model;
        this.serialNumber = serialNumber;
        this.imei = imei;
        this.comments = comments;
    }

    public Device() {}
}
