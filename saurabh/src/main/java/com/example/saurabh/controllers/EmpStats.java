package com.example.saurabh.controllers;

import java.sql.Date;

public class EmpStats {
	int numYears;
	String lastOrg;
	Date joinDate;

	public EmpStats(int numYears, String lastOrg, Date joinDate) {
		this.numYears = numYears;
		this.lastOrg = lastOrg;
		this.joinDate = joinDate;
	}

	public int getNumYears() {
		return numYears;
	}

	public void setNumYears(int numYears) {
		this.numYears = numYears;
	}

	public String getLastOrg() {
		return lastOrg;
	}

	public void setLastOrg(String lastOrg) {
		this.lastOrg = lastOrg;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
}
