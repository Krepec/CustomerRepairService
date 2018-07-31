package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.RepairService;
import pl.krepec.service.dto.RepairDTO;
import pl.krepec.service.repository.model.Repair;

import java.util.List;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    @Autowired
    private RepairService repairService;

    @RequestMapping("/repairs")
    public List<RepairDTO> getAllRepairs(){
        return repairService.getAllRepairs();
    }

    @PostMapping(value = "/repairs", consumes = "application/json")
    public Integer addNewRepair(@RequestBody RepairDTO repairDTO){
        return repairService.addNewRepair(repairDTO);
    }

    @RequestMapping("/{repairId}")
    public RepairDTO findByRepairId(@PathVariable("repairId") Long repairId) {
        return repairService.findByRepairId(repairId);
    }


    @RequestMapping("/id/{customerId}")
    public List<Repair> findCustomerRepairs(@PathVariable("customerId") Integer customerId) {
        return repairService.findCustomerRepairs(customerId);
    }

    @RequestMapping("/phone/{phone}")
    public List<Repair> findCustomerRepairs(@PathVariable("phone") String phoneNumber) {
        return repairService.findRepairsByCustomerPhoneNumber(phoneNumber);
    }




}

