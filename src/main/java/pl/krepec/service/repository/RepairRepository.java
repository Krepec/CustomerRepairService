package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Repair;

@Repository
public interface RepairRepository extends CrudRepository<Repair, Long> {
}
