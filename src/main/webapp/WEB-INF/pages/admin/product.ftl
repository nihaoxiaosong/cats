<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>cats后台产品管理</title>
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

			<!-- 内容区域 -->
			<div class="tpl-content-wrapper">
				<div class="container-fluid am-cf">
					<div class="row">
						<div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
							<div class="widget am-cf">
								<!--当前位置-->
								<div class="widget-head am-cf">
									<div class="page-header-heading"><span class="am-icon-product-hunt page-header-heading-icon"></span> 产品管理 <small>/ product</small></div>
									<p class="page-header-description">这个是产品管理页. 您可以再次增删改查 cats 的产品信息.</p>
								</div>
								<!--当前位置结束-->
								<div class="widget-body am-fr">
									<!--查询条件-->
									<div>
										<div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
											<div class="am-form-group">
												<div class="am-btn-toolbar">
													<div class="am-btn-group am-btn-group-xs">
														<button type="button" class="am-btn am-btn-default am-btn-success"><span class="am-icon-plus"></span> 新增</button>
														<button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-save"></span> 保存</button>
														<button type="button" class="am-btn am-btn-default am-btn-warning"><span class="am-icon-archive"></span> 审核</button>
														<button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-trash-o"></span> 删除</button>
													</div>
												</div>
											</div>
										</div>
										<div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
											<div class="am-form-group tpl-table-list-select">
												<select data-am-selected="{btnSize: 'sm'}">
													<option value="option1">请选择状态</option>
													<option value="option2">启用</option>
													<option value="option3">停用</option>
												</select>
											</div>
										</div>
										<div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
											<div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
												<input type="text" class="am-form-field" placeholder="请输入产品名称">
												<span class="am-input-group-btn">
            <button class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search" type="button"></button>
          </span>
											</div>
										</div>
									</div>
									<!--查询条件结束-->
									<!--表格-->
									<div class="am-u-sm-12">
										<table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black " id="example-r">
											<thead>
												<tr>
													<th>序号</th>
													<th>编码</th>
													<th>产品名称</th>
													<th>状态</th>
													<th>操作</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>1</td>
													<td>1001</td>
													<td>饱学席</td>
													<td>启用</td>
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
												<tr>
													<td>2</td>
													<td>1002</td>
													<td>考吧</td>
													<td>启用</td>
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
												<tr>
													<td>3</td>
													<td>1003</td>
													<td>税务实训平台</td>
													<td>启用</td>
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
												<tr>
													<td>4</td>
													<td>1004</td>
													<td>考试宝-g</td>
													<td>启用</td>
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
												<tr>
													<td>5</td>
													<td>1005</td>
													<td>考试宝-x</td>
													<td>启用</td>
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
												<tr>
													<td>6</td>
													<td>1006</td>
													<td>考试宝-k</td>
													<td>停用</td>
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
												
												<tr>
													<td>7</td>
													<td>1007</td>
													<td>代理记账云平台</td>
													<td>停用</td>
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
												
												<tr>
													<td>8</td>
													<td>1008</td>
													<td>cmac基础训练</td>
													<td>停用</td>
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
												
												<tr>
													<td>9</td>
													<td>1009</td>
													<td>代理记账云平台</td>
													<td>停用</td>
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
												
												<tr>
													<td>10</td>
													<td>1010</td>
													<td>竞赛平台</td>
													<td>停用</td>
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
											</tbody>
										</table>
									</div>
									<!--表格结束-->
									<!--分页-->
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
									<!--分页结束-->
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>
			<!-- 内容区域结束 -->

		</div>
	</body>

</html>