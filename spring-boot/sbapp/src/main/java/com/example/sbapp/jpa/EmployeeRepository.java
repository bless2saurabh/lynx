package com.example.sbapp.jpa;

import com.example.sbapp.Employee;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	List<Employee> findAllByFirstName(String firstName);

	Iterable<Employee> findAllByFirstNameOrLastName(String firstName, String lastName);
}
