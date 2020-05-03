package com.service.empservice;

import com.employee.EmpBo.AddRecruitedCandidateBO;
import com.employee.EmpBo.EmployeePaySalaryBO;
import com.employee.EmpVo.AddRecruitedCandidateVO;
import com.employee.EmpVo.EmployeePaySalaryVO;
import com.regemp.empdao.AddRecruitedCandidateDao;
import com.regemp.empdao.EmployeePaySalaryDao;

public class AddRecruitedCandidateService {
	public  void  AddRecruitedCandidate(AddRecruitedCandidateVO AddRecruitedCandidateVO)
	{
		AddRecruitedCandidateBO AddRecruitedCandidateBO=null;
		
		AddRecruitedCandidateBO=new AddRecruitedCandidateBO();
		AddRecruitedCandidateBO.setId(AddRecruitedCandidateVO.getId());
		AddRecruitedCandidateBO.setBranch(AddRecruitedCandidateVO.getBranch());;
		AddRecruitedCandidateBO.setFullName(AddRecruitedCandidateVO.getFullName());;
		AddRecruitedCandidateBO.setPercentage(AddRecruitedCandidateVO.getPercentage());;
		AddRecruitedCandidateBO.setYearOFPassedOut(AddRecruitedCandidateVO.getYearOFPassedOut());;
				
		AddRecruitedCandidateDao AddRecruitedCandidateDao=null;
		AddRecruitedCandidateDao=new AddRecruitedCandidateDao();
	       System.out.println(AddRecruitedCandidateBO);

		try {
			AddRecruitedCandidateDao.AddRecruitedCandidate(AddRecruitedCandidateBO);;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
