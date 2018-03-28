/**
 * 统一整合datatables调用的方法,增强代码的复用性
 * @author zhangmj
 * @date 2018-03-07 15:13
 */

var datatable_empPhone = null;

function createTable_EmpPhone(){
	if(datatable_empPhone != null){
		datatable_empPhone.destroy();
	}
	datatable_empPhone = $('#datatable_empPhone').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/employee/empPage.do',
	 	 	dataSrc:"data",
	 	 	data : {
	 	 		'empName':$("#searchEmpName").val()
	 	 	},
	 	 	type:"post"
		},
		columns:[
			{data:'empNo'},
			{data:'empName'},
			{data:'dept.deptName'},
			{data:'empEmail'},
			{data:'empPhonenum'}
		] 
	});
}
/***************************empTable***********************************/
var datatable_emp = null;
function createTable_Emp(){
	if(datatable_emp != null){
		datatable_emp.destroy();
	}
	datatable_emp = $('#datatable_emp').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/employee/empPage.do',
	 	 	dataSrc:"data",
	 	 	data : {
	 	 		'empName':$("#searchEmpName").val()
	 	 	},
	 	 	type:"post"
		},
		columns:[
			{data:'empNo'},
			{data:'empBirthS'},
			{data:'empHiredateS'},
			{data:'empName'},
			{data:'empAddress'},
			{data:'dept.deptName'},
			{data:'empEmail'},
			{data:'empPhonenum'},
			{data:'empPos'},
			{data:'empGender',render:function(data){
				if(data == 1){
					return '男';
				}else{
					return '女';
				}
			}},
			{data:'empId',render:function(data,type,row){
				return "<a href='javascript:del(\"emp\","+data+",\"/office-management/employee/delEmp.do\");'>删除</a>&nbsp;"
				+"<a href='javascript:modify(\"emp\","+JSON.stringify(row)+","+data+",\"修改员工信息\",\"/office-management/employee/toModifyEmp.do\");'>修改</a>"
			}}
		] 
	});
}

/***************************userTable**********************************/
var datatable_user = null;
function createTable_User(){
	if(datatable_user != null){
		datatable_user.destroy();
	}
	datatable_user = $('#datatable_user').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器 d
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/user/userPage.do',
	 	 	dataSrc:"data",
	 	 	type:"post",
	 	 	data:{
	 	 		'userName':$("#userNameSearch").val()
	 	 	}
		},
		columns:[
			{data:'userId'},
			{data:'userName'},
			{data:'emp.empName'},
			{data:'userId',render:function(data,type,row){
				return "<a href='javascript:del(\"user\","+data+",\"/office-management/user/delUser.do\");'>删除</a>&nbsp;"
				+"<a href='javascript:modify(\"user\","+JSON.stringify(row)+","+data+",\"修改用户信息\",\"/office-management/user/toModifyUser.do\");'>修改</a>"
			}}
		] 
	});
}
/***************************deptTable**********************************/
var datatable_dept = null;
function createTable_Dept(){
	if(datatable_dept != null){
		datatable_dept.destroy();
	}
	datatable_dept = $('#datatable_dept').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/dept/deptPage.do',
			data:{
				"dept_name":$("#deptNameSearch").val()
			},
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'deptId'},
			{data:'deptName'},
			{data:'deptinfo'},
			{data:'deptId',render:function(data,type,row){
				return "<a href='javascript:del(\"dept\","+data+",\"/office-management/dept/delDept.do\");'>删除</a>&nbsp;"
				+"<a href='javascript:modify(\"dept\","+JSON.stringify(row)+","+data+",\"修改部门信息\",\"/office-management/dept/toModifyDept.do\");'>修改</a>"
			}}
			] 
	});
}
/***************************deptInfo**********************************/
var datatable_checkTimeSe = null;
function createTable_checkTimeSe(){
	if(datatable_checkTimeSe != null){
		datatable_checkTimeSe.destroy();
	}
	datatable_checkTimeSe = $('#datatable_checkTimeSe').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/checkOnWork/checkTimeSeP.do',
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'checkTimeData'},
			{data:'checkTimeFirst'},
			{data:'checkTimeLeave',render:function(data,type,row){
				if(data == null || data == ""){
					return "未签退";
				}else{
					return data;
				}
			}},
			{data:'checkTimeOut',render:function(data){
				if(data == 1){
					return "准时";
				}else if(data == 0){
					return "迟到";
				}else if(data == -1){
					return "旷工";
				}else if(data == 2){
					return "请假";
				}else if(data == 3){
					return "早退";
				}else if(data == 4){
					return "迟到并早退";
				}
			}}
			] 
	});
}
/***************************doCheckSelf**********************************/
var datatable_deptinfo = null;
function createTable_DeptInfo(){
	if(datatable_deptinfo != null){
		datatable_deptinfo.destroy();
	}
	datatable_deptinfo = $('#datatable_deptInfo').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/dept/deptPage.do',
			data:{
				"dept_name":""
			},
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'deptId'},
			{data:'deptName'},
			{data:'deptinfo'},
			] 
	});
}

/****************************MeetingRoomTable**************************/
var datatable_mtRoom = null;
function createTable_MeetingRoom(isAdmin){
	var isAdmin = isAdmin;
	if(datatable_mtRoom != null){
		datatable_mtRoom.destroy();
	}
	datatable_mtRoom = $('#datatable_meetingRoom').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/meeting/meetRoomTable.do',
			data:{
				"status":$("#MeetingRoomStatus").val()
			},
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'meetingRoomId'},
			{data:'meetingRoomName'},
			{data:'meetingRoomCapacity'},
			{data:'meetingRoomStatus',render:function(data){
				if(data == 0){
					return "空闲";
				}else{
					return "使用中";
				}
			}},
			{data:'meetingRoomId',render:function(data,type,row){
				if(!isAdmin){
					return "没有权限";
				}else{
					return "<a href='javascript:del(\"meetRoom\","+data+",\"/office-management/meeting/delMeetingRoom.do\");'>删除</a>&nbsp;"
					+"<a href='javascript:modify(\"meetRoom\","+JSON.stringify(row)+","+data+",\"修改会议室信息\",\"/office-management/meeting/toModifyMeetingRoom.do\");'>修改</a>"
				}
				
			}}
			] 
	});
		
}
/****************************MeetingTable**************************/
var datatable_meeting = null;
function createTable_Meeting(){
	if(datatable_meeting != null){
		datatable_meeting.destroy();
	}
	datatable_meeting = $('#datatable_meeting').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/meeting/meetingTable.do',
			data:{
				"meetingName":$("#meetingNameSearch").val()
			},
	 	 	dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'meetingId'},
			{data:'meetingName'},
			{data:'meetingRoomId'},
			{data:'meetingEmpId'},
			{data:'date'},
			{data:'bookingTime'},
			{data:'initiateMeetingEmp',render:function(data){
				if(data != null && data != ""){
					return data.empName;
				}else{
					return "数据未找到";
				}
			}}
		] 
	});
}
/****************************MyMeetingTable**************************/
var datatable_myMeeting = null;
function createTable_myMeeting(){
	if(datatable_myMeeting != null){
		datatable_myMeeting.destroy();
	}
	datatable_myMeeting = $('#datatable_myMeeting').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/meeting/myMeeting.do',
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'meetingName'},
			{data:'meetingRoomId'},
			{data:'meetingEmpId'},
			{data:'date'},
			{data:'bookingTime'},
			{data:'meetingId',render:function(data,type,row){
				return "<a href='javascript:del(\"myMeeting\","+data+",\"/office-management/meeting/delMeeting.do\");'>删除</a>&nbsp;"
				+"<a href='javascript:modify(\"myMeeting\","+JSON.stringify(row)+","+data+",\"修改会议信息\",\"/office-management/meeting/toModifyMeeting.do\");'>修改</a>"
			}}
			] 
	});
}
/****************************ExtraWorkTable**************************/
var datatable_extraWork = null;
function createTable_ExtraWork(){
	if(datatable_extraWork != null){
		datatable_extraWork.destroy();
	}
	datatable_extraWork = $('#datatable_extraWork').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/approval/workTable.do',
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'extraWorkId'},
			{data:'emp.empName'},
			{data:'time'},
			{data:'extraWorkTime'},
			{data:'isHolidy',render:function(data){if(data==1){return "是"}else{return "否"}}},
			{data:'approval.approvalStatus',render:function(data){
				if(data == 1){
					return "待审批";
				}else if(data == 2){
					return "已通过";
				}else if(data == 3){
					return "未通过";
				}else{
					return "状态异常"
				}
			}},
			{data:'extraWorkId',render:function(data,type,row){
				return "<a href='javascript:del(\"myMeeting\","+data+",\"/office-management/meeting/delMeeting.do\");'>删除</a>&nbsp;"
				+"<a href='javascript:modify(\"myMeeting\","+JSON.stringify(row)+","+data+",\"修改会议信息\",\"/office-management/meeting/toModifyMeeting.do\");'>修改</a>"
			}}
			] 
	});
}
/****************************MyAskLeaveTable***************************/
var datatable_askToLeave = null;
function createTable_AskToLeave(){
	if(datatable_askToLeave != null){
		datatable_askToLeave.destroy();
	}
	datatable_askToLeave = $('#datatable_askToLeave').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/approval/myAskToLeaveTable.do',
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'leaveId'},
			{data:'emp.empName'},
			{data:'leaveTimeStart'},
			{data:'leaveTime'},
			{data:'leaveEvidence',render:function(data){
				return "<button type='button' class='btn btn-info btn-xs'>查看凭证</button>"
			}},
			{data:'leaveReason'},
			{data:'approval.approvalStatus',render:function(data){
				if(data == 1){
					return "待审批";
				}else if(data == 2){
					return "已通过";
				}else if(data == 3){
					return "未通过";
				}else{
					return "状态异常"
				}
			}},
			{data:'leaveId',render:function(data,type,row){
				return "<a href='javascript:del(\"myMeeting\","+data+",\"/office-management/meeting/delMeeting.do\");'>删除</a>&nbsp;"
				+"<a href='javascript:modify(\"myMeeting\","+JSON.stringify(row)+","+data+",\"修改会议信息\",\"/office-management/meeting/toModifyMeeting.do\");'>修改</a>"
			}}
			] 
	});
}
/****************************ExtraWorkTable**************************/
var datatable_extraWorkWaitProval = null;
function createTable_ExtraWorkWaitProval(){
	if(datatable_extraWorkWaitProval != null){
		datatable_extraWorkWaitProval.destroy();
	}
	datatable_extraWorkWaitProval = $('#datatable_extraWorkWaitProval').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/approval/workTable.do',
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'extraWorkId'},
			{data:'emp.empName'},
			{data:'time'},
			{data:'extraWorkTime'},
			{data:'isHolidy',render:function(data){if(data==1){return "是"}else{return "否"}}},
			{data:'approval.approvalStatus',render:function(data){
				if(data == 1){
					return "待审批";
				}else if(data == 2){
					return "已通过";
				}else if(data == 3){
					return "未通过";
				}else{
					return "状态异常"
				}
			}},
			{data:'extraWorkId',render:function(data,type,row){
				return 	"<div class='btn-group  btn-group-xs'>" +
						"<button type='button' class='btn btn-info'>通过</button>"+
						"<button type='button' class='btn btn-info'>拒绝</button>"+
						"</div>";
				}}
			] 
	});
}
/****************************MyAskLeaveTable***************************/
var datatable_askToLeaveWaitProval = null;
function createTable_AskToLeaveWaitProval(){
	if(datatable_askToLeaveWaitProval != null){
		datatable_askToLeaveWaitProval.destroy();
	}
	datatable_askToLeaveWaitProval = $('#datatable_askToLeaveWaitProval').DataTable({
		bLengthChange: false,//改变每页显示数据量
		searching:false,
		ordering:false,
		language:{
			url:'/office-management/static/bootstrap/js/china.json'
		},
		iDisplayLength :12,//用于指定一屏显示的条数，需开启分页器
		serverSide:true,//开启服务器模式
		//数据来源（分页排序过滤）
		ajax:{
			url:'/office-management/approval/myAskToLeaveTable.do',
			dataSrc:"data",
			type:"post",
		},
		columns:[
			{data:'leaveId'},
			{data:'emp.empName'},
			{data:'leaveTimeStart'},
			{data:'leaveTime'},
			{data:'leaveEvidence',render:function(data){
				return "<button type='button' class='btn btn-info btn-xs'>查看凭证</button>"
			}},
			{data:'leaveReason'},
			{data:'approval.approvalStatus',render:function(data){
				if(data == 1){
					return "待审批";
				}else if(data == 2){
					return "已通过";
				}else if(data == 3){
					return "未通过";
				}else{
					return "状态异常"
				}
			}},
			{data:'leaveId',render:function(data,type,row){
				return "<div class='btn-group btn-group-xs'>" +
						"<button type='button' class='btn btn-info'>通过</button>"+
						"<button type='button' class='btn btn-info'>拒绝</button>"+
						"</div>";
			}}
			] 
	});
}

/******************************(modify)获取当前行数据************************
 *修改时获取当前行数据填入修改页面表单(之前是从后台获取用el表达式填写的,前端获取可以减少服务器压力)
************************************************************************/
function getRowData(type,array){
	if(type =="user"){
		$("#modifyUserId").val(array.userId);
		$("#modifyUserName").val(array.userName);
		$("#modifyPassword").val(array.userPassword);
		$("#modifyBindEmp").val(array.bindEmp);	
	}else if(type=="meetRoom"){
		$("#modifyMtRId").val(array.meetingRoomId);
		$("#modifyMtRName").val(array.meetingRoomName);
		$("#modifyMtRC").val(array.meetingRoomCapacity);
		$("#modifyMtRS").val(array.meetingRoomStatus);
	}else if(type == "emp"){
		$("#modifyEmpId").val(array.empId);
		$("#modifyEmpNo").val(array.empNo);
		$("#modifyEmpBirth").val(array.empBirthS);
		$("#modifyEmpHireDate").val(array.empHiredateS);
		$("#modifyEmpName").val(array.empName);
		$("#modifyEmpAddress").val(array.empAddress);
		$("#modifyEmpDepti").val(array.empDepti);
		$("#modifyEmpEmail").val(array.empEmail);
		$("#modifyEmpPhonenum").val(array.empPhonenum);
		$("#modifyEmpPos").val(array.empPos);
		$("#modifyEmpPos").val(array.empPos);
		$("#modifyEmpGender").val(array.empGender);
	}else if(type == "dept"){
		$("#modifyDeptId").val(array.deptId);
		$("#modifyDeptName").val(array.deptName);
		$("#modifyDeptinfo").val(array.deptinfo);
	}else if(type == "myMeeting"){
		$('#modifyMeetingId').val(array.meetingId);
		$('#modifyMeetingName').val(array.meetingName);
		$('#modifyMeetingRoomId').val(array.meetingRoomId);
		$('#modifyMeetingEmpId').val(array.meetingEmpId);
		$('#modifyDate').val(array.date);
		$('#modifyBookingTime').val(array.bookingTime);
	}else{
		console.log("传值类型判断出错,请检查代码!");
	}
}

/************************删除后刷新表格*************************************/
function drawDT(type){
	if(type=="user"){
		datatable_user.draw(1);
	}else if(type == "meetRoom"){
		datatable_mtRoom.draw(1);
	}else if(type == "emp"){
		datatable_emp.draw(1);
	}else if(type == "dept"){
		datatable_dept.draw(1);
	}else if(type == "myMeeting"){
		datatable_myMeeting.draw(1);
	}else{
		console.log("传值类型判断出错,请检查代码!");
	}
}

/******************************删除的公共方法********************************
(此方法中传入的url,需要用到转义字符,示例:javascript:del("+data+",\"url\");)
************************************************************************/
function del(type,id,url){
	bootbox.confirm({
	    message: "是否删除？",
	    buttons: {
	    	confirm: {
	    		label: '是',
		        className: 'btn-success'
		        },
		    cancel: {
		        label: '否',
		        className: 'btn-danger'
			    }
	    	},
			callback: function (result) {
				if(result){
					$.ajax({
						url:url,
						data:{
							"id":id
						},
						type:"post",
						dataType:"json",
						success:function(result){
							if(result.tag==1){
								drawDT(type);
							}else{
								alert(result.message);
							}
						}
					});
				}
			}
	});
}
/******************************修改的公共方法********************************
(此方法中传入的url,需要用到转义字符,示例:javascript:modify("+data+",\"title\",\"url\");)
************************************************************************/
function modify(type,array,id,title,url){
	$.ajax({
		url:url,
		data:{
			"id":id
		},
		type:"post",
		dataType:"text",
		success:function(message){
			bootbox.dialog({
				"title":title,
				"message": message
			});
			getRowData(type,array);
		}
	});
}
/******************************新增的公共方法*******************************/
function add(title,url){
	$.ajax({
		url:url,
		type:"post",
		dataType:"text",
		success:function(message){
			bootbox.dialog({
				"title":title,
				"message": message
			});
		}
	})
}
