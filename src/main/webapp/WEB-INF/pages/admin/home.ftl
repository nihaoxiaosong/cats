<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>cats后台管理首页</title>
		<#include "/common/cssJs.ftl"/>
	</head>

	<body data-type="home">
		<div class="am-g tpl-g">
			<!-- 头部 -->
			<#include "/common/header.ftl"/>
			<!-- 头部结束 -->

			<!-- 风格切换 -->
			<#include "/common/themeSwitch.ftl"/>
			<!-- 风格切换结束 -->

			<!-- 侧边导航栏 -->
			<#include "/common/leftSidebar.ftl"/>
			<!-- 侧边导航栏结束 -->

			<!-- 内容区域 -->
			<div class="tpl-content-wrapper">

				<div class="container-fluid am-cf">
					<div class="row">
						<div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
							<div class="page-header-heading"><span class="am-icon-home page-header-heading-icon"></span> 首页 <small>/ homePage</small></div>
							<p class="page-header-description">这是首页. 没什么好放的, 随便欣赏几张图片吧.</p>
						</div>
					</div>
				</div>
				<div class="row-content am-cf">
					<div class="am-slider am-slider-default" data-am-flexslider id="demo-slider-0">
						<ul class="am-slides">
							<li><img src="http://s.amazeui.org/media/i/demos/bing-4.jpg" /></li>
							<li><img src="http://s.amazeui.org/media/i/demos/bing-3.jpg" /></li>
							<li><img src="http://s.amazeui.org/media/i/demos/bing-2.jpg" /></li>
							<li><img src="http://s.amazeui.org/media/i/demos/bing-1.jpg" /></li>
							<li><img src="http://s.amazeui.org/media/i/demos/pure-4.jpg" /></li>
							<li><img src="http://s.amazeui.org/media/i/demos/pure-3.jpg" /></li>
							<li><img src="http://s.amazeui.org/media/i/demos/pure-2.jpg" /></li>
							<li><img src="http://s.amazeui.org/media/i/demos/pure-1.jpg" /></li>
						</ul>
					</div>
				</div>
				<#--
				<div class="row-content am-cf">
					<div class="am-u-sm-12 am-u-md-4 am-u-lg-3">
						<div class="widget widget-primary am-cf">
							<div class="widget-statistic-header">
							</div>
							<div class="widget-statistic-body">
								<div class="widget-statistic-value">
									用户管理
								</div>
								<div class="widget-statistic-description">
									<button class="widget-fluctuation-tpl-btn">点击进入</button>
								</div>
								<span class="widget-statistic-icon am-icon-user"></span>
							</div>
						</div>
					</div>

					<div class="am-u-sm-12 am-u-md-4 am-u-lg-3">
						<div class="widget widget-purple am-cf">
							<div class="widget-statistic-header">
							</div>
							<div class="widget-statistic-body">
								<div class="widget-statistic-value">
									产品管理
								</div>
								<div class="widget-statistic-description">
									<button class="widget-fluctuation-tpl-btn">点击进入</button>
								</div>
								<span class="widget-statistic-icon am-icon-product-hunt"></span>
							</div>
						</div>
					</div>
					<div class="am-u-sm-12 am-u-md-4 am-u-lg-3">
						<div class="widget widget-primary am-cf">
							<div class="widget-statistic-header">
							</div>
							<div class="widget-statistic-body">
								<div class="widget-statistic-value">
									学校管理
								</div>
								<div class="widget-statistic-description">
									<button class="widget-fluctuation-tpl-btn">点击进入</button>
								</div>
								<span class="widget-statistic-icon am-icon-university"></span>
							</div>
						</div>
					</div>

					<div class="am-u-sm-12 am-u-md-4 am-u-lg-3">
						<div class="widget widget-purple am-cf">
							<div class="widget-statistic-header">
							</div>
							<div class="widget-statistic-body">
								<div class="widget-statistic-value">
									工作室经理
								</div>
								<div class="widget-statistic-description">
									<button class="widget-fluctuation-tpl-btn">点击进入</button>
								</div>
								<span class="widget-statistic-icon am-icon-university"></span>
							</div>
						</div>
					</div>

				</div>

					
				<div class="row-content am-cf">
					<div class="am-u-sm-12 am-u-md-4 am-u-lg-3">
						<div class="widget widget-primary am-cf">
							<div class="widget-statistic-header">
							</div>
							<div class="widget-statistic-body">
								<div class="widget-statistic-value">
									老师管理
								</div>
								<div class="widget-statistic-description">
									<button class="widget-fluctuation-tpl-btn">点击进入</button>
								</div>
								<span class="widget-statistic-icon am-icon-male"></span>
							</div>
						</div>
					</div>

					<div class="am-u-sm-12 am-u-md-4 am-u-lg-3">
						<div class="widget widget-purple am-cf">
							<div class="widget-statistic-header">
							</div>
							<div class="widget-statistic-body">
								<div class="widget-statistic-value">
									学生管理
								</div>
								<div class="widget-statistic-description">
									<button class="widget-fluctuation-tpl-btn">点击进入</button>
								</div>
								<span class="widget-statistic-icon am-icon-renren"></span>
							</div>
						</div>
					</div>

					<div class="am-u-sm-12 am-u-md-4 am-u-lg-3">
						<div class="widget widget-primary am-cf">
							<div class="widget-statistic-header">
							</div>
							<div class="widget-statistic-body">
								<div class="widget-statistic-value">
									权限管理
								</div>
								<div class="widget-statistic-description">
									<button class="widget-fluctuation-tpl-btn">点击进入</button>
								</div>
								<span class="widget-statistic-icon am-icon-lock"></span>
							</div>
						</div>
					</div>

					<div class="am-u-sm-12 am-u-md-4 am-u-lg-3">
						<div class="widget widget-purple am-cf">
							<div class="widget-statistic-header">
							</div>
							<div class="widget-statistic-body">
								<div class="widget-statistic-value">
									公告管理
								</div>
								<div class="widget-statistic-description">
									<button class="widget-fluctuation-tpl-btn">点击进入</button>
								</div>
								<span class="widget-statistic-icon am-icon-bullhorn"></span>
							</div>
						</div>
					</div>
				</div>
					-->

			</div>
			<!-- 内容区域结束 -->

		</div>
	</body>

</html>