package pl.krepec.service.dto;

public class PartTypeDTO {


    private Integer partTypeId;

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

    public PartTypeDTO(Integer partTypeId, String type) {
        this.partTypeId = partTypeId;
        this.type = type;
    }

    public PartTypeDTO() {
    }
}
