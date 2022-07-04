package com.loylty.TestProject.service;

import java.util.List;

import com.loylty.TestProject.entity.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	List<Employee> getEmployees();

	Employee getEmployeeById(Long id);

	void deleteById(Long id);





	
	// abstract methods

}
