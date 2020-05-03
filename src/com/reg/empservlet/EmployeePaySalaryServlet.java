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

import com.employee.EmpVo.EmployeeApplyLeavesVo;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.service.empservice.EmployeeApplyLeaveService;
import com.service.empservice.EmployeePaySalaryService;

public class EmployeePaySalaryServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6285730362471125411L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		    String empNo =   req.getParameter("empNo");
		    String Basicsalary =   req.getParameter("basicsalary");
		    String Hra =   req.getParameter("hra");
		    String Otherallowances =   req.getParameter("otherallowances");
		    String Grosssalary =   req.getParameter("grosssalary");
		    String Pf =   req.getParameter("pf");
		    String Ctc =   req.getParameter("ctc");
		    String Deductions =   req.getParameter("deductions");
		    String Netpay =   req.getParameter("netpay");
 if(empNo != null && !empNo.trim().isEmpty() && Basicsalary != null && !Basicsalary.trim().isEmpty() && Hra != null && !Hra.trim().isEmpty() && Otherallowances != null && !Otherallowances.trim().isEmpty()  &&  Grosssalary != null && !Grosssalary.trim().isEmpty() && Pf != null && !Pf.trim().isEmpty() && Ctc != null && !Ctc.trim().isEmpty() && Deductions != null && !Deductions.trim().isEmpty()  && Netpay != null && !Netpay.trim().isEmpty())			 
 {		     double basicsalary = Double.parseDouble(Basicsalary);
		     double hra = Double.parseDouble(Hra);
		     double otherallowances = Double.parseDouble(Otherallowances);
		     double grosssalary = Double.parseDouble(Grosssalary);
		     double pf = Double.parseDouble(Pf);
		     double ctc = Double.parseDouble(Ctc);
		     double deductions = Double.parseDouble(Deductions);
		     double netpay = Double.parseDouble(Netpay);

		     
		   
		    EmployeePaySalaryService EmployeePaySalaryService=null;
		    EmployeePaySalaryVO  EmployeePaySalaryVO=null;
		    
		    
		    
		    EmployeePaySalaryVO = new  EmployeePaySalaryVO();
		    EmployeePaySalaryVO.setEmpNo(empNo);
		    EmployeePaySalaryVO.setBasicsalary(basicsalary);
		    EmployeePaySalaryVO.setHra(hra);
		    EmployeePaySalaryVO.setOtherallowances(otherallowances);
		    EmployeePaySalaryVO.setGrosssalary(grosssalary);
		    EmployeePaySalaryVO.setPf(pf);
		    EmployeePaySalaryVO.setCtc(ctc);
		    EmployeePaySalaryVO.setDeductions(deductions);
		    EmployeePaySalaryVO.setNetpay(netpay);
		    
		    
		    EmployeePaySalaryService=new EmployeePaySalaryService();
		    EmployeePaySalaryService.paySalary(EmployeePaySalaryVO);
		    
		    req.setAttribute("empNo", empNo);
			RequestDispatcher rs=req.getRequestDispatcher("/paysalarysuccess.jsp");
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
	 
	 RequestDispatcher rs=req.getRequestDispatcher("/paysalary.jsp");
	 rs.forward(req, resp);	 
 }
		 
 }
}
