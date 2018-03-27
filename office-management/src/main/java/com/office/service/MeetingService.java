package com.office.service;

import java.util.List;


import com.office.entity.Meeting;
import com.office.entity.MeetingRoom;

public interface MeetingService {

	public int insertMeeting(Meeting meeting);
	public int delMeeting(int meeting_id);
	public int modifyMeeting(Meeting meeting);
	public List<Meeting> searchMeetingByExample(Meeting meet);
	public int searchMeetingCountByExample(Meeting meet);
	public List<Meeting> searchMeetingByMeetingRoomId(int meetRoomId);
	public Meeting searchMeetingById(int meeting_id);
	public List<Meeting> searchMeetingByEmpId(String emp_id);
	public int searchMeetingCountByEmpId(String emp_id);
	/*
	 * MeetingRoomService
	 */
	public List<MeetingRoom> searchAllMeetingRooms();
	public int MeetingRoomCount();
	public MeetingRoom searchById(int meet_room_id);
	public int insertMeetingRoom(MeetingRoom meeting_room);
	public int delMeetingRoom(int meeting_room_id);
	public int modifyMeetingRoom(MeetingRoom meeting_room);
	public List<MeetingRoom> searchMeetingRoomByStatus(int status);
	public int searchMeetingRoomCountByStatus(int status);
}
