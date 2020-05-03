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


import com.employee.EmpVo.AddRecruitedCandidateVO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.service.empservice.AddRecruitedCandidateService;
import com.service.empservice.EmployeePaySalaryService;
import com.sun.istack.internal.NotNull;

public class AddRecruitedCandidateServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id =   req.getParameter("id");
		String fullname =   req.getParameter("fullname");
	    String Percentage =   req.getParameter("percentage");
	    String branch =   req.getParameter("branch");
	    String Yearofpassedout =   req.getParameter("yearofpassedout");
	    
	    
if(fullname != null && !fullname.trim().isEmpty() && Percentage != null && !Percentage.trim().isEmpty() && branch != null && !branch.trim().isEmpty() && Yearofpassedout != null && !Yearofpassedout.trim().isEmpty() && id != null && !id.trim().isEmpty())
 {

      
	   AddRecruitedCandidateService AddRecruitedCandidateService=null;
	   AddRecruitedCandidateVO  AddRecruitedCandidateVO=null;
	  
	   double percentage = Double.parseDouble(Percentage);
	   int   yearofpassedout = Integer.parseInt(Yearofpassedout);
	   int   empid = Integer.parseInt(id);
 
	    	    
	    AddRecruitedCandidateVO = new  AddRecruitedCandidateVO();
	    AddRecruitedCandidateVO.setId(empid);
	    AddRecruitedCandidateVO.setBranch(branch);
	    AddRecruitedCandidateVO.setFullName(fullname);
	    AddRecruitedCandidateVO.setPercentage(percentage);;
	    AddRecruitedCandidateVO.setYearOFPassedOut(yearofpassedout);
	    
	    AddRecruitedCandidateService=new AddRecruitedCandidateService();
	    AddRecruitedCandidateService.AddRecruitedCandidate(AddRecruitedCandidateVO);;
	    
	    req.setAttribute("FullName", fullname);
		RequestDispatcher rs=req.getRequestDispatcher("/AddRecruitedCandidateSuccess.jsp");
		rs.forward(req, res);


	}

	
	
else  { 
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
		 
		 RequestDispatcher rs=req.getRequestDispatcher("/AddRecruitedCandidate.jsp");
		 rs.forward(req, res);	 
} 
  		
	
}
}