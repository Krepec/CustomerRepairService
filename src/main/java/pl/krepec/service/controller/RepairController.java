package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.krepec.service.RepairService;
import pl.krepec.service.dto.RepairDTO;

import java.util.List;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    @Autowired
    private RepairService repairService;

    @RequestMapping("/repairs")
    public List<RepairDTO> getAllRepairs(){
        return repairService.getAllCustomers();
    }

    @PostMapping(value = "/repairs", consumes = "application/json")
    public Integer addNewRepair(@RequestBody RepairDTO repairDTO){
        return repairService.addNewRepair(repairDTO);
    }

}

