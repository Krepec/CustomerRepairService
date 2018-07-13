package pl.krepec.service;

import pl.krepec.service.dto.RepairDTO;
import pl.krepec.service.repository.model.Repair;

public class RepairService {


    public RepairDTO mapRepair(Repair repair){
        return new RepairDTO(repair.getRepairId(),repair.getDeviceId(),repair.getCustomerId(),repair.getTechnicianId(),
                repair.getPartId(),repair.getStatusId(),repair.getRepairTypeId(), repair.getDeliveryTypeId(),
                repair.getStartDate(), repair.getEndDate(), repair.getPurchaseDate(),repair.getIssueDescribe(), repair.getComments());
    }

}
