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

import com.employee.EmpVo.EmployeeCompleteInfoVO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.service.empservice.IndividualEmployeeInfoService;
import com.service.empservice.IndividualEmployeeSalaryInfoService;

public class IndividualEmployeeInfoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
 	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String empNo =   req.getParameter("empNo");
		 if(empNo != null && !empNo.trim().isEmpty()) {

		 IndividualEmployeeInfoService IndividualEmployeeInfoService=null;
		 
		 IndividualEmployeeInfoService=new IndividualEmployeeInfoService();
		 EmployeeCompleteInfoVO EmployeeCompleteInfoVO =  IndividualEmployeeInfoService.getIndividualEmpInfo(empNo);

	    System.out.println(EmployeeCompleteInfoVO);
	    req.setAttribute("EmployeeCompleteInfoVO", EmployeeCompleteInfoVO);
		RequestDispatcher rs=req.getRequestDispatcher("/IndividualEmployeeInfo.jsp");
		rs.forward(req, resp);

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
			 
			 RequestDispatcher rs=req.getRequestDispatcher("/getIndividualEmployeeInfo.jsp");
			 rs.forward(req, resp);	 
		  
		 }
	
    }

	
	
	}

	 
	


