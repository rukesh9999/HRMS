package com.service.empservice;

import java.util.ArrayList;
import java.util.List;

import com.employee.EmpBo.AddRecruitedCandidateBO;
import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpVo.AddRecruitedCandidateVO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.regemp.empdao.AllEmployeeSalaryInfoDao;
import com.regemp.empdao.AllRecruitedCandidatesInfoDao;

public class AllRecruitedCandidatesInfoService {

	public List<AddRecruitedCandidateVO> getAllRecruitedCandidatesInfo() throws ClassNotFoundException
	{

	AllRecruitedCandidatesInfoDao AllRecruitedCandidatesInfoDao=null;
	AddRecruitedCandidateVO AddRecruitedCandidateVO=null;
	AllRecruitedCandidatesInfoDao=new AllRecruitedCandidatesInfoDao();
	List<AddRecruitedCandidateVO> AddRecruitedCandidateVOs=new ArrayList<AddRecruitedCandidateVO>(); 
	try {
		List <AddRecruitedCandidateBO> AddRecruitedCandidateBOs=AllRecruitedCandidatesInfoDao.getAllRecruitedCandidatesInfo();
	    for(int i=0;i<AddRecruitedCandidateBOs.size();i++) {
	    	
	    	AddRecruitedCandidateBO AddRecruitedCandidateBO=AddRecruitedCandidateBOs.get(i);
	    	AddRecruitedCandidateVO =new AddRecruitedCandidateVO();
	    	AddRecruitedCandidateVO.setId(AddRecruitedCandidateBO.getId());
	    	AddRecruitedCandidateVO.setBranch(AddRecruitedCandidateBO.getBranch());	
	    	AddRecruitedCandidateVO.setFullName(AddRecruitedCandidateBO.getFullName());
	    	AddRecruitedCandidateVO.setPercentage(AddRecruitedCandidateBO.getPercentage());
	    	AddRecruitedCandidateVO.setYearOFPassedOut(AddRecruitedCandidateBO.getYearOFPassedOut());
	    	AddRecruitedCandidateVOs.add(AddRecruitedCandidateVO);
	    }
		
			} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	
	  return AddRecruitedCandidateVOs;


}
}