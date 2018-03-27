package com.office.control;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.DeptDetails;
import com.office.entity.Depts;
import com.office.service.DeptDetailService;
import com.office.service.DeptService;
import com.office.util.AjaxResult;
import com.office.util.DataTables;

@Controller
@RequestMapping("dept/")
public class DeptControl {
	@Resource
	private DeptService deptservice;
	@Resource
	private DeptDetailService ddtService;
	
	@RequestMapping("addDept.do")
	@ResponseBody
	public AjaxResult addDept(Depts dept) {
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = deptservice.insertDept(dept);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"添加成功":"添加失败");
		return ajaxresult;
	}
	
	@RequestMapping("toDeptInfo.do")
	public String deptInfo() {
		return "dept/deptInfo";
	}
	
	@RequestMapping("addDDT.do")
	@ResponseBody
	public AjaxResult addDDT(DeptDetails dd) {
		AjaxResult ajaxresult = new AjaxResult();
		int res = -1;
		res = ddtService.insertDeptDetail(dd);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"添加成功":"添加失败");
		return ajaxresult;
	}
	@RequestMapping("delDDT.do")
	@ResponseBody
	public AjaxResult delDDT(int id) {
		AjaxResult ajaxresult = new AjaxResult();
		int res = -1;
		res = ddtService.delDeptDetail(id);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"删除成功":"删除失败");
		return ajaxresult;
	}
	
	@RequestMapping("searchDDT.do")
	@ResponseBody
	public AjaxResult searchDDT(int deptId) {
		AjaxResult ajaxresult = new AjaxResult();
		int res = -1;
		DeptDetails dtt = ddtService.searchDeptDetailByDeptId(deptId);
		if(!StringUtils.isEmpty(dtt)) {
			res = 1;
		}
		ajaxresult.setTag(res);
		ajaxresult.setMessage(dtt);
		return ajaxresult;
	}
	
	@RequestMapping("modifyDDT.do")
	@ResponseBody
	public AjaxResult modifyDDT(DeptDetails dd) {
		AjaxResult ajaxresult = new AjaxResult();
		int res = -1;
		res = ddtService.updateDeptDetail(dd);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"更新成功":"更新失败");
		return ajaxresult;
	}
	
	@RequestMapping("delDept.do")
	@ResponseBody
	public AjaxResult delDept(int id) {
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = deptservice.delDept(id);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"删除成功":"删除失败");
		return ajaxresult;
	}
	
	@RequestMapping("modifyDept.do")
	@ResponseBody
	public AjaxResult modifyDept(Depts dept) {
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = deptservice.modifyDept(dept);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"修改成功":"修改失败");
		return ajaxresult;
	}
	
	@RequestMapping("deptTable.do")
	public String deptTable() {
		return "dept/deptTable";
	}
	@RequestMapping("toAddDept.do")
	public String toAddDept() {
		return "dept/addDept";
	}
	@RequestMapping("toModifyDept.do")
	public String toModifyDept() {
		return "dept/modifyDept";
	}
	
	@RequestMapping("deptPage.do")
	@ResponseBody
	public DataTables deptPage(String dept_name,int start,int length) {
		DataTables dt = new DataTables();
		List<Depts> list = deptservice.searchDeptsByPage(dept_name, start, length);
		int count = deptservice.searchDeptsCount(dept_name);
		dt.setData(list);
		dt.setRecordsTotal(count);
		dt.setRecordsFiltered(count);
		return dt;
	}
}
