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
import javax.servlet.http.HttpSession;

import com.employee.EmpVo.EmployeeLoginVo;
import com.service.empservice.EmployeeLoginService;

public class EmployeeLoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String emailId=   req.getParameter("email");
	    String username =   req.getParameter("username");
	    String password =   req.getParameter("password");
	    EmployeeLoginService EmployeeLoginService=null;
	    
        if(emailId != null && !emailId.trim().isEmpty() && username != null && !username.trim().isEmpty() && password != null && !password.trim().isEmpty())
        {
	    EmployeeLoginService=new EmployeeLoginService();
	    System.out.println(EmployeeLoginService);
	    EmployeeLoginVo  EmployeeLoginVo= EmployeeLoginService.empLoginService(emailId);
		System.out.println("...."+EmployeeLoginVo+"...");
	    System.out.println(username+"..."+EmployeeLoginVo.getUserName()+"..."+password+"..."+EmployeeLoginVo.getPassword());
	    if(username.equals(EmployeeLoginVo.getUserName()) && password.equals(EmployeeLoginVo.getPassword()))
		{
			System.out.println("username and passwors are equal");
	    	req.setAttribute("username", username);
	    	HttpSession session =req.getSession();
	    	session.setAttribute("username", username);
			RequestDispatcher rs=req.getRequestDispatcher("/Loginsuccess.jsp");
			rs.forward(req, resp);

		}
	    else {
	    	List<String> checkempflag =new ArrayList<>();
			checkempflag.add("Employee  with "+emailId+" Posses  username  password  INVALID  please Register");
			req.setAttribute("flag", checkempflag);    	
	    	RequestDispatcher rs=req.getRequestDispatcher("/login.jsp");
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
					errors.add(""+key+"...is not valid");
					System.out.println(errors+"..errors");
					req.setAttribute("errorsData", errors);
				} 
			 }
			 
			 RequestDispatcher rs=req.getRequestDispatcher("/login.jsp");
			 rs.forward(req, resp);	 
		 }
 }
}
