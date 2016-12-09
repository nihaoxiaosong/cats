<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>登录页</title>
		<#include "/common/bootstrap.ftl" />
		<link href="<@s.url '/css/admin/login.css'/>" />
	</head>

	<body>
		<div class="container">
			<form class="form-signin" role="form">
				<h2 class="form-signin-heading">CATS后台登录</h2>
				<input type="text" class="form-control" placeholder="请输入用户名" required autofocus>
				<input type="password" class="form-control" placeholder="请输入密码" required>
				<div class="checkbox">
					<label>
						<input type="checkbox" value="remember-me"> 记住密码
					</label>
				</div>
				<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
			</form>
		</div>
	</body>
</html>