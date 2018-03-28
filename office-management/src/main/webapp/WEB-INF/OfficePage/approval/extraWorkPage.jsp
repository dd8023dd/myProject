<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.js"></script>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/bootbox.min.js"></script>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/dataTable.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap/css/dataTable.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>加班审批</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#sub").click(function(){
		extrawork();
	})
})
function extrawork() {
	$.ajax({
		url:"${pageContext.request.contextPath}/approval/doExtraWork.do",
		dataType : "json",
		type : "post",
		data : $("#frmExtraWork").serialize(),
		success:function(res){
			alert(res.message);
		}
	})
}
</script>
</head>
<body>
<form id="frmExtraWork" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-2 control-label">加班时长</label>
		<div class="col-sm-6">
			<input type="date" name="extraWorkTime" class="form-control input"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">是否节假日</label>
		<div class="col-sm-6">
			<input type="text" name="isHolidy" class="form-control input" placeholder="请输入请假时长"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">加班时间</label>
		<div class="col-sm-6">
			<input type="text" name="time" class="form-control input"/>
		</div>
	</div>
	<div class="form-group">
	<label class="col-sm-2 control-label"></label>
	<div class="col-sm-6">
		<button type="button" class="btn btn-info btn-lg btn-block" id="sub">提交</button>
	</div>
	</div>
</form>
</body>
</html>