package rest.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rest.entities.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Long> {
}
