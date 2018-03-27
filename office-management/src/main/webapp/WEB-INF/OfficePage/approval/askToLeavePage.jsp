<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请假审批</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#sub").click(function(){
		askto();
	})
})
function askto() {
	$.ajax({
		url:"${pageContext.request.contextPath}/approval/doAskToLeave.do",
		dataType : "json",
		type : "post",
		data : $("#frmToLeave").serialize(),
		success:function(res){
			alert(res.message);
		}
	})
}
</script>
</head>
<form id="frmToLeave">
emp_id:<input name="empId" type="text"/>
leave_time_start:<input name="leaveTimeStartS" type="date"/>
leave_time:<input name="leaveTime" type="text"/>
leave_evidence:<input name="leaveEvidence" type="text"/>
leave_reason:<input name="leaveReason" type="text"/>
leave_time_end:<input name="leaveTimeEndS" type="text"/>
approval_id:<input  name="approvalId" type="text"/>
</form>
<button type="button" id="sub">提交</button>
<body>
</body>
</html>