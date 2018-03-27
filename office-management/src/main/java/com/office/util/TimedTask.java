package com.office.util;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.office.entity.MeetingRoom;
import com.office.service.MeetingService;

/**
 * @author zhangmj
 * @date 2018年2月28日
 */
@Component
public class TimedTask {
	
	@Autowired
	private  MeetingService mtService;
	private static TimedTask timeTask;
	
	@PostConstruct
	public void init() {
		timeTask = this;
		timeTask.mtService = this.mtService;
	}
	public static void resetMeetingRoom(long time,long startTime,MeetingRoom mtr,int meeting_id) {
		System.out.println("会议持续时间:"+time+",会议距目前还有多少时间:"+startTime);
		Runnable runnable = new Runnable() {
            public void run() {
            	if(StringUtils.isEmpty(timeTask.mtService.searchMeetingById(meeting_id))) {
            		System.out.println("会议已删除或已结束");
            		return;//如果会议被删除则不改变原来的状态
            	}else if(mtr.getMeetingRoomStatus().equals(0)) {
            		System.out.println("已经改变会议室状态");
            		mtr.setMeetingRoomStatus(1);
            		int modifyMeetingRoom = timeTask.mtService.modifyMeetingRoom(mtr);
            		System.out.println("修改结果"+modifyMeetingRoom);
            		resetMeetingRoom(0,time,mtr,meeting_id);
            	}else if(time == 0){
            		System.out.println("已经改变会议室状态");
            		mtr.setMeetingRoomStatus(0);
            		timeTask.mtService.modifyMeetingRoom(mtr);
            	}else {
            		return;
            	}
            }  
        };  
        ScheduledExecutorService service = Executors  
                .newSingleThreadScheduledExecutor();  
        // 第二个参数为首次执行的延时时间
        service.schedule(runnable, startTime,TimeUnit.MILLISECONDS);  
	}  
}

