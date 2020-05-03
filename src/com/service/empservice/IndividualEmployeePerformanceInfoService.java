package com.service.empservice;

import com.employee.EmpBo.EmployeeLeaveDetailsBo;
import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.employee.EmpVo.EmployeePerformanceAndReviewVO;

public class IndividualEmployeePerformanceInfoService {

	com.regemp.empdao.IndividualEmployeePerformanceInfoDao IndividualEmployeePerformanceInfoDao=null;
	com.employee.EmpVo.EmployeePerformanceAndReviewVO EmployeePerformanceAndReviewVO=null;
	public com.employee.EmpVo.EmployeePerformanceAndReviewVO getIndividualEmpPerformanceDetails(String empNo)
	{
		IndividualEmployeePerformanceInfoDao=new com.regemp.empdao.IndividualEmployeePerformanceInfoDao();
		EmployeePerformanceAndReviewVO=new com.employee.EmpVo.EmployeePerformanceAndReviewVO();
		try {
			EmployeePerformanceAndReviewBO EmployeePerformanceAndReviewBO=IndividualEmployeePerformanceInfoDao.getIndividualEmpPerformanceDetails(empNo);
			System.out.println(EmployeePerformanceAndReviewBO);
			EmployeePerformanceAndReviewVO.setAttendance(EmployeePerformanceAndReviewBO.getAttendance());;	
			EmployeePerformanceAndReviewVO.setCodingSkills(EmployeePerformanceAndReviewBO.getCodingSkills());;
			EmployeePerformanceAndReviewVO.setCommunication(EmployeePerformanceAndReviewBO.getCommunication());;
			EmployeePerformanceAndReviewVO.setEmployeeNo(EmployeePerformanceAndReviewBO.getEmployeeNo());;
			EmployeePerformanceAndReviewVO.setGoalSetting(EmployeePerformanceAndReviewBO.getGoalSetting());;
			EmployeePerformanceAndReviewVO.setLeadership(EmployeePerformanceAndReviewBO.getLeadership());;
			EmployeePerformanceAndReviewVO.setOverallPerformance(EmployeePerformanceAndReviewBO.getOverallPerformance());;
			EmployeePerformanceAndReviewVO.setTeamwork(EmployeePerformanceAndReviewBO.getTeamwork());;
			EmployeePerformanceAndReviewVO.setTimemanagement(EmployeePerformanceAndReviewBO.getTimemanagement());
			EmployeePerformanceAndReviewVO.setTypeofBand(EmployeePerformanceAndReviewBO.getTypeofBand());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return EmployeePerformanceAndReviewVO;
		 
	}

}
