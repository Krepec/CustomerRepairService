package pl.krepec.service.dto;

public class ServicePriceDTO {

    private Long servicePriceId;

    private String serviceName;

    private String serviceLevel;

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

    public ServicePriceDTO(Long servicePriceId, String serviceLevel, String serviceName, Double servicePrice) {
        this.servicePriceId = servicePriceId;
        this.serviceLevel = serviceLevel;
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }
}