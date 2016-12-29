<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>cats后台用户管理</title>
		<#include "/common/cssJs.ftl"/>
	</head>

	<body data-type="product">
		<div class="am-g tpl-g">
			<#-- 头部 -->
			<#include "/common/header.ftl"/>
			<#-- 头部结束 -->

			<#-- 风格切换 -->
			<#include "/common/themeSwitch.ftl"/>
			<#-- 风格切换结束 -->

			<#-- 侧边导航栏 -->
			<#include "/common/leftSidebar.ftl"/>
			<#-- 侧边导航栏结束 -->

			<#-- 内容区域 -->
			<div class="tpl-content-wrapper">
				<div class="container-fluid am-cf">
					<div class="row">
						<div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
							<div class="widget am-cf">
								<#--当前位置-->
								<div class="widget-head am-cf">
									<div class="page-header-heading"><span class="am-icon-user page-header-heading-icon"></span> 后台用户管理 <small>/ adminUser</small></div>
									<p class="page-header-description">这个是用户管理页. 您可以在此增删改查 cats 后台的用户信息.</p>
								</div>
								<#--当前位置结束-->
								<div class="widget-body am-fr">
									<#--查询条件-->
									<div>
										<div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
											<div class="am-form-group">
												<div class="am-btn-toolbar">
													<div class="am-btn-group am-btn-group-xs">
														<button type="button" class="am-btn am-btn-default am-btn-success" data-am-modal="{target: '#addAdminUser', closeViaDimmer: 0}"><span class="am-icon-plus"></span> 新增</button>
														<button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-save"></span> 保存</button>
														<button type="button" class="am-btn am-btn-default am-btn-warning"><span class="am-icon-archive"></span> 审核</button>
														<button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-trash-o"></span> 删除</button>
													</div>
												</div>
											</div>
										</div>
										<div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
											<div class="am-form-group tpl-table-list-select">
												<select data-am-selected="{btnSize: 'sm'}" id="adminUserStatus">
													<option value="-1">请选择状态</option>
													<option value="0" <#if adminUserStatus=="0">selected</#if> >启用</option>
													<option value="1" <#if adminUserStatus=="1">selected</#if>>停用</option>
												</select>
											</div>
										</div>
										<div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
											<div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
												<input type="text" id="adminUserName" class="am-form-field" value="${adminUserName!}" placeholder="请输入姓名">
												<span class="am-input-group-btn">
													<button class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search" type="button" id="queryAdminUser"></button>
												</span>
											</div>
										</div>
									</div>
									<#--查询条件结束-->
									<#--表格-->
									<div class="am-u-sm-12">
										<table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
											<thead>
												<tr>
													<th><input type="checkbox" id="checkAll" /></th>
													<th>序号</th>
													<th>编码</th>
													<th>姓名</th>
													<th>状态</th>
													<th>操作</th>
												</tr>
											</thead>
											<tbody>
											<#if pager?exists && pager.list?exists && pager.list?size &gt; 0>
												<#list pager.list as adminUser>
													<tr>
														<td><input type="checkbox"/></td>
														<td>${adminUser_index+1}</td>
														<td>${adminUser.code!}</td>
														<td>${adminUser.name!}</td>
														<td <#if adminUser.status.value==1>style="color:red;"</#if> >${adminUser.status.des!}</td>
														<td>
															<div class="tpl-table-black-operation">
																<a href="javascript:;">
																	<i class="am-icon-pencil"></i> 编辑
																</a>
																<a href="javascript:;" class="tpl-table-black-operation-del">
																	<i class="am-icon-trash"></i> 删除
																</a>
															</div>
														</td>
													</tr>
												</#list>												
											<#else>
												<tr style="text-align:center;"><td colspan="6">暂无记录,请新增.</td></tr>
											</#if>
											</tbody>
										</table>
									</div>
									<#--表格结束-->
									<#--分页-->
									<div class="am-u-lg-12 am-cf">
										<div class="am-fr">
											<ul class="am-pagination tpl-pagination">
												<li class="am-disabled">
													<a href="#">«</a>
												</li>
												<li class="am-active">
													<a href="#">1</a>
												</li>
												<li>
													<a href="#">2</a>
												</li>
												<li>
													<a href="#">3</a>
												</li>
												<li>
													<a href="#">4</a>
												</li>
												<li>
													<a href="#">5</a>
												</li>
												<li>
													<a href="#">»</a>
												</li>
											</ul>
										</div>
									</div>
									<#--分页结束-->
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>
			<#-- 内容区域结束 -->
		</div>
		
		<#--新增用户弹出框 start-->
		<div class="am-modal am-modal-no-btn" tabindex="-1" id="addAdminUser">
			<div class="am-modal-dialog">
			    <div class="am-modal-hd">
			    	<label>新增用户</label>
			    	<a href="javascript:void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
			    </div>
			    <hr/>
			    <div class="am-modal-bd">
			    	<div class="am-form am-form-horizontal">
						<div class="am-form-group am-form-group-sm">
							<span for="" class="am-u-sm-3 am-form-label">编码:</span>
							<div class="am-u-sm-6">
								<input type="text" id="addAdminUserCode" class="am-form-field" placeholder="请输入编码">
							</div>
							<span class="am-u-sm-3" style="color:red;" id="addCodeErrorMsg"></span>
						</div>
					
						<div class="am-form-group am-form-group-sm">
							<span for="" class="am-u-sm-3 am-form-label">姓名:</span>
							<div class="am-u-sm-6">
								<input type="text" id="addAdminUserName" class="am-form-field" placeholder="请输入姓名">
							</div>
							<span class="am-u-sm-3" style="color:red;" id="addNameErrorMsg"></span>
						</div>
					
						<div class="am-form-group am-form-group-sm">
							<span for="" class="am-u-sm-3 am-form-label">状态</span>
							<div class="am-u-sm-6">
								<select class="am-input-sm" id="addAdminUserStatus">
									<option value="">请选择状态</option>
									<option value="0">启用</option>
									<option value="1">停用</option>
								</select>
							</div>
							<span class="am-u-sm-3" style="color:red;" id="addStatusErrorMsg"></span>
						</div>
					
						<div class="am-form-group">
							<div class="am-u-sm-10 am-u-sm-offset-3">
								<button type="button" class="am-btn am-btn-default am-btn-sm" data-am-modal-close>取消</button>
								<button type="button" class="am-btn am-btn-primary am-btn-sm" id="addAdminUserConfirm">保存</button>
							</div>
						</div>
					</div>
			    </div>
		  	</div>
		</div>
		<#--新增用户弹出框 end-->
		<script src="<@s.url '/assets/js/common/common.js'/>"></script>
		<script src="<@s.url '/assets/js/admin/adminUser.js'/>"></script>
	</body>

</html>