package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.RepairTypeService;
import pl.krepec.service.dto.RepairTypeDTO;

import java.util.List;

@RestController
@RequestMapping("/repairtypes")
public class RepairTypeController {

    @Autowired
   private RepairTypeService repairTypeService;


    @RequestMapping("/repairtypes")
    public List<RepairTypeDTO> getAllRepairTypes(){
       return repairTypeService.getAllRepairTypes();
    }

    @RequestMapping("/{id}")
    public RepairTypeDTO findById(@PathVariable ("id") Long repairTypeId){
        return repairTypeService.findById(repairTypeId);
    }

    @PostMapping("/repairtypes")
    public Integer addNewRepairType (@RequestBody RepairTypeDTO repairTypeDTO){
        return repairTypeService.addNewRepairType(repairTypeDTO);
    }







}
