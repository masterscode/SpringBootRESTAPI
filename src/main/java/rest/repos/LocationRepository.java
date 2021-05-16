package rest.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import rest.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
