package pl.krepec.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.krepec.service.ServicePriceService;
import pl.krepec.service.repository.ServicePriceRepository;

@RestController
@RequestMapping("/serviceprice")
public class ServicePriceController {

    @Autowired
    ServicePriceService serviceService;



}
