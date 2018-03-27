<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改会议</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#btnModifyMeet").click(function(){
		$.ajax({
			url : "${pageContext.request.contextPath}/meeting/modifyMeeting.do",
			type : "post",
			data : $("#frmModifyMeet").serialize(),
			dataType : "json",
			success : function(result) {
				datatable_myMeeting.draw(1);
				alert(result.message);
			}
		})
	});
});
</script>
</head>
<body>
<form id="frmModifyMeet" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-4 control-label">会议名</label>
		<div class="col-sm-8">
			<input type="text" name="meetingId" id="modifyMeetingId" class="form-control input" readonly/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">会议名</label>
		<div class="col-sm-8">
			<input type="text" name="meetingName" id="modifyMeetingName" class="form-control input" placeholder="请输入会议室名"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">会议室</label>
		<!-- 这里可以考虑用选择框,后台筛选出可以被预约的会议室,然后展示在这里 
		<select>
			<option></option>
		</select>
		 -->
		<div class="col-sm-8">
			<input type="text" name="meetingRoomId" id="modifyMeetingRoomId" class="form-control input" placeholder="请输入会议室ID"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">参会人员</label>
		<div class="col-sm-8">
			<input type="text" name="meetingEmpId" id="modifyMeetingEmpId" class="form-control input" placeholder="请输入参会人员"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">开始时间</label>
		<div class="col-sm-8">
			<input type="text" name="date" id="modifyDate" class="form-control input" placeholder="请输入会议开始时间"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">预约时长</label>
		<div class="col-sm-8">
			<input type="number" name="bookingTime" id="modifyBookingTime" class="form-control input" placeholder="请输入预约时长"/>
		</div>
	</div>
	<div class="form-group" style="text-align:center;">
		<div class="col-sm-12">
			<div class="span14" style="text-align:right;">
				<button id="btnModifyMeet" type="button" class="btn btn-success"
				style="width: 130px;" data-dismiss="modal">提交</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-warning" style="width: 130px;" type="reset">重置</button>
			</div>
		</div>
	</div>
</form>
</body>
</body>
</html>