package com.service.empservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.EmployeeLeaveDetailsBo;
import com.employee.EmpBo.EmployeeProjectDeatilsBO;
import com.employee.EmpVo.EmployeeProjectDeatilsVO;
import com.regemp.empdao.EmployeeLeaveDetailsDao;
import com.sun.org.apache.xerces.internal.util.Status;

public class EmployeeProjectDeatilsService {

	
	com.regemp.empdao.EmployeeProjectDetailsDao EmployeeProjectDetailsDao=null;
	EmployeeProjectDeatilsVO EmployeeProjectDetailsVo=null;
	public EmployeeProjectDeatilsVO getEmpProjects(String empNo)
	{
		EmployeeProjectDetailsDao=new com.regemp.empdao.EmployeeProjectDetailsDao();
		EmployeeProjectDetailsVo=new EmployeeProjectDeatilsVO();
		try {
			EmployeeProjectDeatilsBO EmployeeProjectDetailsBO=EmployeeProjectDetailsDao.getEmpProjects(empNo);
			EmployeeProjectDetailsVo.setEmpNo(EmployeeProjectDetailsBO.getEmpNo());
			EmployeeProjectDetailsVo.setTypeOfTheProject(EmployeeProjectDetailsBO.getTypeOfTheProject());
			EmployeeProjectDetailsVo.setNameOfTheProject(EmployeeProjectDetailsBO.getNameOfTheProject());
			EmployeeProjectDetailsVo.setStartDate(EmployeeProjectDetailsBO.getStartDate());
			EmployeeProjectDetailsVo.setEndDate(EmployeeProjectDetailsBO.getEndDate());
			EmployeeProjectDetailsVo.setStatus(EmployeeProjectDetailsBO.getStatus());
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return EmployeeProjectDetailsVo;
		 
	}
}
