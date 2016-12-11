$(function(){
	/**
	 * 查询按钮点击事件
	 */
	$("#queryAdminUser").click(function(){
		var adminUserName = $("#adminUserName").val();
		var adminUserStatus = $("#adminUserStatus").val();
		location.href="list?adminUserName="+adminUserName+"&adminUserStatus="+adminUserStatus;
	});
	/**
	 * 新增按钮点击事件,只弹出模态框
	 */
	$("#addAdminUser").click(function() {
		$("#addAdminUserModal").modal({
			keyboard : false,
			backdrop:"static"
		});
	});
	
	$("#addAdminUserConfirm").click(function(){
		var addAdminUserCode = $("#addAdminUserCode").val();
		if(common.isEmpty(addAdminUserCode)){
			$("#errorMsg").text("用户编码不能为空!");
			return;
		}
		var addAdminUserName = $("#addAdminUserName").val();
		if(common.isEmpty(addAdminUserName)){
			$("#errorMsg").text("姓名不能为空!");
			return;
		}
		var addAdminUserStatus = $("#addAdminUserStatus").val();
		if(common.isEmpty(addAdminUserStatus)){
			$("#errorMsg").text("状态不能为空!");
			return;
		}
		$.post(
			"/adminUser/insert",
			{
				"addAdminUserCode":addAdminUserCode,
				"addAdminUserName":addAdminUserName,
				"addAdminUserStatus":addAdminUserStatus
			},
			function(data){
				if(data["success"]){
					location.href = "list";
				}else{
					$("#errorMsg").text(data["error"]);
					return;
				}
			}
		);
	});
});