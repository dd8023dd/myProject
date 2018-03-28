package com.office.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.office.dao.ApprovalGroupMapper;
import com.office.dao.EmployeeMapper;
import com.office.entity.ApprovalGroup;
import com.office.entity.Employee;
import com.office.service.ApprovalGroupService;

/**
 * @author zhangmj
 * @date 2018年3月29日
 */
@Service
public class ApprovalGroupServiceImpl implements ApprovalGroupService{

	@Autowired
	private ApprovalGroupMapper agMapper;
	@Autowired
	private EmployeeMapper empMapper;
	/* 
	 * @parameter 
	 * @return -1:传进的参数为空  -2,员工不存在
	 * @see com.office.service.ApprovalGroupService#insertApprovalGroup(com.office.entity.ApprovalGroup)
	 */
	@Override
	public int insertApprovalGroup(ApprovalGroup ag) {
		if(!StringUtils.isEmpty(ag)) {
			Employee selectByPrimaryKey = empMapper.selectByPrimaryKey(ag.getApprovalGroupEmpid());
			if(!StringUtils.isEmpty(selectByPrimaryKey)) {
				return agMapper.insert(ag);
			}else {
				return -2;
			}
		}
		return -1;
	}

	/* 
	 * @parameter 
	 * @return  -1:传进的参数为空  -2,员工不存在
	 * @see com.office.service.ApprovalGroupService#modifyApprovalGroup(com.office.entity.ApprovalGroup)
	 */
	@Override
	public int modifyApprovalGroup(ApprovalGroup ag) {
		if(!StringUtils.isEmpty(ag)) {
			Employee selectByPrimaryKey = empMapper.selectByPrimaryKey(ag.getApprovalGroupEmpid());
			if(!StringUtils.isEmpty(selectByPrimaryKey)) {
				return agMapper.updateByPrimaryKey(ag);
			}else {
				return -2;
			}
		}
		return -1;
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalGroupService#delApprovalGroup(int)
	 */
	@Override
	public int delApprovalGroup(int agid) {
		return agMapper.deleteByPrimaryKey(agid);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalGroupService#searchAllApprovalGroup()
	 */
	@Override
	public List<ApprovalGroup> searchAllApprovalGroup() {
		return agMapper.selectByExample(null);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalGroupService#searchApprovalGroupById()
	 */
	@Override
	public ApprovalGroup searchApprovalGroupById(int agid) {
		return agMapper.selectByPrimaryKey(agid);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ApprovalGroupService#searchAllCountApprovalGroup()
	 */
	@Override
	public long searchAllCountApprovalGroup() {
		// TODO Auto-generated method stub
		return agMapper.countByExample(null);
	}

}
