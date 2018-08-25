package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.StatusService;
import pl.krepec.service.dto.StatusDTO;
import pl.krepec.service.repository.model.Status;

@RestController
@RequestMapping("/statuses")
public class StatusController {

    @Autowired
    private
    StatusService statusService;

    @GetMapping("/statuses")
    public Iterable<StatusDTO> getAllStatuses() {
        return statusService.getAllStatuses();
    }

    @GetMapping("/{id}")
    public StatusDTO findById(@PathVariable ("id") Long statusId){
        return  statusService.findById(statusId);
    }

    @PostMapping(value = "/statuses", consumes = "application/json")
    public Status addStatus(@RequestBody StatusDTO statusDTO){
        return statusService.addNewStatus(statusDTO);
    }



}
