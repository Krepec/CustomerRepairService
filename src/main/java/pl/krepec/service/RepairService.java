package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.RepairDTO;
import pl.krepec.service.repository.RepairRepository;
import pl.krepec.service.repository.model.Repair;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepairService {

    @Autowired
    RepairRepository repairRepository;

    public RepairDTO mapRepair(Repair repair){
        return new RepairDTO(repair.getRepairId(),repair.getDeviceId(),repair.getCustomerId(),repair.getTechnicianId(),
                repair.getPartId(),repair.getStatusId(),repair.getRepairTypeId(), repair.getDeliveryTypeId(),
                repair.getStartDate(), repair.getEndDate(), repair.getPurchaseDate(),repair.getIssueDescribe(), repair.getComments());
    }


    public List<RepairDTO> getAllCustomers(){
        List<RepairDTO> repairDTOList = new ArrayList<>();
        Iterable<Repair> repairList = repairRepository.findAll();
        for (Repair repair : repairList){
           RepairDTO repairDTO =  mapRepair(repair);
            repairDTOList.add(repairDTO);
        }
        return repairDTOList;
    }

    public Integer addNewRepair(RepairDTO repairDTO){
        Repair repair =repairRepository.save(new Repair(repairDTO.getRepairId(),repairDTO.getDeviceId(),repairDTO.getCustomerId(),
                repairDTO.getTechnicianId(),repairDTO.getPartId(),repairDTO.getStatusId(),repairDTO.getRepairTypeId(),
                repairDTO.getDeliveryTypeId(),repairDTO.getStartDate(),repairDTO.getEndDate(),repairDTO.getPurchaseDate(),
                repairDTO.getIssueDescribe(),repairDTO.getComments()));
        return repair.getRepairId();
    }

}
