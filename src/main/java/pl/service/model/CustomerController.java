package pl.service.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

@Autowired
 private CustomerRepository customerRepository;

//@GetMapping("/all")
//public List<Customer> customerList(@RequestParam("id") Long customerId){
//    return  customerRepository.findCustomerById(customerId);
//}


@RequestMapping("/a")
    public String getAll(){
    return String.valueOf(customerRepository.findAll());

}

}
