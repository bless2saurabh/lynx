package com.example.sbapp.controllers;

public class Employee {
	long id;
	String firstName;
	String lastName;

	EmployeeDetails empDetails;

	public Employee(long id, String firstName, String lastName, EmployeeDetails empDetails) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empDetails = empDetails;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EmployeeDetails getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}
}
