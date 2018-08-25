package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.PartTypeDTO;
import pl.krepec.service.repository.PartTypeRepository;
import pl.krepec.service.repository.model.PartType;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartTypeService {

    @Autowired
    private
    PartTypeRepository partTypeRepository;

    private PartTypeDTO mapPartTypes(PartType partType){
        return new PartTypeDTO(partType.getPartTypeId(),partType.getType());
    }


    public List<PartTypeDTO> getAllPartTypes(){
        List<PartTypeDTO> partTypeDTOList = new ArrayList<>();
        Iterable<PartType> partTypeList= partTypeRepository.findAll();

        for (PartType partType : partTypeList){
            PartTypeDTO partTypeDTO = mapPartTypes(partType);
            partTypeDTOList.add(partTypeDTO);
        }

        return partTypeDTOList;
    }

    public PartTypeDTO findById(Long partTypeId){
       PartType partType =  partTypeRepository.findOne(partTypeId);
       return mapPartTypes(partType);
    }

    public PartType addNewPartType(PartTypeDTO partTypeDTO){
        PartType partType = partTypeRepository.save(new PartType(partTypeDTO.getPartTypeId(),partTypeDTO.getType()));
        return partType;
    }
}
