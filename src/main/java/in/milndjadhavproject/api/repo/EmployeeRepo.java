package in.milndjadhavproject.api.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.milndjadhavproject.api.entity.Employee;
@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String>,EmployeeRepoCustom{

	public Optional<Employee> findAllById(String id);

}

