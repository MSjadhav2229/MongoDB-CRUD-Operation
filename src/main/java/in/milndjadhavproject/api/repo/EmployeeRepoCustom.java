package in.milndjadhavproject.api.repo;

import java.util.List;
import java.util.Optional;

import in.milndjadhavproject.api.entity.Employee;

public interface EmployeeRepoCustom {

	public Employee saveAllData(Employee employee);

	public Optional<Employee> findbyid(String id);

	public List<Employee> getAllData();

	public Employee updateData(Employee employee);

	public List<Employee> delteById(String id);

}
