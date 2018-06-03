package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.repository.model.DeliveryType;
import pl.krepec.service.repository.DeliveryTypeRepository;

@RestController
@RequestMapping("/delivery")
public class DeliveryTypeController {

    @Autowired
    private DeliveryTypeRepository deliveryTypeRepository;

    @GetMapping("/all")
    public String getAllDeliveryType() {
        return String.valueOf(deliveryTypeRepository.findAll());
    }

    @PostMapping(value = "deliverytypes", consumes = "application/json")
    public String addDeliveryType(@RequestBody DeliveryType deliveryType) {
        return String.valueOf(deliveryTypeRepository.save(new DeliveryType(deliveryType.getDeliveryTypeId(), deliveryType.getDeliveryType())));
    }

}
