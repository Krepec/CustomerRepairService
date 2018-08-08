package pl.krepec.service.repository.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parts")
public class Part {

    @Id
    @GeneratedValue
    @Column(name = "PartID")
    private Long partId;
    
    @Column(name = "Part_typeID")
    private Long partTypeId;

    @Column(name = "Part_name")
    private String partName;

    @Column(name = "Price")
    private Double price;

    @OneToMany(mappedBy="part")
    private List<Repair> repairs;

    @ManyToOne

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public Long getPartTypeId() {
        return partTypeId;
    }

    public void setPartTypeId(Long partTypeId) {
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

    public Part(Long partId, Long partTypeId, String partTypeName, Double price) {
        this.partId = partId;
        this.partTypeId = partTypeId;
        this.partName = partTypeName;
        this.price = price;
    }

    public Part() {
    }
}


// dodac rodzaj czesci - oryginal/zamiennik, nowa/uzywana