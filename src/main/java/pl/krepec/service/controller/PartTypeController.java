package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.PartTypeService;
import pl.krepec.service.dto.PartTypeDTO;
import pl.krepec.service.repository.model.PartType;

import java.util.List;

@RestController
@RequestMapping("/parttypes")
public class PartTypeController {

    @Autowired
    private
    PartTypeService partTypeService;

    @RequestMapping("/parttypes")
    public List<PartTypeDTO> getAllPartTypes() {
        return partTypeService.getAllPartTypes();
    }

    @RequestMapping("/{id}")
    public PartTypeDTO findById(@PathVariable("id") Long partTypeId) {
        return partTypeService.findById(partTypeId);
    }


    @PostMapping("/parttypes")
    public PartType addNewPartType(@RequestBody PartTypeDTO partTypeDTO) {
        return partTypeService.addNewPartType(partTypeDTO);
    }


}



