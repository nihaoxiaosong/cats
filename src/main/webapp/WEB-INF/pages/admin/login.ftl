<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>cats后台管理登录页</title>
		<#include "/common/cssJs.ftl"/>
	</head>

	<body>
		<div class="am-g tpl-g">
			<#-- 风格切换 -->
			<#include "/common/themeSwitch.ftl"/>
			<#-- 风格切换结束 -->
			<div class="tpl-login">
				<div class="tpl-login-content">
					<div class="tpl-login-logo"></div>
					<form class="am-form tpl-form-line-form">
						<div class="am-form-group">
							<input type="text" class="tpl-form-input" id="userCode" placeholder="请输入账号">
						</div>
						<div class="am-form-group">
							<input type="password" class="tpl-form-input" id="password" placeholder="请输入密码">
						</div>
						<div class="am-form-group tpl-login-remember-me">
							<input id="remember-me" type="checkbox">
							<label for="remember-me">记住密码</label>
						</div>
						<div class="am-form-group">
							<button id="login" type="button" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success tpl-login-btn">提交</button>
						</div>
						<span id="loginErrorMsg" style="color:red;"></span>
					</form>
				</div>
			</div>
		</div>
		<script src="<@s.url '/assets/js/common/common.js'/>"></script>
		<script src="<@s.url '/assets/js/admin/login.js'/>"></script>
	</body>

</html>