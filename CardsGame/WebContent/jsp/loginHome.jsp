<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

</head>
<body>
<form id="loginFrmId" name="loginFrm" method="post">

USER NAME:
<input type="text" name="userName" id="userNameId" value=""></input>
<br>
PASSWORD:
<input type="password" name="pswd" id="pswdId" value=""></input>
<br>
<input type="submit" name="loginBtn" value="SignIn" id="loginBtnId" onclick="login();"></input>

</body>
<script type="text/javascript" src="js/login.js">
</script>
</html>