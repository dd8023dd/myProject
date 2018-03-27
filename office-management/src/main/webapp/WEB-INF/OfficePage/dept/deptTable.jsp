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
<title>部门表</title>
<script type="text/javascript">
$(document).ready(function(){
	createTable_Dept();
	$("#searchDept").click(function(){
		createTable_Dept();
	});
	$("#addDept").click(function(){
		add("新增部门","${pageContext.request.contextPath}/dept/toAddDept.do");
	});
});
$(document).keyup(function(event){ 
	  if(event.keyCode ==13){ 
	  $("#searchDept").trigger("click"); 
	} 
});
</script>
</head>
<body>
<div class="form-horizontal">
	<div style="width:380px;">
		<div class="input-group">
        	<input type="text" id="deptNameSearch" class="form-control input" placeholder="请输入部门名"/>
            <span class="input-group-btn">
					<button type="button" id="searchDept" class="btn btn-info">搜索</button>
					<button type="button" class="btn btn-info" id="addDept">新增部门</button>
            </span>
        </div>
     </div>
</div>
<table id="datatable_dept"  class="display" cellspacing="0" style="width:100%">
	<thead>
		<tr>
			<th>部门ID</th>
			<th>部门名</th>
			<th>部门简介</th>
			<th>操作</th>
		</tr>
	</thead>
</table>
</body>
</html>