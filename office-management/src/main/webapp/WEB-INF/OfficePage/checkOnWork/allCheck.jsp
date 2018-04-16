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
<title>打卡信息管理表</title>
<script type="text/javascript">
$(document).ready(function(){
	datatable_AllCheck();
	$("#searchCheck").click(function(){
		datatable_AllCheck();
	})
})
</script>
</head>
<body>
<div class="form-horizontal">
	<div style="width:380px;">
		<div class="input-group">
        	<input type="date" id="CheckTimeSearch" class="form-control input" />
            <span class="input-group-btn">
					<button type="button" id="searchCheck" class="btn btn-info">搜索</button>
            </span>
        </div>
     </div>
</div>
<table id="datatable_allCheck"  class="display" cellspacing="0" style="width:100%">
	<thead>
		<tr>
			<th>打卡日期</th>
			<th>员工</th>
			<th>打卡状态</th>
			<th>签到时间</th>
			<th>签退时间</th>
		</tr>
	</thead>
</table>
</body>
</html>