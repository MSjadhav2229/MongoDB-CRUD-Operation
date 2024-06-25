package in.milndjadhavproject.api.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.milndjadhavproject.api.entity.Employee;
import in.milndjadhavproject.api.repo.EmployeeRepo;

@Service

public class EmployeeServices {

	@Autowired
	@Lazy
	private EmployeeRepo employeeRepo;
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeServices.class);

	/**
	 * save data
	 */
	public Employee saveData(Employee employee) {

		return employeeRepo.saveAllData(employee);
	}

	/**
	 * get data by id
	 */
	public Optional<Employee> getDataById(String id) {

		return employeeRepo.findbyid(id);
	}

	/**
	 * get all data
	 */
	public List<Employee> getAllData() {

		return employeeRepo.getAllData();
	}

	/**
	 * update data
	 */
	public Employee updateById(Employee employee) {
	return employeeRepo.updateData(employee);
}

	/**
	 * delete data
	 */
	public List<Employee> deleteById(String id){
		return employeeRepo.delteById(id);
	}

}
