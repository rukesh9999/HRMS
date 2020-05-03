package com.employee.EmpVo;

public class AddRecruitedCandidateVO {
	protected int id;
	protected String FullName  ; 
	protected int YearOFPassedOut;
	protected double Percentage;
	protected String Branch;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
		public int getYearOFPassedOut() {
		return YearOFPassedOut;
	}
	public void setYearOFPassedOut(int yearOFPassedOut) {
		YearOFPassedOut = yearOFPassedOut;
	}
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	
	@Override
	public String toString() {
		return "AddRecruitedCandidateVO [id=" + id + ", FullName=" + FullName + ", YearOFPassedOut=" + YearOFPassedOut
				+ ", Percentage=" + Percentage + ", Branch=" + Branch + "]";
	}

	
	

}
