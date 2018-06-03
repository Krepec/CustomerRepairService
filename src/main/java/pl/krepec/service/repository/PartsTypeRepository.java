package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.PartsType;

@Repository
public interface PartsTypeRepository extends CrudRepository<PartsType, Long> {
}
