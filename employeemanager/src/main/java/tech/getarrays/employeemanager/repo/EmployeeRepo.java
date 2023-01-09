package tech.getarrays.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
	//spring understands by the naming convention that we want to delete an Employee
	//by the id
	void deleteEmployeeById(Long id);
	
	//Might be the case there isn't an employee with the specific id.
	Optional<Employee> findEmployeeById(Long id);

}
