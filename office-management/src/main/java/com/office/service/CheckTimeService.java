package com.office.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.office.entity.CheckTime;

public interface CheckTimeService {

	public int insertCheckTime(int emp_id);
	public int delCheckTimeById(int ct_id);
	public int modifyCheckTime(CheckTime c_time);
	public List<CheckTime> searchCheckTimeByTime(String time, int start, int length);
	public List<CheckTime> searchCheckTimeByTimeAndId(String time,int emp_id);
	public List<CheckTime> searchCheckTimeByEmp(int emp_id);
	public int searchCheckTimeCountByEmp(int emp_id);
	public List<CheckTime> searchCheckTimeByStatus(int status);
	public long searchCountAll(String time);
	public List<CheckTime> searchCheckTimeByConditionAll(CheckTime ck);
	public List<CheckTime> searchCheckTimeByCondition(CheckTime ck,int start,int length);
	public int searchCountByCondition(CheckTime ck);
	public HSSFWorkbook exportToExcel(List<CheckTime> list,HttpServletResponse res);
}
