package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.DeviceService;
import pl.krepec.service.dto.DeviceDTO;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("/devices")
    public Iterable<DeviceDTO> find(@RequestParam(required = false, value = "serialnumber") String serialNumer,
                                    @RequestParam(required = false, value = "imei") Long imei,
                                    @RequestParam(required = false, value = "model") String model,
                                    @RequestParam(required = false, value = "mark") String mark) {
        return deviceService.find(serialNumer, imei, model, mark);
    }

    @PostMapping(value = "/devices", consumes = "application/json")
    public Integer addDevice(@RequestBody DeviceDTO deviceDTO) {
        return deviceService.addNewDevice(deviceDTO);
    }

}

  // METHOD USED BEFORE REFACTORING


  /*  @GetMapping("/devices")
    public Iterable<DeviceDTO> findAllDevices() {
        return deviceService.getAllDevices();
    }

    @GetMapping("/findbysn")
    public Iterable<DeviceDTO> findBySerialNumber(@RequestParam String serialNumber) {
        return deviceService.findBySerialNumber(serialNumber);
    }

    @GetMapping("/findbyimei")
    public Iterable<DeviceDTO> findByImei(@RequestParam Long imei) {
        return deviceService.findByImei(imei);
    }

    @GetMapping("/findbymodel")
    public Iterable<DeviceDTO> findByModel(@RequestParam String model) {
        return deviceService.findByModel(model);
    }

    @GetMapping("/findbymark")
    public Iterable<DeviceDTO> findByMark(@RequestParam String mark) {
        return deviceService.findByMark(mark);
    }*/


