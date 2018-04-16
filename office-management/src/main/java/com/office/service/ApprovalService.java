package com.office.service;

import java.util.List;

import com.office.entity.Approval;
import com.office.entity.ApprovalMember;

public interface ApprovalService {
	
	public int insertApproval(Approval approval);
	public int doApproval(Approval approval,String status);
	public int delApproval(int id);
	public int delAppByStatus(int status);
	public List<Approval> AllApproval();
	public List<Approval> searchApprovalByStatus(int status);
	public Approval searchApprovalByApprovalNo(String approval_no);
	public Approval searchApprovalByApprovalId(int approval_id);
	public int inserApprovalMember(ApprovalMember am);
	public int delApprovalMember(int amId);
	public int modifyApprovalMember(ApprovalMember am);
	public List<ApprovalMember> searchApprovalMemberByAccepter(int accepterId);
	public int searchByAccepterCount(int accepterId);
	public int searchBySenderCount(int senderId);
	public List<ApprovalMember> searchApprovalMemberBySender(int senderId);
	public ApprovalMember searchApprovalMemberByApproval(int approvalId);
}
