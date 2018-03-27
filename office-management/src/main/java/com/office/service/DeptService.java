package com.office.service;

import java.util.List;

import com.office.entity.Depts;

public interface DeptService {
	public int insertDept(Depts dept);
	public int delDept(int dept_id);
	public int modifyDept(Depts dept);
	public List<Depts> searchAllDepts();
	public int searchDeptsCount(String dept_name);
	public List<Depts> searchDeptsByPage(String dept_name,int start,int length);
}
