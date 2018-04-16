<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增员工</title>
<script type="text/javascript">
$("#btnAddEmp").click(function(){
	$.ajax({
		url : "/employee/addEmp.do",
		type : "post",
		data : $("#frmAddEmp").serialize(),
		dataType : "json",
		success : function(result) {
			if(result.tag>0){
				datatable_emp.draw(1);
			}else{
				alert(result.message);
			}
		}
	})
});
</script>
</head>
<body> 
<form id="frmAddEmp" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-4 control-label">员工编号</label>
		<div class="col-sm-8">
			<input type="text" name="empNo" class="form-control input" placeholder="请输入员工编号"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">员工生日</label>
		<div class="col-sm-8">
			<input type="date" name="b1" class="form-control input" placeholder="请输入员工生日"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">入职日期</label>
		<div class="col-sm-8">
			<input type="date" name="b2" class="form-control input" placeholder="入职日期"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">员工姓名</label>
		<div class="col-sm-8">
			<input type="text" name="empName" class="form-control input" placeholder="请输入员工姓名"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">员工住址</label>
		<div class="col-sm-8">
			<input type="text" name="empAddress" class="form-control input" placeholder="请输入员工住址"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">部门ID</label>
		<div class="col-sm-8">
			<input type="text" name="empDepti" class="form-control input" placeholder="请输入员工所属部门ID"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">员工邮箱</label>
		<div class="col-sm-8">
			<input type="text" name="empEmail" class="form-control input" placeholder="请输入员工邮箱"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">员工电话</label>
		<div class="col-sm-8">
			<input type="text" name="empPhonenum" class="form-control input" placeholder="请输入员工电话"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">员工职位</label>
		<div class="col-sm-8">
			<input type="text" name="empPos" class="form-control input" placeholder="请输入员工邮箱"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">员工性别</label>
		<div class="col-sm-8">
			<select name="empGender" class="form-control">
				<option value="1">男</option>
				<option value="0">女</option>
			</select>
		</div>
	</div>
	<div class="form-group" style="text-align:center;">
		<div class="col-sm-12">
			<div class="span14" style="text-align:right;">
				<button id="btnAddEmp" type="button" class="btn btn-success"
				style="width: 130px;" data-dismiss="modal">提交</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-warning" style="width: 130px;" type="reset">重置</button>
			</div>
		</div>
	</div>
</form>
</body>
</html>