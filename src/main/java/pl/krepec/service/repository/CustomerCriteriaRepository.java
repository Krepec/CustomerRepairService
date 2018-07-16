package pl.krepec.service.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Customer;
import pl.krepec.service.repository.model.Customer_;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


@Repository
public class CustomerCriteriaRepository {

    @Autowired
    private EntityManager entityManager;

    public Iterable<Customer> findByName(String name){

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Customer> criteriaQuery =  builder.createQuery(Customer.class); // reprezentuje jakiego typu beda nasze obiekty
        Root<Customer> customer = criteriaQuery.from(Customer.class); // reprezentuje z jakiej tabeli wyciagamy wiersze

        Predicate predicate = builder.like(customer.get(Customer_.name), name); // tworzenie metody która przyjmuje arg. custoomer i zwraca booleam

        criteriaQuery.select(customer).where(predicate);


        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}


// Criteria Api jest bardziej złozona i skomplikowana od CrudRepository,  przedstawia jawnie co się dzieje w kodzie,
// natomiast w Crud dzieje sie "magia springa" która nie jest jawnie pokazana
// - criteria api pozwala ma budowanie skomplikowanych zapytań
// - crud pozwala tylko na tworzenie,czytanie, update, oraz kasowanie
