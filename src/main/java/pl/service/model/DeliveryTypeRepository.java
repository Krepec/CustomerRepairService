package pl.service.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryTypeRepository extends CrudRepository<DeliveryType, Long> {
}
