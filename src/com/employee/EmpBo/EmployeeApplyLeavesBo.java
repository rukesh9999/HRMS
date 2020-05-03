package com.employee.EmpBo;

import java.util.Date;

public class EmployeeApplyLeavesBo {
	
	protected String empNo;
	protected String typeOFLeave;
	protected String  startDate;
	protected int NoOfLeaves;
	protected String endDate;
	
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
	public int getNoOfLeaves() {
		return NoOfLeaves;
	}
	public void setNoOfLeaves(int noOfLeaves) {
		NoOfLeaves = noOfLeaves;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "EmployeeApplyLeavesBo [empNo=" + empNo + ", typeOFLeave=" + typeOFLeave + ", startDate=" + startDate
				+ ", NoOfLeaves=" + NoOfLeaves + ", endDate=" + endDate + "]";
	}
}
