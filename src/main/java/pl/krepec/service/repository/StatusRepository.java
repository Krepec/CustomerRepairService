package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Long> {
}
