package com.service.empservice;

import com.employee.EmpBo.EmployeeLeaveDetailsBo;
import com.employee.EmpVo.EmployeeApplyLeavesVo;

public class EmployeeLeaveDetailsService {

	com.regemp.empdao.EmployeeLeaveDetailsDao EmployeeLeaveDetailsDao=null;
	com.employee.EmpVo.EmployeeLeaveDetailsVo EmployeeLeaveDetailsVo=null;
	public com.employee.EmpVo.EmployeeLeaveDetailsVo getEmpLeaves(String empNo)
	{
		EmployeeLeaveDetailsDao=new com.regemp.empdao.EmployeeLeaveDetailsDao();
		EmployeeLeaveDetailsVo=new com.employee.EmpVo.EmployeeLeaveDetailsVo();
		try {
			EmployeeLeaveDetailsBo EmployeeLeaveDetailsBo=EmployeeLeaveDetailsDao.getEmpLeaves(empNo);
			EmployeeLeaveDetailsVo.setEmpNo(EmployeeLeaveDetailsBo.getEmpNo());
			EmployeeLeaveDetailsVo.setTypeOfLeave(EmployeeLeaveDetailsBo.getTypeOfLeave());
			EmployeeLeaveDetailsVo.setStartDate(EmployeeLeaveDetailsBo.getStartDate());
			EmployeeLeaveDetailsVo.setEndDate(EmployeeLeaveDetailsBo.getEndDate());
			EmployeeLeaveDetailsVo.setNoOfLeaves(EmployeeLeaveDetailsBo.getNoOfLeaves());
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return EmployeeLeaveDetailsVo;
		 
	}
}
