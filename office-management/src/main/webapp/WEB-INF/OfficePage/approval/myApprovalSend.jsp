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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我发起的申请</title>
<script type="text/javascript">
$(document).ready(function(){
	//----------请假申请-------//
	createTable_AskToLeave();
	//----------加班申请-------//
	createTable_ExtraWork();
});
</script>
</head>
<body>
<ul id="myTab" class="nav nav-tabs">
	<li class="active">
		<a href="#home" data-toggle="tab">
			 请假申请
		</a>
	</li>
	<li><a href="#ios" data-toggle="tab">
			加班申请
		</a>
	</li>
</ul>
<div id="myTabContent" class="tab-content">
	<div class="tab-pane fade in active" id="home">
		<table id="datatable_askToLeave"  class="display" cellspacing="0" style="width:100%">
			<thead>
				<tr>
					<th>请假单ID</th>
					<th>请假人</th>
					<th>开始时间</th>
					<th>请假时长</th>
					<th>请假凭证</th>
					<th>请假缘由</th>
					<th>审批状态</th>
					<th>操作</th>
				</tr>
			</thead>
		</table>
	</div>
	<div class="tab-pane fade" id="ios">
		<table id="datatable_extraWork"  class="display" cellspacing="0" style="width:100%">
			<thead>
				<tr>
					<th>ID</th>
					<th>加班员工</th>
					<th>开始时间</th>
					<th>加班时长</th>
					<th>是否节假日</th>
					<th>审批状态</th>
					<th>操作</th>
				</tr>
			</thead>
		</table>
	</div>
</div>
</body>
</html>