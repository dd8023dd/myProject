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
<title>审批组成员</title>
<script type="text/javascript">
$(document).ready(function(){
	createTable_ApprovalGroup();
	$("#searchAG").click(function(){
		createTable_ApprovalGroup();
	});
	$("#delApprovalGroupMember").click(function(data){
		alert(data);
	})
	$("#addAG").click(function(){
		add("新增审批组成员","/approval/toAddApprovalGroupMember.do");
	});
});
</script>
</head>
<body>
<div class="form-horizontal" style="float:right">
	<div style="margin-right:10px">
		<button type="button" class="btn btn-info" id="addAG">新增成员</button>
    </div>
</div>
<table id="datatable_approvalGroup"  class="display" style="width:100%">
	<thead>
		<tr>
			<th>审批组成员</th>
			<th>所属部门</th>
			<th>级别</th>
			<th>联系方式</th>
			<th>操作</th>
		</tr>
	</thead>
</table>
</body>
</html>