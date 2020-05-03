package com.reg.empservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.employee.EmpVo.AddRecruitedCandidateVO;
import com.employee.EmpVo.EmployeeCompleteInfoVO;
import com.service.empservice.AddRecruitedCandidateService;
import com.service.empservice.IndividualEmployeeInfoService;
import com.service.empservice.editRecruitedCandidateService;
@WebServlet("/editRecruitedCandidate")
public class editRecruitedCandidateServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service called...");
		
		String id =  req.getParameter("id");
		System.out.println("id..."+id);
		
		
		if(id != null && !id.trim().isEmpty()) {
		int empNo = Integer.parseInt(id);
	    editRecruitedCandidateService editRecruitedCandidateService=null;
	    editRecruitedCandidateService=new editRecruitedCandidateService();
		AddRecruitedCandidateVO AddRecruitedCandidateVO =  editRecruitedCandidateService.getRecruitedCandiateInfo(empNo);
	    System.out.println(AddRecruitedCandidateVO);
	    List<AddRecruitedCandidateVO>  AddRecruitedCandidateVOlist = new ArrayList<AddRecruitedCandidateVO>(); 
	    AddRecruitedCandidateVOlist.add(AddRecruitedCandidateVO);
	    req.setAttribute("AddRecruitedCandidateVOlist", AddRecruitedCandidateVOlist);
		RequestDispatcher rs=req.getRequestDispatcher("/editRecruitedCandidate.jsp");
		rs.forward(req, res);
	  }

	}

	
}
