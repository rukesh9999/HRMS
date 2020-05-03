package com.reg.empservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EmpVo.EmployeePaySalaryVO;
import com.service.empservice.AllEmployeeSalaryInfoService;
import com.service.empservice.IndividualEmployeePerformanceInfoService;

public class AllEmployeeSalaryInfoServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 AllEmployeeSalaryInfoService AllEmployeeSalaryInfoService=null;
		 
		AllEmployeeSalaryInfoService=new AllEmployeeSalaryInfoService();
		List<EmployeePaySalaryVO> EmployeePaySalaryVO=null;
		
		
		try {
			EmployeePaySalaryVO = AllEmployeeSalaryInfoService.getAllEmpSalDetails();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    System.out.println(EmployeePaySalaryVO);
	    req.setAttribute("EmployeePaySalaryVO", EmployeePaySalaryVO);
		RequestDispatcher rs=req.getRequestDispatcher("/AllEmployeeSalaryDetails.jsp");
		rs.forward(req, res);

	}

	



}
