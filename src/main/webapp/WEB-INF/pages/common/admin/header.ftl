<div class="page-header">
	<ul class="nav nav-pills pull-right" role="tablist">
		<li role="presentation" class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 
				<span class="glyphicon glyphicon-user"></span> 你好,${currentUser.userName!"管理员"} <span class="caret"></span>
			</a>
			<ul class="dropdown-menu" role="menu">
				<li>
					<a id="changePwd" href="javascript:void(0);">修改密码</a>
				</li>
				<#--<li class="divider"></li>-->
				<li>
					<a href="/login/logout">退出</a>
				</li>
			</ul>
		</li>
	</ul>
	<h2>CATS衡信后台管理平台 <small>浙江衡信教育科技有限公司</small></h2>
</div>

<#--修改密码弹出框-->
<div class="modal fade" id="changePwdModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				<h4 class="modal-title">修改密码</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<label for="" class="col-sm-4 control-label">原密码</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="" placeholder="请输入原密码">
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-sm-4 control-label">新密码</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" id="" placeholder="请输入新密码">
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-sm-4 control-label">确认密码</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" id="" placeholder="请确认新密码">
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<span id="errorMsg" style="color:red;"></span>
				<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button type="button" class="btn btn-primary" id="">确认</button>
			</div>
		</div>
	</div>
</div>

<script>
	$("#changePwd").click(function(){
		$("#changePwdModal").modal({
			keyboard : false,
			backdrop:"static"
		});
	});
</script>