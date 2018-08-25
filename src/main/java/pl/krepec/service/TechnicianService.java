package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.TechnicianDTO;
import pl.krepec.service.repository.TechnicianRepository;
import pl.krepec.service.repository.model.Technician;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnicianService {

    @Autowired
    private
    TechnicianRepository technicianRepository;

    private TechnicianDTO mapTechnician(Technician technician) {
        TechnicianDTO technicianDTO = new TechnicianDTO(technician.getTechnicianId(), technician.getName(), technician.getSurname());
        return technicianDTO;
    }


    public List<TechnicianDTO> getAllTechnicians() {
        List<TechnicianDTO> technicianDTOList = new ArrayList<>();
        Iterable<Technician> technicianList = technicianRepository.findAll();

        for (Technician technician : technicianList) {
            TechnicianDTO technicianDTO = mapTechnician(technician);
            technicianDTOList.add(technicianDTO);
        }
        return technicianDTOList;
    }

    public TechnicianDTO findById(Long technicianId) {
        Technician technician = technicianRepository.findOne(technicianId);
        TechnicianDTO technicianDTO = mapTechnician(technician);
        return technicianDTO;
    }

    public Technician addNewTechnician(TechnicianDTO technicianDTO) {
        Technician technician = technicianRepository.save(new Technician(technicianDTO.getTechnicianId(), technicianDTO.getName(), technicianDTO.getSurname()));
        return technician;
    }
}
