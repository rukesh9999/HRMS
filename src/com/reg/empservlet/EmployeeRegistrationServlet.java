package com.reg.empservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EmpVo.EmployeeRegistrationVo;
import com.regemp.empdao.CheckEmployeeExitsOrNotDao;
import com.service.empservice.EmployeeRegistrationService;

import ccom.employee.util.convertEmployeeDate;

public class EmployeeRegistrationServlet extends HttpServlet{

   private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service called..");
		
		String empNo=req.getParameter("empNo");
		String empName = req.getParameter("empname");
		String Salary =  req.getParameter("salary");
		String department = req.getParameter("department");
	    String emailId = req.getParameter("email");
		String username =  req.getParameter("username");
		String password =  req.getParameter("password");
		String hireDate1=req.getParameter("hiredate");
		convertEmployeeDate convertEmployeeDate=new convertEmployeeDate();
		String hireDate= convertEmployeeDate.convertDate(hireDate1);
		Boolean flag=false;
	 if(empNo != null && !empNo.trim().isEmpty() && empName != null && !empName.trim().isEmpty() && Salary != null && !Salary.trim().isEmpty() && department != null && !department.trim().isEmpty()  &&  emailId != null && !emailId.trim().isEmpty() && username != null && !username.trim().isEmpty() &&  password != null && !password.trim().isEmpty() && hireDate != null && !hireDate.trim().isEmpty() )
       {
		 
		 CheckEmployeeExitsOrNotDao CheckEmployeeExitsOrNotDao=new CheckEmployeeExitsOrNotDao();
		try {
			  flag= CheckEmployeeExitsOrNotDao.checkEmp(emailId);
			  System.out.println("flag..."+flag);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag==false) {
		System.out.println(hireDate);
        Double salary =  Double.parseDouble(Salary);
		System.out.println("acesses parameters...");
		EmployeeRegistrationVo EmployeeVo=new EmployeeRegistrationVo();
		EmployeeVo.setDepartment(department);
		EmployeeVo.setEmpName(empName);
		EmployeeVo.setEmpNo(empNo);
		EmployeeVo.setSalary(salary);
		EmployeeVo.setEmailId(emailId);
		EmployeeVo.setUsername(username);
		EmployeeVo.setPassword(password);
		EmployeeVo.setHireDate(hireDate);
		
		EmployeeRegistrationService RegistrationService=new EmployeeRegistrationService();
		RegistrationService.regService(EmployeeVo);
		PrintWriter pw=resp.getWriter();
		pw.print(empName+"..added succesfully..");
		
		System.out.println("added to registrstion servlet... ");
		req.setAttribute("empName", empName);
		RequestDispatcher rs=req.getRequestDispatcher("/registratonSuccess.jsp");
		rs.forward(req, resp);
		}
		
		else {
			List<String> checkempflag =new ArrayList<>();
			checkempflag.add("Employee "+empNo+" with  "+emailId+ " already exists");
			req.setAttribute("flag", checkempflag);
			RequestDispatcher rs=req.getRequestDispatcher("/Registration.jsp");
			rs.forward(req, resp);	 

		}
	}

	
	
else {
	Map<String, String[]> requestDataMap = req.getParameterMap();
	 List<String> errors =new ArrayList<>();
	 
	 for(String key:requestDataMap.keySet())
	 {
		if(requestDataMap.get(key)[0].isEmpty() && requestDataMap.get(key)[0].trim().length()<=0) 
		 {
			errors.add(""+key+"    is not valid");
			req.setAttribute("errorsData", errors);
		} 
	 }
	 
	 RequestDispatcher rs=req.getRequestDispatcher("/Registration.jsp");
	 rs.forward(req, resp);	 

}

		
		
	
}
}
