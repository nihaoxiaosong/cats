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
								<label for="adminUserName">用户名:</label>
								<input class="form-control" type="text" id="adminUserName" name="adminUserName" value="${adminUserName!}" placeholder="请输入用户名">
							</div>
							<div class="form-group" style="margin-right: 20px;">
								<label for="adminUserStatus">状态:</label>
								<select class="form-control" id="adminUserStatus" name="adminUserStatus">
									<option value="">请选择状态</option>
									<option value="0" <#if adminUserStatus==0>selected</#if> >开启</option>
									<option value="1" <#if adminUserStatus==1>selected</#if> >停用</option>
								</select>
							</div>
							<div class="form-group" style="margin-right: 20px;">
								<input class="btn btn-primary" type="button" id="queryAdminUser" value="查询">
							</div>
						</form>
					</div>
					<div style="margin-top: 30px;"><button type="button" id="addAdminUser" class="btn btn-primary">新增</button></div>
					<div style="margin-top: 5px;">
						<table class="table table-bordered table-hover" style="text-align:center">
							<tr class="warning">
								<td><label>序号</label></td>
								<td><label>用户编码</label></td>
								<td><label>用户姓名</label></td>
								<td><label>状态</label></td>
								<td><label>操作</label></td>
							</tr>
							<#if pager?exists && pager.list?exists && (pager.list?size>0) >
								<#list pager.list as adminUser>
									<tr>
										<td>${adminUser_index+1}</td>
										<td>${adminUser.userCode!}</td>
										<td>${adminUser.userName!}</td>
										<td <#if adminUser.status.des=="停用">style="color:red;"</#if>>${adminUser.status.des!}</td>
										<td>
											<a href="#">修改</a>
											<a href="#">重置密码</a>
											<a href="Javascript:void(0);" name="delAdminUser">删除</a>
										</td>
									</tr>
								</#list>
							</#if>
						</table>
					</div>
				</div>
			</div>
		</div>
		<#--新增弹出框-->
		<div class="modal fade" id="addAdminUserModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
						<h4 class="modal-title">新增产品</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" role="form">
							<div class="form-group">
								<label for="addAdminUserCode" class="col-sm-4 control-label">用户编码</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="addAdminUserCode" placeholder="请输入用户编码">
								</div>
							</div>
							<div class="form-group">
								<label for="addAdminUserName" class="col-sm-4 control-label">姓名</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="addAdminUserName" placeholder="请输入姓名">
								</div>
							</div>
							<div class="form-group">
								<label for="addAdminUserStatus" class="col-sm-4 control-label">状态</label>
								<div class="col-sm-6">
									<select class="form-control" id="addAdminUserStatus">
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
						<button type="button" class="btn btn-primary" id="addAdminUserConfirm">确认</button>
					</div>
				</div>
			</div>
		</div>
		<#--删除确认弹出框-->
		<div class="modal fade" id="delAdminUserModal">
			<div class="modal-dialog modal-sm">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
						<h4 class="modal-title">删除用户</h4>
					</div>
					<div class="modal-body" style="text-align:center">
						<span>是否确认删除?</span>
					</div>
					<div class="modal-footer">
						<span id="errorMsg" style="color:red;"></span>
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-primary" id="delAdminUserConfirm">确认</button>
					</div>
				</div>
			</div>
		</div>
		
		
	</body>
	<script src="<@s.url '/js/admin/adminUser.js'/>"></script>
	<script src="<@s.url '/js/common/common.js'/>"></script>
</html>