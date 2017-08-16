package com.example.saurabh.controllers;

public class Employee {
	long id;
	String fname;
	String lname;
	EmpStats empStats;

	public Employee(long id, String fname, String lname, EmpStats empStats) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.empStats = empStats;
	}

	public long getId() {
		return id;
	}

	public EmpStats getEmpStats() {
		return empStats;
	}

	public void setEmpStats(EmpStats empStats) {
		this.empStats = empStats;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
