package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.DeliveryTypeService;
import pl.krepec.service.dto.DeliveryTypeDTO;
import pl.krepec.service.repository.model.DeliveryType;

@RestController
@RequestMapping("/deliverytypes")
public class DeliveryTypeController {

    @Autowired
    private DeliveryTypeService deliveryTypeService;

    @GetMapping("/{id}")
    public DeliveryTypeDTO getDeliveryTypeById(@PathVariable("id") Long deliveryTypeId) {
       return deliveryTypeService.findById(deliveryTypeId);
    }

    @GetMapping("/deliverytypes")
    public Iterable<DeliveryTypeDTO> getAllDeliveryTypes() {
       return deliveryTypeService.getAllDeliteryTypes();
    }

    @PostMapping(value = "/deliverytypes", consumes = "application/json")
    public DeliveryType addDeliveryType(@RequestBody DeliveryTypeDTO deliveryTypeDTO) {
        return deliveryTypeService.addNewDelivertyType(deliveryTypeDTO);
    }

}
