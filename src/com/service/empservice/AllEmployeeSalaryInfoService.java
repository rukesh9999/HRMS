package com.service.empservice;

import java.util.ArrayList;
import java.util.List;

import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.regemp.empdao.AllEmployeeSalaryInfoDao;

public class AllEmployeeSalaryInfoService {
    
	
	public List<EmployeePaySalaryVO> getAllEmpSalDetails() throws ClassNotFoundException
	{

	AllEmployeeSalaryInfoDao AllEmployeeSalaryInfoDao=null;
	EmployeePaySalaryVO EmployeePaySalaryVO=null;
	AllEmployeeSalaryInfoDao=new AllEmployeeSalaryInfoDao();
	List<EmployeePaySalaryVO> EmployeePaySalaryVOs=new ArrayList<EmployeePaySalaryVO>(); 
	try {
		List <EmployeePaySalaryBO> EmployeePaySalaryBOs=AllEmployeeSalaryInfoDao.getAllEmpSalDetails();
	    for(int i=0;i<EmployeePaySalaryBOs.size();i++) {
	    	
	    	EmployeePaySalaryBO EmployeePaySalaryBO=EmployeePaySalaryBOs.get(i);
	    	EmployeePaySalaryVO =new EmployeePaySalaryVO();
	    	EmployeePaySalaryVO.setBasicsalary(EmployeePaySalaryBO.getBasicsalary());	
			EmployeePaySalaryVO.setCtc(EmployeePaySalaryBO.getCtc());
			EmployeePaySalaryVO.setDeductions(EmployeePaySalaryBO.getDeductions());
			EmployeePaySalaryVO.setEmpNo(EmployeePaySalaryBO.getEmpNo());
			EmployeePaySalaryVO.setGrosssalary(EmployeePaySalaryBO.getGrosssalary());
			EmployeePaySalaryVO.setHra(EmployeePaySalaryBO.getHra());
			EmployeePaySalaryVO.setNetpay(EmployeePaySalaryBO.getNetpay());
			EmployeePaySalaryVO.setOtherallowances(EmployeePaySalaryBO.getOtherallowances());
			EmployeePaySalaryVO.setPf(EmployeePaySalaryBO.getPf());
			EmployeePaySalaryVOs.add(EmployeePaySalaryVO);

	    	
	    }
		
			} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	  return EmployeePaySalaryVOs;
	 
}


}
  