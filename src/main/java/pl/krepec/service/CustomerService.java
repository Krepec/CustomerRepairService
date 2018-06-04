package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.model.CustomerDTO;
import pl.krepec.service.repository.CustomerRepository;
import pl.krepec.service.repository.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerDTO mapCustomer(Customer customer) {

        return new CustomerDTO(customer.getCustomerId(), customer.getName(), customer.getSurname(),
                customer.getPhoneNumber1(), customer.getPhoneNumber2(), customer.getCity(), customer.getCity(),
                customer.getCity(), customer.getPostalCode(), customer.getCity(), customer.getEmail());
    }

    public Iterable<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findAll();
        getCustomerDTO(customerDTOList, customerList);
        return customerDTOList;

    }


    public CustomerDTO fingById(Long customerId) {

        Customer customer = customerRepository.findOne(customerId);
        CustomerDTO customerDTO = mapCustomer(customer);

        return customerDTO;
    }

    public Iterable<CustomerDTO> findByName(String name) {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findByName(name);
        getCustomerDTO(customerDTOList, customerList);

        return customerDTOList;
    }

    public Iterable<CustomerDTO> findByNameAndSurname(String name, String surname) {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findByNameAndSurname(name, surname);
        getCustomerDTO(customerDTOList, customerList);

        return customerDTOList;
    }

    public Iterable<CustomerDTO> findByPhoneNumber1(String phoneNumber1) {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findByPhoneNumber1(phoneNumber1);
        getCustomerDTO(customerDTOList, customerList);

        return customerDTOList;

    }

    public Iterable<CustomerDTO> findByPhoneNumber2(String phoneNumber2) {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findByPhoneNumber2(phoneNumber2);
        getCustomerDTO(customerDTOList, customerList);

        return customerDTOList;

    }

    public Iterable<CustomerDTO> findByNameAndCity(String name, String city) {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findByNameAndCity(name, city);
        getCustomerDTO(customerDTOList, customerList);

        return customerDTOList;

    }

    public Long addNewCustomer(CustomerDTO customerDTO) {
        Customer customer = customerRepository.save(new Customer(customerDTO.getCustomerId(), customerDTO.getName(),
                customerDTO.getSurname(), customerDTO.getPhoneNumber1(), customerDTO.getPhoneNumber2(), customerDTO.getStreet(),
                customerDTO.getBuildingNumber(), customerDTO.getFlatNumber(), customerDTO.getPostalCode(), customerDTO.getCity(),
                customerDTO.getEmail()));

        return customer.getCustomerId();
    }

    private void getCustomerDTO(List<CustomerDTO> customerDTOList, Iterable<Customer> customerList) {
        for (Customer customer : customerList) {
            CustomerDTO customerDTO = mapCustomer(customer);
            customerDTOList.add(customerDTO);
        }
    }
}


//Service jest warstwą pośrednia ponieczy controllerm a repozytorium, mapujemmy tutaj obiekt Customer do obiektu CustomerDTO