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
				<div class="page-header">
					<h2>CATS衡信后台管理平台 <small>浙江衡信教育科技有限公司</small></h2>
				</div>
			</div>
			<div class="row" style="margin-top: 30px;">
				<div class="col-md-2">
					<div class="list-group">
						<a href="#" class="list-group-item active"><span class="glyphicon glyphicon-wrench"></span> 基础数据管理</a>
						<a href="#" class="list-group-item row" style="text-align:center">产品管理</a>
						<a href="#" class="list-group-item" style="text-align:center">学校管理</a>
						<a href="manager.html" class="list-group-item" style="text-align:center">工作室经理管理</a>
						<a href="#" class="list-group-item" style="text-align:center">老师管理</a>
						<a href="#" class="list-group-item" style="text-align:center">学生管理</a>
						<a href="#" class="list-group-item" style="text-align:center">权限管理</a>
						<a href="#" class="list-group-item" style="text-align:center">公告管理</a>
						<a href="#" class="list-group-item active"><span class="glyphicon glyphicon-user"></span> 人才选拔测评管理</a>
						<a href="#" class="list-group-item" style="text-align:center">CMAC合格标准</a>
						<a href="#" class="list-group-item" style="text-align:center">选拔合格标准</a>
						<a href="#" class="list-group-item" style="text-align:center">成绩查询</a>
						<a href="#" class="list-group-item" style="text-align:center">选拔结果管理</a>
						<a href="#" class="list-group-item" style="text-align:center">课程管理</a>
						<a href="#" class="list-group-item" style="text-align:center">政府网站管理</a>
						<a href="#" class="list-group-item active"><span class="glyphicon glyphicon-hdd"></span> 工作室管理</a>
						<a href="#" class="list-group-item" style="text-align:center">任务类型设置</a>
					</div>
				</div>
				<div class="col-md-10">
					<div>
						<ol class="breadcrumb">
							<li>基础数据管理</li>
							<li class="active">产品管理</li>
						</ol>
					</div>
					<div style="margin-top: 30px;">
						<form class="form-inline" role="form">
							<div class="form-group" style="margin-right: 20px;">
								<label for="">产品名称:</label>
								<input class="form-control" type="text" placeholder="请输入产品名称">
							</div>
							<div class="form-group" style="margin-right: 20px;">
								<label for="">状态:</label>
								<select class="form-control">
									<option>请选择状态</option>
									<option>开启</option>
									<option>停用</option>
								</select>
							</div>
							<div class="form-group" style="margin-right: 20px;">
								<input class="btn btn-primary" type="button" value="查询">
							</div>
						</form>
					</div>
					<div style="margin-top: 30px;"><button type="button" id="addProduct" class="btn btn-primary">新增</button></div>
					<div style="margin-top: 5px;">
						<table class="table table-bordered table-hover table-striped" style="text-align:center">
							<tr class="info">
								<th style="text-align:center">序号</td>
								<th style="text-align:center">产品编码</td>
								<th style="text-align:center">产品名称</td>
								<th style="text-align:center">状态</td>
								<th style="text-align:center">操作</td>
							</tr>
							<tr>
								<td>1</td>
								<td>1001</td>
								<td>代理记账云平台</td>
								<td>启用</td>
								<td><a href="#">修改</a></td>
							</tr>
							<tr>
								<td>2</td>
								<td>1002</td>
								<td>CMAC基础训练平台</td>
								<td>启用</td>
								<td><a href="#">修改</a></td>
							</tr>
							<tr>
								<td>3</td>
								<td>1003</td>
								<td>税务实训平台</td>
								<td>停用</td>
								<td><a href="#">修改</a></td>
							</tr>
							<tr>
								<td>4</td>
								<td>1004</td>
								<td>理实一体教学平台</td>
								<td>停用</td>
								<td><a href="#">修改</a></td>
							</tr>
							<tr>
								<td>5</td>
								<td>1005</td>
								<td>亿企代账(教学版)</td>
								<td>停用</td>
								<td><a href="#">修改</a></td>
							</tr>
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
									<input type="text" class="form-control" id="productCode" placeholder="请输入产品编码">
								</div>
							</div>
							<div class="form-group">
								<label for="productName" class="col-sm-4 control-label">产品名称</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="productName" placeholder="请输入产品名称">
								</div>
							</div>
							<div class="form-group">
								<label for="productStatus" class="col-sm-4 control-label">状态</label>
								<div class="col-sm-6">
									<select class="form-control" id="productStatus">
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
	<script src="<@s.url '/js/background/productManager.js'/>"></script>
	<script src="<@s.url '/js/common/common.js'/>"></script>
</html>