package com.example.sbapp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<EmployeeDetails> empDetails;
	// private String empDetails;

	public Employee() {
	}

	public Employee(String firstName, String lastName, List<EmployeeDetails> empDetails) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empDetails = empDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public List<EmployeeDetails> getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(List<EmployeeDetails> empDetails) {
		this.empDetails = empDetails;
	}
}
