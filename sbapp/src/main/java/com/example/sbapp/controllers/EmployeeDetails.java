package com.example.sbapp.controllers;

import java.sql.Date;

public class EmployeeDetails {

	int numYearsExp;
	String emailId;
	Date joiningDate;
	Date leavingDate;

	public EmployeeDetails(int numYearsExp, String emailId, Date joiningDate, Date leavingDate) {
		this.numYearsExp = numYearsExp;
		this.emailId = emailId;
		this.joiningDate = joiningDate;
		this.leavingDate = leavingDate;
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
