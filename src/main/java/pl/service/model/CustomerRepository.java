package pl.service.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByName(String name);
    List<Customer> findByNameAndSurname(String name, String surname);
    List<Customer> findByPhoneNumber1(String phoneNumber1);
    List<Customer> findByPhoneNumber2(String phoneNumber2);

}

//Get pobieranie danych
//Post wysyłanie
//Put update
//Delete
