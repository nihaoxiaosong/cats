$(function() {
	/**
	 * 查询按钮点击事件
	 */
	$("#queryProduct").click(function(){
		var productName = $("#productName").val();
		var productStatus = $("#productStatus").val();
		location.href="list?productName="+productName+"&productStatus="+productStatus;
	});
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
		var addProductCode = $("#addProductCode").val();
		if(common.isEmpty(addProductCode)){
			$("#errorMsg").text("产品编码不能为空!");
			return;
		}
		var addProductName = $("#addProductName").val();
		if(common.isEmpty(addProductName)){
			$("#errorMsg").text("产品名称不能为空!");
			return;
		}
		var addProductStatus = $("#addProductStatus").val();
		if(common.isEmpty(addProductStatus)){
			$("#errorMsg").text("状态不能为空!");
			return;
		}
		$.post(
			"insert",
			{
				"productCode":addProductCode,
				"productName":addProductName,
				"productStatus":addProductStatus
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
	$("#addProductCode,#addProductName,#addProductStatus").click(function(){
		$("#errorMsg").text("");
	});
});