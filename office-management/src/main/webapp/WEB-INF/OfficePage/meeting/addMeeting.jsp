<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/bootbox.min.js"></script>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/dataTable.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/myTables.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap/css/dataTable.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/MyDataTable.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>预约会议</title>
<script type="text/javascript">
$(document).ready(function(){
	initDate();
	$("#btnAddMeet").click(function(){
		$.ajax({
			url : "${pageContext.request.contextPath}/meeting/doAddMeeting.do",
			type : "post",
			data : $("#frmAddMeet").serialize(),
			dataType : "json",
			success : function(result) {
				alert(result.message);
			}
		})
	});
});
function initDate() {
	$(".form_datetime").datetimepicker({
		// language: 'fr',
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		forceParse : 0,
		showMeridian : 1
	});
}
</script>
</head>
<body>
<form id="frmAddMeet" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-2 control-label">会议名</label>
		<div class="col-sm-4">
			<input type="text" name="meetingName" class="form-control input" placeholder="请输入会议室名"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">会议室</label>
		<!-- 这里可以考虑用选择框,后台筛选出可以被预约的会议室,然后展示在这里 
		<select>
			<option></option>
		</select>
		 -->
		<div class="col-sm-4">
			<input type="text" name="meetingRoomId" class="form-control input" placeholder="请输入会议室ID"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">参会人员</label>
		<div class="col-sm-4">
			<input type="text" name="meetingEmpId" class="form-control input" placeholder="请输入参会人员"/>
		</div>
	</div>
	<div class="form-group">
	<label class="col-sm-2 control-label">开始时间</label>
 	<div class="col-sm-4">
 	<div class="input-group date form_datetime" data-date-format="yyyy-MM-dd hh:ii:ss" data-link-field="dtp_input1">
	<input class="form-control" type="text" value="" readonly>
 	<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
 	<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
 	</div>
 		<input type="hidden" id="dtp_input1" name="date" value=""/>
 	</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">预约时长</label>
		<div class="col-sm-4" >
			<input type="number" name="bookingTime" class="form-control input" placeholder="请输入预约时长"/>
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-6">
			<div class="span14" style="text-align:center;">
				<button id="btnAddMeet" type="button" class="btn btn-success"
				style="width: 130px;" data-dismiss="modal">提交</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-warning" style="width: 130px;" type="reset">重置</button>
			</div>
		</div>
	</div>
</form>
</body>
</html>