$(function(){
	/**
	 * 查询按钮点击事件
	 */
	$("#queryAdminUser").click(function(){
		var adminUserName = $("#adminUserName").val();
		var adminUserStatus = $("#adminUserStatus").val();
		if(adminUserStatus=="-1"){
			adminUserStatus = "";
		}
		location.href="/adminUser/list?adminUserName="+adminUserName+"&adminUserStatus="+adminUserStatus;
	});
	/**
	 * 新增按钮点击事件,后台交互
	 */
	$("#addAdminUserConfirm").click(function(){
		var addAdminUserCode = $("#addAdminUserCode").val();
		if(common.isEmpty(addAdminUserCode)){
			$("#addCodeErrorMsg").text("编码不能为空!");
			return;
		}
		var addAdminUserName = $("#addAdminUserName").val();
		if(common.isEmpty(addAdminUserName)){
			$("#addNameErrorMsg").text("姓名不能为空!");
			return;
		}
		var addAdminUserStatus = $("#addAdminUserStatus").val();
		if(common.isEmpty(addAdminUserStatus)){
			$("#addStatusErrorMsg").text("状态不能为空!");
			return;
		}
		$.post(
			"/adminUser/insert",
			{
				"adminUserCode":addAdminUserCode,
				"adminUserName":addAdminUserName,
				"adminUserStatus":addAdminUserStatus
			},
			function(data){
				if(data["success"]){
					location.href = "/adminUser/list";
				}else{
					$("#errorMsg").text(data["error"]);
					return;
				}
			}
		);
	});
	
	/**
	 * 三个框点击事件,提示语消失
	 */
	$("#addAdminUserCode").click(function(){
		$("#addCodeErrorMsg").text("");
	});
	$("#addAdminUserName").click(function(){
		$("#addNameErrorMsg").text("");
	});
	$("#addAdminUserStatus").click(function(){
		$("#addStatusErrorMsg").text("");
	});
	
	/**
	 * 删除按钮点击事件,弹出提示框
	 */
	$("a[name='delAdminUser']").click(function(){
		$("#delAdminUserModal").modal({
			keyboard : false,
			backdrop:"static"
		});
	});
	
	
});