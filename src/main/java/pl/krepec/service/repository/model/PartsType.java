package pl.krepec.service.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "parts_type")
public class PartsType {

    @Id
    @GeneratedValue
    @Column(name = "Part_typeID")
    private Integer partTypeId;

    @Column(name = "Type")
    private String type;

    public Integer getPartTypeId() {
        return partTypeId;
    }

    public void setPartTypeId(Integer partTypeId) {
        this.partTypeId = partTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PartsType(Integer partTypeId, String type) {
        this.partTypeId = partTypeId;
        this.type = type;
    }

    public PartsType() {
    }
}
