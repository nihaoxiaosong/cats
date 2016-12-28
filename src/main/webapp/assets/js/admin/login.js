$(function() {
	$("#login").click(function() {
		var userCode = $("#userCode").val();
		var password = $("#password").val();
		if(!login.checkUserCode(userCode)){
			$("#loginErrorMsg").html("请输入用户名!");
			return;
		}
		if(!login.checkUserCode(password)){
			$("#loginErrorMsg").html("请输入密码!");
			return;
		}
		login.submit(userCode, password);
	});

	$("#userCode,#password").click(function() {
		$("#loginErrorMsg").html("");
	});
	
	$("#userCode").keydown(function(event){
		if(event.which == 13){
			$("#password").focus();
		}
	});
	
	$("#password").keydown(function(event){
		if(event.which == 13){
			var userCode = $("#userCode").val();
			var password = $("#password").val();
			if(!login.checkUserCode(userCode)){
				$("#loginErrorMsg").html("请输入用户名!");
				return;
			}
			if(!login.checkUserCode(password)){
				$("#loginErrorMsg").html("请输入密码!");
				return;
			}
			login.submit(userCode, password);
		}
	});
});


var login = {
		checkUserCode : function(userCode){
			if (common.isEmpty(userCode)) {
				return false;
			}else{
				return true;
			}
		},
		checkoutPassword : function(password){
			if (common.isEmpty(password)) {
				return false;
			}else{
				return true;
			}
		},
		submit : function(userCode, password){
			$.post("/login/submit", {
				"userCode" : userCode,
				"password" : password
			}, function(data) {
				if (data["success"]) {
					location.href = "/login/home";
				} else {
					$("#loginErrorMsg").html("用户名或密码错误!");
					return;
				}
			});
		}
}