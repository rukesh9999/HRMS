package com.employee.EmpBo;

import java.util.Date;

public class EmployeeProjectAssignmentBO {

	protected String empNo;
	protected String nameOfTheProject;
	protected String typeOfTheProject;
	protected String startDate;
	protected String endDate;
	protected String Status;

	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getNameOfTheProject() {
		return nameOfTheProject;
	}
	public void setNameOfTheProject(String nameOfTheProject) {
		this.nameOfTheProject = nameOfTheProject;
	}
	public String getTypeOfTheProject() {
		return typeOfTheProject;
	}
	public void setTypeOfTheProject(String typeOfTheProject) {
		this.typeOfTheProject = typeOfTheProject;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "EmployeeProjectAssignmentBO [empNo=" + empNo + ", nameOfTheProject=" + nameOfTheProject
				+ ", typeOfTheProject=" + typeOfTheProject + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", Status=" + Status + "]";
	}
	
	}
