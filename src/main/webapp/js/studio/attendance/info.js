$(function(){
	/**
	 * 页面时间显示初始化
	 */
	var now = (new Date()).toLocaleString();
	$("#nowTime").text(now);
	
	/**
	 * 签到
	 */
	$("#sign").click(function(){
		$.post(
			"sign",
			{
				"studioCode":"abc",
				"studioName":"衡信工作室",
				"studentCode":"zhangsan",
				"studentName":"张三",
			},
			function(data){
			}
		);
	});
	
	
	/**
	 * 时间显示
	 */
	setInterval(function() {
	    var now = (new Date()).toLocaleString();
	    $("#nowTime").text(now);
	}, 1000);
	
	/**
	 * 本月点击
	 */
	$("#thisMonth").click(function(){
		var firstDay = getThisMonthFirstDay();
		var lastDay = getThisMonthLastDay();
		$("#startTime").val(firstDay.Format("yyyy-MM-dd hh:mm:ss"));
		$("#endTime").val(lastDay.Format("yyyy-MM-dd hh:mm:ss"));
	});
	
	/**
	 * 上月点击
	 */
	$("#lastMonth").click(function(){
		var firstDay = getLastMonthFirstDay();
		var lastDay = getLastMonthLastDay();
		$("#startTime").val(firstDay.Format("yyyy-MM-dd hh:mm:ss"));
		$("#endTime").val(lastDay.Format("yyyy-MM-dd hh:mm:ss"));
	});
	
	/**
	 * 查询点击
	 */
	$("#query").click(function(){
		var startTime = $("#startTime").val();
		var endTime = $("#endTime").val();
		location.href = "/cats/attendance/info?startTime="+startTime+"&endTime="+endTime;
	});
});