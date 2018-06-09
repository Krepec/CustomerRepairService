package pl.krepec.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.krepec.service.controller.CustomerController;
import pl.krepec.service.repository.*;
import pl.krepec.service.repository.model.*;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
public class App {
    public static void main(String[] args) {
        SpringApplication.run(new Object[]{App.class,Customer.class, CustomerRepository.class, CustomerController.class, DeliveryType.class, DeliveryTypeRepository.class
        , Device.class, DeviceRepository.class, Part.class, PartRepository.class, PartType.class, PartTypeRepository.class, Repair.class,RepairRepository.class,
                RepairType.class, RepairTypeRepository.class, Status.class, StatusRepository.class,Technician.class,TechnicianRepository.class},args);

    }
}
