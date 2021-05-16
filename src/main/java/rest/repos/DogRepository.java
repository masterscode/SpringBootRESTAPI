package rest.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.entities.Dog;

import java.util.List;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
    Dog findDogById(Long id);
    List<Dog> findDogsByBreed(String breed);
}
