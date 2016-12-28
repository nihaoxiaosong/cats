var currentUrlId = "CURRENT_URL_ID";

$(function(){
	var cookieValue = $.cookie(currentUrlId);
	switch(cookieValue){
		case "HOME":
			homeActive();
			break;
		case "ADMIN_USER":
			basicDataActive();
			$("#adminUser").addClass("sub-active");
			break;
		case "PRODUCT":
			basicDataActive();
			$("#product").addClass("sub-active");
			break;
		case "SCHOOL":
			basicDataActive();
			$("#school").addClass("sub-active");
			break;
		case "STUDIO_MANAGER":
			basicDataActive();
			$("#studioManager").addClass("sub-active");
			break;
		case "TEACHER":
			basicDataActive();
			$("#teacher").addClass("sub-active");
			break;
		case "STUDENT":
			basicDataActive();
			$("#student").addClass("sub-active");
			break;
		case "RIGHT":
			basicDataActive();
			$("#right").addClass("sub-active");
			break;
		case "NOTICE":
			basicDataActive();
			$("#notice").addClass("sub-active");
			break;
		case "CMAC_STANDARD":
			talentSelectionActive();
			$("#cmacStandard").addClass("sub-active");
			break;
		case "SELECTION_STANDARD":
			talentSelectionActive();
			$("#selectionStandard").addClass("sub-active");
			break;
		case "QUERY_RESULT":
			talentSelectionActive();
			$("#queryResult").addClass("sub-active");
			break;
		case "QUERY_SELECTION_RESULT":
			talentSelectionActive();
			$("#querySelectionResult").addClass("sub-active");
			break;
		case "COURSE":
			talentSelectionActive();
			$("#course").addClass("sub-active");
			break;
		case "GOVERNMENT":
			talentSelectionActive();
			$("#government").addClass("sub-active");
			break;
		case "TASK_TYPE":
			$("#taskType").addClass("sub-active");
			break;
		case "EVALUATION_SCORE":
			$("#evaluationScore").addClass("sub-active");
			break;
	}
	
});

/**
 * 选中首页,首页没有展开的子项,只要选中首页就好了
 */
function homeActive(){
	$("#home").addClass("active");
}
/**
 * 选中基础数据,并将基础数据展开,小图标换成向上
 */
function basicDataActive(){
	$("#basicData").addClass("active");
	$("#basicData").children("span").addClass("sidebar-nav-sub-ico-rotate");
	$("#basicDataUl").addClass("displayblock");
}
/**
 * 选中人才选拔测评管理,并将人才选拔测评管理展开,小图标换成向上
 */
function talentSelectionActive(){
	$("#talentSelection").addClass("active");
	$("#talentSelection").children("span").addClass("sidebar-nav-sub-ico-rotate");
	$("#talentSelectionUl").addClass("displayblock");
}
/**
 * 选中工作室管理,并将工作室管理展开,小图标换成向上
 */
function studioActive(){
	$("#studio").addClass("active");
	$("#studio").children("span").addClass("sidebar-nav-sub-ico-rotate");
	$("#studioUl").addClass("displayblock");
}
