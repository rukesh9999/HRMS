package com.service.empservice;

import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.employee.EmpVo.EmployeePerformanceAndReviewVO;
import com.regemp.empdao.EmployeePaySalaryDao;
import com.regemp.empdao.EmployeePerformanceAndReviewDao;

public class EmployeePerformanceAndReviewService {
	
	public  void  savePerformanceAndReviewService(EmployeePerformanceAndReviewVO EmployeePerformanceAndRevieVO)
	{
		EmployeePerformanceAndReviewService EmployeePerformanceAndReviewService=null;
		EmployeePerformanceAndReviewBO EmployeePerformanceAndReviewBO=null;
		
		EmployeePerformanceAndReviewBO =new EmployeePerformanceAndReviewBO();
		EmployeePerformanceAndReviewBO.setAttendance(EmployeePerformanceAndRevieVO.getAttendance());
		EmployeePerformanceAndReviewBO.setCodingSkills(EmployeePerformanceAndRevieVO.getCodingSkills());
		EmployeePerformanceAndReviewBO.setCommunication(EmployeePerformanceAndRevieVO.getCommunication());
		EmployeePerformanceAndReviewBO.setEmployeeNo(EmployeePerformanceAndRevieVO.getEmployeeNo());
		EmployeePerformanceAndReviewBO.setGoalSetting(EmployeePerformanceAndRevieVO.getGoalSetting());
		EmployeePerformanceAndReviewBO.setLeadership(EmployeePerformanceAndRevieVO.getLeadership());
		EmployeePerformanceAndReviewBO.setOverallPerformance(EmployeePerformanceAndRevieVO.getOverallPerformance());
		EmployeePerformanceAndReviewBO.setTeamwork(EmployeePerformanceAndRevieVO.getTeamwork());;
		EmployeePerformanceAndReviewBO.setTimemanagement(EmployeePerformanceAndRevieVO.getTeamwork());
		EmployeePerformanceAndReviewBO.setTypeofBand(EmployeePerformanceAndRevieVO.getTypeofBand());
		EmployeePerformanceAndReviewBO.setGoalSetting(EmployeePerformanceAndReviewBO.getGoalSetting());
		
		EmployeePerformanceAndReviewDao EmployeePerformanceAndReviewDao=null;
		EmployeePerformanceAndReviewDao=new EmployeePerformanceAndReviewDao();
		
		try {
			EmployeePerformanceAndReviewDao.savePerformanceAndReviewService(EmployeePerformanceAndReviewBO);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
