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
							<h4 class="card-title">密码重置</h4>
							<form method="POST">
							 
								<div class="form-group">
									<label for="new-password"></label>
									<input id="new-password" type="password" placeholder="请输入新密码" class="form-control" name="password" required autofocus data-eye>
									
								</div>
                                <div class="form-group">
									<label for="new-password"></label>
									<input id="new-password" type="password" placeholder="请再次输入新密码" class="form-control" name="password" required autofocus data-eye>
									<div class="form-text text-muted">
                             
										请确保您的密码长度足够安全，且容易记住。<br/><br/>
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

	<script src="${base}/js/jquery.min.js"></script>
	<script src="${base}/js/bootstrap.min.js"></script>
	<script src="${base}/js/my-login.js"></script>
</body>
</html>