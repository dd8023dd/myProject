package com.office.service.impl;

import java.util.List;

import org.eclipse.jetty.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.office.dao.ApprovalMapper;
import com.office.dao.ApprovalMemberMapper;
import com.office.entity.Approval;
import com.office.entity.ApprovalExample;
import com.office.entity.ApprovalExample.Criteria;
import com.office.entity.ApprovalMember;
import com.office.entity.ApprovalMemberExample;
import com.office.service.ApprovalService;
@Service
public class ApprovalServiceImpl implements ApprovalService{

	@Autowired
	private ApprovalMapper appMapper;
	@Autowired
	private ApprovalMemberMapper amMapper;
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
	/* 
	 * @parameter 
	 * @return  传值为空返回-2
	 * @see com.office.service.ApprovalService#inserApprovalMember(com.office.entity.ApprovalMember)
	 */
	@Override
	public int inserApprovalMember(ApprovalMember am) {
		if(StringUtils.isEmpty(am)) {
			return -2;
		}
		return amMapper.insert(am);
	}
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalService#delApprovalMember(int)
	 */
	@Override
	public int delApprovalMember(int amId) {
		
		return amMapper.deleteByPrimaryKey(amId);
	}
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalService#modifyApprovalMember(com.office.entity.ApprovalMember)
	 */
	@Override
	public int modifyApprovalMember(ApprovalMember am) {
		if(StringUtils.isEmpty(am)) {
			return -2;
		}
		return amMapper.updateByPrimaryKey(am);
	}
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalService#searchApprovalMemberByAccepter(int)
	 */
	@Override
	public List<ApprovalMember> searchApprovalMemberByAccepter(int accepterId) {
		ApprovalMemberExample example = new ApprovalMemberExample();
		com.office.entity.ApprovalMemberExample.Criteria criteria = example.createCriteria();
		criteria.andApprovalAccpeterIdEqualTo(accepterId);
		List<ApprovalMember> selectByExample = amMapper.selectByExample(example);
		return selectByExample.size()>0?selectByExample:null;
	}
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalService#searchApprovalMemberBySender(int)
	 */
	@Override
	public List<ApprovalMember> searchApprovalMemberBySender(int senderId) {
		ApprovalMemberExample example = new ApprovalMemberExample();
		com.office.entity.ApprovalMemberExample.Criteria criteria = example.createCriteria();
		criteria.andApprovalSenderIdEqualTo(senderId);
		List<ApprovalMember> selectByExample = amMapper.selectByExample(example);
		return selectByExample.size()>0?selectByExample:null;
	}
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalService#searchApprovalMemberByApproval(int)
	 */
	@Override
	public ApprovalMember searchApprovalMemberByApproval(int approvalId) {
		ApprovalMemberExample example = new ApprovalMemberExample();
		com.office.entity.ApprovalMemberExample.Criteria criteria = example.createCriteria();
		criteria.andApprovalIdEqualTo(approvalId);
		List<ApprovalMember> selectByExample = amMapper.selectByExample(example);
		return selectByExample.size()>0?selectByExample.get(0):null;
	}
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalService#searchByAccepterCount(int)
	 */
	@Override
	public int searchByAccepterCount(int accepterId) {
		ApprovalMemberExample example = new ApprovalMemberExample();
		com.office.entity.ApprovalMemberExample.Criteria criteria = example.createCriteria();
		criteria.andApprovalAccpeterIdEqualTo(accepterId);
		return (int)amMapper.countByExample(example);
	}
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalService#searchBySenderCount(int)
	 */
	@Override
	public int searchBySenderCount(int senderId) {
		ApprovalMemberExample example = new ApprovalMemberExample();
		com.office.entity.ApprovalMemberExample.Criteria criteria = example.createCriteria();
		criteria.andApprovalSenderIdEqualTo(senderId);
		return (int)amMapper.countByExample(example);
	}
	
	/**
	 * 审批
	 * @param Approval对象(添加完审批状态)
	 * 只能审批待审批状态  = = 传入其他状态的返回-1
	 */
	@Override
	public int doApproval(Approval approval, String status) {
		int result = -1;
		if(approval.getApprovalStatus() != 1) {
			return -1;
		}
		if(StringUtil.isNotBlank(status)&&"1".equals(status)) {//通过
			approval.setApprovalStatus(2);
		}else if(StringUtil.isNotBlank(status)&&"0".equals(status)) {//拒绝
			approval.setApprovalStatus(3);
		}
		result = appMapper.updateByPrimaryKey(approval);
		return result;
	}
}