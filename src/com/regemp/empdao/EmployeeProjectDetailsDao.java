package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.employee.EmpBo.EmployeeLeaveDetailsBo;
import com.employee.EmpBo.EmployeeProjectDeatilsBO;

public class EmployeeProjectDetailsDao {

	public EmployeeProjectDeatilsBO getEmpProjects(String EMPNO) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		String empNo = null;
	    String NAME_OF_THE_PROJECT =null;
	    String TYPE_OF_PROJECT =null;
	    String START_DATE =null;
	    String END_DATE=null;
		String STATUS=null;
		  
		EmployeeProjectDeatilsBO EmployeeProjectDeatilsBO=null;
		final String select_emp_data="select EMPNO,NAME_OF_THE_PROJECT,TYPE_OF_PROJECT,START_DATE,END_DATE,STATUS  from emp_projects where EMPNO=?";
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
			   NAME_OF_THE_PROJECT = rs.getString(2);
			   TYPE_OF_PROJECT=rs.getString(3);
			   START_DATE =rs.getString(4);
			   END_DATE=rs.getString(5);
			   STATUS=rs.getString(6);
		  }
		  
		  EmployeeProjectDeatilsBO= new EmployeeProjectDeatilsBO();
		  EmployeeProjectDeatilsBO.setEmpNo(empNo);
		  EmployeeProjectDeatilsBO.setNameOfTheProject(NAME_OF_THE_PROJECT);
		  EmployeeProjectDeatilsBO.setTypeOfTheProject(TYPE_OF_PROJECT);
		  EmployeeProjectDeatilsBO.setStartDate(START_DATE);
		  EmployeeProjectDeatilsBO.setEndDate(END_DATE);
		  EmployeeProjectDeatilsBO.setStatus(STATUS);
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EmployeeProjectDeatilsBO;
	}


}
