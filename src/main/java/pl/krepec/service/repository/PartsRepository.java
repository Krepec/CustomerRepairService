package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Parts;

@Repository
public interface PartsRepository extends CrudRepository<Parts, Long> {
}
