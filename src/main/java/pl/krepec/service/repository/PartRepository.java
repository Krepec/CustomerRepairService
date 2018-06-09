package pl.krepec.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krepec.service.repository.model.Part;

import java.util.List;

@Repository
public interface PartRepository extends CrudRepository<Part, Long> {

    List<Part> findByPartName(String partName);
}
