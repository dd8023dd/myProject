package com.office.service;

import java.util.List;

import com.office.entity.DeptDetails;

/**
 * @author zhangmj
 * @date 2018年3月15日
 */
public interface DeptDetailService {

	public int insertDeptDetail(DeptDetails dd);
	public int delDeptDetail(int ddId);
	public int updateDeptDetailEMP(DeptDetails dd);
	public int updateDeptDetail(DeptDetails dd);
	public DeptDetails searchDeptDetailByDeptId(int deptId);
	public List<DeptDetails> searchAllDeptDetails();
}
