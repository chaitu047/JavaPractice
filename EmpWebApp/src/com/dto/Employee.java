package com.dto;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private String loginId;
	private String password;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSalary, String loginId, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.loginId = loginId;
		this.password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", loginId=" + loginId
				+ ", password=" + password;
	}
	
}
