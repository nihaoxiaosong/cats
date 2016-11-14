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
});