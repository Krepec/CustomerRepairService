package pl.krepec.service.repository.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parts")
public class Part {

    @Id
    @GeneratedValue
    @Column(name = "Part_typeID")
    private Integer partTypeId;

    @Column(name = "Part_name")
    private String partName;

    @Column(name = "Price")
    private Double price;


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

    public Part(Integer partTypeId, String partTypeName, Double price) {
        this.partTypeId = partTypeId;
        this.partName = partTypeName;
        this.price = price;
    }

    public Part() {
    }
}


// dodac rodzaj czesci - oryginal/zamiennik, nowa/uzywana