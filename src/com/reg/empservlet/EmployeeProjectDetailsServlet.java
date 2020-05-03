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

import com.employee.EmpVo.EmployeeLeaveDetailsVo;
import com.employee.EmpVo.EmployeeProjectDeatilsVO;
import com.service.empservice.EmployeeLeaveDetailsService;
import com.service.empservice.EmployeeProjectDeatilsService;

public class EmployeeProjectDetailsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String empNo =   req.getParameter("empNo");
		 
		 if(empNo != null && !empNo.trim().isEmpty())
		 {
		 
		 EmployeeProjectDeatilsService EmployeeProjectDeatilsService=null;
		 
		 EmployeeProjectDeatilsService=new EmployeeProjectDeatilsService();
		 EmployeeProjectDeatilsVO EmployeeProjectDeatilsVO =  EmployeeProjectDeatilsService.getEmpProjects(empNo);

	    System.out.println(EmployeeProjectDeatilsVO);
	    req.setAttribute("EmployeeProjectDeatilsVO", EmployeeProjectDeatilsVO);
		RequestDispatcher rs=req.getRequestDispatcher("/employeeprojectsInfo.jsp");
		rs.forward(req, resp);

	}

		 else {
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
				 
				 RequestDispatcher rs=req.getRequestDispatcher("/getProjectDetails.jsp");
				 rs.forward(req, resp);	 

			}

				

		
	
}
}