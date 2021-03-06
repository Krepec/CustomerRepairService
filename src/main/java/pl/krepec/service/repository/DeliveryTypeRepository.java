package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.DeliveryType;

import java.util.List;

@Repository
public interface DeliveryTypeRepository extends CrudRepository<DeliveryType, Long> {

}
