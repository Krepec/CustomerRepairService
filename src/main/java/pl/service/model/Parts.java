package pl.service.model;

import javax.persistence.*;

@Entity
@Table(name = "Parts")
public class Parts {

    @Id
    @GeneratedValue
    @Column(name = "RepairID")
    private Integer repairId;

    @Column(name = "Part_typeID")
    private Integer partTypeId;

    @Column(name = "Part_type_name")
    private String partTypeName;

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

    public String getPartTypeName() {
        return partTypeName;
    }

    public void setPartTypeName(String partTypeName) {
        this.partTypeName = partTypeName;
    }

    public Parts(Integer repairId, Integer partTypeId, String partTypeName) {
        this.repairId = repairId;
        this.partTypeId = partTypeId;
        this.partTypeName = partTypeName;
    }

    public Parts() {
    }
}


