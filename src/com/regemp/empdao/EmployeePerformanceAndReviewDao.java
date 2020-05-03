package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;
import com.employee.EmpVo.EmployeePerformanceAndReviewVO;

public class EmployeePerformanceAndReviewDao {

	public void savePerformanceAndReviewService(EmployeePerformanceAndReviewBO EmployeePerformanceAndRevieBO) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		System.out.println(EmployeePerformanceAndRevieBO);
		System.out.println("dao called...");
		
		final String insert_emp_data="insert into EMP_PerformanceAndReviews values('"+EmployeePerformanceAndRevieBO.getEmployeeNo()+"','"+EmployeePerformanceAndRevieBO.getCommunication()+"','"+EmployeePerformanceAndRevieBO.getCodingSkills()+"','"+EmployeePerformanceAndRevieBO.getLeadership()+"','"+EmployeePerformanceAndRevieBO.getTeamwork()+"','"+EmployeePerformanceAndRevieBO.getGoalSetting()+"','"+EmployeePerformanceAndRevieBO.getTimemanagement()+"','"+EmployeePerformanceAndRevieBO.getAttendance()+"','"+EmployeePerformanceAndRevieBO.getOverallPerformance()+"','"+EmployeePerformanceAndRevieBO.getTypeofBand()+"')";

		System.out.println(insert_emp_data);
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
		  		
		    Statement st=con.createStatement();

		    System.out.println("statement created...");
			 
		    int  rowno= st.executeUpdate(insert_emp_data);
			System.out.println(rowno+"... record inserted  successfully into db........");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}


}
