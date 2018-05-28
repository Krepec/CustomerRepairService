package pl.service.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryTypeController {

    @Autowired
    private DeliveryTypeRepository deliveryTypeRepository;

    @GetMapping("/all")
    public String getAllDeliveryType() {
        return String.valueOf(deliveryTypeRepository.findAll());
    }

    @PostMapping(value = "deliverytype", consumes = "application/json")
    public String addDeliveryType(@RequestBody DeliveryType deliveryType) {
        return String.valueOf(deliveryTypeRepository.save(new DeliveryType(deliveryType.getDeliveryTypeId(), deliveryType.getDeliveryType())));
    }

}
