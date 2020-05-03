package com.service.empservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.employee.EmpBo.AddRecruitedCandidateBO;
import com.employee.EmpVo.AddRecruitedCandidateVO;
import com.regemp.empdao.AddRecruitedCandidateDao;
import com.regemp.empdao.deleteRecruitedCandidateDao;

public class deleteRecruitedCandidateService {

	public  void  deleteRecruitedCandiateInfo(int empNo)
	{
					
		deleteRecruitedCandidateDao deleteRecruitedCandidateDao=null;
		deleteRecruitedCandidateDao=new deleteRecruitedCandidateDao();
		
		try {
			deleteRecruitedCandidateDao.deleteRecruitedCandiateInfo(empNo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
