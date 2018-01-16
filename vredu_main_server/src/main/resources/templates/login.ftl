<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="author" content="Kodinger">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<#assign base = request.contextPath />
	<base id="base" href="${base}">
	<title>My Login Page &mdash; Bootstrap 4 Login Page Snippet</title>
	<link rel="stylesheet" type="text/css" href="${base}/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${base}/css/my-login.css">
</head>
<body class="my-login-page">
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-md-center h-100">
				<div class="card-wrapper">
					<div class="brand">
						<img src="${base}/img/logo.jpg">
					</div>
					<div class="card fat">
						<div class="card-body">
							<h4 class="card-title">登陆</h4>
							<form action="loginHandle" method="POST" >
							 
								<div class="form-group">
									<label for="username">用户名</label>

									<input id="username" type="text" placeholder="请输入用户名" class="form-control" name="username" value="" required= "required">
								</div>

								<div class="form-group">
									<label for="password">密码
										<a href="forgot" class="float-right">
											忘记密码?
										</a>
									</label>
									<input id="password" type="password" placeholder="登录密码" class="form-control" name="password" required= "required">
								</div>

								<div class="form-group">
									<label>
										<input type="checkbox" name="remember" /> 记住我
									</label>
								</div>

								<div class="form-group no-margin">
									<button type="submit" class="btn btn-primary btn-block">
										登陆
									</button>
								</div>
								<div class="margin-top20 text-center">
									没有账号? <a href="register">立即注册</a>
								</div>
							</form>
						</div>
					</div>
					<div class="footer">
						Copyright &copy; 2017 &mdash; 国家电网公司 
					</div>
				</div>
			</div>
		</div>
	</section>

	<script src="${base}/js/jquery.min.js"></script>
	<script src="${base}/js/bootstrap.min.js"></script>
	<script src="${base}/js/my-login.js"></script>
</body>
</html>