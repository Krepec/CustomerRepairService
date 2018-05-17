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
    public String getAll() {
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

//    @PostMapping("/customerid")

    @RequestMapping(value="/customers", method = RequestMethod.POST, consumes = "application/json")
    public String addCustomer(@RequestBody CustomerId customerId){
        return String.valueOf(customerRepository.save(new Customer(customerId.getCustomerId(),"","","","","","","","","","")));
    }
}

// stworzylismy klase customerId ponieważ nie przekazujemy wszystkich wartosci z konstruktora w klasie customers (przekazujemy tylko jeden paramets customerId) - wymagane sa settery i gettery
// bibliotek JSON potrzebuje opakować propertisow w obiekt (serializacja - przeksztalcenie obiektu javovego do jsona , deserializacja przeksztalcenie obiektu z jsona do obiektu javovego)
// REST - zestaw dobrych praktyk do pisania aplikacjii webowych
// zarówno put oraz update mogą służyc do tworzenia np. nowego klienta
// PUT (create)- /serwis/customers/customerId
// POST (create) - /serwis/customers{customerid:"5"}
// alternatuwa dla postmana curl -  curl --header "Content-Type: application/json" --request POST --data '{"customerId":5}' http://localhost:8080/serwis/customers