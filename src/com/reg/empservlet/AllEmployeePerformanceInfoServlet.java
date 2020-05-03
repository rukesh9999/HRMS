package com.reg.empservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EmpVo.EmployeePaySalaryVO;
import com.employee.EmpVo.EmployeePerformanceAndReviewVO;
import com.service.empservice.AllEmployeePerformanceInfoService;
import com.service.empservice.AllEmployeeSalaryInfoService;

public class AllEmployeePerformanceInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AllEmployeePerformanceInfoService AllEmployeePerformanceInfoService=null;
		 
		AllEmployeePerformanceInfoService=new AllEmployeePerformanceInfoService();
		List<EmployeePerformanceAndReviewVO> EmployeePerformanceAndReviewVO=null;
		
		
		try {
			EmployeePerformanceAndReviewVO = AllEmployeePerformanceInfoService.getAllEmpPerformanceDetails();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    System.out.println(EmployeePerformanceAndReviewVO);
	    req.setAttribute("EmployeePerformanceAndReviewVO", EmployeePerformanceAndReviewVO);
		RequestDispatcher rs=req.getRequestDispatcher("/AllEmployeePerformanceDetails.jsp");
		rs.forward(req, res);

	}

	


}
