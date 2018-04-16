<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
</head>
<script type="text/javascript">
$("#btnModifyUser").click(function(){
	$.ajax({
		url : "/user/modifyUser.do",
		type : "post",
		data : $("#frmModifyUser").serialize(),
		dataType : "json",
		success : function(result) {
			if(result.tag>0){
				datatable_user.draw(1);
			}else{
				alert(result.message);
			}
		}
	})
});
</script>
<body>
<form id="frmModifyUser" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-4 control-label">用户ID</label>
		<div class="col-sm-8">
			<input type="text" id="modifyUserId" name="userId" class="form-control input" readonly/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">用户名</label>
		<div class="col-sm-8">
			<input type="text" id="modifyUserName" name="userName" class="form-control input" placeholder="请输入用户名"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">密码</label>
		<div class="col-sm-8">
			<input type="password" id="modifyPassword" name="userPassword" class="form-control input" placeholder="请输入密码"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">员工ID</label>
		<div class="col-sm-8">
			<input type="number" id="modifyBindEmp" name="bindEmp" 
			class="form-control input" placeholder="请输入员工id"/>
		</div>
	</div>
	<div class="form-group" style="text-align:center;">
		<div class="col-sm-12">
			<div class="span14" style="text-align:right;">
				<button id="btnModifyUser" type="button" class="btn btn-success"
				style="width: 130px;" data-dismiss="modal">提交</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-warning" style="width: 130px;" type="reset">重置</button>
			</div>
		</div>
	</div>
</form>
</body>
</html>