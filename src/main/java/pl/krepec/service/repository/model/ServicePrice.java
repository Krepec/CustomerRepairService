package pl.krepec.service.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "services")
public class ServicePrice {

    @Id
    @GeneratedValue
    @Column(name = "Service_priceID")
    private Long servicePriceId;

    @Column(name = "Service_level")
    private String serviceLevel;

    @Column(name = "Service_name")
    private String serviceName;

    @Column(name = "Service_price")
    private Double servicePrice;

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public Long getServicePriceId() {
        return servicePriceId;
    }

    public void setServicePriceId(Long servicePriceId) {
        this.servicePriceId = servicePriceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public ServicePrice(Long servicePriceId, String serviceLevel, String serviceName, Double servicePrice) {
        this.servicePriceId = servicePriceId;
        this.serviceLevel = serviceLevel;
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    @Override
    public String toString() {
        return "ID ceny naprawy: " + servicePriceId + " Lewel naprawy; " + serviceLevel + " Naprawa: " + serviceName + " Cena naprawy: " + servicePrice;
    }


}

