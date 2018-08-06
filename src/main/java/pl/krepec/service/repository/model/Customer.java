package pl.krepec.service.repository.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "CustomerID")
    private long customerId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Phone_number1")
    private String phoneNumber1;

    @Column(name = "Phone_number2")
    private String phoneNumber2 = "";

    @Column(name = "Street")
    private String street;

    @Column(name = "Building_number")
    private String buildingNumber;

    @Column(name = "Flat_number")
    private String flatNumber;

    @Column(name = "Postal_code")
    private String postalCode;

    @Column(name = "City")
    private String city;

    @Column(name = "Email")
    private String email;

    @OneToMany(mappedBy="customer")
    private List<Repair> repairs;

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Customer(long customerId, String name, String surname, String phone_number1,
                    String phone_number2, String street, String building_number, String flat_number,
                    String postal_code, String city, String email) {

        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.phoneNumber1 = phone_number1;
        this.phoneNumber2 = phone_number2;
        this.street = street;
        this.buildingNumber = building_number;
        this.flatNumber = flat_number;
        this.postalCode = postal_code;
        this.city = city;
        this.email = email;
    }

    public Customer() {

    }

    @Override
    public String toString() {
        return "Id: " + customerId + " Imię: " + name + " Nazwisko: \n" + surname + " Telefon1: " + phoneNumber1 + " Telefon2: " + phoneNumber2 +
                " Ulica: " + street + " Numer budynku: " + buildingNumber + " Numer mieszkania: " + flatNumber + " Kod pocztowy: " + postalCode +
                " Miasto: " + city + " E-mail: " + email;
    }
}
