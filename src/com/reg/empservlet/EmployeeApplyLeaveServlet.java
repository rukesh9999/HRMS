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

import com.employee.EmpVo.EmployeeApplyLeavesVo;
import com.employee.EmpVo.EmployeeLoginVo;
import com.service.empservice.EmployeeApplyLeaveService;
import com.service.empservice.EmployeeLoginService;

import ccom.employee.util.convertEmployeeDate;

public class EmployeeApplyLeaveServlet  extends HttpServlet{

	private static final long serialVersionUID = 8908363035495895962L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    String empNo =     req.getParameter("empNo");
		    String typeofleave =   req.getParameter("typeofleave");
		    String Startdate1 = req.getParameter("startdate");
		    String Enddate1=req.getParameter("enddate");
            String Noofleaves =   req.getParameter("noofleaves");
    	    convertEmployeeDate convertEmployeeDate=new convertEmployeeDate();
   		    String Startdate= convertEmployeeDate.convertDate(Startdate1);
   		    String Enddate= convertEmployeeDate.convertDate(Enddate1);

            
            
  if(empNo != null && !empNo.trim().isEmpty() && typeofleave != null && !typeofleave.trim().isEmpty() && Startdate != null && !Startdate.trim().isEmpty() && Enddate != null && !Enddate.trim().isEmpty()  &&  Noofleaves != null && !Noofleaves.trim().isEmpty())
  {	      
		    
			int   noofleaves  =   Integer.parseInt(Noofleaves);
		    EmployeeApplyLeaveService EmployeeApplyLeaveService=null;
		    EmployeeApplyLeavesVo  EmployeeApplyLeavesVo=null;
		    EmployeeApplyLeavesVo = new  EmployeeApplyLeavesVo();
		    EmployeeApplyLeavesVo.setEmpNo(empNo);
		    EmployeeApplyLeavesVo.setTypeOFLeave(typeofleave);
		    EmployeeApplyLeavesVo.setStartDate(Startdate);
		    EmployeeApplyLeavesVo.setEndDate(Enddate);
		    EmployeeApplyLeavesVo.setNoOfLeaves(noofleaves);
		    EmployeeApplyLeaveService=new EmployeeApplyLeaveService();
		    EmployeeApplyLeaveService.empApplyLeave(EmployeeApplyLeavesVo);
		    
		    req.setAttribute("username", empNo);
			RequestDispatcher rs=req.getRequestDispatcher("/leavesuccess.jsp");
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
		 
		 RequestDispatcher rs=req.getRequestDispatcher("/applyLeave.jsp");
		 rs.forward(req, resp);	 
	 }
			 
			 
					
	}
}
