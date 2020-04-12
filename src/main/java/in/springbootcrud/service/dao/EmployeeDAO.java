package in.springbootcrud.service.dao;

import java.util.List;

import in.springbootcrud.service.model.Employee;

public interface EmployeeDAO {
	
List<Employee> get();

Employee get(int Id);
  
void save(Employee employee);

void delete(int Id);

	
	
}
