package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.ServicePrice;

@Repository
public interface ServicePriceRepository extends CrudRepository<ServicePrice, Long> {


}
