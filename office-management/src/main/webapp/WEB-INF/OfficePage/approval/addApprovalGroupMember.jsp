<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加审批小组成员</title>
<script type="text/javascript">
$("#btnAddApprovalGroupMember").click(function(){
	$.ajax({
		url : "${pageContext.request.contextPath}/approval/addApprovalGroupMember.do",
		type : "post",
		data : $("#frmAddApprovalGroupMember").serialize(),
		dataType : "json",
		success : function(result) {
			if(result.tag>0){
				datatable_approvalGroup.draw(1);
			}else{
				alert(result.message);
			}
		}
	})
});
</script>
</head>
<body>
<form id="frmAddApprovalGroupMember" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-3 control-label">员工ID</label>
		<div class="col-sm-9">
			<input type="text" name="approvalGroupEmpid" class="form-control input" placeholder="请输入员工ID"/>
		</div>
	</div>
	<div class="form-group" style="text-align:center;">
		<div class="col-sm-12">
			<button id="btnAddApprovalGroupMember" type="button" class="btn btn-success btn-block" data-dismiss="modal">提交</button>
		</div>
	</div>
</form>
</body>
</html>