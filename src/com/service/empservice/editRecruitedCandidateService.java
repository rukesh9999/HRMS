package com.service.empservice;

import com.employee.EmpBo.AddRecruitedCandidateBO;
import com.employee.EmpBo.EmployeeCompleteInfoBO;
import com.employee.EmpVo.AddRecruitedCandidateVO;
import com.employee.EmpVo.EmployeeCompleteInfoVO;

public class editRecruitedCandidateService {

	com.regemp.empdao.editRecruitedCandidateDao editRecruitedCandidateDao=null;
	com.employee.EmpVo.AddRecruitedCandidateVO AddRecruitedCandidateVO=null;
	public  AddRecruitedCandidateVO getRecruitedCandiateInfo(int empNo)
	{
		editRecruitedCandidateDao=new com.regemp.empdao.editRecruitedCandidateDao();
		AddRecruitedCandidateVO=new com.employee.EmpVo.AddRecruitedCandidateVO();
		try {
			AddRecruitedCandidateBO AddRecruitedCandidateBO=editRecruitedCandidateDao.getRecruitedCandiateInfo(empNo);
			System.out.println(AddRecruitedCandidateBO);
			AddRecruitedCandidateVO.setBranch(AddRecruitedCandidateBO.getBranch());	
			AddRecruitedCandidateVO.setFullName(AddRecruitedCandidateBO.getFullName());
			AddRecruitedCandidateVO.setId(AddRecruitedCandidateBO.getId());
			AddRecruitedCandidateVO.setPercentage(AddRecruitedCandidateBO.getPercentage());
			AddRecruitedCandidateVO.setYearOFPassedOut(AddRecruitedCandidateBO.getYearOFPassedOut());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return AddRecruitedCandidateVO;
		 
	}



}
