<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="coreTags"%>
<%@ taglib prefix="tiles" uri="springTiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src='https://code.responsivevoice.org/responsivevoice.js'></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style type="text/css">
body#LoginForm {
	background-image:
		url("https://hdwallsource.com/img/2014/9/blur-26347-27038-hd-wallpapers.jpg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	padding: 10px;
}

.form-heading {
	color: #fff;
	font-size: 23px;
}

.panel h2 {
	color: #444444;
	font-size: 18px;
	margin: 0 0 8px 0;
}

.panel p {
	color: #777777;
	font-size: 14px;
	margin-bottom: 30px;
	line-height: 24px;
}

.login-form .form-control {
	background: #f7f7f7 none repeat scroll 0 0;
	border: 1px solid #d4d4d4;
	border-radius: 4px;
	font-size: 14px;
	height: 38px;
	line-height: 50px;
}

.login-form .aadhaar-form-control {
	background: #f7f7f7 none repeat scroll 0 0;
	border: 1px solid #d4d4d4;
	border-radius: 4px;
	font-size: 14px;
	height: 38px;
	line-height: 50px;
}

.main-div {
	background: #ffffff none repeat scroll 0 0;
	border-radius: 2px;
	margin: 10px auto 30px;
	max-width: 38%;
	padding: 50px 70px 70px 71px;
}

.login-form .form-group {
	margin-bottom: 10px;
}

.login-form {
	text-align: center;
}

.forgot a {
	color: #777777;
	font-size: 14px;
	text-decoration: underline;
}

.login-form  .btn.btn-primary {
	background: #78A90F none repeat scroll 0 0;
	border-color: #f4f4f5;
	color: #ffffff;
	font-size: 14px;
	width: 100%;
	height: 45px;
	line-height: 50px;
	padding: 0;
	margin-bottom: -12px;
}

.login-form  .btn.btn-success {
	background: #f0ad4e none repeat scroll 0 0;
	border-color: #f0ad4e;
	color: #ffffff;
	font-size: 14px;
	width: 100%;
	height: 45px;
	line-height: 50px;
	padding: 0;
	margin-top: -12px;
}

.forgot {
	text-align: left;
	margin-bottom: 30px;
}

.botto-text {
	color: #ffffff;
	font-size: 14px;
	margin: auto;
}

.login-form .btn.btn-primary.reset {
	background: #ff9900 none repeat scroll 0 0;
}

.back {
	text-align: left;
	margin-top: 10px;
}

.back a {
	color: #444444;
	font-size: 13px;
	text-decoration: none;
}
</style>

</head>
<body>
	<tiles:insertAttribute name="body"></tiles:insertAttribute>
</body>
</html>