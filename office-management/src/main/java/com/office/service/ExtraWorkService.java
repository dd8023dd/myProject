package com.office.service;

import java.util.Date;
import java.util.List;

import com.office.entity.ExtraWork;

public interface ExtraWorkService {
	public int insertExtraWork(ExtraWork extraWork);
	public int approvalExtraWork(ExtraWork extraWork);
	public int delExtraWork(int extraWork_id);
	public List<ExtraWork> searchAllExtraWork();
	public List<ExtraWork> searchExtraWorkByTime(String time);
	public List<ExtraWork> searchExtraWorkByEmp(int emp_id,int start,int end);
	public long searchExtraWorkCountByEmp(int emp_id);
	public ExtraWork searchByExtraWorkId(int extraWork_id);
	public ExtraWork searchByApprovalId(int approval_id);
	public int isHolidyExtraWork(Date time);
	public int delWorkByApprovalId(int approval_id);
}
