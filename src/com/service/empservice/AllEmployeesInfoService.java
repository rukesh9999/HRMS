package com.service.empservice;

import java.util.ArrayList;
import java.util.List;

import com.employee.EmpBo.EmployeeCompleteInfoBO;
import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpVo.EmployeeCompleteInfoVO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.regemp.empdao.AllEmployeeSalaryInfoDao;
import com.regemp.empdao.AllEmployeesInfoDao;

public class AllEmployeesInfoService {

	
	public List<EmployeeCompleteInfoVO> getAllEmpsInfo() throws ClassNotFoundException
	{

	AllEmployeesInfoDao AllEmployeesInfoDao=null;
	EmployeeCompleteInfoVO EmployeeCompleteInfoVO=null;
	AllEmployeesInfoDao=new AllEmployeesInfoDao();
	List<EmployeeCompleteInfoVO> EmployeeCompleteInfoVOs=new ArrayList<EmployeeCompleteInfoVO>(); 
	try {
		List <EmployeeCompleteInfoBO> EmployeeCompleteInfoBOs=AllEmployeesInfoDao.getAllEmpsInfo();
	    for(int i=0;i<EmployeeCompleteInfoBOs.size();i++) {
	    	
	    	EmployeeCompleteInfoBO EmployeeCompleteInfoBO=EmployeeCompleteInfoBOs.get(i);
	    	System.out.println("from..."+EmployeeCompleteInfoBO);
	    	EmployeeCompleteInfoVO =new EmployeeCompleteInfoVO();
	    	EmployeeCompleteInfoVO.setCtc(EmployeeCompleteInfoBO.getCtc());	
	    	EmployeeCompleteInfoVO.setDepartment(EmployeeCompleteInfoBO.getDepartment());
	    	EmployeeCompleteInfoVO.setEmailId(EmployeeCompleteInfoBO.getEmailId());
	    	EmployeeCompleteInfoVO.setEmployeeperformance(EmployeeCompleteInfoBO.getEmployeeperformance());
	    	EmployeeCompleteInfoVO.setEmpName(EmployeeCompleteInfoBO.getEmpName());
	    	EmployeeCompleteInfoVO.setEmpNo(EmployeeCompleteInfoBO.getEmpNo());
	    	EmployeeCompleteInfoVO.setProjectStatus(EmployeeCompleteInfoBO.getProjectStatus());
			EmployeeCompleteInfoVO.setNameoftheProject(EmployeeCompleteInfoBO.getNameoftheProject());
			EmployeeCompleteInfoVO.setTypeofband(EmployeeCompleteInfoBO.getTypeofband());
			EmployeeCompleteInfoVOs.add(EmployeeCompleteInfoVO);
	    	
	    }
		
			} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	  return EmployeeCompleteInfoVOs;
	 
	}
	
}
