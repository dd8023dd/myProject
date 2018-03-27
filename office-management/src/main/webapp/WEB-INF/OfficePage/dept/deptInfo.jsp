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
<title>部门信息</title>
<script type="text/javascript">
$(document).ready(function(){
	createTable_DeptInfo();
	$('#datatable_deptInfo').on('click', 'tr',function() {    
        //点击行事件
        var data = datatable_deptinfo.row(this).data().deptId;
        $.ajax({
        	url:"${pageContext.request.contextPath}/dept/searchDDT.do",
        	data:{
        		"deptId":data
        	},
        	type:"post",
        	dataType:"json",
        	success:function(res){
        		console.log(res);
        		if(res.tag>0){
        			$("#dept_manager").html("部门经理:"+res.message.deptManager);
        			$("#dept_photo").html("<img width='500px' height='560px' src='/office-management/static/img/"+res.message.deptImg+".jpg'/>")
        		}else{
        			alert("数据获取出错,请重试!");
        		}
        	}
        });
   }); 
});
</script>
</head>
<body>
	<div class="col-sm-6">
		<div class="page-header">
			<h1>
			<small>xxx公司各部门信息</small>
			</h1>
		</div>
		<table id="datatable_deptInfo" class="table table-bordered table-hover">
			<thead>
				<tr class="active">
					<th>部门ID</th>
					<th>部门</th>
					<th>部门简介</th>
				</tr>
			</thead>
		</table>
	</div>
	<div class="col-sm-6">
		<div><h3 id="dept_manager">这里放部门联系人</h3></div>
		<div id="dept_photo">这里放照片</div>
	</div>
</body>
</html>