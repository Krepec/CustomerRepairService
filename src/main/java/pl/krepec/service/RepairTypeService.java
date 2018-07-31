package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.RepairTypeDTO;
import pl.krepec.service.repository.RepairTypeRepository;
import pl.krepec.service.repository.model.RepairType;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepairTypeService {

    @Autowired
    private RepairTypeRepository repairTypeRepository;

    private RepairTypeDTO mapRepairType(RepairType repairType){
        return new RepairTypeDTO(repairType.getRepairTypeId(),repairType.getRepairTypeName());
    }

    public List<RepairTypeDTO> getAllRepairTypes(){
       List<RepairTypeDTO> repairTypeDTOList = new ArrayList<>();
       Iterable<RepairType> repairTypeList =  repairTypeRepository.findAll();

       for (RepairType repairType : repairTypeList){
           RepairTypeDTO repairTypeDTO = mapRepairType(repairType);
           repairTypeDTOList.add(repairTypeDTO);

       }
      return repairTypeDTOList;
    }

    public RepairTypeDTO findById(Long repairTypeId){
        RepairType repairType = repairTypeRepository.findOne(repairTypeId);
        return mapRepairType(repairType);
    }

    public Integer addNewRepairType(RepairTypeDTO repairTypeDTO){
       RepairType repairType =  repairTypeRepository.save(new RepairType(repairTypeDTO.getRepairTypeId(),repairTypeDTO.getRepairTypeName()));
       return repairType.getRepairTypeId();
    }
}
