package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.TechnicianService;
import pl.krepec.service.dto.TechnicianDTO;
import pl.krepec.service.repository.model.Technician;

import java.util.List;

@RestController
@RequestMapping("/technicians")
public class TechnicianController {

    @Autowired
    TechnicianService technicianService;


    @RequestMapping("/technicians")
    public List<TechnicianDTO> getAllTechnicians(){
        return technicianService.getAllTechnicians();
    }

    @RequestMapping("/{id}")
    public TechnicianDTO findById(@PathVariable("id") Long technicianId){
        return technicianService.findById(technicianId);
    }

    @PostMapping("/technicians")
    public Technician addTechnician(@RequestBody TechnicianDTO technicianDTO){
        return technicianService.addNewTechnician(technicianDTO);
    }

}
