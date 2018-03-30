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
<title>请假审批</title>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({//ajax加载审批组数据
		url : "${pageContext.request.contextPath}/approval/approvalGroupList.do",
		type : "post",
		dataType : "json",
		success : function(result) {
			$("#approvalPerson").html(function(){
				var a="";
				for(var i=0;i<result.tag.length;i++){
					a = a + "<option value='"+result.tag[i].emp.empId+"'>"+result.tag[i].emp.empName+"</option>";
				}
				return a;
			});
		}
	});
	$("#sub").click(function(){
		askto(); 
	});
})
function askto() {
	$.ajax({
		url:"${pageContext.request.contextPath}/approval/doAskToLeave.do",
		dataType : "json",
		type : "post",
		data :$("#frmToLeave").serialize(),
		success:function(res){
			alert(res.message);
		}
	})
}
</script>
</head>
<form id="frmToLeave" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-2 control-label">开始时间</label>
		<div class="col-sm-6">
			<input type="date" name="leaveTimeStart" class="form-control input"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">请假时长</label>
		<div class="col-sm-6">
			<input type="text" name="leaveTime" class="form-control input" placeholder="请输入请假时长"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">结束时间</label>
		<div class="col-sm-6">
			<input type="text" name="leaveTimeEnd" class="form-control input"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">请假缘由</label>
		<div class="col-sm-6">
			<input type="text" name="leaveReason" class="form-control input" placeholder="请输入请假缘由"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">请假凭证</label>
		<div class="col-sm-6">
			<input type="text" name="leaveEvidence" class="form-control input"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">审批人</label>
		<div class="col-sm-6">
			<select id="approvalPerson" name="approvalPersonId"  class="form-control"></select>
		</div>
	</div>
	<div class="form-group">
	<label class="col-sm-2 control-label"></label>
		<div class="col-sm-6">
			<button type="button" class="btn btn-info btn-lg btn-block" id="sub">提交</button>
		</div>
	</div>
</form>
<body>
</body>
</html>