package com.employee.EmpBo;

public class EmployeeCompleteInfoBO {

//empno,empname,emailId,department,ctc(package),nameoftheProject,Projectstatus ,employeeperformance,typeofband
protected String empNo;
protected String empName;	
protected String emailId;
protected String department;
protected String nameoftheProject;
protected String projectStatus;
protected String employeeperformance;
protected String typeofband;
protected String ctc;
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
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getNameoftheProject() {
	return nameoftheProject;
}
public void setNameoftheProject(String nameoftheProject) {
	this.nameoftheProject = nameoftheProject;
}
public String getProjectStatus() {
	return projectStatus;
}
public void setProjectStatus(String projectStatus) {
	this.projectStatus = projectStatus;
}
public String getEmployeeperformance() {
	return employeeperformance;
}
public void setEmployeeperformance(String employeeperformance) {
	this.employeeperformance = employeeperformance;
}
public String getTypeofband() {
	return typeofband;
}
public void setTypeofband(String typeofband) {
	this.typeofband = typeofband;
}
public String getCtc() {
	return ctc;
}
public void setCtc(String ctc) {
	this.ctc = ctc;
}
@Override
public String toString() {
	return "EmployeeCompleteInfoBO [empNo=" + empNo + ", empName=" + empName + ", emailId=" + emailId + ", department="
			+ department + ",  nameoftheProject=" + nameoftheProject + ", projectStatus="
			+ projectStatus + ", employeeperformance=" + employeeperformance + ", typeofband=" + typeofband + ", ctc="
			+ ctc + "]";
}


}
