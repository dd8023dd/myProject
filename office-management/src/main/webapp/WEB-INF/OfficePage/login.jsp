<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>移动办公管理系统-登陆</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css" />
<style>
body{height:100%;overflow:hidden;background-image: url(${pageContext.request.contextPath}/static/img/xingkong.jpg);background-size:cover;}
canvas{z-index:-1;position:absolute;}
</style>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.js"></script>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/js/verificationNumbers.js"></script>
<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/js/Particleground.js"></script>
<script>
//判断是否敲击了Enter键 
$(document).keyup(function(event){ 
	  if(event.keyCode ==13){ 
	  $("#do_login").trigger("click"); 
	} 
});

$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#C4C4C4',
    lineColor: '#C4C4C4',
  });
  //验证码
  createCode();
  $("#do_login").click(function(){
		var b = validate(1);
		if($("#userName").val() == "" && $("#password").val() == ""){
			alert("用户名或密码不可为空!");
		}else if(!b){
			alert("验证码错误,请重输!");
		}else{
		$.ajax({
			url:"${pageContext.request.contextPath}/checkLogin.do",
			type:"post",
			data:{
				"username":$("#userName").val(),
				"password":$("#password").val()
			},
			dataType:"json",
			success:function(result){
				if(result.tag == 0){
					alert(result.message);
				}else{
					window.location.href="${pageContext.request.contextPath}/index.do";
				}
			}
		})  
		}
	})
});
</script>
</head>
<body>
<dl class="admin_login">
 <dt>
  <strong>移动办公管理系统</strong>
  <em>Office Management System</em>
 </dt>
 <dd class="user_icon">
  <input type="text" placeholder="账号" class="login_txtbx" name="username" id="userName"/>
 </dd>
 <dd class="pwd_icon">
  <input type="password" placeholder="密码" class="login_txtbx" name="password" id ="password"/>
 </dd>
 <dd class="val_icon">
  <div class="checkcode">
    <input type="text" id="J_codetext" placeholder="验证码" maxlength="4" class="login_txtbx">
    <canvas class="J_codeimg" id="myCanvas" onclick="createCode();">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
  </div>
  <input type="button" value="验证码核验" class="ver_btn" onClick="validate(0);">
 </dd>
 <dd>
  <input type="button" value="立即登录" class="submit_btn" id="do_login"/>
 </dd>
</dl>
</body>
</html>