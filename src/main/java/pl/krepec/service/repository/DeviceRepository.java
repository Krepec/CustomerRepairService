package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Device;

import java.util.List;

@Repository
public interface DeviceRepository extends CrudRepository<Device, Long>{

    List<Device> findBySerialNumber(String serialNumber);
    List<Device> findByImei(Long imei);
    List<Device> findByModel(String model);
    List<Device> findByMark(String mark);

}