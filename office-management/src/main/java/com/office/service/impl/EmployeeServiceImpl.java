package com.office.service.impl;

import java.util.List;

import org.eclipse.jetty.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.dao.EmployeeMapper;
import com.office.entity.Employee;
import com.office.entity.EmployeeExample;
import com.office.entity.EmployeeExample.Criteria;
import com.office.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeMapper empMapper;
	
	/*
	 * 添加员工
	 * @param emp
	 * @see com.office.service.EmployeeService#addEmployees(com.office.entity.Employee)
	 */
	public int addEmployees(Employee emp) {
		return empMapper.insert(emp);
	}
	
	/*
	 * 修改员工
	 * @param emp
	 * @see com.office.service.EmployeeService#changeEmployees(com.office.entity.Employee)
	 */
	public int modifyEmployees(Employee emp) {
		return empMapper.updateByPrimaryKey(emp);
	}
	
	/*
	 * 删除员工
	 * @param emp_id
	 * @see com.office.service.EmployeeService#removeEmployees(int)
	 */
	public int removeEmployees(int emp_id) {
		return empMapper.deleteByPrimaryKey(emp_id);
	}
	
	/*
	 * 根据条件查询员工(不分页)
	 * @param emp
	 * @see com.office.service.EmployeeService#searchEmpByExample(com.office.entity.Employee)
	 */
	public List<Employee> searchEmpByExample(Employee emp) {
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		if(emp.getEmpBirth() != null) {//根据生日查询
			criteria.andEmpBirthEqualTo(emp.getEmpBirth());
		}
		if(StringUtil.isNotBlank(emp.getEmpAddress())) {//根据地址模糊查询
			criteria.andEmpAddressLike("%"+emp.getEmpAddress()+"%");
		}
		if(StringUtil.isNotBlank(emp.getEmpName())) {//根据员工名模糊查询
			criteria.andEmpNameLike("%"+emp.getEmpName()+"%");
		}
		if(emp.getEmpId() != null) {//根据员工id查询
			criteria.andEmpIdEqualTo(emp.getEmpId());
		}
		if(emp.getEmpDepti() != null) {//根据部门id查询
			criteria.andEmpDeptiEqualTo(emp.getEmpDepti());
		}
		return empMapper.selectByExample(example);
	}
	
	/*
	 * 员工的分页查询
	 * @param emp start length
	 * @see com.office.service.EmployeeService#searchEmpByPage(com.office.entity.Employee, int, int)
	 */
	public List<Employee> searchEmpByPage(Employee emp, int start, int length) {
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		if(emp == null) {
			return null; 
		}
		if(emp.getEmpBirth() != null) {//根据生日查询
			criteria.andEmpBirthEqualTo(emp.getEmpBirth());
		}
		if(StringUtil.isNotBlank(emp.getEmpAddress())) {//根据地址模糊查询
			criteria.andEmpAddressLike("%"+emp.getEmpAddress()+"%");
		}
		if(StringUtil.isNotBlank(emp.getEmpName())) {//根据员工名模糊查询
			criteria.andEmpNameLike("%"+emp.getEmpName()+"%");
		}
		if(emp.getEmpId() != null) {//根据员工id查询
			criteria.andEmpIdEqualTo(emp.getEmpId());
		}
		if(emp.getEmpDepti() != null) {//根据部门id查询
			criteria.andEmpDeptiEqualTo(emp.getEmpDepti());
		}
		example.setStart(start);
		example.setEnd(length);
		return empMapper.selectByExample(example);
	}

	@Override
	public int searchEmpPageCount(Employee emp) {
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		if(emp == null) {
			return -1;
		}
		if(emp.getEmpBirth() != null) {//根据生日查询
			criteria.andEmpBirthEqualTo(emp.getEmpBirth());
		}
		if(StringUtil.isNotBlank(emp.getEmpAddress())) {//根据地址模糊查询
			criteria.andEmpAddressLike("%"+emp.getEmpAddress()+"%");
		}
		if(StringUtil.isNotBlank(emp.getEmpName())) {//根据员工名模糊查询
			criteria.andEmpNameLike("%"+emp.getEmpName()+"%");
		}
		if(emp.getEmpId() != null) {//根据员工id查询
			criteria.andEmpIdEqualTo(emp.getEmpId());
		}
		if(emp.getEmpDepti() != null) {//根据部门id查询
			criteria.andEmpDeptiEqualTo(emp.getEmpDepti());
		}
		return (int) empMapper.countByExample(example);
	}

}
