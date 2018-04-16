<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>员工表</title>
<script type="text/javascript">
$(document).ready(function(){
	createTable_User();
	$("#searchUser").click(function(){
		createTable_User();
	});
	$("#addNewUser").click(function(){
		add("新增用户","/user/toAddUser.do");
	});
});
</script>
</head>
<body>
<div class="form-horizontal">
	<div style="width:380px;">
		<div class="input-group">
        	<input type="text" id="userNameSearch" class="form-control input" placeholder="请输入用户名"/>
            <span class="input-group-btn">
					<button type="button" class="btn btn-info" id="searchUser">搜索</button>
					<button type="button" class="btn btn-info" id="addNewUser">新增用户</button>
            </span>
        </div>
     </div>
</div>
<table id="datatable_user"  class="display" cellspacing="0" style="width:100%">
	<thead>
		<tr>
			<th>用户ID</th>
			<th>用户名</th>
			<th>绑定员工</th>
			<th>操作</th>
		</tr>
	</thead>
</table>
</body>
</html>