package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.employee.EmpBo.AddRecruitedCandidateBO;
import com.employee.EmpBo.EmployeePaySalaryBO;

public class AllRecruitedCandidatesInfoDao {

	public List<AddRecruitedCandidateBO> getAllRecruitedCandidatesInfo() throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		int id=0;
		String FullName = null;
	    int YearOFPassedOut =0;
	    double Percentage =0.0;
		String Branch =null;
		 
        List<AddRecruitedCandidateBO>  AddRecruitedCandidateBOs =null;
        
        AddRecruitedCandidateBO AddRecruitedCandidateBO=null;
		
		final String select_emp_data="select Id,FullName,YearOFPassedOut,Percentage,Branch  from RecruitedCandidates ";
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
		  System.out.println("PreparedStatement created...");
		  ResultSet  rs= pstmt.executeQuery();
		  System.out.println("selected record successfully from db........");
		  AddRecruitedCandidateBOs=new ArrayList<AddRecruitedCandidateBO>();
		  while(rs.next())
		  {
			  System.out.println(rs.getString(1)+"..."+rs.getString(2)+"..."+rs.getString(3)+"..."+rs.getString(4)+"..."+rs.getString(5));
               
			     id                =rs.getInt(1);
			     FullName          = rs.getString(2);
			     YearOFPassedOut   = rs.getInt(3);
			     Percentage        = rs.getDouble(4);
			     Branch            = rs.getString(5);

			AddRecruitedCandidateBO = new AddRecruitedCandidateBO();
			AddRecruitedCandidateBO.setId(id);
		  	AddRecruitedCandidateBO.setBranch(Branch);
		  	AddRecruitedCandidateBO.setFullName(FullName);
		  	AddRecruitedCandidateBO.setPercentage(Percentage);
		    AddRecruitedCandidateBO.setYearOFPassedOut(YearOFPassedOut);
		    System.out.println(AddRecruitedCandidateBO);
		    AddRecruitedCandidateBOs.add(AddRecruitedCandidateBO);

		  }
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  return  AddRecruitedCandidateBOs;
	}



}
