package pl.krepec.service.controller;

import ch.qos.logback.core.layout.EchoLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.CustomerService;
import pl.krepec.service.dto.CustomerDTO;
import pl.krepec.service.repository.model.Customer;

import java.util.List;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/{Id}")
    public CustomerDTO findById(@PathVariable("Id") Long customerId) {
        return customerService.fingById(customerId);

    }

    @GetMapping("/customers")
    public Iterable<CustomerDTO> find(
            @RequestParam(required = false, value = "name") String name,
            @RequestParam(required = false, value = "surname") String surname,
            @RequestParam(required = false, value = "phone1") String phoneNumber1,
            @RequestParam(required = false, value = "phone2") String phoneNumber2,
            @RequestParam(required = false, value = "city") String city) {
        return customerService.find(name, surname, phoneNumber1, phoneNumber2, city);

    }


    @PostMapping(value = "/customers", consumes = "application/json")
    public Customer addCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.addNewCustomer(customerDTO);
    }


}
// ma poziomie kontrolera nie powinno byc zadnych wywołan do bazy danych


// METHOD USED BEFORE REFACTORING


/*  @GetMapping("/customers/")
    public Iterable<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();

    }

     @GetMapping("findbynameandsurname")
    public Iterable<CustomerDTO> findByNameAndSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return customerService.findByNameAndSurname(name, surname);
    }

    @GetMapping("/findbyphone1")
    public Iterable<CustomerDTO> findByPhoneNumber1(@RequestParam("phone1") String phoneNumber1) {
        return customerService.findByPhoneNumber1(phoneNumber1);
    }

    @GetMapping("/findbyphone2")
    public Iterable<CustomerDTO> findByPhoneNumber2(@RequestParam("phone2") String phoneNumber2) {
        return customerService.findByPhoneNumber2(phoneNumber2);
    }

    @GetMapping("/findbynameandcity")
    public Iterable<CustomerDTO> findByNameAndCity(@RequestParam("name") String name, @RequestParam("city") String city) {
        return customerService.findByNameAndCity(name, city);
    }*/
