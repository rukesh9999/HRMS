package com.reg.empservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EmpVo.EmployeeCompleteInfoVO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.service.empservice.AllEmployeeSalaryInfoService;
import com.service.empservice.AllEmployeesInfoService;

public class AllEmployeesInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AllEmployeesInfoService AllEmployeesInfoService=null;
		 
		AllEmployeesInfoService=new AllEmployeesInfoService();
			List<EmployeeCompleteInfoVO> EmployeeCompleteInfoVOs=null;
			
			
			try {
				EmployeeCompleteInfoVOs = AllEmployeesInfoService.getAllEmpsInfo();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    System.out.println("from servlet...."+EmployeeCompleteInfoVOs);
		    req.setAttribute("EmployeeCompleteInfoVOs", EmployeeCompleteInfoVOs);
			RequestDispatcher rs=req.getRequestDispatcher("/AllEmployeesInfo.jsp");
			rs.forward(req, resp);

		}

	}

	

