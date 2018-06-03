package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.RepairType;

@Repository
public interface RepairTypeRepository extends CrudRepository<RepairType,Long> {
}
