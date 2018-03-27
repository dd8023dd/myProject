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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>电话本</title>
<script type="text/javascript">
$(document).ready(function(){
	createTable_EmpPhone();
	$("#SearchEmpPhone").click(function(){
		createTable_EmpPhone();
	});
});
</script>
</head>
<body>
	<div style="width:280px;">
		<div class="input-group">
        	<input type="text" id="searchEmpName" name="empName" class="form-control input" placeholder="请输入员工名"/>
            <span class="input-group-btn">
					<button id="SearchEmpPhone" type="button" class="btn btn-info">搜索</button>
            </span>
        </div>
     </div>
<table id="datatable_empPhone"  class="table" cellspacing="0" style="width:100%">
	<thead>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>所属部门</th>
			<th>邮箱</th>
			<th>联系电话</th>
		</tr>
	</thead>
</table>
</body>
</html>