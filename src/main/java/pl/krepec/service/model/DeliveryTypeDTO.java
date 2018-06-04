package pl.krepec.service.model;


public class DeliveryTypeDTO {

    private Integer deliveryTypeId;

    private String deliveryType;

    public Integer getDeliveryTypeId() {

        return deliveryTypeId;
    }

    public void setDeliveryTypeId(Integer deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public DeliveryTypeDTO(Integer delivery_TypeId, String delivery_Type) {
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


