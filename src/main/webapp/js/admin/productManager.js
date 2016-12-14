$(function() {
	/**
	 * 查询按钮点击事件
	 */
	$("#queryProduct").click(function(){
		var productName = $("#productName").val();
		var productStatus = $("#productStatus").val();
		location.href="/product/list?productName="+productName+"&productStatus="+productStatus;
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
			$("#addErrorMsg").text("产品编码不能为空!");
			return;
		}
		var addProductName = $("#addProductName").val();
		if(common.isEmpty(addProductName)){
			$("#addErrorMsg").text("产品名称不能为空!");
			return;
		}
		var addProductStatus = $("#addProductStatus").val();
		if(common.isEmpty(addProductStatus)){
			$("#addErrorMsg").text("状态不能为空!");
			return;
		}
		$.post(
			"/product/insert",
			{
				"productCode":addProductCode,
				"productName":addProductName,
				"productStatus":addProductStatus
			},
			function(data){
				if(data["success"]){
					location.href = "list";
				}else{
					$("#addErrorMsg").text(data["error"]);
					return;
				}
			}
		);
		
	});
	/**
	 * 三个框点击事件,提示语消失
	 */
	$("#addProductCode,#addProductName,#addProductStatus").click(function(){
		$("#addErrorMsg").text("");
	});
	
	/**
	 * 修改按钮点击事件,只弹出模态框,后台查询产品
	 */
	$("a[name='editProduct']").click(function() {
		var editId = $(this).attr("id");
		$.get(
			"/product/getById",
			{
				"productId":editId
			},
			function(data){
				if(data["success"]){					
					$("#editProductCode").val(data["data"].code);
					$("#editProductName").val(data["data"].name);
					if(data["data"].productStatus=="ENABLE"){
						$("#editProductStatus").val(0);
					}else{
						$("#editProductStatus").val(1);
					}
					$("#editProductModal").modal({
						keyboard : false,
						backdrop:"static"
					});
				}else{
					
				}
			}
		);
	});
	
	/**
	 * 修改产品确认按钮点击事件,后台交互
	 */
	$("#editProductConfirm").click(function(){
		var productCode = $("#editProductCode").val();
		var productName = $("#editProductName").val();
		var productStatus = $("#editProductStatus").val();
		$.post(
			"/product/update",
			{
				"productCode":productCode,
				"productName":productName,
				"productStatus":productStatus
			},
			function(data){
				if(data["success"]){
					location.href="/product/list";
				}
			}
		);
	});
	
	
});