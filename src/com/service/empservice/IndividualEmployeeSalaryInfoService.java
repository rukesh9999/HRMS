package com.service.empservice;


import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;
import com.employee.EmpVo.EmployeePerformanceAndReviewVO;

public class IndividualEmployeeSalaryInfoService {

	com.regemp.empdao.IndividualEmployeeSalaryInfoDao IndividualEmployeeSalaryInfoDao=null;
	com.employee.EmpVo.EmployeePaySalaryVO EmployeePaySalaryVO=null;
	public com.employee.EmpVo.EmployeePaySalaryVO getIndividualEmpSalDetails(String empNo)
	{
		IndividualEmployeeSalaryInfoDao=new com.regemp.empdao.IndividualEmployeeSalaryInfoDao();
		EmployeePaySalaryVO=new com.employee.EmpVo.EmployeePaySalaryVO();
		try {
			EmployeePaySalaryBO	EmployeePaySalaryBO =IndividualEmployeeSalaryInfoDao.getIndividualEmpSalDetails(empNo) ;
			EmployeePaySalaryVO.setBasicsalary(EmployeePaySalaryBO.getBasicsalary());	
			EmployeePaySalaryVO.setCtc(EmployeePaySalaryBO.getCtc());
			EmployeePaySalaryVO.setDeductions(EmployeePaySalaryBO.getDeductions());
			EmployeePaySalaryVO.setEmpNo(EmployeePaySalaryBO.getEmpNo());
			EmployeePaySalaryVO.setGrosssalary(EmployeePaySalaryBO.getGrosssalary());
			EmployeePaySalaryVO.setHra(EmployeePaySalaryBO.getHra());
			EmployeePaySalaryVO.setNetpay(EmployeePaySalaryBO.getNetpay());
			EmployeePaySalaryVO.setOtherallowances(EmployeePaySalaryBO.getOtherallowances());
			EmployeePaySalaryVO.setPf(EmployeePaySalaryBO.getPf());
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return EmployeePaySalaryVO;
		 
	}


}
