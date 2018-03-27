<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addMeetingRoom</title>
<script type="text/javascript">
$("#btnAddMtR").click(function(){
	$.ajax({
		url : "${pageContext.request.contextPath}/meeting/addMeetingRoom.do",
		type : "post",
		data : $("#frmAddMtR").serialize(),
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
<form id="frmAddMtR" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-4 control-label">会议室名</label>
		<div class="col-sm-8">
			<input type="text" name="meetingRoomName" class="form-control input" placeholder="请输入会议室名"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">会议室容量</label>
		<div class="col-sm-8">
			<input type="text" name="meetingRoomCapacity" class="form-control input" placeholder="请输入会议室容量"/>
		</div>
	</div>
	<div class="form-group" style="text-align:center;">
		<div class="col-sm-12">
			<div class="span14" style="text-align:right;">
				<button id="btnAddMtR" type="button" class="btn btn-success"
				style="width: 130px;" data-dismiss="modal">提交</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-warning" style="width: 130px;" type="reset">重置</button>
			</div>
		</div>
	</div>
</form>
</body>
</html>