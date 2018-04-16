package com.office.service.impl;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
