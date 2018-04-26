package com.office.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import org.eclipse.jetty.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.office.dao.EmployeeMapper;
import com.office.dao.MeetingMapper;
import com.office.dao.MeetingRoomMapper;
import com.office.entity.Employee;
import com.office.entity.Meeting;
import com.office.entity.MeetingRoomExample;
import com.office.entity.MeetingExample;
import com.office.entity.MeetingExample.Criteria;
import com.office.entity.MeetingRoom;
import com.office.service.MeetingService;
import com.office.util.SendMessage;
import com.office.util.TimedTask;

@Service
public class MeetingServiceImpl implements MeetingService{

	@Autowired
	private MeetingMapper mtMapper;
	@Autowired
	private MeetingRoomMapper mtrMapper;
	@Autowired
	private EmployeeMapper empM;

	public Boolean isMeetingRoomExist(int mtrId) {
		MeetingRoom selectByPrimaryKey = mtrMapper.selectByPrimaryKey(mtrId);
		if(StringUtils.isEmpty(selectByPrimaryKey)) {
			return false;
		}
		return true;
	}
	
	/*
	 * 添加一场会议
	 * @parameter meeting
	 * @return 
	 * @see com.office.service.MeetingService#insertMeeting(com.office.entity.Meeting)
	 */
	@Override
	public int insertMeeting(Meeting meeting) {
		int insert = -1;
		if(isMeetingRoomExist(meeting.getMeetingRoomId())) {
			insert = mtMapper.insert(meeting);
		}else {
			return 3;
		}
		int meetUtil = meetUtil(meeting);
		if(meetUtil != 1) {
			System.out.println(meetUtil);
			mtMapper.deleteByPrimaryKey(meeting.getMeetingId());
			return meetUtil;
		}
		SendMessage send = new SendMessage();
		String s = "已预约会议，主题："+meeting.getMeetingName()+"。的会议，将于（"+meeting.getBookingTime()+"）开始，请准时参加！";
		send.SendMessageToEmp(meeting.getMeetingEmpId(),s);
		return insert;
	}
	
	/*
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#delMeeting(int)
	 */
	@Override
	public int delMeeting(int meeting_id) {
//		int res = -1;
		Meeting del_meeting = mtMapper.selectByPrimaryKey(meeting_id);
//		MeetingRoom meetingRoom = mtrMapper.selectByPrimaryKey(del_meeting.getMeetingRoomId());
//		meetingRoom.setMeetingRoomStatus(0);
//		res = modifyMeetingRoom(meetingRoom);
//		if(res < 1) {
//			return 0;
//		}
//		Calendar c = Calendar.getInstance();
		Date timeStart = del_meeting.getMeetingTimeStart();
//		c.setTime(timeStart);
//		c.add(Calendar.HOUR,del_meeting.getBookingTime());//会议结束之前取消给通知
		if(timeStart.getTime()>new Date().getTime()) {
			SendMessage send = new SendMessage();
			send.SendMessageToEmp(del_meeting.getMeetingEmpId(),del_meeting.getBookingTime()+"-的会议已取消,请留意");
		}
		
		return mtMapper.deleteByPrimaryKey(meeting_id);
	}
	
	/*
	 * 预约或修改会议的工具类
	 * 功能:判断是否可以预约或修改
	 * 0:预约时间不得早于当前时间   1:预约成功  2:预约时间段已被预约
	 * 前两层判断都过了就表明预约成功,启动定时器
	 */
	private int meetUtil(Meeting meeting) {
		long otherBookTime = 0;
		long otherStartTime = 0;
		long timed = 3600000 * meeting.getBookingTime();
		long currentMeetStartTime = meeting.getMeetingTimeStart().getTime();
		long currentMeetEndTime = currentMeetStartTime + timed;
		long nowTime = new Date().getTime();
		if(currentMeetStartTime<nowTime) {
			return 0;
		}
		MeetingRoom meetingRoom = mtrMapper.selectByPrimaryKey(meeting.getMeetingRoomId());
//		int meetingRoomCapacity = meetingRoom.getMeetingRoomCapacity(); //该部分功能移至前端
//		String[] split = meeting.getMeetingEmpId().split(",");
//		if(meetingRoomCapacity<split.length) {
//			SendMessage send = new SendMessage();
//			String s = "当前参会人员数过多,建议更换会议室";
//			send.SendMessageToEmp(split[1], s);
//		}
		List<Meeting> searchMeetingByMeetingRoomId = searchMeetingByMeetingRoomId(meeting.getMeetingRoomId());
		System.out.println("同个会议室有多少会议"+searchMeetingByMeetingRoomId.size());
		if(searchMeetingByMeetingRoomId.size()>0) {
			for (Meeting meetingList : searchMeetingByMeetingRoomId) {
				if(meetingList.getMeetingId().equals(meeting.getMeetingId())) {
					continue;
				}
				otherBookTime= meetingList.getBookingTime() * 3600000;
				otherStartTime = meetingList.getMeetingTimeStart().getTime();
//				if(Math.max(currentMeetStartTime, otherStartTime)-Math.min(currentMeetEndTime,otherStartTime+otherBookTime)<0) {
				if(currentMeetEndTime<otherStartTime || currentMeetStartTime>(otherBookTime+otherStartTime)) {
					continue;
				}else {
					return 2;
				}
			}
		}
		TimedTask.resetMeetingRoom(timed,currentMeetStartTime-nowTime,meetingRoom,meeting.getMeetingId());//定时器任务
		return 1;
	}
	
	@Override
	public int modifyMeeting(Meeting meeting) {
		int meetUtil = meetUtil(meeting);
		if(meetUtil != 1) {
			return meetUtil;
		}
		SendMessage send = new SendMessage();
		String s = "会议变更-主题："+meeting.getMeetingName()+"。的会议，将于（"+meeting.getBookingTime()+"）开始，请准时参加！";
		send.SendMessageToEmp(meeting.getMeetingEmpId(), s);
		return mtMapper.updateByPrimaryKey(meeting);
	}

	/*
	 * 多条件查询
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#searchMeetingByExample(com.office.entity.Meeting)
	 */
	@Override
	public List<Meeting> searchMeetingByExample(Meeting meet) {
		MeetingExample example = new MeetingExample();
		Criteria criteria = example.createCriteria();
		Integer meetingRoomId = meet.getMeetingRoomId();
		String meetingName = meet.getMeetingName();
		Date date = meet.getMeetingTimeStart();
		if(StringUtil.isNotBlank(meetingName)) {
			criteria.andMeetingNameLike("%"+meetingName+"%");
		}
		if( meetingRoomId != null) {
			criteria.andMeetingRoomIdEqualTo(meetingRoomId);
		}
		if(date != null) {
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			c1.setTime(date);
			c1.set(Calendar.HOUR_OF_DAY,0);
		    c1.set(Calendar.MINUTE, 0);
		    c2.setTime(date);
		    c2.set(Calendar.HOUR_OF_DAY,23);
		    c2.set(Calendar.MINUTE, 59);
			criteria.andMeetingTimeStartBetween(c1.getTime(), c2.getTime());
		}
		if(StringUtils.isEmpty(meet)) {
			return mtMapper.selectByExample(null);
		}
		List<Meeting> list = mtMapper.selectByExample(example);
		for (Meeting meeting : list) {
			String[] split = meeting.getMeetingEmpId().split(",");
			if(StringUtil.isNotBlank(split[0])) {
				Employee initiateMeetingEmp = empM.selectByPrimaryKey(Integer.parseInt(split[0]));
				meeting.setInitiateMeetingEmp(initiateMeetingEmp);
			}
		}
		return list;
	}

	@Override
	public int searchMeetingCountByExample(Meeting meet) {
		MeetingExample example = new MeetingExample();
		Criteria criteria = example.createCriteria();
		Integer meetingRoomId = meet.getMeetingRoomId();
		String meetingName = meet.getMeetingName();
		Date date = meet.getMeetingTimeStart();
		if(StringUtil.isNotBlank(meetingName)) {
			criteria.andMeetingNameLike("%"+meetingName+"%");
		}
		if( meetingRoomId != null) {
			criteria.andMeetingRoomIdEqualTo(meetingRoomId);
		}
		if(date != null) {
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			c1.setTime(date);
			c1.set(Calendar.HOUR_OF_DAY,0);
		    c1.set(Calendar.MINUTE, 0);
		    c2.setTime(date);
		    c2.set(Calendar.HOUR_OF_DAY,23);
		    c2.set(Calendar.MINUTE, 59);
			criteria.andMeetingTimeStartBetween(c1.getTime(), c2.getTime());
		}
		if(StringUtils.isEmpty(meet)) {
			return (int) mtMapper.countByExample(null);
		}
		return (int) mtMapper.countByExample(example);
	}
	
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#searchMeetingByMeetingRoomId(int)
	 */
	@Override
	public List<Meeting> searchMeetingByMeetingRoomId(int meetRoomId) {
		MeetingExample example = new MeetingExample();
		Criteria criteria = example.createCriteria();
		criteria.andMeetingRoomIdEqualTo(meetRoomId);
		return mtMapper.selectByExample(example);
	}

	
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#insertMeetingRoom(com.office.entity.MeetingRoom)
	 */
	@Override
	public int insertMeetingRoom(MeetingRoom meeting_room) {
		meeting_room.setMeetingRoomStatus(0);
		return mtrMapper.insert(meeting_room);
	}


	/* *********
	 * @parameter meeting_room_id
	 * @return 
	 * @see com.office.service.MeetingService#delMeetingRoom(int)
	 */
	@Override
	public int delMeetingRoom(int meeting_room_id) {
		long time = 0;
		Date dt = new Date();
		MeetingRoom selectByPrimaryKey = mtrMapper.selectByPrimaryKey(meeting_room_id);
		int meetingRoomStatus = selectByPrimaryKey.getMeetingRoomStatus();
		List<Meeting> searchMeetingByMeetingRoomId = searchMeetingByMeetingRoomId(meeting_room_id);
		for (Meeting meeting : searchMeetingByMeetingRoomId) {
			time =(meeting.getBookingTime() * 3600000) + meeting.getMeetingTimeStart().getTime();
			if(dt.getTime()<time) {
				return -99;
			}
		}
		return meetingRoomStatus == 0?mtrMapper.deleteByPrimaryKey(meeting_room_id):-1;
	}


	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#modifyMeetingRoom(com.office.entity.MeetingRoom)
	 */
	@Override
	public int modifyMeetingRoom(MeetingRoom meeting_room) {
		return  mtrMapper.updateByPrimaryKey(meeting_room);
	}


	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#searchAllMeetingRooms()
	 */
	@Override
	public List<MeetingRoom> searchAllMeetingRooms() {
		return mtrMapper.selectByExample(null);
	}


	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#searchMeetingRoomByStatus(int)
	 */
	@Override
	public List<MeetingRoom> searchMeetingRoomByStatus(int status) {
		
		MeetingRoomExample example = new MeetingRoomExample();
		com.office.entity.MeetingRoomExample.Criteria criteria = example.createCriteria();
		criteria.andMeetingRoomStatusEqualTo(status);
		return mtrMapper.selectByExample(example);
	}

	@Override
	public int searchMeetingRoomCountByStatus(int status) {
		MeetingRoomExample example = new MeetingRoomExample();
		com.office.entity.MeetingRoomExample.Criteria criteria = example.createCriteria();
		criteria.andMeetingRoomStatusEqualTo(status);
		return (int) mtrMapper.countByExample(example);
	}
	
	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#searchById(int)
	 */
	@Override
	public MeetingRoom searchById(int meet_room_id) {
		return mtrMapper.selectByPrimaryKey(meet_room_id);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#MeetingRoomCount()
	 */
	@Override
	public int MeetingRoomCount() {
		return (int) mtrMapper.countByExample(null);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#searchMeetingById(int)
	 */
	@Override
	public Meeting searchMeetingById(int meeting_id) {
		return mtMapper.selectByPrimaryKey(meeting_id);
	}

	/* 
	 * @parameter 
	 * @return 
	 * @see com.office.service.MeetingService#searchMeetingByEmpId(int)
	 */
	@SuppressWarnings("null")
	@Override
	public List<Meeting> searchMeetingByEmpId(String emp_id) {
		String[] split = null;
		List<Meeting> list2 = new ArrayList<Meeting>();
		List<Meeting> list = mtMapper.selectByExample(null);
		for (Meeting meeting : list) {
			split = meeting.getMeetingEmpId().split(",");
			if(StringUtil.isNotBlank(split[0]) && split[0].equals(emp_id) && !StringUtils.isEmpty(meeting)) {
				list2.add(meeting);
			}
		}
		return list2;
	}
	@Override
	public int searchMeetingCountByEmpId(String emp_id) {
		String[] split = null;
		int i = 0;
		List<Meeting> list = mtMapper.selectByExample(null);
		for (Meeting meeting : list) {
			split = meeting.getMeetingEmpId().split(",");
			if(StringUtil.isNotBlank(split[0]) && split[0].equals(emp_id)  && !StringUtils.isEmpty(meeting)) {
				i+=1;
			}
		}
		return i;
	}

}
