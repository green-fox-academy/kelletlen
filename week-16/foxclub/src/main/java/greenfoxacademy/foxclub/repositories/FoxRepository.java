package greenfoxacademy.foxclub.repositories;

import greenfoxacademy.foxclub.models.Fox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {
  Fox findByName(String name);

}
