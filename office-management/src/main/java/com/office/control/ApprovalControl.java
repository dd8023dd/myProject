package com.office.control;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jetty.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.Approval;
import com.office.entity.ApprovalGroup;
import com.office.entity.ApprovalMember;
import com.office.entity.AskToLeave;
import com.office.entity.ExtraWork;
import com.office.service.ApprovalGroupService;
import com.office.service.ApprovalService;
import com.office.service.AskToLeaveService;
import com.office.service.ExtraWorkService;
import com.office.util.AjaxResult;
import com.office.util.DataTables;
import com.office.util.GetSessionContext;

@Controller
@RequestMapping("approval/")
public class ApprovalControl {

	@Autowired
	private ApprovalService appService;
	@Autowired
	private AskToLeaveService LeaveService;
	@Autowired
	private ExtraWorkService workService;
	@Autowired
	private GetSessionContext getSession;
	@Autowired
	private ApprovalGroupService agService;
	
	@RequestMapping("toAllApprovalTable.do")
	public String toAllApprovalTable() {
		return "approval/allApprovalInfo";
	}
	
	@RequestMapping("toAddApprovalGroupMember.do")
	public String toAddApprovalGroupMember() {
		return "approval/addApprovalGroupMember";
	}
	@RequestMapping("toApprovalGroupTable.do")
	public String toApprovalGroupTable() {
		return "approval/approvalGroupTable";
	}
	@RequestMapping("toAskToLeave.do")
	public String toAskToLeave() {
		return "approval/askToLeavePage";
	}
	@RequestMapping("toMyAccept.do")
	public String toMyAccept() {
		return "approval/myAccept";
	}
	@RequestMapping("toMyApprovalSend.do")
	public String toMyApprovalSend() {
		return "approval/myApprovalSend";
	}
	@RequestMapping("toExtraWork.do")
	public String toExtraWork() {
		return "approval/extraWorkPage";
	}
	
	@RequestMapping("approvalGroupList.do")
	@ResponseBody
	public AjaxResult approvalGroupList() {
		AjaxResult result = new AjaxResult();
		List<ApprovalGroup> searchAllApprovalGroup = agService.searchAllApprovalGroup();
		result.setTag(searchAllApprovalGroup);
		return result;
	}
	
	@RequestMapping("allAskToLeave.do")
	@ResponseBody
	public DataTables allAskToLeave(int start,int length) {
		DataTables dt = new DataTables();
		List<AskToLeave> searchAllLeaveS = LeaveService.searchAllLeaveS(start,length);
		int count = LeaveService.searchLeaveCount();
		dt.setData(searchAllLeaveS);
		dt.setRecordsFiltered(count);
		dt.setRecordsTotal(count);
		return dt;
	}
	
	@RequestMapping("allExtraWork.do")
	@ResponseBody
	public DataTables allExtraWork(int start,int length) {
		DataTables dt = new DataTables();
		List<ExtraWork> list = workService.searchAllExtraWorkS(start,length);
		int count = workService.searchCountAll();
		dt.setData(list);
		dt.setRecordsFiltered(count);
		dt.setRecordsTotal(count);
		return dt;
	}
	
	@RequestMapping("myAcceptApproval.do")
	@ResponseBody
	public DataTables myAcceptApproval(HttpServletRequest req,int start,int length) {
		DataTables dt = new DataTables();
		int emp_id = getSession.getEmpId(req);//在session中获取当前登录员工id
		List<ApprovalMember> memberList = appService.searchApprovalMemberByAccepter(emp_id);
		List<AskToLeave> leave =  new ArrayList<AskToLeave>();
		if(!StringUtils.isEmpty(memberList)) {
			for (ApprovalMember approvalMember : memberList) {
				AskToLeave leave2 = LeaveService.searchByApprovalId(approvalMember.getApprovalId());
				if(StringUtils.isEmpty(leave2)) {
					continue;
				}
				leave.add(leave2);
				dt.setData(leave);
			}
		}
		dt.setRecordsFiltered(leave.size());
		dt.setRecordsTotal(leave.size());
		return dt;
	}
	@RequestMapping("myAcceptApprovalExw.do")//接受加班审批
	@ResponseBody
	public DataTables myAcceptApprovalExw(HttpServletRequest req,int start,int length) {
		DataTables dt = new DataTables();
		int emp_id = getSession.getEmpId(req);//在session中获取当前登录员工id
		List<ApprovalMember> memberList = appService.searchApprovalMemberByAccepter(emp_id);
		List<ExtraWork> ew =  new ArrayList<ExtraWork>();
		if(!StringUtils.isEmpty(memberList)) {
			for (ApprovalMember approvalMember : memberList) {
				ExtraWork byApprovalId = workService.searchByApprovalId(approvalMember.getApprovalId());
				if(StringUtils.isEmpty(byApprovalId)) {
					continue;
				}
				ew.add(byApprovalId);
				dt.setData(ew);
			}
		}
		dt.setRecordsFiltered(ew.size());
		dt.setRecordsTotal(ew.size());
		return dt;
	}
	
	@RequestMapping("approvalGroupTable.do")
	@ResponseBody
	public DataTables approvalGroupTable() {
		DataTables dt = new DataTables();
		List<ApprovalGroup> searchAllApprovalGroup = agService.searchAllApprovalGroup();
		int count = (int)agService.searchAllCountApprovalGroup();
		dt.setRecordsFiltered(count);
		dt.setRecordsTotal(count);
		dt.setData(searchAllApprovalGroup);
		return dt;
	}
	
	@RequestMapping("myAskToLeaveTable.do")
	@ResponseBody
	public DataTables myAskToLeaveTable(int start,int length,HttpServletRequest req) {
		int emp_id = getSession.getEmpId(req);
		DataTables dt = new DataTables();
		List<AskToLeave> searchLeaveByEmp = LeaveService.searchLeaveByEmp(emp_id, start, length);
		int count = LeaveService.searchLeaveByEmpCount(emp_id);
		dt.setData(searchLeaveByEmp);
		dt.setRecordsFiltered(count);
		dt.setRecordsTotal(count);
		return dt;
	}
	
	@RequestMapping("addApprovalGroupMember.do")
	@ResponseBody
	public AjaxResult addApprovalGroupMember(ApprovalGroup ag) {
		AjaxResult result = new AjaxResult();
		int res = agService.insertApprovalGroup(ag);
		result.setTag(res);
		if(res > 0) {
			result.setMessage("成员添加成功");
		}else if(res == -2) {
			result.setMessage("该员工ID不存在");
		}else {
			result.setMessage("成员添加失败");
		}
		return result;
	}
	
	@RequestMapping("delApprovalGroupMember.do")
	@ResponseBody
	public AjaxResult delApprovalGroupMember(int id) {
		AjaxResult result = new AjaxResult();
		int res = agService.delApprovalGroup(id);
		result.setTag(res);
		if(res > 0) {
			result.setMessage("删除成功");
		}else {
			result.setMessage("删除失败");
		}
		return result;
	}
	
	@RequestMapping("doAskToLeave.do")
	@ResponseBody
	public AjaxResult doAskToLeave(AskToLeave leave,HttpServletRequest req) {
		AjaxResult result = new AjaxResult();	
		int leaveRes = -1;
		Object attribute = req.getSession().getAttribute("emp_id");
		if(!StringUtils.isEmpty(attribute)) {
			int emp_id = Integer.parseInt(attribute.toString());
			leave.setEmpId(emp_id);
		}else {
			result.setTag(leaveRes);
			result.setMessage("登录信息丢失,请重新登录后再试");
			return result;
		}
		Approval approval = creatApproval(1, leave);
		ApprovalMember am = creatApprovalMember(approval.getApprovalId(),leave.getEmpId(),leave.getApprovalPersonId());
		if(!StringUtils.isEmpty(approval) && !StringUtils.isEmpty(am)) {
			leave.setApprovalId(approval.getApprovalId());
			leaveRes = LeaveService.insertLeave(leave);
			if(leaveRes<1) {
				appService.delApprovalMember(am.getApprovalMemberId());
				appService.delApproval(approval.getApprovalId());
			}
		}
		result.setTag(leaveRes);
		result.setMessage(leaveRes>0?"审批提交成功":"审批提交失败,请重试");
		return result;
	}
	
	public ApprovalMember creatApprovalMember(int approvalId,int empId,int accepterId) {
		ApprovalMember am = new ApprovalMember();
		am.setApprovalAccpeterId(accepterId);
		am.setApprovalId(approvalId);
		am.setApprovalSenderId(empId);
		int inserApprovalMember = appService.inserApprovalMember(am);
		return inserApprovalMember>0?am:null;
	}
	
	@RequestMapping("doExtraWork.do")
	@ResponseBody
	public AjaxResult doExtraWork(ExtraWork work,HttpServletRequest req) {
		AjaxResult result = new AjaxResult();
		int workRes = -1;
		Object attribute = req.getSession().getAttribute("emp_id");
		if(!StringUtils.isEmpty(attribute)) {
			int emp_id = Integer.parseInt(attribute.toString());
			work.setEmpId(emp_id);
		}else {
			result.setTag(workRes);
			result.setMessage("登录信息丢失,请重新登录后再试");
			return result;
		}
		Approval approval = creatApproval(2, work);
		ApprovalMember am = creatApprovalMember(approval.getApprovalId(),work.getEmpId(),work.getApprovalPersonId());
		if(approval != null) {
			work.setApprovalId(approval.getApprovalId());
			workRes = workService.insertExtraWork(work);
			if(workRes<1) {
				appService.delApprovalMember(am.getApprovalMemberId());
				appService.delApproval(approval.getApprovalId());
			}
		} 
		result.setTag(workRes);
		result.setMessage(workRes>0?"审批提交成功":"审批提交失败,请重试");
		return result;
	}
	
	private Approval creatApproval(int approval_type,Object o) {
		Approval approval = new Approval();
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddHHmmss");
		int random = (int)Math.random()*100;
		String approval_no = date.format(new Date())+random;
		approval.setApprovalNo(approval_no);
		//判断审批类型1.请假 2.加班
		if(approval_type == 1) {
			approval.setApprovalType("askToLeave");
			Integer leaveTime = ((AskToLeave) o).getLeaveTime();
			if(leaveTime<=3) {//三种审批等级
				approval.setApprovalLevel(1);
			}else if(3<leaveTime && leaveTime<=7){
				approval.setApprovalLevel(2);
			}else if(leaveTime>7) {
				approval.setApprovalLevel(3);
			}
		}else if(approval_type == 2) {
			approval.setApprovalType("extraWork");
			approval.setApprovalLevel(1);
		}
		int insertApproval = appService.insertApproval(approval);
		return insertApproval>0?approval:null;
	}
	
	@RequestMapping("delApproval.do")
	@ResponseBody
	public AjaxResult delApproval(int approval_id) {
		AjaxResult result = new AjaxResult();
		int res = -1;
		Approval approval = appService.searchApprovalByApprovalId(approval_id);
		if("askToLeave".equals(approval.getApprovalType())) {
			res = LeaveService.delLeaveByApprovalId(approval_id);
		}else if("extraWork".equals(approval.getApprovalType())) {
			res = workService.delWorkByApprovalId(approval_id);
		}
		AskToLeave askToLeave = LeaveService.searchByApprovalId(approval_id);
		ExtraWork extraWork = workService.searchByApprovalId(approval_id);
		//如果请假表或者加班表删除成功但是审批表删除失败了,这边的判断就会出现问题
//		res = res>0?appService.delApproval(approval_id):-1;
		res = StringUtils.isEmpty(askToLeave) && StringUtils.isEmpty(extraWork)
				?appService.delApproval(approval_id):-1;
		result.setTag(res);
		result.setMessage(res>0?"删除成功":"删除失败,请重试");
		return result;
	}
	
	@RequestMapping("doApproval.do")
	@ResponseBody
	//根据传入值判断操作status 1:pass 0:refuse
	public AjaxResult doApproval(int approvalId,String status) {
		AjaxResult result = new AjaxResult();
		Approval approval = appService.searchApprovalByApprovalId(approvalId);
		int doApproval = appService.doApproval(approval,status);
		result.setTag(doApproval);
		result.setMessage(doApproval>0?"审批成功":"审批失败");
		return result;
	}
	
	@RequestMapping("leaveTableManage.do")
	public String leaveTableManage() {
		return "approval/leaveTableManage";
	}
	
	@RequestMapping("leaveTable.do")
	@ResponseBody
	public DataTables leaveTable(String time) {
		DataTables table = new DataTables();
		LeaveService.searchLeaceByLeaveTime(time);
		//这边不用分页 = = 按照时间范围划分
		return table;
	}
	
	@RequestMapping("workTableManage.do")
	public String workTableManage() {
		return "approval/workTableManage";
	}
	
	@RequestMapping("workTable.do")
	@ResponseBody
	public DataTables workTable(HttpServletRequest request,int start,int length) {
		DataTables table = new DataTables();
		int emp_id = getSession.getEmpId(request);
		List<ExtraWork> list = workService.searchExtraWorkByEmp(emp_id,start,length);
		table.setData(list);
		int count = (int)workService.searchExtraWorkCountByEmp(emp_id);
		table.setRecordsFiltered(count);
		table.setRecordsTotal(count);
		return table;
	}
}