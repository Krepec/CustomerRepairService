package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.model.PartDTO;
import pl.krepec.service.repository.PartRepository;
import pl.krepec.service.repository.model.Part;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartService {

    @Autowired
    private PartRepository partsRepository;


    private PartDTO mapPart(Part part) {
        PartDTO partDTO = new PartDTO(part.getPartTypeId(), part.getPartName(), part.getPrice());
        return partDTO;
    }


    public Iterable<PartDTO> getAllParts() {
        List<PartDTO> partDTOList = new ArrayList<PartDTO>();
        Iterable<Part> partList = partsRepository.findAll();

        for (Part part : partList) {
            PartDTO partDTO = mapPart(part);
            partDTOList.add(partDTO);
        }
        return partDTOList;
    }

    public Iterable<PartDTO> getByPartName(String partName) {
        List<PartDTO> partDTOList = new ArrayList<PartDTO>();
        Iterable<Part> partList = partsRepository.findByPartName(partName);

        for (Part part : partList) {
            PartDTO partDTO = mapPart(part);
            partDTOList.add(partDTO);
        }
        return partDTOList;
    }

    public Integer addNewPart(PartDTO partDTO) {
        Part part = partsRepository.save(new Part(partDTO.getPartTypeId(), partDTO.getPartName(), partDTO.getPrice()));
        return part.getPartTypeId();
    }


}
