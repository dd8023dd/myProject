<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人设置</title>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		url:"${pageContext.request.contextPath}/user/searchByUserName.do",
		type:"post",
		dataType:"json",
		success:function(result){
			if(result.tag != -1){
				console.log(result.message);
				$("#userName").html("<span class='badge'>用户名</span>"+result.message.userName);
				$("#address").html("<span class='badge'>住址</span>"+result.message.emp.empAddress);
				$("#empName").html("<span class='badge'>姓名</span>"+result.message.emp.empName);
				$("#empNo").html("<span class='badge'>员工编号</span>"+result.message.emp.empNo);
				$("#birthDay").html("<span class='badge'>生日</span>"+result.message.emp.empBirthS);
				$("#hireDay").html("<span class='badge'>入职日期</span>"+result.message.emp.empHiredateS);
			}
		}
	});
});
</script>
</head>
<body>
<div class="col-sm-6">
<ul class="list-group">
    <li class="list-group-item" id="userName">加载中...(若加载失败请重新登录后重试)</li>
    <li class="list-group-item" id="address">加载中...</li>
    <li class="list-group-item" id="empName">加载中...</li>
    <li class="list-group-item" id="empNo">加载中...</li>
    <li class="list-group-item" id="birthDay">加载中...</li>
    <li class="list-group-item" id="hireDay">加载中...</li>
</ul>
</div>
</body>
</html>