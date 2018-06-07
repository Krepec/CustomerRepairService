package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.DeliveryTypeService;
import pl.krepec.service.model.DeliveryTypeDTO;

@RestController
@RequestMapping("/delivery")
public class DeliveryTypeController {

    @Autowired
    private DeliveryTypeService deliveryTypeService;

    @GetMapping("/deliverytypes")
    public Iterable<DeliveryTypeDTO> getAllDeliveryTypes() {
        return deliveryTypeService.getAllDeliteryTypes();
    }

    @PostMapping(value = "deliverytypes", consumes = "application/json")
    public Integer addDeliveryType(@RequestBody DeliveryTypeDTO deliveryTypeDTO) {
        return deliveryTypeService.addNewDelivertyType(deliveryTypeDTO);
    }

}
