package pl.krepec.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.krepec.service.CustomerService;
import pl.krepec.service.model.CustomerDTO;


@RestController
@RequestMapping("/service")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public Iterable<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();

   }
    @GetMapping("/findbyid")
    public CustomerDTO findById(@RequestParam("customerid") Long customerId) {
        return  customerService.fingById(customerId);

    }

    @GetMapping("/findbyname")
    public Iterable<CustomerDTO> findByName(@RequestParam("name") String name){
        return customerService.findByName(name);
    }

    @GetMapping("findbynameandsurname")
    public Iterable<CustomerDTO> findByNameAndSurname(@RequestParam("name") String name, @RequestParam("surname") String surname){
        return customerService.findByNameAndSurname(name,surname);
    }

    @GetMapping("/findbyphone1")
    public Iterable<CustomerDTO> findByPhoneNumber1(@RequestParam("phone1") String phoneNumber1){
        return customerService.findByPhoneNumber1(phoneNumber1);
    }

    @GetMapping("/findbyphone2")
    public Iterable<CustomerDTO> findByPhoneNumber2(@RequestParam("phone2") String phoneNumber2){
        return customerService.findByPhoneNumber2(phoneNumber2);
    }

    @GetMapping("/findbynameandcity")
    public Iterable<CustomerDTO> findByNameAndCity(@RequestParam("name") String name, @RequestParam("city") String city){
        return customerService.findByNameAndCity(name, city);
    }


    //    @PostMapping
    @RequestMapping(value="/customers", method = RequestMethod.POST, consumes = "application/json")
    public Long addCustomer(@RequestBody CustomerDTO customerDTO){
      Long customerId = customerService.addNewCustomer(customerDTO);
        return customerId;
    }
}

// ma poziomie kontrolera nie powinno byc zadnych wywołan do bazy danych


