package com.employee.EmpBo;

public class EmployeePerformanceAndReviewBO {


	protected String  EmployeeNo;
	protected String  Communication;
	protected String  CodingSkills;
	protected String  Teamwork;
	protected String  Leadership;
	protected String  GoalSetting;
	protected String  Timemanagement;
	protected String  Attendance;
	protected String  OverallPerformance;
	protected String  TypeofBand;
	public String getEmployeeNo() {
		return EmployeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		EmployeeNo = employeeNo;
	}
	public String getCommunication() {
		return Communication;
	}
	public void setCommunication(String communication) {
		Communication = communication;
	}
	public String getCodingSkills() {
		return CodingSkills;
	}
	public void setCodingSkills(String codingSkills) {
		CodingSkills = codingSkills;
	}
	public String getTeamwork() {
		return Teamwork;
	}
	public void setTeamwork(String teamwork) {
		Teamwork = teamwork;
	}
	public String getLeadership() {
		return Leadership;
	}
	public void setLeadership(String leadership) {
		Leadership = leadership;
	}
	public String getGoalSetting() {
		return GoalSetting;
	}
	public void setGoalSetting(String goalSetting) {
		GoalSetting = goalSetting;
	}
	public String getTimemanagement() {
		return Timemanagement;
	}
	public void setTimemanagement(String timemanagement) {
		Timemanagement = timemanagement;
	}
	public String getAttendance() {
		return Attendance;
	}
	public void setAttendance(String attendance) {
		Attendance = attendance;
	}
	public String getOverallPerformance() {
		return OverallPerformance;
	}
	public void setOverallPerformance(String overallPerformance) {
		OverallPerformance = overallPerformance;
	}
	public String getTypeofBand() {
		return TypeofBand;
	}
	public void setTypeofBand(String typeofBand) {
		TypeofBand = typeofBand;
	}
	@Override
	public String toString() {
		return "EmployeePerformanceAndReviewService [EmployeeNo=" + EmployeeNo + ", Communication=" + Communication
				+ ", CodingSkills=" + CodingSkills + ", Teamwork=" + Teamwork + ", Leadership=" + Leadership
				+ ", GoalSetting=" + GoalSetting + ", Timemanagement=" + Timemanagement + ", Attendance=" + Attendance
				+ ", OverallPerformance=" + OverallPerformance + ", TypeofBand=" + TypeofBand + "]";
	}
	


}
