package pl.krepec.service.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.*;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

@Repository
public class RepairCriteriaRepository {


    @Autowired
    private EntityManager entityManager;

    public List<Repair> findRepairsByCustomerInfo(Integer customerId, String name, String surname, String phoneNumber1, String email) throws InputMismatchException {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);
        Root<Customer> customerRoot = criteriaQuery.from(Customer.class);
        Join<Customer, Repair> repairs = customerRoot.join("repairs");

        Predicate predicateCustomerId = criteriaBuilder.equal(customerRoot.get(Customer_.customerId), customerId);
        Predicate predicateName = criteriaBuilder.equal(customerRoot.get(Customer_.name), name);
        Predicate predicateSurmane = criteriaBuilder.equal(customerRoot.get(Customer_.surname), surname);
        Predicate predicatePhoneNumber1 = criteriaBuilder.equal(customerRoot.get(Customer_.phoneNumber1), phoneNumber1);
        Predicate predicateEmail = criteriaBuilder.equal(customerRoot.get(Customer_.email), email);

        if (customerId != null) {
            return getRepairs(criteriaQuery, repairs, predicateCustomerId);
        } else if (name != null) {
            return getRepairs(criteriaQuery, repairs, predicateName);
        } else if (surname != null) {
            return getRepairs(criteriaQuery, repairs, predicateSurmane);
        } else if (phoneNumber1 != null) {
            return getRepairs(criteriaQuery, repairs, predicatePhoneNumber1);
        } else if (email != null) {
            return getRepairs(criteriaQuery, repairs, predicateEmail);
        }
        throw new InputMismatchException("WPROWADZONO BŁĘDNE DANE !!!");
    }

    private List<Repair> getRepairs(CriteriaQuery<Repair> criteriaQuery, Join<Customer, Repair> repairs, Predicate inputPredicate) {
        List<Repair> customersRepairList = new ArrayList<>();
        criteriaQuery.select(repairs).where(inputPredicate);
        List<Repair> results = entityManager.createQuery(criteriaQuery).getResultList();
        for (Repair repair : results) {
            customersRepairList.add(repair);

        }
        return customersRepairList;
    }

    public List<Repair> findRepairsByDeviceInfo(Integer deviceId, String imei, String serialNumber) throws InputMismatchException {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);
        Root<Device> deviceRoot = criteriaQuery.from(Device.class);
        Join<Device, Repair> repairs = deviceRoot.join("repairs");

        Predicate predicateImei = criteriaBuilder.equal(deviceRoot.get(Device_.imei), imei);
        Predicate predicateSerialNumber = criteriaBuilder.equal(deviceRoot.get(Device_.serialNumber), serialNumber);

        if (deviceId != null) {
            Predicate predicateDeviceId = criteriaBuilder.equal(deviceRoot.get(Device_.deviceId), deviceId);
            return getRepairs2(criteriaQuery, repairs, predicateDeviceId);
        } else if (imei != null) {
            return getRepairs2(criteriaQuery, repairs, predicateImei);
        } else if (serialNumber != null) {
            return getRepairs2(criteriaQuery, repairs, predicateSerialNumber);
        }

        throw new InputMismatchException("WPROWADZONO BŁĘDNE DANE !!!");
    }

            private List<Repair> getRepairs2(CriteriaQuery<Repair> criteriaQuery, Join<Device, Repair> repairs, Predicate inputPredicate) {
        List<Repair> customersRepairList = new ArrayList<>();
        criteriaQuery.select(repairs).where(inputPredicate);
        List<Repair> results = entityManager.createQuery(criteriaQuery).getResultList();
        for (Repair repair : results) {
            customersRepairList.add(repair);

        }
        return customersRepairList;
    }
}











// STARE METODY
/*
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

    public List<Repair> findRepairsByCustomerPhoneNumber(String phoneNumber) {

        List<Repair> customersRepairList = new ArrayList<>();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);
        Root<Customer> customerRoot = criteriaQuery.from(Customer.class);
        Join<Customer, Repair> repairs = customerRoot.join("repairs");

        Predicate predicate = criteriaBuilder.equal(customerRoot.get(Customer_.phoneNumber1), phoneNumber);

        criteriaQuery.select(repairs).where(predicate);

        List<Repair> results = entityManager.createQuery(criteriaQuery).getResultList();
        for (Repair repair : results) {
            customersRepairList.add(repair);

        }
        return customersRepairList;
    }*/
