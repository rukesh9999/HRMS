package com.regemp.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;

public class IndividualEmployeeSalaryInfoDao {

	public EmployeePaySalaryBO getIndividualEmpSalDetails(String EMPNO) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		String userName = null;
		String password=null;
		
		String empNo = null;
	    double BASIC_SALARY =0.0;
	    double HRA =0.0;
	    double OTHER_ALLOWANCES =0.0;
	    double GROSS_SALARY=0.0;
	    double PF=0.0;
	    double CTC=0.0;
		double Deductions=0.0;
		double Net_Pay=0.0;
		


		EmployeePaySalaryBO EmployeePaySalaryBO=null;
		final String select_emp_data="select EMPNO,BASIC_SALARY,HRA,OTHER_ALLOWANCES,GROSS_SALARY,PF,CTC,Deductions,Net_Pay  from emp_salary where EMPNO=?";
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
			   BASIC_SALARY = rs.getDouble(2);
			   HRA=rs.getDouble(3);
			   OTHER_ALLOWANCES =rs.getDouble(4);
			   GROSS_SALARY=rs.getDouble(5);
			   PF=rs.getDouble(6);
			   CTC=rs.getDouble(7);
			   Deductions=rs.getDouble(8);
			   Net_Pay=rs.getDouble(9);

		  }
		  
		  
		  EmployeePaySalaryBO= new EmployeePaySalaryBO();
		  EmployeePaySalaryBO.setEmpNo(empNo);
		  EmployeePaySalaryBO.setBasicsalary(BASIC_SALARY);
		  EmployeePaySalaryBO.setCtc(CTC);
		  EmployeePaySalaryBO.setDeductions(Deductions);
		  EmployeePaySalaryBO.setGrosssalary(GROSS_SALARY);;
		  EmployeePaySalaryBO.setHra(HRA);
		  EmployeePaySalaryBO.setNetpay(Net_Pay);
		  EmployeePaySalaryBO.setOtherallowances(OTHER_ALLOWANCES);
		  EmployeePaySalaryBO.setPf(PF);
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EmployeePaySalaryBO;
	}


}
