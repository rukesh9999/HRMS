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
import com.service.empservice.deleteRecruitedCandidateService;
import com.service.empservice.editRecruitedCandidateService;

@WebServlet(urlPatterns = "/deleteRecruitedCandidateServlet")
public class deleteRecruitedCandidateServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id =  req.getParameter("id");
		System.out.println("id..."+id);

		if(id != null && !id.trim().isEmpty()) {
		int empNo = Integer.parseInt(id);
		deleteRecruitedCandidateService deleteRecruitedCandidateService=null;
		deleteRecruitedCandidateService=new deleteRecruitedCandidateService();
	    deleteRecruitedCandidateService.deleteRecruitedCandiateInfo(empNo);
	    req.setAttribute("empNo", empNo);
		RequestDispatcher rs=req.getRequestDispatcher("/AllRecruitedCandidatesInfoServlet");
		rs.forward(req, res);
	
	}
   }
}
