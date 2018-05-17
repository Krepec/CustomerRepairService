package pl.service.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);

    List<Customer> findByNameAndSurname(String name, String surname);

    List<Customer> findByPhoneNumber1(String phoneNumber1);

    List<Customer> findByPhoneNumber2(String phoneNumber2);

    List<Customer> findByNameAndCity(String name, String city);


}

//Get pobieranie danych
//Post wysyłanie
//Put update
//Delete
