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

        if (customerId != null) {
            Predicate predicateCustomerId = criteriaBuilder.equal(customerRoot.get(Customer_.customerId), customerId);
            return getRepairsByCustomerInfo(criteriaQuery, repairs, predicateCustomerId);
        } else if (name != null) {
            Predicate predicateName = criteriaBuilder.equal(customerRoot.get(Customer_.name), name);
            return getRepairsByCustomerInfo(criteriaQuery, repairs, predicateName);
        } else if (surname != null) {
            Predicate predicateSurmane = criteriaBuilder.equal(customerRoot.get(Customer_.surname), surname);
            return getRepairsByCustomerInfo(criteriaQuery, repairs, predicateSurmane);
        } else if (phoneNumber1 != null) {
            Predicate predicatePhoneNumber1 = criteriaBuilder.equal(customerRoot.get(Customer_.phoneNumber1), phoneNumber1);
            return getRepairsByCustomerInfo(criteriaQuery, repairs, predicatePhoneNumber1);
        } else if (email != null) {
            Predicate predicateEmail = criteriaBuilder.equal(customerRoot.get(Customer_.email), email);
            return getRepairsByCustomerInfo(criteriaQuery, repairs, predicateEmail);
        }
        throw new InputMismatchException("WPROWADZONO BŁĘDNE DANE !!!");
    }

    private List<Repair> getRepairsByCustomerInfo(CriteriaQuery<Repair> criteriaQuery, Join<Customer, Repair> repairs, Predicate inputPredicate) {
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

        if (deviceId != null) {
            Predicate predicateDeviceId = criteriaBuilder.equal(deviceRoot.get(Device_.deviceId), deviceId);
            return getRepairsByDeviceInfo(criteriaQuery, repairs, predicateDeviceId);
        } else if (imei != null) {
            Predicate predicateImei = criteriaBuilder.equal(deviceRoot.get(Device_.imei), imei);
            return getRepairsByDeviceInfo(criteriaQuery, repairs, predicateImei);
        } else if (serialNumber != null) {
            Predicate predicateSerialNumber = criteriaBuilder.equal(deviceRoot.get(Device_.serialNumber), serialNumber);
            return getRepairsByDeviceInfo(criteriaQuery, repairs, predicateSerialNumber);
        }

        throw new InputMismatchException("WPROWADZONO BŁĘDNE DANE !!!");
    }

    private List<Repair> getRepairsByDeviceInfo(CriteriaQuery<Repair> criteriaQuery, Join<Device, Repair> repairs, Predicate inputPredicate) {
        List<Repair> customersRepairList = new ArrayList<>();
        criteriaQuery.select(repairs).where(inputPredicate);
        List<Repair> results = entityManager.createQuery(criteriaQuery).getResultList();
        for (Repair repair : results) {
            customersRepairList.add(repair);

        }
        return customersRepairList;
    }


    public List<Repair> findRepairsByTechnicianInfo(Integer technicianId) throws InputMismatchException {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);
        Root<Technician> deviceRoot = criteriaQuery.from(Technician.class);
        Join<Technician, Repair> repairs = deviceRoot.join("repairs");

        if (technicianId != null) {
            Predicate predicateTechnicianID = criteriaBuilder.equal(deviceRoot.get(Technician_.technicianId), technicianId);
            return getRepairsByTechnicianInfo(criteriaQuery, repairs, predicateTechnicianID);
        } else throw new InputMismatchException("WPROWADZONO BŁĘDNE DANE !!!");
    }

    private List<Repair> getRepairsByTechnicianInfo(CriteriaQuery<Repair> criteriaQuery, Join<Technician, Repair> repairs, Predicate inputPredicate) {
        List<Repair> customersRepairList = new ArrayList<>();
        criteriaQuery.select(repairs).where(inputPredicate);
        List<Repair> results = entityManager.createQuery(criteriaQuery).getResultList();
        for (Repair repair : results) {
            customersRepairList.add(repair);

        }
        return customersRepairList;
    }

    public List<Repair> findRepairsByStatusInfo(Integer statusId, String status) throws InputMismatchException {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);
        Root<Status> deviceRoot = criteriaQuery.from(Status.class);
        Join<Status, Repair> repairs = deviceRoot.join("repairs");

        if (statusId != null) {
            Predicate predicateStatusId = criteriaBuilder.equal(deviceRoot.get(Status_.statusId), statusId);
            return getRepairsByStatus(criteriaQuery, repairs, predicateStatusId);
        } else if (status != null) {
            Predicate predicateStatus = criteriaBuilder.equal(deviceRoot.get(Status_.status),status);
            return getRepairsByStatus(criteriaQuery, repairs, predicateStatus);

        } else throw new InputMismatchException("WPROWADZONO BŁĘDNE DANE !!!");
    }

    private List<Repair> getRepairsByStatus(CriteriaQuery<Repair> criteriaQuery, Join<Status, Repair> repairs, Predicate inputPredicate) {
        List<Repair> customersRepairList = new ArrayList<>();
        criteriaQuery.select(repairs).where(inputPredicate);
        List<Repair> results = entityManager.createQuery(criteriaQuery).getResultList();
        for (Repair repair : results) {
            customersRepairList.add(repair);

        }
        return customersRepairList;
    }

    public List<Repair> findRepairsByRepairTypeInfo(Integer repairTypeId, String repairTypeName) throws InputMismatchException {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);
        Root<RepairType> deviceRoot = criteriaQuery.from(RepairType.class);
        Join<RepairType, Repair> repairs = deviceRoot.join("repairs");

        if (repairTypeId != null) {
            Predicate predicateDeliveryTypeId = criteriaBuilder.equal(deviceRoot.get(RepairType_.repairTypeId), repairTypeId);
            return getRepairsByRepairType(criteriaQuery, repairs, predicateDeliveryTypeId);
        } else if (repairTypeName != null) {
            Predicate predicateDeliveryType = criteriaBuilder.equal(deviceRoot.get(RepairType_.repairTypeName), repairTypeName);
            return getRepairsByRepairType(criteriaQuery, repairs, predicateDeliveryType);

        } else throw new InputMismatchException("WPROWADZONO BŁĘDNE DANE !!!");
    }

    private List<Repair> getRepairsByRepairType(CriteriaQuery<Repair> criteriaQuery, Join<RepairType, Repair> repairs, Predicate inputPredicate) {
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
