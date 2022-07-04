package com.loylty.TestProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loylty.TestProject.entity.Employee;
import com.loylty.TestProject.repository.EmployeeRepository;
import com.loylty.TestProject.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);	
	}


	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(Long id) {	
		return employeeRepository.findById(id).get();
	}


	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}


}
