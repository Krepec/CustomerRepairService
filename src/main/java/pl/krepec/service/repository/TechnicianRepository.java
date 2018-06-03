package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Technician;

@Repository
public interface TechnicianRepository extends CrudRepository<Technician, Long> {
}
