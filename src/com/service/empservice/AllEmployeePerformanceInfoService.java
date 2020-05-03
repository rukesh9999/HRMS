package com.service.empservice;

import java.util.ArrayList;
import java.util.List;

import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpBo.EmployeePerformanceAndReviewBO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.employee.EmpVo.EmployeePerformanceAndReviewVO;
import com.regemp.empdao.AllEmployeePerformanceInfoDao;
import com.regemp.empdao.AllEmployeeSalaryInfoDao;

public class AllEmployeePerformanceInfoService {

	public List<EmployeePerformanceAndReviewVO> getAllEmpPerformanceDetails() throws ClassNotFoundException
	{

	AllEmployeePerformanceInfoDao AllEmployeePerformanceInfoDao=null;
	EmployeePerformanceAndReviewVO EmployeePerformanceAndReviewVO=null;
	AllEmployeePerformanceInfoDao=new AllEmployeePerformanceInfoDao();
	List<EmployeePerformanceAndReviewVO> EmployeePerformanceAndReviewVOs=new ArrayList<EmployeePerformanceAndReviewVO>(); 
	try {
		List <EmployeePerformanceAndReviewBO> EmployeePerformanceAndReviewBOs=AllEmployeePerformanceInfoDao.getAllEmpPerformanceDetails();
	    for(int i=0;i<EmployeePerformanceAndReviewBOs.size();i++) {
	    	
	    	EmployeePerformanceAndReviewBO EmployeePerformanceAndReviewBO=EmployeePerformanceAndReviewBOs.get(i);
	    	EmployeePerformanceAndReviewVO =new EmployeePerformanceAndReviewVO();
	    	EmployeePerformanceAndReviewVO.setAttendance(EmployeePerformanceAndReviewBO.getAttendance());	
	    	EmployeePerformanceAndReviewVO.setCodingSkills(EmployeePerformanceAndReviewBO.getCodingSkills());
	    	EmployeePerformanceAndReviewVO.setCommunication(EmployeePerformanceAndReviewBO.getCommunication());
	    	EmployeePerformanceAndReviewVO.setEmployeeNo(EmployeePerformanceAndReviewBO.getEmployeeNo());
	    	EmployeePerformanceAndReviewVO.setGoalSetting(EmployeePerformanceAndReviewBO.getGoalSetting());
	    	EmployeePerformanceAndReviewVO.setLeadership(EmployeePerformanceAndReviewBO.getLeadership());
	    	EmployeePerformanceAndReviewVO.setOverallPerformance(EmployeePerformanceAndReviewBO.getOverallPerformance());
	    	EmployeePerformanceAndReviewVO.setTeamwork(EmployeePerformanceAndReviewBO.getTeamwork());
	    	EmployeePerformanceAndReviewVO.setTypeofBand(EmployeePerformanceAndReviewBO.getTypeofBand());
	    	EmployeePerformanceAndReviewVO.setTimemanagement(EmployeePerformanceAndReviewBO.getTimemanagement());

	    	EmployeePerformanceAndReviewVOs.add(EmployeePerformanceAndReviewVO);

	    	
	    }
		
			} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	  return EmployeePerformanceAndReviewVOs;
	 
}



}
