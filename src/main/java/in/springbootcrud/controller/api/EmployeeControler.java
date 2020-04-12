package in.springbootcrud.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.springbootcrud.service.model.Employee;
import in.springbootcrud.service.service.EmployeeService;
@RestController
@RequestMapping("/api")
public class EmployeeControler {
	
	@Autowired
	private EmployeeService employeeService;
	
@GetMapping("/employee")
	
	public List<Employee> get()
	{
		return employeeService.get();
	}
	

}
