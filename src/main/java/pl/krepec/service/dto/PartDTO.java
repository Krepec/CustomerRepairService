package pl.krepec.service.dto;

public class PartDTO {

    private Long partId;
    
    private Long partTypeId;

    private String partName;

    private Double price;

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

    public PartDTO(Long partId,Long partTypeId, String partTypeName, Double price) {
        this.partId = partId;
        this.partTypeId = partTypeId;
        this.partName = partTypeName;
        this.price = price;
    }

    public PartDTO() {
    }
}