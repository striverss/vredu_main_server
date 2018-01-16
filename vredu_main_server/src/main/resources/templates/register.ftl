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
							<h4 class="card-title">注册</h4>
							<form action="registerHandle" method="POST">
							 
								<div class="form-group">
									<label for="name">用户名</label>
									<input id="name" type="text" class="form-control" name="username" required autofocus>
								</div>

								<div class="form-group">
									<label for="password">密码</label>
									<input id="password" type="password" class="form-control" name="password" required data-eye>
								</div>

								<div class="form-group">
									<label for="email">邮箱</label>
									<input id="email" type="email" class="form-control" name="email" required>
								</div>

								<div class="form-group">
									<label>
										<input type="checkbox" name="agree" value="1"> 同意开发者协议
									</label>
								</div>

								<div class="form-group no-margin">
									<button type="submit" class="btn btn-primary btn-block">
										注册
									</button>
								</div>
								<div class="margin-top20 text-center">
									已有账号? <a href="login">立即登陆</a>
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