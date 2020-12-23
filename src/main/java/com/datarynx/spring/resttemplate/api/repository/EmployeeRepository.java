package com.datarynx.spring.resttemplate.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datarynx.spring.resttemplate.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
