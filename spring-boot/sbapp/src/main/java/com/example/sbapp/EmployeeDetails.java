package com.example.sbapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Date;

@Entity
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int numYearsExp;
	private String emailId;
	private Date joiningDate;
	private Date leavingDate;

	public EmployeeDetails() {
	}

	public EmployeeDetails(int numYearsExp, String emailId, Date joiningDate, Date leavingDate) {
		this.numYearsExp = numYearsExp;
		this.emailId = emailId;
		this.joiningDate = joiningDate;
		this.leavingDate = leavingDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumYearsExp() {
		return numYearsExp;
	}

	public void setNumYearsExp(int numYearsExp) {
		this.numYearsExp = numYearsExp;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}
}
