package com.office.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.eclipse.jetty.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.office.dao.CheckTimeMapper;
import com.office.entity.CheckTime;
import com.office.entity.CheckTimeExample;
import com.office.entity.CheckTimeExample.Criteria;
import com.office.service.CheckTimeService;
@Service
public class CheckTimeServiceImpl implements CheckTimeService{

	@Autowired
	private CheckTimeMapper ctMapper;
	
	/*
	 * @ return 1打卡成功,0打卡失败,99打卡成功and迟到了
	 * @see com.office.service.CheckTimeService#insertCheckTime(int)
	 */
	@Override
	public int insertCheckTime(int emp_id) {
		CheckTime ct = new CheckTime();
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dfd = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = new Date();
		Calendar c = Calendar.getInstance();
	    c.set(Calendar.HOUR_OF_DAY,9);
	    c.set(Calendar.MINUTE,0);
	    c.set(Calendar.SECOND, 0);
	    Calendar le = Calendar.getInstance();
	    le.set(Calendar.HOUR_OF_DAY,17);
	    le.set(Calendar.MINUTE,0);
	    le.set(Calendar.SECOND, 0);
	    Date leaveTime = le.getTime();
	    Date standardTime = c.getTime();
		List<CheckTime> searchCheckTimeByTime = searchCheckTimeByTimeAndId(dfd.format(dt),emp_id);
		ct.setCheckTimeData(dfd.format(dt));
		if(searchCheckTimeByTime.size() < 1) {
			String checkTime = dft.format(dt);
			ct.setCheckTimeFirst(checkTime);
			ct.setCheckTimeEmpid(emp_id);
			if(dt.getTime()>standardTime.getTime()) {
				ct.setCheckTimeOut(0);
				ctMapper.insert(ct);
				return 99;
			}else if(dt.getTime()<=standardTime.getTime()) {
				ct.setCheckTimeOut(1);
			}
		}else {
			CheckTime checkTime2 = searchCheckTimeByTime.get(0);
			String checkTime = dft.format(dt);
			checkTime2.setCheckTimeLeave(checkTime);
			int checkTimeOut = checkTime2.getCheckTimeOut();
			if(dt.getTime()<leaveTime.getTime()) {
				if(checkTimeOut == 0 || checkTimeOut == 4) {
					checkTime2.setCheckTimeOut(4);
				}else {
					checkTime2.setCheckTimeOut(3);
				}
				modifyCheckTime(checkTime2);
				return 93;
			}else if(dt.getTime()>=leaveTime.getTime()) {
				if(checkTimeOut==0||checkTimeOut == 4) {
					checkTime2.setCheckTimeOut(0);
				}else {	
					checkTime2.setCheckTimeOut(1);
				}
				return modifyCheckTime(checkTime2);
			}
		}
		return ctMapper.insert(ct);
	}

	@Override
	public int delCheckTimeById(int ct_id) {
		return ctMapper.deleteByPrimaryKey(ct_id);
	}

	@Override
	public int modifyCheckTime(CheckTime c_time) {
		return ctMapper.updateByPrimaryKey(c_time);
	}

	@Override
	public List<CheckTime> searchCheckTimeByTime(String time,int start,int length) {
		if("".equals(time) || time == null) {return ctMapper.selectByExample(null);}
		CheckTimeExample example = new CheckTimeExample();
		Criteria criteria = example.createCriteria();
		criteria.andCheckTimeDataEqualTo(time);
		example.setStart(start);
		example.setEnd(length);
		return ctMapper.selectByExample(example);
	}
	
	@Override
	public List<CheckTime> searchCheckTimeByEmp(int emp_id) {
		CheckTimeExample example = new CheckTimeExample();
		Criteria criteria = example.createCriteria();
		criteria.andCheckTimeEmpidEqualTo(emp_id);
		return ctMapper.selectByExample(example);
	}

	/*
	 * 根据状态查询  =-=是否迟到等等
	 * (non-Javadoc)
	 * @see com.office.service.CheckTimeService#searchCheckTimeByStatus(int)
	 */
	@Override
	public List<CheckTime> searchCheckTimeByStatus(int status) {
		CheckTimeExample example = new CheckTimeExample();
		Criteria criteria = example.createCriteria();
		criteria.andCheckTimeOutEqualTo(status);
		return ctMapper.selectByExample(example);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.CheckTimeService#searchCheckTimeCountByEmp(int)
	 */
	@Override
	public int searchCheckTimeCountByEmp(int emp_id) {
		CheckTimeExample example = new CheckTimeExample();
		Criteria criteria = example.createCriteria();
		criteria.andCheckTimeEmpidEqualTo(emp_id);
		return (int) ctMapper.countByExample(example);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.CheckTimeService#searchCheckTimeByTimeAndId(java.lang.String, int)
	 */
	@Override
	public List<CheckTime> searchCheckTimeByTimeAndId(String time, int emp_id) {
		CheckTimeExample example = new CheckTimeExample();
		Criteria criteria = example.createCriteria();
		criteria.andCheckTimeDataEqualTo(time);
		criteria.andCheckTimeEmpidEqualTo(emp_id);
		return ctMapper.selectByExample(example);
	}

	/* 
	 * 查询所有签到表
	 * @parameter 
	 * @return 
	 * @see com.office.service.CheckTimeService#searchCountAll()
	 */
	@Override
	public long searchCountAll(String time) {
		if("".equals(time) || time == null) {return ctMapper.countByExample(null);}
		CheckTimeExample example = new CheckTimeExample();
		Criteria criteria = example.createCriteria();
		criteria.andCheckTimeDataEqualTo(time);
		return ctMapper.countByExample(example);
	}
	
	private CheckTimeExample condition(CheckTime ck) {
		CheckTimeExample example = new CheckTimeExample();
		Criteria criteria = example.createCriteria();
		if(!StringUtils.isEmpty(ck.getCheckTimeOut())) {
			if(ck.getCheckTimeOut() == 3 || ck.getCheckTimeOut() == 0) {
				List<Integer> intList = new ArrayList<Integer>();
				intList.add(ck.getCheckTimeOut());
				intList.add(4);
				criteria.andCheckTimeOutIn(intList);
			}else {
				criteria.andCheckTimeOutEqualTo(ck.getCheckTimeOut());
			}
		}
		if(StringUtil.isNotBlank(ck.getCheckTimeData())) {
			criteria.andCheckTimeDataEqualTo(ck.getCheckTimeData());
		}
		if(!StringUtils.isEmpty(ck.getCheckTimeEmpid())) {
			criteria.andCheckTimeEmpidEqualTo(ck.getCheckTimeEmpid());
		}
		return example;
		
	}
	
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.CheckTimeService#searchCheckTimeByCondition(com.office.entity.CheckTime, int, int)
	 */
	@Override
	public List<CheckTime> searchCheckTimeByCondition(CheckTime ck, int start, int length) {
		CheckTimeExample condition = condition(ck);
		condition.setStart(start);
		condition.setEnd(length);
		return ctMapper.selectByExample(condition);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.CheckTimeService#searchCountByCondition(com.office.entity.CheckTime)
	 */
	@Override
	public int searchCountByCondition(CheckTime ck) {
		CheckTimeExample condition = condition(ck);
		return (int)ctMapper.countByExample(condition);
	}

	@Override
	public HSSFWorkbook exportToExcel(List<CheckTime> list,HttpServletResponse res) {
		int row = 0;
		HSSFWorkbook hwb = new HSSFWorkbook();//创建一个excel文件
		HSSFSheet hs = hwb.createSheet();//在workbook中添加一个sheet对应excel的sheet
		HSSFRow hr = hs.createRow(row);//在sheet添加表头,第0行.
		HSSFCellStyle hcs = hwb.createCellStyle();//设置表头样式
		hcs.setAlignment(HorizontalAlignment.CENTER);//居中
		
		//将表头字段放入数组当中
		String[] excelHeader = {"---打卡日期---","---打卡员工---","-----------签到时间-------------","-------------签退时间-------------","---考勤状态---"};
		for(int i=0;i<excelHeader.length;i++) {
			HSSFCell hc = hr.createCell(i);//顺序创建
			hc.setCellValue(excelHeader[i]);//顺序塞入
			hc.setCellStyle(hcs);//居中
			hs.autoSizeColumn(i);//设置 i 这一列为自动调整列宽
		}
		for(int i=0;i<list.size();i++) {
			hr = hs.createRow(i+1);//在sheet中自动随 i+1 增加一行（i 是表头
			CheckTime ct = list.get(i);
			hr.createCell(0).setCellValue(ct.getCheckTimeData());
			hr.createCell(1).setCellValue(ct.getEmpName());
			hr.createCell(2).setCellValue(ct.getCheckTimeFirst());
			hr.createCell(3).setCellValue(ct.getCheckTimeLeave());
			hr.createCell(4).setCellValue(CheckTimeStatus(ct.getCheckTimeOut()));
		}
		return hwb;
	}
	
	/**
	 * 1为准时0迟到 
	 * 3早退 4迟到加早退
	 */
	private String CheckTimeStatus(int status) {
		if(status == 1) {return "准时";}
		if(status == 0) {return "迟到";}
		if(status == 3) {return "早退";}
		if(status == 4) {return "迟到并早退";}
		return "系统错误请联系管理员";
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.CheckTimeService#searchCheckTimeByConditionAll(com.office.entity.CheckTime)
	 */
	@Override
	public List<CheckTime> searchCheckTimeByConditionAll(CheckTime ck) {
		CheckTimeExample condition = condition(ck);
		return ctMapper.selectByExample1(condition);
	}
}
