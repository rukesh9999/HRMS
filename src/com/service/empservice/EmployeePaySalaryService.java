package com.service.empservice;

import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpBo.EmployeeProjectAssignmentBO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.employee.EmpVo.EmployeeProjectAssignmentVO;
import com.regemp.empdao.EmployeePaySalaryDao;
import com.regemp.empdao.EmployeeProjectAssignmentDao;

public class EmployeePaySalaryService {

	
	public  void  paySalary(EmployeePaySalaryVO EmployeePaySalaryVO)
	{
		EmployeePaySalaryBO EmployeePaySalaryBO=null;
		
		
		EmployeePaySalaryBO=new EmployeePaySalaryBO();
		EmployeePaySalaryBO.setEmpNo(EmployeePaySalaryVO.getEmpNo());
		EmployeePaySalaryBO.setBasicsalary(EmployeePaySalaryVO.getBasicsalary());
		EmployeePaySalaryBO.setCtc(EmployeePaySalaryVO.getCtc());
		EmployeePaySalaryBO.setDeductions(EmployeePaySalaryVO.getDeductions());
		EmployeePaySalaryBO.setGrosssalary(EmployeePaySalaryVO.getGrosssalary());
		EmployeePaySalaryBO.setHra(EmployeePaySalaryVO.getHra());
		EmployeePaySalaryBO.setNetpay(EmployeePaySalaryVO.getNetpay());
		EmployeePaySalaryBO.setOtherallowances(EmployeePaySalaryVO.getOtherallowances());
		EmployeePaySalaryBO.setPf(EmployeePaySalaryVO.getPf());
		
		EmployeePaySalaryDao EmployeePaySalaryDao=null;
		EmployeePaySalaryDao=new EmployeePaySalaryDao();
		
		try {
			EmployeePaySalaryDao.paySalary(EmployeePaySalaryBO);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
