<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>产品管理</title>
		<#include "/common/bootstrap.ftl" />
	</head>

	<body>
		<div class="container">
			<div class="row">
				<#include "/common/admin/header.ftl" />
			</div>
			<div class="row" style="margin-top: 30px;">
				<div class="col-md-2">
					<#include "/common/admin/left.ftl" />
				</div>
				<div class="col-md-10">
					<div>
						<ol class="breadcrumb">
							<li><span class="glyphicon glyphicon-map-marker"></span> 基础数据管理</li>
							<li class="active">产品管理</li>
						</ol>
					</div>
					<div style="margin-top: 30px;">
						<form class="form-inline" role="form">
							<div class="form-group" style="margin-right: 20px;">
								<label for="">产品名称:</label>
								<input class="form-control" id="productName" type="text" name="productName" value="${productName!}" placeholder="请输入产品名称">
							</div>
							<div class="form-group" style="margin-right: 20px;">
								<label for="">状态:</label>
								<select class="form-control" id="productStatus" name="productStatus">
									<option value="">请选择状态</option>
									<option value="0" <#if productStatus==0>selected</#if> >开启</option>
									<option value="1" <#if productStatus==1>selected</#if> >停用</option>
								</select>
							</div>
							<div class="form-group" style="margin-right: 20px;">
								<input class="btn btn-primary" id="queryProduct" type="button" value="查询">
							</div>
						</form>
					</div>
					<div style="margin-top: 30px;"><button type="button" id="addProduct" class="btn btn-primary">新增</button></div>
					<div style="margin-top: 5px;">
						<table class="table table-bordered table-hover table-striped" style="text-align:center">
							<tr class="warning">
								<td><label>序号</label></td>
								<td><label>产品编码</label></td>
								<td><label>产品名称</label></td>
								<td><label>状态</label></td>
								<td><label>操作</label></td>
							</tr>
							<#if list?exists && (list?size>0) >
								<#list list as p>
									<tr>
										<td>${p_index+1}</td>
										<td>${p.code!}</td>
										<td>${p.name!}</td>
										<td <#if p.productStatus.des=="停用">style="color:red;"</#if>>${p.productStatus.des!}</td>
										<td><a href="#">修改</a></td>
									</tr>
								</#list>
							</#if>
						</table>
					</div>
				</div>
			</div>
		</div>
		<#--新增弹出框-->
		<div class="modal fade" id="addProductModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
						<h4 class="modal-title">新增产品</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" role="form">
							<div class="form-group">
								<label for="productCode" class="col-sm-4 control-label">产品编码</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="addProductCode" placeholder="请输入产品编码">
								</div>
							</div>
							<div class="form-group">
								<label for="productName" class="col-sm-4 control-label">产品名称</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="addProductName" placeholder="请输入产品名称">
								</div>
							</div>
							<div class="form-group">
								<label for="productStatus" class="col-sm-4 control-label">状态</label>
								<div class="col-sm-6">
									<select class="form-control" id="addProductStatus">
										<option value="">请选择状态</option>
										<option value="0">启用</option>
										<option value="1">停用</option>
									</select>
								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<span id="errorMsg" style="color:red;"></span>
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-primary" id="addProductConfirm">确认</button>
					</div>
				</div>
			</div>
		</div>
		
	</body>
	<script src="<@s.url '/js/admin/productManager.js'/>"></script>
	<script src="<@s.url '/js/common/common.js'/>"></script>
</html>