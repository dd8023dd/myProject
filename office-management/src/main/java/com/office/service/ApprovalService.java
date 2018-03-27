package com.office.service;

import java.util.List;

import com.office.entity.Approval;

public interface ApprovalService {
	
	public int insertApproval(Approval approval);
	public int doApproval(Approval approval);
	public int delApproval(int id);
	public int delAppByStatus(int status);
	public List<Approval> AllApproval();
	public List<Approval> searchApprovalByStatus(int status);
	public Approval searchApprovalByApprovalNo(String approval_no);
	public Approval searchApprovalByApprovalId(int approval_id);
}
