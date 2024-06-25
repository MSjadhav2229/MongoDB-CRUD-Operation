package in.milndjadhavproject.api.repo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import in.milndjadhavproject.api.entity.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepoCustom {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeRepoImpl.class);

	@Autowired
	@Lazy
	private EmployeeRepo employeeRepo;

	@Override
	public Employee saveAllData(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllData() {
		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> findbyid(String id) {
		return employeeRepo.findAllById(id);
	}

	@Override
	public List<Employee> delteById(String id) {
		employeeRepo.deleteById(id);
		LOG.error("Data is Succesfully delted by " + id);
		return employeeRepo.findAll();
	}

	@Override
	public Employee updateData(Employee employee) {

		LOG.info("update the data Succesfully by ");
		return employeeRepo.save(employee);
	}

}
