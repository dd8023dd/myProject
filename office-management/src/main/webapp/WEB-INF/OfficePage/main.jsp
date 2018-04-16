<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<link rel="stylesheet"
	href="/static/plugins/layui/css/layui.css"
	media="all" />
<style type="text/css">
.admin-main {
	margin: 15px;
}

.admin-main .layui-field-title .layui-field-box {
	padding: 10px 30px;
}

.admin-main .layui-field-title .layui-field-box p {
	padding: 5px 0;
}
</style>
	<script type="text/javascript" charset="utf8" src="/static/bootstrap/js/jquery.js"></script>
</head>
<script type="text/javascript">
$(document).ready(function(){
	isBirthday();
})
function isBirthday(){
	$.ajax({
		url:"/isBirthday.do",
		type:"post",
		dataType:"json",
		success:function(result) {
			if(result.tag == 1){
				$("#isb").html(result.message);
			}
		}
	})
}
</script>
<body>
	<div class="admin-main">
		<blockquote class="layui-elem-quote">
			<p>移动办公管理系统</p>
			Office-Managerment-System
			<p>前端设计基于LayUI实现</p>
			<br/>
			<p id="isb" style="font-size:20px;"></p><!-- 这里放动态祝福等等啦 = = 例如生日什么的 = = -->
			<p style="color: #2E8DED;">--这里可以放公司简介--</p>
			<!--<p style="color: #01AAED;">子窗体弹出对话框编辑表单的一些建议：如果是处理表单的，建议在子窗口弹出。把背景设置为无，如果只是提示信息，可以在父窗口弹出。</p>-->
		</blockquote>
		<fieldset class="layui-elem-field">
			<legend>公告</legend>
			<div class="layui-field-box">
				<fieldset class="layui-elem-field layui-field-title">
					<legend>日期:2018-03-06 13:26:00</legend>
					<div class="layui-field-box">
						<p>完成移动办公管理系统毕业设计前端设计项目首页index第一版</p>
					</div>
				</fieldset>
				<fieldset class="layui-elem-field layui-field-title">
					<legend>日期:2018-03-12 14:30:00</legend>
					<div class="layui-field-box">
						<p>完成其中一部分表格网页增删改查的编写</p>
					</div>
				</fieldset>
				<fieldset class="layui-elem-field layui-field-title">
					<legend>日期:2018-03-16 14:35:00</legend>
					<div class="layui-field-box">
						<p>完成部分前端的编写,及特殊后端功能实现方法的修改</p>
					</div>
				</fieldset>
			</div>
		</fieldset>
	</div>
</body>
</html>