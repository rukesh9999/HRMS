package com.employee.EmpBo;

import java.util.Date;

public class EmployeeLeaveDetailsBo {

	protected String empNo;
	protected String typeOfLeave;
	protected String StartDate;
	protected String endDate;
	protected int noOfLeaves;
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getTypeOfLeave() {
		return typeOfLeave;
	}
	public void setTypeOfLeave(String typeOfLeave) {
		this.typeOfLeave = typeOfLeave;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getNoOfLeaves() {
		return noOfLeaves;
	}
	public void setNoOfLeaves(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}
	@Override
	public String toString() {
		return "EmployeeLeaveDetailsBo [empNo=" + empNo + ", typeOfLeave=" + typeOfLeave + ", StartDate=" + StartDate
				+ ", endDate=" + endDate + ", noOfLeaves=" + noOfLeaves + "]";
	}
	
}
