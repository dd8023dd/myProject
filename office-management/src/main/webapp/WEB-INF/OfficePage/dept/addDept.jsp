<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增部门</title>
<script type="text/javascript">
$("#btnAddDept").click(function(){
	$.ajax({
		url : "/dept/addDept.do",
		type : "post",
		data : $("#frmAddDept").serialize(),
		dataType : "json",
		success : function(result) {
			if(result.tag>0){
				datatable_dept.draw(1);
			}else{
				alert(result.message);
			}
		}
	})
});
</script>
</head>
<body>
<form id="frmAddDept" class="form-horizontal" role="form" style="margin: 50px;">
	<div class="form-group">
		<label class="col-sm-4 control-label">部门名称</label>
		<div class="col-sm-8">
			<input type="text" name="deptName" class="form-control input" placeholder="请输入部门名称"/>
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-4 control-label">部门简介</label>
		<div class="col-sm-8">
			<input type="text" name="deptinfo" class="form-control input" placeholder="请输入部门简介"/>
		</div>
	</div>
	<div class="form-group" style="text-align:center;">
		<div class="col-sm-12">
			<div class="span14" style="text-align:right;">
				<button id="btnAddDept" type="button" class="btn btn-success"
				style="width: 130px;" data-dismiss="modal">提交</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-warning" style="width: 130px;" type="reset">重置</button>
			</div>
		</div>
	</div>
</form>
</body>
</html>