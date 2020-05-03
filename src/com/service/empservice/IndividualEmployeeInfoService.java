package com.service.empservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.EmpBo.EmployeeCompleteInfoBO;
import com.employee.EmpBo.EmployeeLeaveDetailsBo;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;
import com.employee.EmpVo.EmployeeCompleteInfoVO;

public class IndividualEmployeeInfoService {

		com.regemp.empdao.IndividualEmployeeInfoDao IndividualEmployeeInfoDao=null;
		com.employee.EmpVo.EmployeeCompleteInfoVO EmployeeCompleteInfoVO=null;
		public  EmployeeCompleteInfoVO getIndividualEmpInfo(String empNo)
		{
			IndividualEmployeeInfoDao=new com.regemp.empdao.IndividualEmployeeInfoDao();
			EmployeeCompleteInfoVO=new com.employee.EmpVo.EmployeeCompleteInfoVO();
			try {
				EmployeeCompleteInfoBO EmployeeCompleteInfoBO=IndividualEmployeeInfoDao.getIndividualEmpInfo(empNo);
				System.out.println(EmployeeCompleteInfoBO);
				EmployeeCompleteInfoVO.setCtc(EmployeeCompleteInfoBO.getCtc());	
				EmployeeCompleteInfoVO.setDepartment(EmployeeCompleteInfoBO.getDepartment());;
				EmployeeCompleteInfoVO.setEmailId(EmployeeCompleteInfoBO.getEmailId());
				EmployeeCompleteInfoVO.setEmployeeperformance(EmployeeCompleteInfoBO.getEmployeeperformance());;
				EmployeeCompleteInfoVO.setEmpName(EmployeeCompleteInfoBO.getEmpName());;
				EmployeeCompleteInfoVO.setEmpNo(EmployeeCompleteInfoBO.getEmpNo());
				EmployeeCompleteInfoVO.setNameoftheProject(EmployeeCompleteInfoBO.getNameoftheProject());
				EmployeeCompleteInfoVO.setProjectStatus(EmployeeCompleteInfoBO.getProjectStatus());
				EmployeeCompleteInfoVO.setTypeofband(EmployeeCompleteInfoBO.getTypeofband());

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return EmployeeCompleteInfoVO;
			 
		}

	
	 
	
	
	
	
	
	
	}
	

