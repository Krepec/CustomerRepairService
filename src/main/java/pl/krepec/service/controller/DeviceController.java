package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.krepec.service.DeviceService;
import pl.krepec.service.model.DeviceDTO;
import pl.krepec.service.repository.DeviceRepository;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    public Iterable<DeviceDTO> findBySerialNumber(@RequestParam String serialNumber){
        return deviceService.findBySerialNumber(serialNumber);
    }

    public Iterable<DeviceDTO> findByImei(@RequestParam String imei){
        return deviceService.findBySerialNumber(imei);
    }




}
