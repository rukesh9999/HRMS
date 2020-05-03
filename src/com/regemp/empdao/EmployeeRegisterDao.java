package com.regemp.empdao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.EmployeeRegistrationBo;

public class EmployeeRegisterDao {

	public void registerEmp(EmployeeRegistrationBo EmployeeBo) throws ClassNotFoundException
	{
		Connection con=null;
		Statement stmt=null;
		
		System.out.println("dao called..."+EmployeeBo.getDepartment());
		
		final String insert_emp_data="insert into Employee values('"+EmployeeBo.getEmpNo()+"','"+EmployeeBo.getEmpName()+"',"+EmployeeBo.getSalary()+",'"+EmployeeBo.getDepartment()+"','"+EmployeeBo.getHireDate()+"','"+EmployeeBo.getEmailId()+"','"+EmployeeBo.getUsername()+"','"+EmployeeBo.getPassword()+"') ";
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
		  int  rs= st.executeUpdate(insert_emp_data);
		  System.out.println("inserted record successfully into db........");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
