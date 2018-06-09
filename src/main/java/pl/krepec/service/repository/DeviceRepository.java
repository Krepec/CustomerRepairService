package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Device;

import java.util.List;

@Repository
public interface DeviceRepository extends CrudRepository<Device, Long>{

    List<Device> findBySerialNumber(String serialNumber);
    List<Device> findByImei(String imei);
    List<Device> findByMark(String mark);
    List<Device> findByModel(String model);

}