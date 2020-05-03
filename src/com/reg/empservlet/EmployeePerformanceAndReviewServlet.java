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


import com.employee.EmpVo.EmployeePerformanceAndReviewVO;
import com.service.empservice.EmployeePerformanceAndReviewService;

public class EmployeePerformanceAndReviewServlet  extends HttpServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	    String EmployeeNo=   req.getParameter("empNo");
	    String CodingSkills =   req.getParameter("CodingSkills");
	    String Teamwork =   req.getParameter("Teamwork");
	    String Leadership=   req.getParameter("Leadership");
	    String GoalSetting =   req.getParameter("GoalSetting");
	    String Timemanagement =   req.getParameter("Timemanagement");
	    String Attendance=   req.getParameter("Attendance");
	    String OverallPerformance =   req.getParameter("OverallPerformance");
	    String TypeofBand =   req.getParameter("TypeofBand");
	    String Communication =   req.getParameter("Communication");
if(EmployeeNo != null && !EmployeeNo.trim().isEmpty() && CodingSkills != null && !CodingSkills.trim().isEmpty() && Teamwork != null && !Teamwork.trim().isEmpty() && Leadership != null && !Leadership.trim().isEmpty()  &&  GoalSetting != null && !GoalSetting.trim().isEmpty() && Timemanagement != null && !Timemanagement.trim().isEmpty() && OverallPerformance != null && !OverallPerformance.trim().isEmpty() && Attendance != null && !Attendance.trim().isEmpty()  && TypeofBand != null && !TypeofBand.trim().isEmpty()  && Communication != null && !Communication.trim().isEmpty())
{
	    System.out.println(EmployeeNo+""+CodingSkills+""+Teamwork+""+Leadership+""+GoalSetting+""+Timemanagement+""+Attendance+""+OverallPerformance+""+TypeofBand);
	    
	    EmployeePerformanceAndReviewVO EmployeePerformanceAndReviewVO=null;
	    EmployeePerformanceAndReviewVO =new EmployeePerformanceAndReviewVO();
	    
	    EmployeePerformanceAndReviewVO.setAttendance(Attendance);
	    EmployeePerformanceAndReviewVO.setCodingSkills(CodingSkills);
	    EmployeePerformanceAndReviewVO.setCommunication(Communication);
	    EmployeePerformanceAndReviewVO.setEmployeeNo(EmployeeNo);
	    EmployeePerformanceAndReviewVO.setGoalSetting(GoalSetting);
	    EmployeePerformanceAndReviewVO.setLeadership(Leadership);
	    EmployeePerformanceAndReviewVO.setTypeofBand(TypeofBand);
	    EmployeePerformanceAndReviewVO.setOverallPerformance(OverallPerformance);
	    EmployeePerformanceAndReviewVO.setTeamwork(Teamwork);
	    EmployeePerformanceAndReviewVO.setTimemanagement(Timemanagement);
	    
	    EmployeePerformanceAndReviewService EmployeePerformanceAndReviewService =null;
	    EmployeePerformanceAndReviewService=new EmployeePerformanceAndReviewService();
	    EmployeePerformanceAndReviewService.savePerformanceAndReviewService(EmployeePerformanceAndReviewVO);
	    
	    
	    req.setAttribute("EmployeeNo", EmployeeNo);
		RequestDispatcher rs=req.getRequestDispatcher("/SavePerformanceAndreview.jsp");
		rs.forward(req, res);

	    
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
	 
	 RequestDispatcher rs=req.getRequestDispatcher("/addperformance.jsp");
	 rs.forward(req, res);	 

}

}
}