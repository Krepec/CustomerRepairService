package pl.krepec.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.ServicePriceService;
import pl.krepec.service.dto.ServicePriceDTO;
import pl.krepec.service.repository.model.ServicePrice;

import java.util.List;

@RestController
@RequestMapping("/serviceprices")
public class ServicePriceController {

    @Autowired
    private ServicePriceService servicePriceService;

@RequestMapping("/serviceprices")
public List<ServicePriceDTO> getAllServicePrice(){
    return servicePriceService.getAllServices();
}

@RequestMapping("/{servicepriceid}")
    public ServicePriceDTO findByServicePriceId(@PathVariable Long servicePriceId){
    return servicePriceService.findByServicePriceId(servicePriceId);
    }


    @PostMapping("/serviceprices")
    public ServicePrice addNewServicePrice(@RequestBody ServicePriceDTO servicePriceDTO ){
    return servicePriceService.addNewServicePrice(servicePriceDTO);
}
}
