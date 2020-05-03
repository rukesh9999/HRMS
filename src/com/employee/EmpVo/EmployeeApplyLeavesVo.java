package com.employee.EmpVo;

import java.util.Date;

public class EmployeeApplyLeavesVo {
	protected String empNo;
	protected String typeOFLeave;
	protected String  startDate;
	protected String endDate;
	protected int  NoOfLeaves;
	
	
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getTypeOFLeave() {
		return typeOFLeave;
	}
	public void setTypeOFLeave(String typeOFLeave) {
		this.typeOFLeave = typeOFLeave;
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
	public int getNoOfLeaves() {
		return NoOfLeaves;
	}
	public void setNoOfLeaves(int noOfLeaves) {
		NoOfLeaves = noOfLeaves;
	}
	@Override
	public String toString() {
		return "EmployeeApplyLeavesVo [empNo=" + empNo + ", typeOFLeave=" + typeOFLeave + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", NoOfLeaves=" + NoOfLeaves + "]";
	}
	
	
	}
