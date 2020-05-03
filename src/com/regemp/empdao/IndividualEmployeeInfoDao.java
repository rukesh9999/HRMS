package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.EmployeeCompleteInfoBO;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;

public class IndividualEmployeeInfoDao {

	
	public EmployeeCompleteInfoBO getIndividualEmpInfo(String EMPNO) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		
		String ctc = null;
	    String department =null;
	    String emailId =null;
		String employeeperformance =null;
		String empName=null;
		String empNo=null;
		String nameoftheProject=null;
		String projectStatus=null;
		String typeofband=null;


		EmployeeCompleteInfoBO EmployeeCompleteInfoBO=null;
		final String select_emp_data="select emp.empno,emp.empname,emp.emailId,emp.department,esal.ctc,eproj.NAME_OF_THE_PROJECT , eproj.status,epr.OverallPerformance,epr.typeofband from employee emp left outer join  EMP_SALARY esal on (emp.EMPNO=esal.EMPNO) left outer join EMP_PROJECTS eproj on (eproj.empno=esal.empno)  left outer join EMP_PerformanceAndReviews epr on(epr.EmployeeNo=eproj.empno) where emp.empno=?";
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
			  empName = rs.getString(2);
			  emailId=rs.getString(3);
			  department=rs.getString(4);
			  ctc =rs.getString(5);
			  nameoftheProject=rs.getString(6);
			  projectStatus=rs.getString(7);
			  employeeperformance=rs.getString(8);
			  typeofband=rs.getString(9);
		  }
		  

	        
		  EmployeeCompleteInfoBO= new EmployeeCompleteInfoBO();
		  EmployeeCompleteInfoBO.setCtc(ctc);
		  EmployeeCompleteInfoBO.setDepartment(department);
		  EmployeeCompleteInfoBO.setEmailId(emailId);
		  EmployeeCompleteInfoBO.setEmployeeperformance(employeeperformance);
		  EmployeeCompleteInfoBO.setEmpName(empName);
		  EmployeeCompleteInfoBO.setEmpNo(empNo);;
		  EmployeeCompleteInfoBO.setNameoftheProject(nameoftheProject);
		  EmployeeCompleteInfoBO.setProjectStatus(projectStatus);
		  EmployeeCompleteInfoBO.setTypeofband(typeofband);
		  System.out.println("EmployeeCompleteInfoBO.."+EmployeeCompleteInfoBO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EmployeeCompleteInfoBO;
	}

	
}
