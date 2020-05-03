package com.reg.empservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EmpVo.EmployeePaySalaryVO;
import com.employee.EmpVo.EmployeePerformanceAndReviewVO;
import com.service.empservice.IndividualEmployeeSalaryInfoService;
import com.service.empservice.IndividualEmployeePerformanceInfoService;

public class IndividualEmployeePerformanceInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String empNo  =   req.getParameter("empNo");
		 if(empNo != null && !empNo.trim().isEmpty()) {
		 IndividualEmployeePerformanceInfoService IndividualEmployeePerformanceInfoService=null;
		 IndividualEmployeePerformanceInfoService=new IndividualEmployeePerformanceInfoService();
		 EmployeePerformanceAndReviewVO EmployeePerformanceAndReviewVO=  IndividualEmployeePerformanceInfoService.getIndividualEmpPerformanceDetails(empNo);

	    System.out.println("in servlet..."+EmployeePerformanceAndReviewVO);
	    req.setAttribute("EmployeePerformanceAndReviewVO", EmployeePerformanceAndReviewVO);
		RequestDispatcher rs=req.getRequestDispatcher("/individualEmployeePerformanceInfo.jsp");
		rs.forward(req, res);

		 }
		 else 
		 {
			 Map<String, String[]> requestDataMap = req.getParameterMap();
			 List<String> errors =new ArrayList<>();
			 
			 for(String key:requestDataMap.keySet())
			 {
				if(requestDataMap.get(key)[0].isEmpty() && requestDataMap.get(key)[0].trim().length()<=0) 
				 {
					errors.add(""+key+"...is not valid");
					System.out.println(errors+"..errors");
					req.setAttribute("errorsData", errors);
				} 
			 }
			 
			 RequestDispatcher rs=req.getRequestDispatcher("/getIndividualEmployeePerformanceInfo.jsp");
			 rs.forward(req, res);	 
		 }
}
}