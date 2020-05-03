package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.AddRecruitedCandidateBO;
import com.employee.EmpBo.EmployeePaySalaryBO;

public class AddRecruitedCandidateDao {

	public void AddRecruitedCandidate(AddRecruitedCandidateBO AddRecruitedCandidateBO) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		System.out.println(AddRecruitedCandidateBO);
		System.out.println("dao called...");
		final String insert_emp_data="insert into RecruitedCandidates values("+AddRecruitedCandidateBO.getId()+",'"+AddRecruitedCandidateBO.getFullName()+"',"+AddRecruitedCandidateBO.getYearOFPassedOut()+","+AddRecruitedCandidateBO.getPercentage()+",'"+AddRecruitedCandidateBO.getBranch()+"')";
		final String select_emp_data="select FullName,YearOFPassedOut,Percentage,Branch from  RecruitedCandidates where Id=?";
		final String update_emp_data="update  RecruitedCandidates set FullName='"+AddRecruitedCandidateBO.getFullName()+"',YearOFPassedOut="+AddRecruitedCandidateBO.getYearOFPassedOut()+", Percentage="+AddRecruitedCandidateBO.getPercentage()+", Branch='"+AddRecruitedCandidateBO.getBranch()+"' where id="+AddRecruitedCandidateBO.getId()+" ";
		System.out.println(insert_emp_data);
		System.out.println(update_emp_data);

		final String url="jdbc:oracle:thin:@localhost:1521:xe";
		final String Driver_class="oracle.jdbc.driver.OracleDriver";
		final String UserName="system";
		final String Password="tiger"; 
		boolean flag=false;
		try {
			
			  System.out.println("loading the driver...");
			  Class.forName("oracle.jdbc.driver.OracleDriver");
	          System.out.println("driver loaded...");
		      con=DriverManager.getConnection(url, UserName, Password);
	          System.out.println("connection established.........");
		      pstmt=con.prepareStatement(select_emp_data);
			  pstmt.setInt(1,AddRecruitedCandidateBO.getId());
			  System.out.println("PreparedStatement created...");
			  ResultSet  rs= pstmt.executeQuery();
			  System.out.println("selected record successfully from db........");
			  while(rs.next())
			  {
				 System.out.println("true..");
				 flag= true;
			  }
		
		      if(flag)
		      { 
		          stmt=  con.createStatement();
		    	  int  rowno= stmt.executeUpdate(update_emp_data);
		    	  System.out.println(AddRecruitedCandidateBO.getId()+"  already exists updated..");
		      }
		      else {
		    	  
		    	 stmt  =  con.createStatement();
		         int  rowno= stmt.executeUpdate(insert_emp_data);
				 System.out.println(rowno+"... record inserted  successfully into db........");
		      }
			  
			  		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}


}
