<header>
	<#-- logo start -->
	<div class="am-fl tpl-header-logo header-logo">
		
	</div>
	<#-- logo end -->
	<div class="tpl-header-fluid">
		<#-- display sidebar start -->
		<div class="am-fl tpl-header-switch-button am-icon-list"></div>
		<#-- display sidebar end -->
		<#-- seach start -->
		<div class="am-fl tpl-header-search">
			<form class="tpl-header-search-form" action="javascript:;">
				<button class="tpl-header-search-btn am-icon-search"></button>
				<input class="tpl-header-search-box" type="text" placeholder="输入搜索内容...">
			</form>
		</div>
		<#-- seach end -->
		<div class="am-fr tpl-header-navbar">
			<ul>
				<#-- welcome -->
				<li class="am-text-sm tpl-header-navbar-welcome">
					<a href="javascript:void(0);">
						<span class="am-icon-user"> 欢迎你,宋杰</span>
					</a>
				</li>
				<#-- datetime -->
				<li class="am-text-sm tpl-header-navbar-welcome">
					<a href="javascript:void(0);">
						<span class="am-icon-calendar"> 今天是 2016-12-17 星期二</span>
					</a>
				</li>
				<#-- changePwd -->
				<li class="am-text-sm tpl-header-navbar-welcome">
					<a href="javascript:void(0);">
						<span class="am-icon-key"> 修改密码</span>
					</a>
				</li>

				<#-- logout -->
				<li class="am-text-sm">
					<a href="/login/logout">
						<span class="am-icon-sign-out"> 退出</span>
					</a>
				</li>
			</ul>
		</div>
		
	</div>
</header>