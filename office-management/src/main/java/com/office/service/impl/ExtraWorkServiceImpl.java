package com.office.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.office.dao.ApprovalMapper;
import com.office.dao.ExtraWorkMapper;
import com.office.entity.ExtraWork;
import com.office.entity.ExtraWorkExample;
import com.office.entity.ExtraWorkExample.Criteria;
import com.office.service.ExtraWorkService;
import com.office.util.HolidyDate;
@Service
public class ExtraWorkServiceImpl implements ExtraWorkService{

	@Autowired
	private ExtraWorkMapper extMapper;
	@Autowired
	private ApprovalMapper appMapper;
	
	/*
	 * @return 0:未绑定审批表
	 * @see com.office.service.AskToLeaveService#insertLeave(com.office.entity.AskToLeave)
	 */
	@Override
	public int insertExtraWork(ExtraWork extraWork) {
		return StringUtils.isEmpty(extraWork.getApprovalId())?0:extMapper.insert(extraWork);
	}

	@Override
	public int approvalExtraWork(ExtraWork extraWork) {
		return extMapper.updateByPrimaryKey(extraWork);
	}

	@Override
	public int delExtraWork(int extraWork_id) {
		int result = -1;
		ExtraWork extraWork = searchByExtraWorkId(extraWork_id);
		if(StringUtils.isEmpty(extraWork)) {
			result = appMapper.deleteByPrimaryKey(extraWork.getApprovalId())>0?
				extMapper.deleteByPrimaryKey(extraWork_id):-1;
		}
		return result;
	}

	@Override
	public List<ExtraWork> searchAllExtraWork() {
		return extMapper.selectByExample(null);
	}

	@Override
	public List<ExtraWork> searchExtraWorkByTime(String time) {
		ExtraWorkExample example = new ExtraWorkExample();
		Criteria criteria = example.createCriteria();
	    criteria.andTimeEqualTo(time);
		return extMapper.selectByExample(example);
	}

	@Override
	public List<ExtraWork> searchExtraWorkByEmp(int emp_id,int start,int end) {
		ExtraWorkExample example = new ExtraWorkExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpIdEqualTo(emp_id);
		example.setStart(start);
		example.setEnd(end);
		return extMapper.selectByExample(example);
	}

	@Override
	public ExtraWork searchByExtraWorkId(int extraWork_id) {
		return extMapper.selectByPrimaryKey(extraWork_id);
	}

	@Override
	public int isHolidyExtraWork(Date time) {
		int result = -1;
		SimpleDateFormat timef=new SimpleDateFormat("MMdd");
		String format = timef.format(time);
		HolidyDate d = new HolidyDate();
		List<String> holidyList = d.getHolidyList();
		for (String string : holidyList) {
			result = string.equals(format)?1:0;
		}
		return result;
	}

	@Override
	public int delWorkByApprovalId(int approval_id) {
		ExtraWorkExample example = new ExtraWorkExample();
		Criteria criteria = example.createCriteria();
		criteria.andApprovalIdEqualTo(approval_id);
		return extMapper.deleteByExample(example);
	}

	@Override
	public ExtraWork searchByApprovalId(int approval_id) {
		ExtraWorkExample example = new ExtraWorkExample();
		Criteria criteria = example.createCriteria();
		criteria.andApprovalIdEqualTo(approval_id);
		List<ExtraWork> selectByExample = extMapper.selectByExample(example);
		if(selectByExample.size() >1){
			System.err.println("异常:多个加班类符合approval_id");
			return null;
		}
		return (ExtraWork) selectByExample;
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.ExtraWorkService#searchExtraWorkCountByEmp(int)
	 */
	@Override
	public long searchExtraWorkCountByEmp(int emp_id) {
		ExtraWorkExample example = new ExtraWorkExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpIdEqualTo(emp_id);
		return extMapper.countByExample(example);
	}

}
