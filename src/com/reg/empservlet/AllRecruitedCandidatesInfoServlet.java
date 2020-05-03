package com.reg.empservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EmpVo.AddRecruitedCandidateVO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.service.empservice.AllEmployeeSalaryInfoService;
import com.service.empservice.AllRecruitedCandidatesInfoService;

public class AllRecruitedCandidatesInfoServlet  extends HttpServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AllRecruitedCandidatesInfoService AllRecruitedCandidatesInfoService=null;
		 
		AllRecruitedCandidatesInfoService=new AllRecruitedCandidatesInfoService();
		List<AddRecruitedCandidateVO> AddRecruitedCandidateVOs=null;
		
		
		try {
			AddRecruitedCandidateVOs = AllRecruitedCandidatesInfoService.getAllRecruitedCandidatesInfo();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    System.out.println(AddRecruitedCandidateVOs);
	    req.setAttribute("AddRecruitedCandidateVOs", AddRecruitedCandidateVOs);
		RequestDispatcher rs=req.getRequestDispatcher("/AllRecruitedCandidatesDeatils.jsp");
		rs.forward(req, res);

	
	}
}
