package pl.service.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(new Object[]{App.class,Customer.class, CustomerRepository.class, CustomerController.class, DeliveryType.class, DeliveryTypeRepository.class
        , Device.class, DeviceRepository.class, Parts.class, PartsRepository.class, PartsType.class, PartsTypeRepository.class, Repair.class,RepairRepository.class,
                RepairType.class, RepairTypeRepository.class, Status.class, StatusRepository.class,Technician.class,TechnicianRepository.class},args);

    }
}
