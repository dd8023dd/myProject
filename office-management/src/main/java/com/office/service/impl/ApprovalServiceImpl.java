package com.office.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.office.dao.ApprovalMapper;
import com.office.entity.Approval;
import com.office.entity.ApprovalExample;
import com.office.entity.ApprovalExample.Criteria;
import com.office.service.ApprovalService;
@Service
public class ApprovalServiceImpl implements ApprovalService{

	@Autowired
	private ApprovalMapper appMapper;
	
	/*
	 * 发起审批
	 */
	@Override
	public int insertApproval(Approval approval) {
		int result = -1;
		if(StringUtils.isEmpty(approval.getApprovalStatus()) || approval.getApprovalStatus() ==0 ) {
			approval.setApprovalStatus(1);//1为待审批
			result = appMapper.insert(approval);
		}
		return result;
	}
	/*
	 * 审批
	 * @param Approval对象(添加完审批状态)
	 * 只能审批待审批状态  = = 传入其他状态的返回-1
	 * -1为已审批
	 */
	@Override
	public int doApproval(Approval approval) {
		int result = -1;
		if(approval.getApprovalStatus() == 1) {
			result = appMapper.updateByPrimaryKey(approval);
		}
		return result;
	}

	@Override
	public int delApproval(int id) {
		return appMapper.deleteByPrimaryKey(id);
	}
	
	/*
	 * 根据状态删除审批表
	 */
	@Override
	public int delAppByStatus(int status) {
		ApprovalExample example = new ApprovalExample();
		Criteria criteria = example.createCriteria();
		criteria.andApprovalStatusEqualTo(status);
		return appMapper.deleteByExample(example);
	}
	
	@Override
	public List<Approval> AllApproval() {
		return appMapper.selectByExample(null);
	}
	
	/*
	 * 根据状态查询审批表
	 * @see com.office.service.ApprovalService#searchApprovalByStatus(int)
	 */
	@Override
	public List<Approval> searchApprovalByStatus(int status) {
		ApprovalExample example = new ApprovalExample();
		Criteria criteria = example.createCriteria();
		criteria.andApprovalStatusEqualTo(status);
		return appMapper.selectByExample(example);
	}
	@Override
	public Approval searchApprovalByApprovalNo(String approval_no) {
		return appMapper.selectByApprovalNo(approval_no);
	}
	@Override
	public Approval searchApprovalByApprovalId(int approval_id) {
		return appMapper.selectByPrimaryKey(approval_id);
	}
}