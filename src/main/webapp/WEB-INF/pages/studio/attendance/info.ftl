<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>我的考勤</title>
		<link href="<@s.url '/plugin/bootstrap/css/bootstrap.min.css'/>" type="text/css" rel="stylesheet"/>
		<link href="<@s.url '/plugin/bootstrap/css/bootstrap-theme.min.css'/>" type="text/css" rel="stylesheet"/>
		
	</head>

	<body>
		<div class="container">
			<div class="row">
				<div class="page-header">
					<h1>工作室管理平台 <small>浙江衡信教育科技有限公司</small></h1>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<ul class="nav nav-pills ">
						<li role="" class="active">
							<a href="../attendance/myAttendance.html">考勤</a>
						</li>
						<li role="">
							<a href="../mission/myMission.html">任务</a>
						</li>
						<li role="">
							<a href="../workLog/myWorkLog.html">工作日志</a>
						</li>
						<li role="">
							<a href="#">代账企业信息</a>
						</li>
						<li role="">
							<a href="#">综合素质评价</a>
						</li>
						<li role="">
							<a href="#">报表统计</a>
						</li>
					</ul>
				</div>
			</div>

			<div class="row" style="margin-top: 50px;">
				<div class="col-md-2">
					<div class="list-group">
						<a href="#" class="list-group-item active"><span class="glyphicon glyphicon-calendar"></span> 我的考勤</a>
						<a href="#" class="list-group-item" style="text-align:center">考勤情况</a>
						<a href="#" class="list-group-item active"><span class="glyphicon glyphicon-th-list"></span> 考勤管理</a>
						<a href="#" class="list-group-item" style="text-align:center">考勤设置</a>
						<a href="#" class="list-group-item" style="text-align:center">异常考勤</a>
						<a href="#" class="list-group-item" style="text-align:center">出勤报表</a>
						<a href="#" class="list-group-item" style="text-align:center">工作时长</a>
					</div>
				</div>
				<div class="col-md-10">
					<div>
						<form class="form-inline" role="form">
							
							<div class="form-group">
								<label for="">时间:</label>
							</div>
							<div class="form-group">
								<input style="width:150px;" class="form-control" type="text" placeholder="开始时间">
							</div>
								<label for="">-</label>
							<div class="form-group">
								<input style="width:150px;" class="form-control" type=" text" id="" placeholder="结束时间">
							</div>
							<div class="form-group">
								<input type="button" class="form-control btn btn-info" id="" value="本月">
								<input type="button" class="form-control btn btn-info" id="" value="上月">
								<input type="button" class="form-control btn btn-primary" id="" value="查询">
							</div>
							
							<div class="form-group" style="float:right;">
								<div class="input-group">
									<label type="text" class="form-control" id="nowTime"></label>
									<div class="input-group-btn">
										<button type="button" id="sign" class="btn btn-danger">签到</button>
									</div>
								</div>
							</div>
						
						</form>
					</div>
					<div style="margin-top: 50px;">
						<table class="table table-bordered table-hover" style="text-align:center">
							<tr class="active">
								<td>序号</td>
								<td>姓名</td>
								<td>考勤类型</td>
								<td>考勤时间</td>
								<td>ip地址</td>
								<td>考勤状态</td>
								<td>申诉状态</td>
							</tr>
							<#if attendanceList?exists && (attendanceList?size>0)>
								<#list attendanceList as attendance>
									<tr style="height:50px;">
										<td>${attendance_index+1}</td>
										<td>${attendance.studentName!}</td>
										<td>${attendance.signType.des!}</td>
										<td>${(attendance.attendanceTime)?string("yyyy-MM-dd HH:mm:ss")}</td>
										<td>${attendance.ipAddress!}</td>
										<td>${attendance.attendanceType.des!}</td>
										<#if attendance.attendanceType?exists && attendance.attendanceType!="NORMAL">
											<td>
												<input type="button" class="btn btn-warning" value="${attendance.appealStatus.des!}" />
											</td>
										<#else>
											<td></td>
										</#if>
									</tr>
								</#list>
							</#if>
						</table>
					</div>
					<div style="float: right;">
						<nav>
							<ul class="pagination">
								${pageCode!}
							</ul>
						</nav>
					</div>
				</div>
			</div>

		</div>
	</body>
	
	<script src="<@s.url '/plugin/jquery/jquery-1.12.3.min.js'/>" type="text/javascript"></script>
	<script src="<@s.url '/plugin/bootstrap/js/bootstrap.min.js'/>" type="text/javascript"></script>
	<script src="<@s.url '/js/studio/attendance/info.js'/>" type="text/javascript"></script>
</html>