package com.loylty.TestProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loylty.TestProject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
