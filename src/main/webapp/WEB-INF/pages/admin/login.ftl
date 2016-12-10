<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>登录页</title>
		<#include "/common/bootstrap.ftl" />
		<link href="<@s.url '/css/admin/login.css'/>" type="text/css" rel="stylesheet" />
	</head>

	<body>
		<div class="container">
			<form class="form-signin" role="form" id="loginForm">
				<h2 class="form-signin-heading">CATS后台登录</h2>
				<input type="text" id="userCode" name="userCode" class="form-control mt10" placeholder="请输入用户名" required autofocus>
				<input type="password" id="password" name="password" class="form-control mt10" placeholder="请输入密码" required>
				<button type="button" class="btn btn-lg btn-primary btn-block mt50" id="login">登录</button>
				<span class="colorRed" id="errorMsg"></span>
			</form>
		</div>
	</body>
	<script src="<@s.url '/js/admin/login.js'/>"></script>
	<script src="<@s.url '/js/common/common.js'/>"></script>
</html>