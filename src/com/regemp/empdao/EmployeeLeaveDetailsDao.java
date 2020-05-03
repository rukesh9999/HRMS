package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.employee.EmpBo.EmployeeLeaveDetailsBo;

public class EmployeeLeaveDetailsDao {

	public EmployeeLeaveDetailsBo getEmpLeaves(String EMPNO) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		
		String empNo = null;
	    String Type_of_leave =null;
		String Start_date =null;
		String end_date=null;
		int No_of_leaves=0;
		  
		EmployeeLeaveDetailsBo employeeLeaveDetailsBo=null;
		final String select_emp_data="select EMPNO,TYPE_OF_LEAVE, START_DATE ,END_DATE,NO_OF_LEAVES  from emp_leaves where EMPNO=?";
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
		  pstmt.setString(1,EMPNO);
		  System.out.println("PreparedStatement created...");
		  ResultSet  rs= pstmt.executeQuery();
		  System.out.println("selected record successfully from db........");
		  while(rs.next())
		  {
			   empNo = rs.getString(1);
			   Type_of_leave = rs.getString(2);
			   Start_date =rs.getString(3);
			   end_date=rs.getString(4);
			   No_of_leaves=rs.getInt(5);
			  

		  }
		  
		   employeeLeaveDetailsBo=new EmployeeLeaveDetailsBo();
		   employeeLeaveDetailsBo.setEmpNo(empNo);
		   employeeLeaveDetailsBo.setTypeOfLeave(Type_of_leave);
		   employeeLeaveDetailsBo.setStartDate(Start_date);
		   employeeLeaveDetailsBo.setEndDate(end_date);
		   employeeLeaveDetailsBo.setNoOfLeaves(No_of_leaves);
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeeLeaveDetailsBo;
	}
}
