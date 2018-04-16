<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" charset="utf8" src="/static/bootstrap/js/jquery.js"></script>
<script type="text/javascript" charset="utf8" src="/static/js/jquery.flipcountdown.js"></script>
<script type="text/javascript" charset="utf8" src="/static/bootstrap/js/bootbox.min.js"></script>
<script type="text/javascript" charset="utf8" src="/static/bootstrap/js/dataTable.js"></script>
<script type="text/javascript" src="/static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/static/js/myTables.js"></script>
<link rel="stylesheet" type="text/css" href="/static/bootstrap/css/dataTable.css">
<link rel="stylesheet" type="text/css" href="/static/css/jquery.flipcountdown.css">
<link rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/static/css/MyDataTable.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人考勤记录表</title>
<script type="text/javascript">
$(document).ready(function(){
	createTable_checkTimeSe();
	$('#retroclockbox1').flipcountdown();
	$("#checkTime").click(function(){
		$.ajax({
			url:"/checkOnWork/doCheck.do",
			type:"post",
			dataType:"json",
			success:function(result) {
				datatable_checkTimeSe.draw(1);
				alert(result.message);
			}
		})
	});
});
</script>
</head>
<body>

<div class="col-sm-9">
<table id="datatable_checkTimeSe"  class="table" style="width:100%">
	<thead>
		<tr>
			<th>日期</th>
			<th>签到时间</th>
			<th>签退时间</th>
			<th>考勤状态</th>
		</tr>
	</thead>
</table>
</div>
<div class="col-sm-3">
<div>
<h3>请在此处签到</h3>
<button type="button" class="btn btn-info btn-block btn-lg" id="checkTime">签到</button>
</div>
<div>
<p>当前时间为</p>
<div id="retroclockbox1"></div>
</div>
</div>
</body>
</html>