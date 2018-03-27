package com.office.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.dao.DeptsMapper;
import com.office.entity.Depts;
import com.office.entity.DeptsExample;
import com.office.entity.DeptsExample.Criteria;
import com.office.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptsMapper deptMapper;
	@Override
	public int insertDept(Depts dept) {
		return deptMapper.insert(dept);
	}

	@Override
	public int delDept(int dept_id) {
		return deptMapper.deleteByPrimaryKey(dept_id);
	}

	@Override
	public int modifyDept(Depts dept) {
		return deptMapper.updateByPrimaryKey(dept);
	}

	@Override
	public List<Depts> searchAllDepts() {
		return deptMapper.selectByExample(null);
	}

	@Override
	public int searchDeptsCount(String dept_name) {
		DeptsExample example = new DeptsExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptNameLike("%"+dept_name+"%");
		return  (int)deptMapper.countByExample(example);
	}

	@Override
	public List<Depts> searchDeptsByPage(String dept_name, int start, int length) {
		DeptsExample example = new DeptsExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptNameLike("%"+dept_name+"%");
		example.setStart(start);
		example.setEnd(length);
		return deptMapper.selectByExamplePage(example);
	}

}
