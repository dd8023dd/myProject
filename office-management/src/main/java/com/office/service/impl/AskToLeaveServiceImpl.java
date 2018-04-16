package com.office.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.office.dao.ApprovalMapper;
import com.office.dao.AskToLeaveMapper;
import com.office.entity.AskToLeave;
import com.office.entity.AskToLeaveExample;
import com.office.entity.AskToLeaveExample.Criteria;
import com.office.service.AskToLeaveService;

@Service
public class AskToLeaveServiceImpl implements AskToLeaveService{

	@Autowired
	private AskToLeaveMapper askMapper;
	@Autowired
	private ApprovalMapper appMapper;
	
	/*
	 * @return 0:未绑定审批表
	 * @see com.office.service.AskToLeaveService#insertLeave(com.office.entity.AskToLeave)
	 */
	@Override
	public int insertLeave(AskToLeave leave) {
		return StringUtils.isEmpty(leave.getApprovalId())?0:askMapper.insert(leave);
	}

	@Override
	public int approvalLeave(AskToLeave leave) {
		return askMapper.updateByPrimaryKey(leave);
	}

	@Override
	public int delLeave(int leave_id) {
		int result = -1;
		AskToLeave leave = searchByLeaveId(leave_id);
		if(StringUtils.isEmpty(leave)) {
			result = appMapper.deleteByPrimaryKey(leave.getApprovalId())>0?
					askMapper.deleteByPrimaryKey(leave_id):-1;
		}
		return result;
	}

	@Override
	public List<AskToLeave> searchAllLeave() {
		return askMapper.selectByExampleS(null);
	}

	@Override
	public List<AskToLeave> searchLeaveByEmp(int emp_id,int start,int end) {
		AskToLeaveExample example = new AskToLeaveExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpIdEqualTo(emp_id);
		example.setStart(start);
		example.setEnd(end);
		return askMapper.selectByExampleS(example);
	}

	@Override
	public List<AskToLeave> searchLeaceByLeaveTime(String time) {
		AskToLeaveExample example = new AskToLeaveExample();
		Criteria criteria = example.createCriteria();
		criteria.andLeaveTimeEndEqualTo(time);
		return askMapper.selectByExampleS(example);
	}

	@Override
	public AskToLeave searchByLeaveId(int leave_id) {
		return askMapper.selectByPrimaryKeyS(leave_id);
	}

	@Override
	public int delLeaveByApprovalId(int approval_id) {
		AskToLeaveExample example = new AskToLeaveExample();
		Criteria criteria = example.createCriteria();
		criteria.andApprovalIdEqualTo(approval_id);
		return askMapper.deleteByExample(example);
	}

	@Override
	public AskToLeave searchByApprovalId(int approval_id) {
		AskToLeaveExample example = new AskToLeaveExample();
		Criteria criteria = example.createCriteria();
		criteria.andApprovalIdEqualTo(approval_id);
		example.setStart(0);
		example.setEnd(1);
		List<AskToLeave> selectByExampleS = askMapper.selectByExampleS(example);
		if(selectByExampleS.size() >1){
			System.err.println("异常:多个请假类符合approval_id");
			return null;
		}
		return (AskToLeave) (selectByExampleS.size()>0?selectByExampleS.get(0):null);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.AskToLeaveService#searchLeaveByEmpCount(int)
	 */
	@Override
	public int searchLeaveByEmpCount(int emp_id) {
		AskToLeaveExample example = new AskToLeaveExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpIdEqualTo(emp_id);
		return (int)askMapper.countByExample(example);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.AskToLeaveService#searchAllLeaveS(int, int)
	 */
	@Override
	public List<AskToLeave> searchAllLeaveS(int start, int length) {
		AskToLeaveExample example = new AskToLeaveExample();
		example.setStart(start);
		example.setEnd(length);
		return askMapper.selectByExampleS(example);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.AskToLeaveService#searchLeaveCount()
	 */
	@Override
	public int searchLeaveCount() {
		return (int)askMapper.countByExample(null);
	}

}
