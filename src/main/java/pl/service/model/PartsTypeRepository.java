package pl.service.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsTypeRepository extends CrudRepository<PartsType, Long> {
}
