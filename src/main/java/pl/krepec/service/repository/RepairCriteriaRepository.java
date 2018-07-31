package pl.krepec.service.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Customer;
import pl.krepec.service.repository.model.Customer_;
import pl.krepec.service.repository.model.Repair;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepairCriteriaRepository {


    @Autowired
    private EntityManager entityManager;

    public List<Repair> findCustomerRepairs(Integer customerId) {

        List<Repair> customersRepairList = new ArrayList<>();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);

        Root<Customer> customerRoot = criteriaQuery.from(Customer.class);
        Join<Customer, Repair> repairs = customerRoot.join("repairs");

        Predicate predicate = criteriaBuilder.equal(customerRoot.get(Customer_.customerId), customerId);

        criteriaQuery.select(repairs).where(predicate);

        List<Repair> results = entityManager.createQuery(criteriaQuery).getResultList();
        for (Repair repair : results) {
            customersRepairList.add(repair);

        }
        return customersRepairList;
    }

    public List<Repair> findRepairsByCustomerPhoneNumber(String phoneNumber){

        List<Repair> customersRepairList = new ArrayList<>();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);
        Root<Customer> customerRoot = criteriaQuery.from(Customer.class);
        Join<Customer,Repair> repairs = customerRoot.join("repairs");

        Predicate predicate = criteriaBuilder.equal(customerRoot.get(Customer_.phoneNumber1), phoneNumber);

        criteriaQuery.select(repairs).where(predicate);

        List<Repair> results = entityManager.createQuery(criteriaQuery).getResultList();
        for (Repair repair : results) {
            customersRepairList.add(repair);

        }
        return customersRepairList;

    }

}
