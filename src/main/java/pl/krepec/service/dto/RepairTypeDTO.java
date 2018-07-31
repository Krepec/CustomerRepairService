package pl.krepec.service.dto;

public class RepairTypeDTO {

    private Integer repairTypeId;

    private String repairTypeName;

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

    public RepairTypeDTO(Integer repairTypeId, String repairTypeName) {
        this.repairTypeId = repairTypeId;
        this.repairTypeName = repairTypeName;
    }

    public RepairTypeDTO() {
    }
}
