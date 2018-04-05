package pl.service.model;

import javax.persistence.*;

@Entity
@Table(name = "parts")
public class Parts {

    @Id
    @GeneratedValue
    @Column(name = "RepairID")
    private Integer repairId;

    @Column(name = "Part_typeID")
    private Integer partTypeId;

    @Column(name = "Part_name")
    private String partName;

    @Column(name = "Price")
    private Double price;

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public Integer getRepairId() {
        return repairId;
    }


    public Integer getPartTypeId() {
        return partTypeId;
    }

    public void setPartTypeId(Integer partTypeId) {
        this.partTypeId = partTypeId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Parts(Integer repairId, Integer partTypeId, String partTypeName, Double price) {
        this.repairId = repairId;
        this.partTypeId = partTypeId;
        this.partName = partTypeName;
        this.price = price;
    }

    public Parts() {
    }
}


