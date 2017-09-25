<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Welcome!</title>
<style>
.center {
	width: 200px;
	padding: 10px;
	margin: auto;
	background: green;
}

.align {
	text-align: center;
}
</style>
</head>
<body>
	<h3 class="align">Please, log in!</h3>
	<form action="MainServlet" method="post" class="center">
		<input type="hidden" name="command" value="login" /> <input
			type="text" name="login" placeholder="Login" /><br> <input
			type="password" name="password" placeholder="password" /><br> <input
			type="submit" name="login" />
	</form>
</body>
</html>
