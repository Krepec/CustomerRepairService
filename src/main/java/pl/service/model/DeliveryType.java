package pl.service.model;

import javax.persistence.*;

@Entity
@Table(name = "Delivery_type")
public class DeliveryType {

    @Id
    @GeneratedValue
    @Column(name = "Delivery_typeID")
    private Integer delivetyTypeId;

    @Column(name = "Delivery")
    private String deliveryType;

    public Integer getDelivetyTypeId() {

        return delivetyTypeId;
    }

    public void setDelivetyTypeId(Integer delivetyTypeId) {
        this.delivetyTypeId = delivetyTypeId;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public DeliveryType(Integer delivetyTypeId, String deliveryType) {
        this.delivetyTypeId = delivetyTypeId;
        this.deliveryType = deliveryType;
    }

    public DeliveryType() {
    }
}
