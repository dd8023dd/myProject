<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
$("#btnModifyMtR").click(function(){
	$.ajax({
		url : "/meeting/modifyMeetingRoom.do",
		type : "post",
		data : $("#frmModifyMtR").serialize(),
		dataType : "json",
		success : function(result) {
			if(result.tag>0){
				datatable_mtRoom.draw(1);
			}else{
				alert(result.message);
			}
		}
	})
});
</script>
</head>
<body>
<form id="frmModifyMtR" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-4 control-label">会议室ID</label>
		<div class="col-sm-8">
			<input type="text" id="modifyMtRId" name="meetingRoomId" class="form-control input" readonly/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">会议室名</label>
		<div class="col-sm-8">
			<input type="text" id="modifyMtRName" name="meetingRoomName" class="form-control input" placeholder="请输入会议室名"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">会议室名</label>
		<div class="col-sm-8">
			<input type="text" id="modifyMtRS" name="meetingRoomStatus" class="form-control input" readonly/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">会议室容量</label>
		<div class="col-sm-8">
			<input type="text" id="modifyMtRC" name="meetingRoomCapacity" class="form-control input" placeholder="请输入会议室容量"/>
		</div>
	</div>
	<div class="form-group" style="text-align:center;">
		<div class="col-sm-12">
			<div class="span14" style="text-align:right;">
				<button id="btnModifyMtR" type="button" class="btn btn-success"
				style="width: 130px;" data-dismiss="modal">提交</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-warning" style="width: 130px;" type="reset">重置</button>
			</div>
		</div>
	</div>
</form>
</body>
</html>