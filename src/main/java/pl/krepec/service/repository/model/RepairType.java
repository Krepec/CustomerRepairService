package pl.krepec.service.repository.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "repair_type")
public class RepairType {


    @Id
    @GeneratedValue
    @Column(name = "Repair_typeID")
    private Integer repairTypeId;

    @Column(name = "Repair_type_name")
    private String repairTypeName;

    @OneToMany(mappedBy = "repairType")
    public List<Repair> repairs;

    public Integer getRepairTypeId() {
        return repairTypeId;
    }

    public void setRepairTypeId(Integer repairTypeId) {
        this.repairTypeId = repairTypeId;
    }

    public String getRepairTypeName() {
        return repairTypeName;
    }

    public void setRepairTypeName(String repairTypeName) {
        this.repairTypeName = repairTypeName;
    }

    public RepairType(Integer repairTypeId, String repairTypeName) {
        this.repairTypeId = repairTypeId;
        this.repairTypeName = repairTypeName;
    }

    public RepairType() {
    }
}
