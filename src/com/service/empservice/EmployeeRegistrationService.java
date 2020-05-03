package com.service.empservice;


import com.employee.EmpBo.EmployeeRegistrationBo;
import com.employee.EmpVo.EmployeeRegistrationVo;

public class EmployeeRegistrationService {

	com.regemp.empdao.EmployeeRegisterDao RegisterDao=null;
	public void regService(EmployeeRegistrationVo employeeVo) {
		System.out.println("service called...");
		RegisterDao=new com.regemp.empdao.EmployeeRegisterDao();
		EmployeeRegistrationBo EmployeeBo =new EmployeeRegistrationBo();
		
		
		EmployeeBo.setDepartment(employeeVo.getDepartment());
		EmployeeBo.setEmpName(employeeVo.getEmpName());
		EmployeeBo.setEmpNo(employeeVo.getEmpNo());
		EmployeeBo.setSalary(employeeVo.getSalary());
		EmployeeBo.setEmailId(employeeVo.getEmailId());
		EmployeeBo.setUsername(employeeVo.getUsername());
		EmployeeBo.setPassword(employeeVo.getPassword());
		EmployeeBo.setHireDate(employeeVo.getHireDate());
		try {
			System.out.println("adding to dao .....");

			RegisterDao.registerEmp(EmployeeBo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
