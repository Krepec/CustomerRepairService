package pl.service.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


}

//Get pobieranie danych
//Post wysyłanie
//Put update
//Delete
