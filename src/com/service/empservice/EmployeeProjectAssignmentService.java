package com.service.empservice;

import com.employee.EmpBo.EmployeeProjectAssignmentBO;
import com.employee.EmpVo.EmployeeProjectAssignmentVO;
import com.regemp.empdao.EmployeeProjectAssignmentDao;

public class EmployeeProjectAssignmentService {

	
	public  void  assignProject(EmployeeProjectAssignmentVO EmployeeProjectAssignmentVO)
	{
		EmployeeProjectAssignmentBO EmployeeProjectAssignmentBo=null;
		EmployeeProjectAssignmentBo=new EmployeeProjectAssignmentBO();
		EmployeeProjectAssignmentBo.setEmpNo(EmployeeProjectAssignmentVO.getEmpNo());
		EmployeeProjectAssignmentBo.setNameOfTheProject(EmployeeProjectAssignmentVO.getNameOfTheProject());
		EmployeeProjectAssignmentBo.setStartDate(EmployeeProjectAssignmentVO.getStartDate());
		EmployeeProjectAssignmentBo.setEndDate(EmployeeProjectAssignmentVO.getEndDate());
		EmployeeProjectAssignmentBo.setTypeOfTheProject(EmployeeProjectAssignmentVO.getTypeOfTheProject());
		EmployeeProjectAssignmentBo.setStatus(EmployeeProjectAssignmentVO.getStatus());
		
		EmployeeProjectAssignmentDao EmployeeProjectAssignmentDao=null;
		EmployeeProjectAssignmentDao=new EmployeeProjectAssignmentDao();
		
		try {
			EmployeeProjectAssignmentDao.assignProject(EmployeeProjectAssignmentBo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
