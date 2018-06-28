package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krepec.service.dto.CustomerDTO;
import pl.krepec.service.repository.CustomerRepository;
import pl.krepec.service.repository.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Iterable<CustomerDTO> find(String name, String surname, String phoneNumber1, String phoneNumber2, String city) {
        if (name != null && surname != null) {
            return findByNameAndSurname(name, surname);
        } else if (name != null) {
            return findByName(name);
        } else if (phoneNumber1 != null) {
            return findByPhoneNumber1(phoneNumber1);
        } else if (phoneNumber2 != null) {
            return findByPhoneNumber2(phoneNumber2);
        } else if (city != null) {
            return findByPhoneNumber2(city);
        } else {
            return getAllCustomers();
        }
    }

    private CustomerDTO mapCustomer(Customer customer) {

        return new CustomerDTO(customer.getCustomerId(), customer.getName(), customer.getSurname(),
                customer.getPhoneNumber1(), customer.getPhoneNumber2(), customer.getCity(), customer.getCity(),
                customer.getCity(), customer.getPostalCode(), customer.getCity(), customer.getEmail());
    }

    private Iterable<CustomerDTO> getAllCustomers() {
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

    private Iterable<CustomerDTO> findByName(String name) {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findByName(name);
        getCustomerDTO(customerDTOList, customerList);

        return customerDTOList;
    }

    private Iterable<CustomerDTO> findByNameAndSurname(String name, String surname) {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findByNameAndSurname(name, surname);
        getCustomerDTO(customerDTOList, customerList);

        return customerDTOList;
    }

    private Iterable<CustomerDTO> findByPhoneNumber1(String phoneNumber1) {
        List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();

        Iterable<Customer> customerList = customerRepository.findByPhoneNumber1(phoneNumber1);
        getCustomerDTO(customerDTOList, customerList);

        return customerDTOList;

    }

    private Iterable<CustomerDTO> findByPhoneNumber2(String phoneNumber2) {
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