package pl.krepec.service.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "delivery_type")
public class DeliveryType {

    @Id
    @GeneratedValue
    @Column(name = "Delivery_typeID")
    private Long deliveryTypeId;

    @Column(name = "Delivery")
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

    public DeliveryType(Long delivery_TypeId, String delivery_Type) {
        this.deliveryTypeId = delivery_TypeId;
        this.deliveryType = delivery_Type;
    }

    public DeliveryType() {
    }

    @Override
    public String toString() {
        return "Id typu naprawy: " + deliveryTypeId + " Typ naprawy: " + deliveryType;
    }
}
