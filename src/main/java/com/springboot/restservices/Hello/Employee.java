package com.springboot.restservices.Hello;

public class Employee {

	String empName;
	String empBranch;
	String empCity;
	
	
	
	public Employee(String empName, String empBranch, String empCity) {
		
		this.empName = empName;
		this.empBranch = empBranch;
		this.empCity = empCity;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpBranch() {
		return empBranch;
	}
	public void setEmpBranch(String empBranch) {
		this.empBranch = empBranch;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empBranch=" + empBranch + ", empCity=" + empCity + "]";
	}
	
	
	
	
	
}
