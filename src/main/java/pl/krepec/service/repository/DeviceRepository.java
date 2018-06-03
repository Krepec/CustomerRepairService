package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Device;

@Repository
public interface DeviceRepository extends CrudRepository<Device, Long>{

}