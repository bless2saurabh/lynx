package com.example.sbapp.controllers;

import com.example.sbapp.Employee;
import com.example.sbapp.EmployeeDetails;
import com.example.sbapp.jpa.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TodoController {

	public static final long DAY = 24 * 60 * 60 * 1000l;

	@Autowired
	EmployeeRepository empRepos;

	@RequestMapping("/api/deleteAll")
	public void deletaAll() {
		empRepos.deleteAll();
	}

	@RequestMapping("/api/save")
	public void save() {

		EmployeeDetails esSB = new EmployeeDetails(16, "sb14feb@gmail.com",
				new Date(System.currentTimeMillis() - 16 * 365 * DAY),
				new Date(System.currentTimeMillis() - 183 * DAY));
		EmployeeDetails esBS = new EmployeeDetails(16, "bless.2.saurabh@gmail.com",
				new Date(System.currentTimeMillis() - 15 * 365 * DAY),
				new Date(System.currentTimeMillis() - 183 * DAY));

		Employee e1 = new Employee("Saurabh", "Bansal", Arrays.asList(esSB, esBS));
		Employee e2 = new Employee("Bansal", "Saurabh", Arrays.asList(esSB, esBS));

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		empRepos.save(list);
	}

	@RequestMapping("/api/list")
	public List<Employee> list() {
		List<Employee> listEmp = new ArrayList<>();
		empRepos.findAll().forEach(listEmp::add);

		return listEmp;
	}

	@RequestMapping("/api/findAllByFirstName")
	public List<Employee> findAllByFirstName(@RequestParam String firstName) {

		List<Employee> listEmp = new ArrayList<>();

		empRepos.findAllByFirstName(firstName).forEach(listEmp::add);

		return listEmp;
	}

	@RequestMapping("/api/findAllByFirstNameOrLastName")
	public List<Employee> findAllByFirstNameOrLastName(@RequestParam String firstname, @RequestParam String lastname) {

		List<Employee> listEmp = new ArrayList<>();

		empRepos.findAllByFirstNameOrLastName(firstname, lastname).forEach(listEmp::add);

		return listEmp;
	}

	@RequestMapping("/api/count")
	public long count() {
		return empRepos.count();
	}

	@RequestMapping("/api/findById/{id}")
	public Employee findById(@PathVariable("id") Employee entity) {
		return entity;
	}

	@RequestMapping("/api/delete")
	public void delete(@RequestParam Long id) {
		empRepos.delete(id);
	}

	@RequestMapping("/api/exists")
	public boolean exists(@RequestParam Long id) {
		return empRepos.exists(id);
	}

	@RequestMapping("/")
	public String home() {
		return "HOME...\nAvailable URLs: \"/api/list/\"";
	}

}
