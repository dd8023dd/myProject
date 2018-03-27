
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.js"></script>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/bootbox.min.js"></script>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/dataTable.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/myTables.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap/css/dataTable.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/MyDataTable.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会议表</title>
<script type="text/javascript">
$(document).ready(function(){
	createTable_Meeting();
});
</script>
</head>
<body>
<div style="width:280px;">
	<div class="input-group">
       	<input class="form-control input"/>
		<span class="input-group-btn">
			<button type="button" class="btn btn-info">搜索</button>
    	</span>
	</div>
</div>
<table id="datatable_meeting"  class="display" cellspacing="0" style="width:100%">
	<thead>
		<tr>
			<th>ID</th>
			<th>会议名</th>
			<th>会议室</th>
			<th>与会员工</th>
			<th>开始时间</th>
			<th>预约时长</th>
			<th>发起人</th>
		</tr>
	</thead>
</table>
</body>
</html>