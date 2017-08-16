package com.example.saurabh.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@RestController
public class TodoController {

	@RequestMapping("/api/list")
	public List<Employee> list() {
		EmpStats es1 = new EmpStats(2, "Aplion Networks",
				new Date(System.currentTimeMillis() - 16 * 365 * 24 * 60 * 60 * 1000l));
		EmpStats es2 = new EmpStats(2, "Globespan",
				new Date(System.currentTimeMillis() - 14 * 365 * 24 * 60 * 60 * 1000l));

		return Arrays
				.asList(new Employee[] { new Employee(12345678, "f", "l", es1),
						new Employee(12345678, "f", "l", es2) });
	}
}
