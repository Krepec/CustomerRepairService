package pl.krepec.service.model;

public class PartDTO {


    private Integer partTypeId;

    private String partName;

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

    public PartDTO(Integer partTypeId, String partTypeName, Double price) {
        this.partTypeId = partTypeId;
        this.partName = partTypeName;
        this.price = price;
    }

    public PartDTO() {
    }
}