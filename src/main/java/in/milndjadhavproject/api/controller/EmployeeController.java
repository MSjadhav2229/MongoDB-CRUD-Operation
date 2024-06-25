package in.milndjadhavproject.api.controller;

import in.milndjadhavproject.api.ApiEndPoints;
import in.milndjadhavproject.api.entity.Employee;
import in.milndjadhavproject.api.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = ApiEndPoints.EMPLOYEE_CONTROLLER)
public class EmployeeController {
	@Autowired
	@Lazy
	private EmployeeServices employeeService;

	/**
	 * save data
	 */
	@RequestMapping(value = "/loadData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> loadData(@RequestBody(required = true) Employee employee) {
		Employee reps = employeeService.saveData(employee);
		if (reps == null) {
			return new ResponseEntity<Employee>(reps, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Employee>(reps, HttpStatus.OK);
	}

	/**
	 * get data by id
	 */
	@RequestMapping(value = "/getDatabyId/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Employee>> getDatabyId(@PathVariable(required = true, name = "id") String id) {

//		System.err.println(id);
		Optional<Employee> reps = employeeService.getDataById(id);
		if (reps == null) {
			return new ResponseEntity<Optional<Employee>>(reps, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Optional<Employee>>(reps, HttpStatus.OK);
	}

	/**
	 * get all data in term of list
	 */
	@RequestMapping(value = "/getAllData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllData() {
		List<Employee> reps = employeeService.getAllData();
		if (reps == null) {
			return new ResponseEntity<List<Employee>>(reps, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Employee>>(reps, HttpStatus.OK);
	}

	/**
	 * update data
	 */
	@RequestMapping(value = "/updateData", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> updateData(@RequestBody(required = true) Employee employee) {
		Employee reps = employeeService.updateById(employee);
		if (reps == null) {
			return new ResponseEntity<Employee>(reps, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Employee>(reps, HttpStatus.OK);
	}

	/**
	 * delete by id
	 */
	@RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> deletingData(@PathVariable(required = true, name = "id") String id) {
		List<Employee> reps = employeeService.deleteById(id);
		if (reps == null) {
			return new ResponseEntity<List<Employee>>(reps, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Employee>>(reps, HttpStatus.OK);
	}

}
