package in.springbootcrud.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.springbootcrud.service.dao.EmployeeDAO;
import in.springbootcrud.service.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> get() {
	return employeeDAO.get();
	}

	@Override
	public Employee get(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int Id) {
		// TODO Auto-generated method stub
		
	}
	

}
