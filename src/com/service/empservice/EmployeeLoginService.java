package com.service.empservice;

import com.employee.EmpBo.EmployeeLoginBo;
import com.employee.EmpVo.EmployeeLoginVo;

public class EmployeeLoginService {

	com.regemp.empdao.EmployeeLoginDao EmployeeLoginDao=null;
	EmployeeLoginVo  EmployeeLoginVo=null;
	public EmployeeLoginVo empLoginService(String emailId)
	{
		EmployeeLoginDao=new com.regemp.empdao.EmployeeLoginDao();
		EmployeeLoginBo EmployeeLoginBo;
		try {
			
			EmployeeLoginBo = EmployeeLoginDao.empLogin(emailId);
			EmployeeLoginVo=new EmployeeLoginVo();
		    EmployeeLoginVo.setUserName(EmployeeLoginBo.getUserName());
			EmployeeLoginVo.setPassword(EmployeeLoginBo.getPassword());
				
		   
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   System.out.println("returning to Loginservlet");
		
		return EmployeeLoginVo;
		
	
	}
	



}