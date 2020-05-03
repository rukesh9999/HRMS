package com.employee.EmpVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.employee.EmpBo.EmployeeLeaveDetailsBo;
import com.employee.EmpBo.EmployeeLoginBo;

public class EmployeeLeaveDetailsVo {

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
		return "EmployeeLeaveDetailsVo [empNo=" + empNo + ", typeOfLeave=" + typeOfLeave + ", StartDate=" + StartDate
				+ ", endDate=" + endDate + ", noOfLeaves=" + noOfLeaves + ", getEmpNo()=" + getEmpNo()
				+ ", getTypeOfLeave()=" + getTypeOfLeave() + ", getStartDate()=" + getStartDate() + ", getEndDate()="
				+ getEndDate() + ", getNoOfLeaves()=" + getNoOfLeaves() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
		

}