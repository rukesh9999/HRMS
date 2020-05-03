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
import com.employee.EmpVo.EmployeeProjectDeatilsVO;
import com.service.empservice.EmployeeProjectDeatilsService;
import com.service.empservice.IndividualEmployeePerformanceInfoService;
import com.service.empservice.IndividualEmployeeSalaryInfoService;

public class IndividualEmployeeSalaryInfoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String empNo =   req.getParameter("empNo");
		 if(empNo != null && !empNo.trim().isEmpty()) {

		 IndividualEmployeeSalaryInfoService IndividualEmployeeSalaryInfoService=null;
		 
		 IndividualEmployeeSalaryInfoService=new IndividualEmployeeSalaryInfoService();
		 EmployeePaySalaryVO EmployeePaySalaryVO =  IndividualEmployeeSalaryInfoService.getIndividualEmpSalDetails(empNo);

	    System.out.println(EmployeePaySalaryVO);
	    req.setAttribute("EmployeePaySalaryVO", EmployeePaySalaryVO);
		RequestDispatcher rs=req.getRequestDispatcher("/IndividualEmployeeSalaryDetails.jsp");
		rs.forward(req, res);

	}
		 else {
			
			 Map<String, String[]> requestDataMap = req.getParameterMap();
			 List<String> errors =new ArrayList<>();
			 
			 for(String key:requestDataMap.keySet())
			 {
				if(requestDataMap.get(key)[0].equals("") &&  requestDataMap.get(key)[0].trim().length()<=0) {
					errors.add(""+key+"...is not valid");
					req.setAttribute("errorsData", errors);
				} 
			 }
			 
			 RequestDispatcher rs=req.getRequestDispatcher("/getIndividualEmployeeSalaryInfo.jsp");
			 rs.forward(req, res);	 
		  
		 }
	
    }
}