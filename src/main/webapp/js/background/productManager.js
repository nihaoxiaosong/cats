$(function() {
	/**
	 * 新增按钮点击事件,只弹出模态框
	 */
	$("#addProduct").click(function() {
		$("#addProductModal").modal({
			keyboard : false,
			backdrop:"static"
		});
	});
	/**
	 * 新增产品确认按钮点击事件,后台交互
	 */
	$("#addProductConfirm").click(function(){
		var productCode = $("#productCode").val();
		if(common.isEmpty(productCode)){
			$("#errorMsg").text("产品编码不能为空!");
			return;
		}
		var productName = $("#productName").val();
		if(common.isEmpty(productName)){
			$("#errorMsg").text("产品名称不能为空!");
			return;
		}
		var productStatus = $("#productStatus").val();
		if(common.isEmpty(productStatus)){
			$("#errorMsg").text("状态不能为空!");
			return;
		}
		alert(111);
		$.post(
			"insert",
			{
				"productCode":productCode,
				"productName":productName,
				"productStatus":productStatus
			},
			function(data){
				if(data["success"]){
					location.href = "list";
				}
			}
		);
		
	});
	/**
	 * 三个框点击事件,提示语消失
	 */
	$("#productCode,#productName,#productStatus").click(function(){
		$("#errorMsg").text("");
	});
});