package com.office.service;

import java.util.List;

import com.office.entity.ApprovalGroup;

/**
 * @author zhangmj
 * @date 2018年3月29日
 */
public interface ApprovalGroupService {
	public int insertApprovalGroup(ApprovalGroup ag);
	public int modifyApprovalGroup(ApprovalGroup ag);
	public int delApprovalGroup(int agid);
	public List<ApprovalGroup> searchAllApprovalGroup();
	public long searchAllCountApprovalGroup();
	public ApprovalGroup searchApprovalGroupById(int agid);
}
