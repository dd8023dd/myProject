package com.office.entity;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Meeting {
    private Integer meetingId;

    private String meetingName;

    private Integer meetingRoomId;

    private String meetingEmpId;

    private Date meetingTimeStart;

    private Integer bookingTime;

    private Employee initiateMeetingEmp;//会议发起人
    
	public Employee getInitiateMeetingEmp() {
		return initiateMeetingEmp;
	}

	public void setInitiateMeetingEmp(Employee initiateMeetingEmp) {
		this.initiateMeetingEmp = initiateMeetingEmp;
	}

	private String date;
    
    public String getDate() {
    	if(meetingTimeStart != null ) {
    		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    		date = dt.format(meetingTimeStart);
    	}
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public Integer getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(Integer meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public String getMeetingEmpId() {
        return meetingEmpId;
    }

    public void setMeetingEmpId(String meetingEmpId) {
        this.meetingEmpId = meetingEmpId == null ? null : meetingEmpId.trim();
    }

    public Date getMeetingTimeStart() {
        return meetingTimeStart;
    }

    public void setMeetingTimeStart(Date meetingTimeStart) {
        this.meetingTimeStart = meetingTimeStart;
    }

    public Integer getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Integer bookingTime) {
        this.bookingTime = bookingTime;
    }
}