package pl.service.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/all")
    public String getAll() {
        return String.valueOf(customerRepository.findAll());

    }

    @GetMapping("/findbyid")
    public String fetchDataByLastName(@RequestParam("customerid") Long customerId) {
        return  String.valueOf((customerRepository.findOne(customerId)));

    }






}

