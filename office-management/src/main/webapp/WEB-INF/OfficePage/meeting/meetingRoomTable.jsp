<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" charset="utf8" src="/static/bootstrap/js/jquery.js"></script>
<script type="text/javascript" charset="utf8" src="/static/bootstrap/js/bootbox.min.js"></script>
<script type="text/javascript" charset="utf8" src="/static/bootstrap/js/dataTable.js"></script>
<script type="text/javascript" src="/static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/static/js/myTables.js"></script>
<link rel="stylesheet" type="text/css" href="/static/bootstrap/css/dataTable.css">
<link rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/static/css/MyDataTable.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会议室管理</title>
<script type="text/javascript">
$(document).ready(function(){
	createTable_MeetingRoom(true);
	$("#addNewMeetingRoom").click(function(){
		add("新增会议室","/meeting/toAddMeetingRoom.do");
	});
	$("#MeetingRoomStatus").change(function(){
		createTable_MeetingRoom(true);
	})
});
</script>
</head>
<body>
<div style="width:280px;">
	<div class="input-group">
       	<select id="MeetingRoomStatus" class="form-control input" style="text-align:center;">
       		<option value="1">使用中的会议室</option>
        	<option value="0" selected="selected">空闲会议室</option>
        </select>
		<span class="input-group-btn">
			<button type="button" class="btn btn-info" id="addNewMeetingRoom">新增会议室</button>
    	</span>
	</div>
</div>

<table id="datatable_meetingRoom"  class="display" cellspacing="0" style="width:100%">
	<thead>
		<tr>
			<th>ID</th>
			<th>会议室名</th>
			<th>容量</th>
			<th>状态</th>
			<th>操作</th>
		</tr>
	</thead>
</table>
</body>
</html>