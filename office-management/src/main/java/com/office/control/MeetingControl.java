package com.office.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.Meeting;
import com.office.entity.MeetingRoom;
import com.office.service.MeetingService;
import com.office.util.AjaxResult;
import com.office.util.DataTables;

/*
 * @author zhangmj
 * @date 2018年2月28日
 */
@Controller
@RequestMapping("meeting/")
public class MeetingControl {

	@Autowired
	private MeetingService mtService;
	
	@RequestMapping("toMeetingRoomTable.do")
	public String toMeetingRoomTable() {
		return "meeting/meetingRoomTable";
	}
	
	@RequestMapping("toAddMeetingRoom.do")
	public String toAddMeetingRoom() {
		return "meeting/addMeetingRoom";
	}
	
	@RequestMapping("MTRtableOnlyRead.do")
	public String MTRtableOnlyRead() {
		return "meeting/MTRtableOnlyRead";
	}
	
	@RequestMapping("toModifyMeetingRoom.do")
	public String toModifyMeetingRoom() {
		return "meeting/modifyMeetingRoom";
	}
	
	@RequestMapping("toAddMeeting.do")
	public String toAddMeeting() {
		return "meeting/addMeeting";
	}
	
	@RequestMapping("toModifyMeeting.do")
	public String toModifyMeeting() {
		return "meeting/modifyMeeting";
	}
	
	@RequestMapping("toMeetingTable.do")
	public String toMeetingTable() {
		return "meeting/meetingTable";
	}
	
	@RequestMapping("doAddMeeting.do")
	@ResponseBody
	public AjaxResult doAddMeeting(Meeting meeting) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date parse = fmt.parse(meeting.getDate());
			meeting.setMeetingTimeStart(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AjaxResult result = new AjaxResult();
		int res = -1;
		res = mtService.insertMeeting(meeting);
		result.setTag(res);
		if(res == 1) {
			result.setMessage("会议预约成功!");
		}else if(res < 1) {
			result.setMessage("会议预约失败,请重试!");
		}else if(res == 2) {
			result.setMessage("会议室正在使用中,或预约时间不符合规定");
		}else if(res == 3) {
			result.setMessage("会议室不存在");
		}
		return result;
	}
	
	@RequestMapping("delMeeting.do")
	@ResponseBody
	public AjaxResult delMeeting(int id) {
		AjaxResult result = new AjaxResult();
		int res = -1;
		res = mtService.delMeeting(id);                                  
		result.setTag(res);
		result.setMessage(res>0?"删除成功":"删除失败");
		return result;
	}
	
	@RequestMapping("modifyMeeting.do")
	@ResponseBody
	public AjaxResult modifyMeeting(Meeting meeting) {
		AjaxResult result = new AjaxResult();
		int res = -1;
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date parse = fmt.parse(meeting.getDate());
			meeting.setMeetingTimeStart(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res = mtService.modifyMeeting(meeting);
		result.setTag(res);
		if(res < 1) {
			result.setMessage("会议变更失败,请重试!");
		}else if(res == 1) {
			result.setMessage("会议变更成功!");
		}else if(res == 2) {
			result.setMessage("会议室正在使用中,或预约时间不符合规定");
		}else if(res == 3) {
			result.setMessage("会议室不存在");
		}
		return result;
	}
	
	@RequestMapping("meetingTable.do")
	@ResponseBody
	public DataTables meetingTable(Meeting meet) {
		DataTables dt = new DataTables();
		List<Meeting> example = mtService.searchMeetingByExample(meet);
		dt.setData(example);
		int countByExample = mtService.searchMeetingCountByExample(meet);
		dt.setRecordsFiltered(countByExample);
		dt.setRecordsTotal(countByExample);
		return dt;
	}
	
	@RequestMapping("toMyMeeting.do")
	public String toMyMeeting() {
		return "meeting/myMeeting";
	}
	
	@RequestMapping("myMeeting.do")
	@ResponseBody
	public DataTables myMeeting(Meeting meet,HttpServletRequest request) {
		DataTables dt = new DataTables();
		Object object = request.getSession().getAttribute("emp_id");
		String emp_id =object != null ?object.toString():null;
		List<Meeting> example = mtService.searchMeetingByEmpId(emp_id);
		dt.setData(example);
		int countByExample = mtService.searchMeetingCountByEmpId(emp_id);
		dt.setRecordsFiltered(countByExample);
		dt.setRecordsTotal(countByExample);
		return dt;
	}
	
	@RequestMapping("meetRoomTable.do")
	@ResponseBody			
	public DataTables meetRoomTable(int status) {
		DataTables dt =  new DataTables();
		List<MeetingRoom> roomByStatus = mtService.searchMeetingRoomByStatus(status);
		int countByStatus = mtService.searchMeetingRoomCountByStatus(status);
		dt.setData(roomByStatus);
		dt.setRecordsFiltered(countByStatus);
		dt.setRecordsTotal(countByStatus);
		return dt;
	}
	
	@RequestMapping("addMeetingRoom.do")
	@ResponseBody
	public AjaxResult addMeetingRoom(MeetingRoom meetingRoom) {
		AjaxResult result = new AjaxResult();
		int res = -1;
		res = mtService.insertMeetingRoom(meetingRoom);
		result.setTag(res);
		result.setMessage(res>0?"添加成功":"添加失败");
		return result;
	}
	
	@RequestMapping("delMeetingRoom.do")
	@ResponseBody
	public AjaxResult delMeetingRoom(int id) {
		AjaxResult result = new AjaxResult();
		int res = -1;
		res = mtService.delMeetingRoom(id);
		result.setTag(res);
		if(res>0) {
			result.setMessage("会议室删除成功!");
		}else if(res == -99) {
			result.setMessage("会议室中有预约会议,不可删除");
		}else {
			result.setMessage("会议室删除失败,请检查是否有正在进行的会议");
		}
		return result;
	}
	
	@RequestMapping("modifyMeetingRoom.do")
	@ResponseBody
	public AjaxResult modifyMeetingRoom(MeetingRoom meetingRoom) {
		AjaxResult result = new AjaxResult();
		int res = -1;
		res = mtService.modifyMeetingRoom(meetingRoom);
		result.setTag(res);
		result.setMessage(res>0?"修改成功":"修改失败,请检查该会议室是否正在会议中或存在预约中会议");
		return result;
	}
}
