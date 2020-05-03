package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.EmployeeLoginBo;
import com.employee.EmpBo.EmployeeRegistrationBo;

public class CheckEmployeeExitsOrNotDao {

	public Boolean checkEmp(String emailId) throws ClassNotFoundException
	{
		boolean flag=false;
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		final String select_emp_data="select userName,password from Employee where EMAILID=?";
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
		  pstmt.setString(1,emailId);
		  System.out.println("PreparedStatement created...");
		  ResultSet  rs= pstmt.executeQuery();
		  System.out.println("selected record successfully from db........");
		  while(rs.next())
		  {
			  userName = rs.getString(1);
			  password = rs.getString(2);
			  System.out.println(userName+"......."+password);
			  flag=true;
		  }
		  
		  
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}
	
}
