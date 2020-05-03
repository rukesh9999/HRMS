package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.AddRecruitedCandidateBO;

public class deleteRecruitedCandidateDao {
	
	public void  deleteRecruitedCandiateInfo(int empNo) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		PreparedStatement pstmt=null;
		
		
		final String delete_emp_data="delete from RecruitedCandidates where id=?";
		System.out.println(delete_emp_data);
		final String url="jdbc:oracle:thin:@localhost:1521:xe";
		final String Driver_class="oracle.jdbc.driver.OracleDriver";
		final String UserName="system";
		final String Password="tiger"; 

	
		  System.out.println("loading the driver...");
		  Class.forName("oracle.jdbc.driver.OracleDriver");
	      System.out.println("driver loaded...");

		  try {
			  con=DriverManager.getConnection(url, UserName, Password);
			  System.out.println("connection established.........");
			  pstmt=con.prepareStatement(delete_emp_data);
			  pstmt.setInt(1,empNo);
			  System.out.println("PreparedStatement created...");
			  int  deletedRecord = pstmt.executeUpdate();
			  System.out.println("deleted record successfully from db........");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	
}