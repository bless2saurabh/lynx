package com.example.sbapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

	public static final long DAY = 24 * 60 * 60 * 1000l;

	@RequestMapping("/api/list")
	public List<Employee> list() {
		List<Employee> listEmp = new ArrayList<>();

		EmployeeDetails esSB = new EmployeeDetails(16, "sb.14feb@gmail.com",
				new Date(System.currentTimeMillis() - 16 * 365 * DAY),
				new Date(System.currentTimeMillis() - 183 * DAY));
		listEmp.add (new Employee(1092436578, "Saurabh", "Bansal", esSB));

		EmployeeDetails esBS = new EmployeeDetails(16, "bless2saurabh@gmail.com",
				new Date(System.currentTimeMillis() - 15 * 365 * DAY),
				new Date(System.currentTimeMillis() - 183 * DAY));
		listEmp.add(new Employee(8794631259893096l, "Bansal", "Saurabh", esBS));

		return listEmp;
	}

	@RequestMapping("/")
	public String home() {
		return "HOME...\nAvailable URLs: \"/api/list/\"";
	}

}
