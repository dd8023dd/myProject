package com.office.service;

import java.util.Date;
import java.util.List;

import com.office.entity.AskToLeave;

public interface AskToLeaveService {
	public int insertLeave(AskToLeave leave);
	public int approvalLeave(AskToLeave leave);
	public int delLeave(int leave_id);
	public int delLeaveByApprovalId(int approval_id);
	public List<AskToLeave> searchAllLeave();
	public List<AskToLeave> searchLeaveByEmp(int emp_id);
	public List<AskToLeave> searchLeaceByLeaveTime(Date time);
	public AskToLeave searchByLeaveId(int leave_id);
	public AskToLeave searchByApprovalId(int approval_id);
}
