package pl.krepec.service.dto;


public class DeliveryTypeDTO {

    private Long deliveryTypeId;

    private String deliveryType;

    public Long getDeliveryTypeId() {

        return deliveryTypeId;
    }

    public void setDeliveryTypeId(Long deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public DeliveryTypeDTO(Long delivery_TypeId, String delivery_Type) {
        this.deliveryTypeId = delivery_TypeId;
        this.deliveryType = delivery_Type;
    }

    public DeliveryTypeDTO() {
    }

    @Override
    public String toString() {
        return "Id typu naprawy: " + deliveryTypeId + " Typ naprawy: " + deliveryType;
    }
}


