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
			<div class="row justify-content-md-center align-items-center h-100">
				<div class="card-wrapper">
					<div class="brand">
						<img src="${base}/img/logo.jpg">
					</div>
					<div class="card fat">
						<div class="card-body">
							<h4 class="card-title">忘记密码</h4>
							<form method="POST">
							 
								<div class="form-group">
									<label for="email"></label>
									<input id="email" type="email" placeholder="请输入邮箱" class="form-control" name="email" value="" required autofocus>
									<div class="form-text text-muted">
										点击“密码重置”，我们会发送重置密码的链接到您的邮箱。
									</div>
								</div>

								<div class="form-group no-margin">
									<button type="submit" class="btn btn-primary btn-block">
										密码重置
									</button>
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
</body>
</html>