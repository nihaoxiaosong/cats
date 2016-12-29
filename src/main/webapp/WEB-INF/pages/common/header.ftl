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
						<span class="am-icon-user"> 欢迎你, ${currentUser.userName!}</span>
					</a>
				</li>
				<#-- datetime -->
				<li class="am-text-sm tpl-header-navbar-welcome">
					<a href="javascript:void(0);">
						<span class="am-icon-calendar" data-am-datepicker="{format: 'yyyy-mm-dd'}" id="todayDate"> </span>
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

<script src="<@s.url '/assets/js/common/date.js'/>"></script>
<script src="<@s.url '/assets/js/common/date.js'/>"></script>
<script>
	var today = new Date();
	var todayStr = today.Format("yyyy-MM-dd");
	var weekInt = today.getDay();
	var weekStr = "星期";
	switch (weekInt){
		case 0:
			weekStr+="天";
			break;
		case 1:
			weekStr+="一";
			break;
		case 2:
			weekStr+="二";
			break;
		case 3:
			weekStr+="三";
			break;
		case 4:
			weekStr+="四";
			break;
		case 5:
			weekStr+="五";
			break;
		case 6:
			weekStr+="六";
			break;
	}
	$("#todayDate").text("今天是 "+todayStr+" "+weekStr);
</script>