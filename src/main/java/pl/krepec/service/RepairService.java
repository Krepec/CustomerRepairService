package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.RepairDTO;
import pl.krepec.service.repository.RepairCriteriaRepository;
import pl.krepec.service.repository.RepairRepository;
import pl.krepec.service.repository.model.Repair;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

@Service
public class RepairService {

    @Autowired
    private RepairRepository repairRepository;
    @Autowired
    private RepairCriteriaRepository repairCriteriaRepository;

    private RepairDTO mapRepair(Repair repair) {
        return new RepairDTO(repair.getRepairId(), repair.getDeviceId(), repair.getCustomerId(), repair.getTechnicianId(),
                repair.getPartId(), repair.getStatusId(), repair.getRepairTypeId(), repair.getDeliveryTypeId(),
                repair.getStartDate(), repair.getEndDate(), repair.getPurchaseDate(), repair.getIssueDescribe(), repair.getComments());
    }


    public List<RepairDTO> getAllRepairs() {
        List<RepairDTO> repairDTOList = new ArrayList<>();
        Iterable<Repair> repairList = repairRepository.findAll();
        for (Repair repair : repairList) {
            RepairDTO repairDTO = mapRepair(repair);
            repairDTOList.add(repairDTO);
        }
        return repairDTOList;
    }

    public RepairDTO findByRepairId(Long repairId) {
        Repair repair = repairRepository.findOne(repairId);
        return mapRepair(repair);

    }


    public List<Repair> findRepairsByCustomerInfo(Integer customerId, String name, String surname, String phoneNumber1, String email) throws InputMismatchException {
        return repairCriteriaRepository.findRepairsByCustomerInfo(customerId, name, surname, phoneNumber1, email);
    }

    public List<Repair> findRepairsByDeviceInfo(Integer deviceId, String imei, String serialNumber) throws InputMismatchException {
        return repairCriteriaRepository.findRepairsByDeviceInfo(deviceId, imei, serialNumber);
    }

    public List<Repair> findRepairsByTechnicianInfo(Integer technicianId) throws InputMismatchException {
        return repairCriteriaRepository.findRepairsByTechnicianInfo(technicianId);
    }


    public Integer addNewRepair(RepairDTO repairDTO) {
        Repair repair = repairRepository.save(new Repair(repairDTO.getRepairId(), repairDTO.getDeviceId(), repairDTO.getCustomerId(),
                repairDTO.getTechnicianId(), repairDTO.getPartId(), repairDTO.getStatusId(), repairDTO.getRepairTypeId(),
                repairDTO.getDeliveryTypeId(), repairDTO.getStartDate(), repairDTO.getEndDate(), repairDTO.getPurchaseDate(),
                repairDTO.getIssueDescribe(), repairDTO.getComments()));
        return repair.getRepairId();
    }


}
