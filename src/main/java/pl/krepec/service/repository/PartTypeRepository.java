package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.PartType;

@Repository
public interface PartTypeRepository extends CrudRepository<PartType, Long> {
}
