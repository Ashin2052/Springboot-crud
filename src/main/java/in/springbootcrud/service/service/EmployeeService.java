package in.springbootcrud.service.service;

import java.util.List;

import in.springbootcrud.service.model.Employee;

public interface EmployeeService {

	List<Employee> get();

	Employee get(int Id);
	  
	void save(Employee employee);

	void delete(int Id);
}
