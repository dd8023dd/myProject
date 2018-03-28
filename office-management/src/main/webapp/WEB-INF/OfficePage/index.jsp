<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Office-System</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/global.css" media="all">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/plugins/font-awesome/css/font-awesome.min.css">
	<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/plugins/layui/layui.js"></script>
	<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/datas/nav.js"></script>
	<script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/static/js/index.js"></script>
</head>
	<body>
		<div class="layui-layout layui-layout-admin" style="border-bottom:solid 5px #1aa094;">
			<div class="layui-header header header-demo">
				<div class="layui-main ">
					<div class="admin-login-box">
						<a class="logo" style="left: 0;" href="#">
							<span style="font-size: 22px;">ZhangMj</span>
						</a>
						<div class="admin-side-toggle">
							<i class="fa fa-bars" aria-hidden="true"></i>
						</div>
						<div class="admin-side-full">
							<i class="fa fa-life-bouy" aria-hidden="true"></i>
						</div>
					</div>
					<ul class="layui-nav admin-header-item">
						<li class="layui-nav-item" id="clearCached">
							<a href="#">清除缓存</a>
						</li>
						<li class="layui-nav-item" id="baidu">
							<a href="#">百度一下</a>
						</li>
						<li class="layui-nav-item" id="video1">
							<a href="#">公司视频</a>
						</li>
						<li class="layui-nav-item">
							<a href="#" class="admin-header-user">
								<img src="${pageContext.request.contextPath}/static/img/zhangmj01.jpg" />
								<span>${username }</span>
							</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="${pageContext.request.contextPath}/user/toMyself.do" target="_blank"><i class="fa fa-user-circle" aria-hidden="true"></i> 个人信息</a>
								</dd>
								<dd>
									<a href="#"><i class="fa fa-gear" aria-hidden="true"></i> 设置</a>
								</dd>
								<dd id="lock">
									<a href="#">
										<i class="fa fa-lock" aria-hidden="true" style="padding-right: 3px;padding-left: 1px;"></i> 锁屏 (Alt+L)
									</a>
								</dd>
								<dd>
									<a href="${pageContext.request.contextPath}/login.do"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a>
								</dd>
							</dl>
						</li>
					</ul>
					<ul class="layui-nav admin-header-item-mobile">
						<li class="layui-nav-item">
							<a href="${pageContext.request.contextPath}/login.do"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="layui-side layui-bg-black" id="admin-side">
				<div class="layui-side-scroll" id="admin-navbar-side" lay-filter="side"></div>
			</div>
			<div class="layui-body" style="bottom: 0;border-left: solid 2px #1AA094;" id="admin-body">
				<div class="layui-tab admin-nav-card layui-tab-brief" lay-filter="admin-tab">
					<ul class="layui-tab-title">
						<li class="layui-this">
							<i class="fa fa-dashboard" aria-hidden="true"></i>
							<cite>系统首页</cite>
						</li>
					</ul>
					<div class="layui-tab-content" style="min-height:150px;padding: 5px 0 0 0;">
						<div class="layui-tab-item layui-show">
							<iframe src="${pageContext.request.contextPath}/toMain.do"></iframe>
						</div>
					</div>
				</div>
			</div>

			<div class="site-tree-mobile layui-hide">
				<i class="layui-icon">&#xe602;</i>
			</div>
			<div class="site-mobile-shade"></div>

			<!--锁屏模板 start-->
			<script type="text/template" id="lock-temp">
				<div class="admin-header-lock" id="lock-box">
					<div class="admin-header-lock-img">
						<img src="${pageContext.request.contextPath}/static/img/zhangmj01.jpg" />
					</div>
					<div class="admin-header-lock-name" id="lockUserName">${username }</div>
					<input type="text" class="admin-header-lock-input" value="输入密码解锁.." name="lockPwd" id="lockPwd" />
					<button class="layui-btn layui-btn-small" id="unlock">解锁</button>
				</div>
			</script>
			<!--锁屏模板 end -->
			<script type="text/javascript">
				layui.use('layer', function() {
					var $ = layui.jquery,
						layer = layui.layer;

					$('#video1').on('click', function() {
						layer.open({
							title: 'YouTube',
							maxmin: true,
							type: 2,
							content: 'video.html',
							area: ['800px', '500px']
						});
					});
					$('#baidu').on('click', function() {
						layer.open({
							title: 'Baidu',
							maxmin: true,
							type: 2,
							content: 'http://www.baidu.com',
							area: ['900px', '650px']
						});
					});
				});
			</script>
		</div>
	</body>
</html>