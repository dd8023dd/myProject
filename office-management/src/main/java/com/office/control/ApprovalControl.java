package com.office.control;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.Approval;
import com.office.entity.AskToLeave;
import com.office.entity.ExtraWork;
import com.office.service.ApprovalService;
import com.office.service.AskToLeaveService;
import com.office.service.ExtraWorkService;
import com.office.util.AjaxResult;
import com.office.util.DataTables;

@Controller
@RequestMapping("approval/")
public class ApprovalControl {

	@Autowired
	private ApprovalService appService;
	@Autowired
	private AskToLeaveService LeaveService;
	@Autowired
	private ExtraWorkService workService;
	
	@RequestMapping("toAskToLeave.do")
	public String toAskToLeave() {
		return "approval/askToLeavePage";
	}
	@RequestMapping("toExtraWork.do")
	public String toExtraWork() {
		return "approval/extraWorkPage";
	}
	
	@RequestMapping("doAskToLeave.do")
	@ResponseBody
	public AjaxResult doAskToLeave(AskToLeave leave) {
		AjaxResult result = new AjaxResult();	
		int leaveRes = -1;
		Approval approval = creatApproval(1, leave);
		if(approval != null ) {
			leave.setApprovalId(approval.getApprovalId());
			leaveRes = LeaveService.insertLeave(leave);
			if(leaveRes<1) {
				appService.delApproval(approval.getApprovalId());
			}
		}
		result.setTag(leaveRes);
		result.setMessage(leaveRes>0?"审批提交成功":"审批提交失败,请重试");
		return result;
	}
	
	@RequestMapping("doExtraWork.do")
	@ResponseBody
	public AjaxResult doExtraWork(ExtraWork work) {
		AjaxResult result = new AjaxResult();
		int workRes = -1;
		Approval approval = creatApproval(2, work);
		if(approval != null) {
			work.setApprovalId(approval.getApprovalId());
			workRes = workService.insertExtraWork(work);
			if(workRes<1) {
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
			if(leaveTime<=3) {
				approval.setApprovalLevel(1);
			}else if(3<leaveTime && leaveTime<=7) {
				approval.setApprovalLevel(2);
			}else if(leaveTime>7) {
				approval.setApprovalLevel(3);
			}
		}else if(approval_type == 2) {
			approval.setApprovalType("extraWork");
			approval.setApprovalLevel(1);
		}
		int insertApproval = appService.insertApproval(approval);
		int approvalId = appService.searchApprovalByApprovalNo(approval.getApprovalNo()).getApprovalId();
		approval.setApprovalId(approvalId);
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
	public AjaxResult doApproval(Approval approval) {
		AjaxResult result = new AjaxResult();
		int doApproval = appService.doApproval(approval);
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
	public DataTables workTable() {
		DataTables table = new DataTables();
		return table;
	}
}
