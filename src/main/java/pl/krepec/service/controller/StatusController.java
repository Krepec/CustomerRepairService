package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.StatusService;
import pl.krepec.service.dto.StatusDTO;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private
    StatusService statusService;

    @GetMapping("/status")
    public Iterable<StatusDTO> getAllStatuses() {
        return statusService.getAllStatuses();
    }

    @GetMapping("/[id]")
    public StatusDTO findById(@PathVariable ("id") Long statusId){
        return  statusService.findById(statusId);
    }

    @PostMapping(value = "/status", consumes = "application/json")
    public Integer addStatus(@RequestBody StatusDTO statusDTO){
        return statusService.addNewStatus(statusDTO);
    }

}
