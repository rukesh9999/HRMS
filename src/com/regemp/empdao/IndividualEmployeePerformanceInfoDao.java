package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;
import com.employee.EmpBo.EmployeeProjectDeatilsBO;
import com.employee.EmpVo.EmployeePerformanceAndReviewVO;

public class IndividualEmployeePerformanceInfoDao {

	public EmployeePerformanceAndReviewBO getIndividualEmpPerformanceDetails(String EMPNO) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		
		String EmployeeNo = null;
	    String Communication =null;
	    String CodingSkills =null;
		String Teamwork =null;
		String GoalSetting=null;
		String Timemanagement=null;
		String Attendance=null;
		String OverallPerformance=null;
		String TypeofBand=null;
		String Leadership=null;


		EmployeePerformanceAndReviewBO EmployeePerformanceAndReviewBO=null;
		final String select_emp_data="select  EmployeeNo,Communication,CodingSkills,Leadership,Teamwork ,GoalSetting,Timemanagement,Attendance,OverallPerformance,TypeofBand   from EMP_PerformanceAndReviews where EmployeeNo=?";
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
			   EmployeeNo = rs.getString(1);
			   Communication = rs.getString(2);
			   CodingSkills=rs.getString(3);
			   Leadership=rs.getString(4);
			   Teamwork =rs.getString(5);
			   GoalSetting=rs.getString(6);
			   Timemanagement=rs.getString(7);
			   Attendance=rs.getString(8);
			   OverallPerformance=rs.getString(9);
			   TypeofBand=rs.getString(10);

		  }
		  

	        
		  EmployeePerformanceAndReviewBO= new EmployeePerformanceAndReviewBO();
		  EmployeePerformanceAndReviewBO.setAttendance(Attendance);
		  EmployeePerformanceAndReviewBO.setCodingSkills(CodingSkills);
		  EmployeePerformanceAndReviewBO.setCommunication(Communication);;
		  EmployeePerformanceAndReviewBO.setEmployeeNo(EmployeeNo);;
		  EmployeePerformanceAndReviewBO.setGoalSetting(Leadership);;
		  EmployeePerformanceAndReviewBO.setOverallPerformance(OverallPerformance);;
		  EmployeePerformanceAndReviewBO.setTeamwork(Teamwork);;
		  EmployeePerformanceAndReviewBO.setTimemanagement(Timemanagement);
		  EmployeePerformanceAndReviewBO.setTypeofBand(TypeofBand);
		  EmployeePerformanceAndReviewBO.setLeadership(Leadership);
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EmployeePerformanceAndReviewBO;
	}

}
