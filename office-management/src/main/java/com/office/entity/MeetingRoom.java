package com.office.entity;

public class MeetingRoom {
    private Integer meetingRoomId;//会议室id

    private Integer meetingRoomCapacity;//会议室容量

    private Integer meetingRoomStatus;//会议室状态

    private String meetingRoomName;//会议室名

    public Integer getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(Integer meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public Integer getMeetingRoomCapacity() {
        return meetingRoomCapacity;
    }

    public void setMeetingRoomCapacity(Integer meetingRoomCapacity) {
        this.meetingRoomCapacity = meetingRoomCapacity;
    }

    public Integer getMeetingRoomStatus() {
        return meetingRoomStatus;
    }

    public void setMeetingRoomStatus(Integer meetingRoomStatus) {
        this.meetingRoomStatus = meetingRoomStatus;
    }

    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName == null ? null : meetingRoomName.trim();
    }
}