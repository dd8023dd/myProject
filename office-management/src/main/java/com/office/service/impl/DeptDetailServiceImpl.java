package com.office.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.office.dao.DeptDetailsMapper;
import com.office.dao.DeptsMapper;
import com.office.entity.DeptDetails;
import com.office.entity.DeptDetailsExample;
import com.office.entity.DeptDetailsExample.Criteria;
import com.office.entity.Depts;
import com.office.entity.Employee;
import com.office.service.DeptDetailService;
import com.office.service.EmployeeService;

/**
 * @author zhangmj
 * @date 2018年3月15日
 */
@Service
public class DeptDetailServiceImpl implements DeptDetailService{

	@Autowired
	private DeptsMapper dMapper;
	@Autowired
	private DeptDetailsMapper ddtMapper;
	@Autowired
	private EmployeeService emps;
	
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.DeptDetailService#insertDeptDetail(com.office.entity.DeptDetails)
	 */
	@Override
	public int insertDeptDetail(DeptDetails dd) {
		Depts dept = dMapper.selectByPrimaryKey(dd.getDeptId());
		if(StringUtils.isEmpty(dept)) {
			return -1;
		}
		return ddtMapper.insert(dd);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.DeptDetailService#delDeptDetail(int)
	 */
	@Override
	public int delDeptDetail(int ddId) {
		// TODO Auto-generated method stub
		return ddtMapper.deleteByPrimaryKey(ddId);
	}

	/* 
	 * 内部更新方法,前端调用按钮更新
	 * @parameter DeptDetails对象
	 * @return 数据变更条数
	 * @see com.office.service.DeptDetailService#updateDeptDetail(com.office.entity.DeptDetails)
	 */
	@Override
	public int updateDeptDetailEMP(DeptDetails dd) {
		Employee emp = new Employee();
		emp.setEmpDepti(dd.getDeptId());
		List<Employee> empList = emps.searchEmpByExample(emp);
		StringBuffer sb = new StringBuffer();
		for (Employee employee : empList) {
			sb.append(employee.getEmpId());
			sb.append(",");
		}
		dd.setDeptEmp(sb.toString());
		return ddtMapper.updateByPrimaryKey(dd);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.DeptDetailService#searchDeptDetailByDeptId(int)
	 */
	@Override
	public DeptDetails searchDeptDetailByDeptId(int deptId) {
		DeptDetailsExample example = new DeptDetailsExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptIdEqualTo(deptId);
		List<DeptDetails> byExample = ddtMapper.selectByExample(example);
		if(byExample.size()>0) {
			DeptDetails details =byExample.get(0);
			if(!StringUtils.isEmpty(details)) {
				return details;
			}
		}
		return null;
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.DeptDetailService#searchAllDeptDetails()
	 */
	@Override
	public List<DeptDetails> searchAllDeptDetails() {
		// TODO Auto-generated method stub
		return ddtMapper.selectByExample(null);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.DeptDetailService#updateDeptDetail(com.office.entity.DeptDetails)
	 */
	@Override
	public int updateDeptDetail(DeptDetails dd) {
		return ddtMapper.updateByPrimaryKey(dd);
	}

}
