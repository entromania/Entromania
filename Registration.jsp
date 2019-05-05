	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="coming-soon">
<head>
<base href="${pageContext.request.contextPath}/Admin/">
<meta charset="utf-8">
<title>Registration Form</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-touch-fullscreen" content="yes">
<meta name="author" content="KaijuThemes">

<link
	href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400italic,600'
	rel='stylesheet' type='text/css'>
<link type="text/css" href="css/blue.css" rel="stylesheet">
<link type="text/css" href="css/font-awesome.min.css" rel="stylesheet">
<link type="text/css" href="css/themify-icons.css" rel="stylesheet">
<!-- Themify Icons -->
<link type="text/css" href="css/styles.css" rel="stylesheet">
<style>
.main-header {
	background-image: url("images/loginback11.jpg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	width: 100%;
	height: 100%;
}
</style>
</head>

<body class="main-header">


	<div class="container" id="registration-form">
		
		<div align="center">
			<a href="index.html" class="login-logo"><img
				src="images/logo.png"></a>
		</div>
		<br />
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h2>Registration Form</h2>
					</div>
					<div class="panel-body">
						<form action="<%=request.getContextPath()%>/RegistrationCo"
							method="post" class="form-horizontal">
							<div class="form-group mb-md">
								<label for="FullName" class="col-xs-4 control-label">Full
									Name</label>
								<div class="col-xs-8">
									<input type="text" class="form-control" name="name"
										id="FulltName" placeholder="Full Name" required>
								</div>
							</div>
							<div class="form-group mb-md">
								<label for="FullName" class="col-xs-4 control-label">Date
									Of Birth</label>
								<div class="col-xs-8">
									<input type="date" name="dateofbirth" class="form-control"
										data-inputmask="'alias': 'date'">
								</div>
							</div>
							<div class="form-group mb-md">
								<label for="FullName" class="col-xs-4 control-label">Gender</label>
								<div class="col-xs-8">
									<div class="radio-inline">
										<label><input type="radio" value="male" name="gender">Male</label>
									</div>
									<div class="radio-inline">
										<label><input type="radio" name="gender" value="female">Female</label>
									</div>
								</div>
							</div>
							<div class="form-group mb-md">
								<label for="FullName" class="col-xs-4 control-label">Mobile
									No</label>
								<div class="col-xs-8">
									<input type="text" class="form-control" name="mobileno"
										placeholder="Mobile No" required>
								</div>
							</div>
							<div class="form-group mb-md">
								<label for="Email" class="col-xs-4 control-label">Email</label>
								<div class="col-xs-8">
									<input type="text" class="form-control" name="email" id="Email"
										placeholder="Email" required>
								</div>
							</div>
							<div class="form-group mb-md">
								<label for="Password" class="col-xs-4 control-label">Password</label>
								<div class="col-xs-8">
									<input type="password" class="form-control" name="password"
										id="Password" placeholder="Password" required>
								</div>
							</div>
							<div class="form-group mb-md">
								<label for="ConfirmPassword" class="col-xs-4 control-label">Confirm</label>
								<div class="col-xs-8">
									<input type="password" class="form-control" name="cpassword"
										id="ConfirmPassword" placeholder="Confirm Password" required>
								</div>
							</div>
							<div class="panel-footer">
								<div class="clearfix">
									<a href="login.jsp" class="btn btn-default pull-left">Already
										Registered? Login</a> <input type="hidden" name="flag"
										value="register"> <input type="submit"
										class="btn btn-primary pull-right" value="Register">
								</div>
							</div>
						</form>

					</div>

				</div>
			</div>
		</div>
	</div>



	<!-- Load site level scripts -->

	<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script> -->

	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<!-- Load jQuery -->
	<script type="text/javascript" src="js/jqueryui-1.10.3.min.js"></script>
	<!-- Load jQueryUI -->
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<!-- Load Bootstrap -->
	<script type="text/javascript" src="js/enquire.min.js"></script>
	<!-- Load Enquire -->

	<script type="text/javascript" src="js/velocity.min.js"></script>
	<!-- Load Velocity for Animated Content -->
	<script type="text/javascript" src="js/velocity.ui.min.js"></script>

	<script type="text/javascript" src="js/wijets.js"></script>
	<!-- Wijet -->

	<script type="text/javascript" src="js/prettify.js"></script>
	<!-- Code Prettifier  -->
	<script type="text/javascript" src="js/bootstrap-switch.js"></script>
	<!-- Swith/Toggle Button -->

	<script type="text/javascript" src="js/bootstrap-tabdrop.js"></script>
	<!-- Bootstrap Tabdrop -->

	<script type="text/javascript" src="js/icheck.min.js"></script>
	<!-- iCheck -->

	<script type="text/javascript" src="js/jquery.nanoscroller.min.js"></script>
	<!-- nano scroller -->

	<script type="text/javascript" src="js/application.js"></script>
	<script type="text/javascript" src="js/demo.js"></script>
	<script type="text/javascript" src="js/demo-switcher.js"></script>

	<!-- End loading site level scripts -->
	<!-- Load page level scripts-->

	<!-- End loading page level scripts-->
</body>
</html>