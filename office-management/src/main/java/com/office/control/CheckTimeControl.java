package com.office.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.CheckTime;
import com.office.service.CheckTimeService;
import com.office.util.AjaxResult;
import com.office.util.DataTables;

/**
 * @author zhangmj
 * @date 2018年3月22日
 */
@Controller
@RequestMapping("checkOnWork/")
public class CheckTimeControl {

	@Autowired
	private CheckTimeService ckService;
	
	@RequestMapping("toDoCheckSelf.do")
	public String toDoCheckSelf() {
		return "checkOnWork/doCheckSelf";
	}
	
	private int returnEmpId(HttpServletRequest request) {
		Object empId = request.getSession().getAttribute("emp_id");
		String emp_id =empId != null ?empId.toString():null;
		int parseInt = Integer.parseInt(emp_id);
		return parseInt;
	}
	
	@RequestMapping("doCheck.do")
	@ResponseBody
	public AjaxResult doCheck(HttpServletRequest request) {
		AjaxResult result = new AjaxResult();
		int tag = -1;
		int returnEmpId = returnEmpId(request);
		tag = ckService.insertCheckTime(returnEmpId);
		result.setTag(tag);
		if(tag == 1) {
			result.setMessage("打卡成功");
		}else if(tag == 99) {
			result.setMessage("打卡成功,你迟到了");
		}else if(tag == 93){
			result.setMessage("打卡成功,早退打卡,若为误打卡请在正确的时间再打一次!");
		}else {
			result.setMessage("打卡失败,请重试!");
		}
		return result;
	}
	
	@RequestMapping("checkTimeSeP.do")
	@ResponseBody
	public DataTables checkTimeSeP(HttpServletRequest request) {
		DataTables dt = new DataTables();
		int returnEmpId = returnEmpId(request);
		List<CheckTime> searchCheckTimeByEmp = ckService.searchCheckTimeByEmp(returnEmpId);
		int countByEmp = ckService.searchCheckTimeCountByEmp(returnEmpId);
		dt.setRecordsFiltered(countByEmp);
		dt.setRecordsTotal(countByEmp);
		dt.setData(searchCheckTimeByEmp);
		return dt;
	}
	
	@RequestMapping("checkTimeAll.do")
	@ResponseBody
	public DataTables checkTimeAll(String time, int start, int length) {
		ckService.searchCheckTimeByTime(time,start,length);
		DataTables dt = new DataTables();
		return dt;
	}
	
}
