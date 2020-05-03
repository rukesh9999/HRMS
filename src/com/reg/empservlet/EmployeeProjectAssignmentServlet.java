package com.reg.empservlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EmpBo.EmployeeProjectAssignmentBO;
import com.employee.EmpVo.EmployeeProjectAssignmentVO;
import com.service.empservice.EmployeeProjectAssignmentService;

import ccom.employee.util.convertEmployeeDate;

public class EmployeeProjectAssignmentServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
		 String empNo =   req.getParameter("empNo");
		 String typeofPROJECT =   req.getParameter("typeofPROJECT");
		 String nameoftheproject =   req.getParameter("nameoftheproject");
		 String noofleaves =   req.getParameter("status");
		 String startdate1=req.getParameter("startdate");
		 String enddate1=req.getParameter("enddate");
		 convertEmployeeDate convertEmployeeDate=new convertEmployeeDate();
		 String startdate=convertEmployeeDate.convertDate(startdate1);
		 String enddate=convertEmployeeDate.convertDate(enddate1);

   if(empNo != null && !empNo.trim().isEmpty() && typeofPROJECT != null && !typeofPROJECT.trim().isEmpty() && nameoftheproject != null && !nameoftheproject.trim().isEmpty() && noofleaves != null && !noofleaves.trim().isEmpty()  &&  startdate != null && !startdate.trim().isEmpty() && enddate != null && !enddate.trim().isEmpty())
   {
		 
		 EmployeeProjectAssignmentVO EmployeeProjectAssignmentVO=null;
		 EmployeeProjectAssignmentVO=new EmployeeProjectAssignmentVO();
		 EmployeeProjectAssignmentVO.setEmpNo(empNo);
		 EmployeeProjectAssignmentVO.setNameOfTheProject(nameoftheproject);
		 EmployeeProjectAssignmentVO.setTypeOfTheProject(typeofPROJECT);
		 EmployeeProjectAssignmentVO.setStartDate(startdate);
		 EmployeeProjectAssignmentVO.setEndDate(enddate);
		 EmployeeProjectAssignmentVO.setStatus(noofleaves);
		 EmployeeProjectAssignmentService  EmployeeProjectAssignmentService=null;
		 EmployeeProjectAssignmentService=new EmployeeProjectAssignmentService();
		 EmployeeProjectAssignmentService.assignProject(EmployeeProjectAssignmentVO);
		
		    req.setAttribute("empNo", empNo);
			RequestDispatcher rs=req.getRequestDispatcher("/assignedprojectsuccess.jsp");
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
		 
		 RequestDispatcher rs=req.getRequestDispatcher("/assignProject.jsp");
		 rs.forward(req, resp);	 

	}

		
	
	
 }
}