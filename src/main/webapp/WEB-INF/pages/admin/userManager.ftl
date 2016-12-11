<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>后台用户管理</title>
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
							<li class="active">后台用户管理</li>
						</ol>
					</div>
					<div style="margin-top: 30px;">
						<form class="form-inline" role="form">
							<div class="form-group" style="margin-right: 20px;">
								<label for="">用户名:</label>
								<input class="form-control" type="text" placeholder="请输入用户名">
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
					<div style="margin-top: 30px;"><button type="button" class="btn btn-primary">新增</button></div>
					<div style="margin-top: 5px;">
						<table class="table table-bordered table-hover" style="text-align:center">
							<tr class="info">
								<td>序号</td>
								<td>用户编码</td>
								<td>用户姓名</td>
								<td>状态</td>
								<td>操作</td>
							</tr>
							<tr>
								<td>1</td>
								<td>zhangsan</td>
								<td>张三</td>
								<td>启用</td>
								<td>
									<a href="#">修改</a>
									<a href="#">重置密码</a>
								</td>
							</tr>
							<tr>
								<td>2</td>
								<td>lisi</td>
								<td>李四</td>
								<td>停用</td>
								<td>
									<a href="#">修改</a>
									<a href="#">重置密码</a>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
		<#--新增弹出框-->
		<div class="modal fade" id="addUserModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
						<h4 class="modal-title">新增产品</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" role="form">
							<div class="form-group">
								<label for="userCode" class="col-sm-4 control-label">用户编码</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="addUserCode" placeholder="请输入用户编码">
								</div>
							</div>
							<div class="form-group">
								<label for="userName" class="col-sm-4 control-label">姓名</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="addUserName" placeholder="请输入姓名">
								</div>
							</div>
							<div class="form-group">
								<label for="userStatus" class="col-sm-4 control-label">状态</label>
								<div class="col-sm-6">
									<select class="form-control" id="addUserStatus">
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
						<button type="button" class="btn btn-primary" id="addUserConfirm">确认</button>
					</div>
				</div>
			</div>
		</div>
		
		
	</body>

</html>