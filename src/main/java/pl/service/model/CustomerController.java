package pl.service.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/serwis")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/all")
    public String getAllCustomers() {
        return String.valueOf(customerRepository.findAll());

    }

    @GetMapping("/findbyid")
    public String findById(@RequestParam("customerid") Long customerId) {
        return  String.valueOf((customerRepository.findOne(customerId)));

    }

    @GetMapping("/findbyname")
    public String findByName(@RequestParam("name") String name){
        return String.valueOf(customerRepository.findByName(name));
    }

    @GetMapping("findbynameandsurname")
    public String findByNameAndSurname(@RequestParam("name") String name, @RequestParam("surname") String surname){
        return String.valueOf(customerRepository.findByNameAndSurname(name,surname));
    }

    @GetMapping("/findbyphone1")
    public List<Customer> findByPhoneNumber1(@RequestParam("phone1") String phoneNumber1){
        return customerRepository.findByPhoneNumber1(phoneNumber1);
    }

    @GetMapping("/findbyphone2")
    public List<Customer> findByPhoneNumber2(@RequestParam("phone2") String phoneNumber2){
        return customerRepository.findByPhoneNumber2(phoneNumber2);
    }

    @GetMapping("/findbynameandcity")
    public String findByNameAndCity(@RequestParam String name, @RequestParam String city){
        return String.valueOf(customerRepository.findByNameAndCity(name, city));
    }


    //    @PostMapping
    @RequestMapping(value="/customers", method = RequestMethod.POST, consumes = "application/json")
    public String addCustomer(@RequestBody Customer customer){
        return String.valueOf(customerRepository.save(new Customer(customer.getCustomerId(),customer.getName(),
                customer.getSurname(),customer.getPhoneNumber1(),customer.getPhoneNumber2(),customer.getStreet(),
                customer.getBuildingNumber(),customer.getFlatNumber(),customer.getPostalCode(),customer.getCity(),
                customer.getEmail())));
    }
}

