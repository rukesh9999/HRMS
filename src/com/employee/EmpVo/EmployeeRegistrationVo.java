package com.employee.EmpVo;

import java.util.Date;

public class EmployeeRegistrationVo {

	protected String empNo;
	protected String empName;
	protected double Salary;
	protected String Department;
	protected String emailId;
	protected String username;
	protected String password;
	protected String hireDate;
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "EmployeeRegistrationVo [empNo=" + empNo + ", empName=" + empName + ", Salary=" + Salary
				+ ", Department=" + Department + ", emailId=" + emailId + ", username=" + username + ", password="
				+ password + ", hireDate=" + hireDate + "]";
	}
	
		
		

}
