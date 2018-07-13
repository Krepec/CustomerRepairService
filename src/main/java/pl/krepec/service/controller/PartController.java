package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.PartService;
import pl.krepec.service.dto.PartDTO;

@RestController
@RequestMapping("/parts")
public class PartController {

    @Autowired
    private PartService partService;

    @GetMapping("/parts")
    public Iterable<PartDTO> getAllParts() {
        return partService.getAllParts();
    }

    @GetMapping("/parts/")
    public Iterable<PartDTO> findByPartName(@RequestParam ("partname") String partName) {
        return partService.getByPartName(partName);
    }

    @PostMapping(value = "parts", consumes = "application/json")
    public Integer addPart(@RequestBody PartDTO partDTO) {
        return partService.addNewPart(partDTO);
    }

}
