package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.RepairService;
import pl.krepec.service.dto.RepairDTO;
import pl.krepec.service.repository.model.Repair;

import java.util.InputMismatchException;
import java.util.List;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    @Autowired
    private RepairService repairService;

    @RequestMapping("/repairs")
    public List<RepairDTO> getAllRepairs() {
        return repairService.getAllRepairs();
    }

    @PostMapping(value = "/repairs", consumes = "application/json")
    public Integer addNewRepair(@RequestBody RepairDTO repairDTO) {
        return repairService.addNewRepair(repairDTO);
    }

    @RequestMapping("/{repairId}")
    public RepairDTO findByRepairId(@PathVariable("repairId") Long repairId) {
        return repairService.findByRepairId(repairId);
    }


    @RequestMapping("/customer/")
    public List<Repair> findRepairsByCustomerInfo
            (@RequestParam(required = false, value = "customerid") Integer customerId,
             @RequestParam(required = false, value = "name") String name,
             @RequestParam(required = false, value = "surname") String surname,
             @RequestParam(required = false, value = "phone") String phoneNumber1,
             @RequestParam(required = false, value = "email") String email) throws InputMismatchException {

        return repairService.findRepairsByCustomerInfo(customerId, name, surname, phoneNumber1, email);
    }

    @RequestMapping("/device/")
    public List<Repair> findRepairsByDeviceInfo
            (@RequestParam(required = false, value = "deviceId") Integer deviceId,
             @RequestParam(required = false, value = "imei") String imei,
             @RequestParam(required = false, value = "serialnumber") String serialNumber) throws InputMismatchException {

        return repairService.findRepairsByDeviceInfo(deviceId, imei, serialNumber);
    }

    @RequestMapping("/technician/{technicianid}")
    public List<Repair> findRepairsByDeviceInfo(@PathVariable("technicianid") Integer technicianId) throws InputMismatchException {

        return repairService.findRepairsByTechnicianInfo(technicianId);
    }

    @RequestMapping("/status/")
    public List<Repair> findRepairsByStatusInfo(
            @RequestParam(required = false, value = "statusid") Integer statusId,
            @RequestParam(required = false, value = "status") String status) throws InputMismatchException {

        return repairService.findRepairsByStatusInfo(statusId, status);
    }

    @RequestMapping("/repairtype/")
    public List<Repair> findRepairsByRepairTypeInfo(
            @RequestParam(required = false, value = "repairtypeid") Integer repairTypeId,
            @RequestParam(required = false, value = "repairtypename") String repairTypeName) throws InputMismatchException {

        return repairService.findRepairsByRepairTypeInfo(repairTypeId, repairTypeName);
    }

}










/* @RequestMapping("/id/{customerId}")
     public List<Repair> findCustomerRepairs(@PathVariable("customerId") Integer customerId) {
         return repairService.findCustomerRepairs(customerId);
     }

     @RequestMapping("/phone/{phone}")
     public List<Repair> findCustomerRepairs(@PathVariable("phone") String phoneNumber) {
         return repairService.findRepairsByCustomerPhoneNumber(phoneNumber);
     }*/