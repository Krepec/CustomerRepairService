package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.krepec.service.repository.DeviceRepository;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    DeviceRepository deviceRepository;




}
