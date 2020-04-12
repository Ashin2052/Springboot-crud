package in.springbootcrud.service.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.springbootcrud.service.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> get() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Employee> query=currentSession.createQuery("from Employee",Employee.class);
	   List<Employee> list= query.getResultList();
	   return list;
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
