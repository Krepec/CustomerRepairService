package pl.service.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairTypeRepository extends CrudRepository<RepairType,Long> {
}
