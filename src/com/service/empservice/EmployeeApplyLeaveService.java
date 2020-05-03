package com.service.empservice;

import com.employee.EmpBo.EmployeeApplyLeavesBo;
import com.employee.EmpVo.EmployeeApplyLeavesVo;
import com.regemp.empdao.EmployeeApplyLeaveDao;

public class EmployeeApplyLeaveService {

	public void empApplyLeave(EmployeeApplyLeavesVo EmployeeApplyLeavesVo)
	{
		EmployeeApplyLeaveDao EmployeeApplyLeaveDao=null;
		EmployeeApplyLeavesBo EmployeeApplyLeavesBo =null;
		EmployeeApplyLeavesBo=new EmployeeApplyLeavesBo();
		EmployeeApplyLeavesBo.setEmpNo(EmployeeApplyLeavesVo.getEmpNo());
		EmployeeApplyLeavesBo.setTypeOFLeave(EmployeeApplyLeavesVo.getTypeOFLeave());
		EmployeeApplyLeavesBo.setStartDate(EmployeeApplyLeavesVo.getStartDate());
		EmployeeApplyLeavesBo.setEndDate(EmployeeApplyLeavesVo.getEndDate());
		EmployeeApplyLeavesBo.setNoOfLeaves(EmployeeApplyLeavesVo.getNoOfLeaves());
		EmployeeApplyLeaveDao=new EmployeeApplyLeaveDao();
		try {
			EmployeeApplyLeaveDao.empApplyLeave(EmployeeApplyLeavesBo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
