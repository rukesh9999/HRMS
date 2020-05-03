package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.AddRecruitedCandidateBO;
import com.employee.EmpBo.EmployeeCompleteInfoBO;

public class editRecruitedCandidateDao {

	public AddRecruitedCandidateBO getRecruitedCandiateInfo(int empNo) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		
		
		int Id=0;
		String Branch=null;
		String FullName=null;
		double percentage=0.0;
        int YearOFPassedOut=0;
		
		AddRecruitedCandidateBO AddRecruitedCandidateBO=null;
		final String select_emp_data="select Id,Branch,FullName,Percentage,YearOFPassedOut  from RecruitedCandidates where id=?";
		System.out.println(select_emp_data);
		final String url="jdbc:oracle:thin:@localhost:1521:xe";
		final String Driver_class="oracle.jdbc.driver.OracleDriver";
		final String UserName="system";
		final String Password="tiger"; 

		try {
			System.out.println("loading the driver...");
			Class.forName("oracle.jdbc.driver.OracleDriver");
	      System.out.println("driver loaded...");

		  con=DriverManager.getConnection(url, UserName, Password);
	      System.out.println("connection established.........");

		  PreparedStatement pstmt=con.prepareStatement(select_emp_data);
		  pstmt.setInt(1,empNo);
		  System.out.println("PreparedStatement created...");
		  ResultSet  rs= pstmt.executeQuery();
		  System.out.println("selected record successfully from db........");
		 
		  while(rs.next())
		  {
			     Id=rs.getInt(1);;
				 Branch=rs.getString(2);
				 FullName=rs.getString(3);
				 percentage=rs.getDouble(4);
		         YearOFPassedOut=rs.getInt(5);
		  }
		  
				        
		  AddRecruitedCandidateBO= new AddRecruitedCandidateBO();
		  AddRecruitedCandidateBO.setBranch(Branch);;
		  AddRecruitedCandidateBO.setFullName(FullName);
		  AddRecruitedCandidateBO.setId(Id);
		  AddRecruitedCandidateBO.setPercentage(percentage);
		  AddRecruitedCandidateBO.setYearOFPassedOut(YearOFPassedOut);
		  System.out.println("EmployeeCompleteInfoBO.."+AddRecruitedCandidateBO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return AddRecruitedCandidateBO;
	}


}
